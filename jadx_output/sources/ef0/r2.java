package ef0;

/* loaded from: classes.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ef0.r2 f252314d = new ef0.r2();

    public r2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ting_enable_music_color_bg, 1) == 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "tingConfig openMusicItemColorBg: " + valueOf.booleanValue());
        return valueOf;
    }
}
