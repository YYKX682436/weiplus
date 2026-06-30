package ip1;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ip1.a f293580d = new ip1.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int nj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.ting.RepairerConfigTingCenterRecommendMusicList());
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarConfig", "tingConfig audioPanelEnableRecommend: " + nj6);
        return java.lang.Boolean.valueOf(nj6 == 1);
    }
}
