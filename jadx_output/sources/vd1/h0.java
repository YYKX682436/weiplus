package vd1;

/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static long f435588b;

    /* renamed from: a, reason: collision with root package name */
    public static final vd1.h0 f435587a = new vd1.h0();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f435589c = jz5.h.b(vd1.g0.f435586d);

    public final java.lang.String a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = currentTimeMillis - f435588b;
        jz5.g gVar = f435589c;
        if (j17 < 60000) {
            return ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).getString("key_ignore_frequency_config", "");
        }
        f435588b = currentTimeMillis;
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_11f07170", "IgnoreFrequencyCheckWhiteListJson");
        if (Ui == null || android.text.TextUtils.isEmpty(Ui.getPath())) {
            return ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).getString("key_ignore_frequency_config", "");
        }
        java.lang.String M = com.tencent.mm.vfs.w6.M(Ui.getPath());
        if (M != null) {
            if (!(M.length() == 0)) {
                ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).putString("key_ignore_frequency_config", M);
            }
        }
        return M;
    }
}
