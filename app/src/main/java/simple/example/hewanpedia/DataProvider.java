package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Beruang;
import simple.example.hewanpedia.model.Beruang;
import simple.example.hewanpedia.model.Elang;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Ikan;
import simple.example.hewanpedia.model.Ikan;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Beruang> initDataBeruang(Context ctx) {
        List<Beruang> beruangs = new ArrayList<>();
        beruangs.add(new Beruang(ctx.getString(R.string.berkacamata_nama), ctx.getString(R.string.berkacamata_asal),
                ctx.getString(R.string.berkacamata_deskripsi), R.drawable.beruang_berkacamata));
        beruangs.add(new Beruang(ctx.getString(R.string.hitam_nama), ctx.getString( R.string.hitam_asal),
                ctx.getString(R.string.hitam_deskripsi),R.drawable.beruang_hitam));
        beruangs.add(new Beruang(ctx.getString(R.string.beruangSloth_nama), ctx.getString(R.string.beruangSloth_asal),
                ctx.getString(R.string.beruangSloth_deskripsi), R.drawable.beruang_sloth));
        beruangs.add(new Beruang(ctx.getString(R.string.madu_nama), ctx.getString(R.string.madu_asal),
                ctx.getString(R.string.madu_deskripsi), R.drawable.beruang_madu));
        beruangs.add(new Beruang(ctx.getString(R.string.coklat_nama), ctx.getString(R.string.coklat_asal),
                ctx.getString(R.string.coklat_deskripsi), R.drawable.beruang_coklat));
        beruangs.add(new Beruang(ctx.getString(R.string.kutub_nama), ctx.getString(R.string.kutub_asal),
                ctx.getString(R.string.kutub_deskripsi), R.drawable.beruang_kutub));
        return beruangs;
    }

    private static List<Elang> initDataElang(Context ctx) {
        List<Elang> elangs = new ArrayList<>();
        elangs.add(new Elang(ctx.getString(R.string.pithecophagajefferyi_nama), ctx.getString(R.string.pithecophagajefferyi_asal),
                ctx.getString(R.string.madu_deskripsi), R.drawable.elang_filipina));
        elangs.add(new Elang(ctx.getString(R.string.elanuscaeruleus_nama), ctx.getString( R.string.elanuscaeruleus_asal),
                ctx.getString(R.string.elanuscaeruleus_deskripsi),R.drawable.elang_tikus));
        elangs.add(new Elang(ctx.getString(R.string.avicedajerdoni_nama), ctx.getString(R.string.avicedajerdoni_asal),
                ctx.getString(R.string.avicedajerdoni_deskripsi), R.drawable.elang_bazajerdon));
        elangs.add(new Elang(ctx.getString(R.string.bondol_nama), ctx.getString(R.string.bondol_asal),
                ctx.getString(R.string.bondol_deskripsi), R.drawable.elang_bondol));
        elangs.add(new Elang(ctx.getString(R.string.elangJawa_nama), ctx.getString(R.string.elangJawa_asal),
                ctx.getString(R.string.elangJawa_deskripsi), R.drawable.elang_jawa));
        elangs.add(new Elang(ctx.getString(R.string.haliaeetusleucogaster_nama), ctx.getString(R.string.haliaeetusleucogaster_asal),
                ctx.getString(R.string.haliaeetusleucogaster_deskripsi), R.drawable.elang_laut));
        return elangs;
    }
    private static List<Ikan> initDataIkan(Context ctx) {
        List<Ikan> ikans = new ArrayList<>();
        ikans.add(new Ikan(ctx.getString(R.string.betta_nama), ctx.getString(R.string.betta_asal),
                ctx.getString(R.string.betta_deskripsi), R.drawable.ikan_cupang));
        ikans.add(new Ikan(ctx.getString(R.string.engraulidae_nama), ctx.getString( R.string.engraulidae_asal),
                ctx.getString(R.string.engraulidae_deskripsi),R.drawable.ikan_teri));
        ikans.add(new Ikan(ctx.getString(R.string.thunnusalbacares_nama), ctx.getString(R.string.thunnusalbacares_asal),
                ctx.getString(R.string.thunnusalbacares_deskripsi), R.drawable.ikan_madidihang));
        ikans.add(new Ikan(ctx.getString(R.string.superordoSelachimorpha_nama), ctx.getString(R.string.superordoSelachimorpha_asal),
                ctx.getString(R.string.superordoSelachimorpha_deskripsi), R.drawable.ikan_hiu));
        ikans.add(new Ikan(ctx.getString(R.string.causpisillum_atau_Balistidae_nama), ctx.getString(R.string.causpisillum_atau_Balistidae_asal),
                ctx.getString(R.string.causpisillum_atau_Balistidae_deskripsi), R.drawable.ikan_tiger));
        ikans.add(new Ikan(ctx.getString(R.string.exocoetidae_nama), ctx.getString(R.string.exocoetidae_asal),
                ctx.getString(R.string.exocoetidae_deskripsi), R.drawable.ikan_terbang));
        return ikans;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataBeruang(ctx));
        hewans.addAll(initDataElang(ctx));
        hewans.addAll(initDataIkan(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
