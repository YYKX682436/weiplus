package dw3;

/* loaded from: classes4.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final dw3.j0 f244218a = new dw3.j0();

    public final java.lang.String a() {
        java.lang.String optString;
        java.lang.String str = "";
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_second_cut_simple_style_wording, "", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "SecondCutSimpleStyleLeftWording: " + Zi);
        if (!android.text.TextUtils.isEmpty(Zi)) {
            kotlin.jvm.internal.o.d(Zi);
            try {
                cl0.g gVar = new cl0.g(Zi);
                if (com.tencent.mm.sdk.platformtools.m2.m()) {
                    optString = gVar.optString(com.tencent.wcdb.fts.BuiltinTokenizer.Simple);
                    kotlin.jvm.internal.o.d(optString);
                } else if (com.tencent.mm.sdk.platformtools.m2.n()) {
                    optString = gVar.optString("tradition");
                    kotlin.jvm.internal.o.d(optString);
                } else {
                    optString = gVar.optString("english");
                    kotlin.jvm.internal.o.d(optString);
                }
                str = optString;
            } catch (cl0.f unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SecondCutConfig", "parse wording JSON error");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "PopupSecondCutSimpleStyleLeftWording: ".concat(str));
            Zi = str;
        }
        kotlin.jvm.internal.o.d(Zi);
        return Zi;
    }

    public final int b() {
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        e42.c0 c0Var = e42.c0.clicfg_phoneix_sns_video_duration;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_phoneix_video_duration, 30);
        com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "ShareVideoDuration: " + Ni);
        int Ni2 = ((h62.d) e0Var).Ni(c0Var, Ni);
        com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "SnsVideoDuration: " + Ni2);
        return Ni2;
    }
}
