package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ay extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ay f126488d = new com.tencent.mm.plugin.finder.storage.ay();

    public ay() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = false;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_video_3_4_ratio_enable, 0);
        int i17 = com.tencent.mm.sdk.platformtools.o4.M("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_VIDEO_RATIO_3_4_INT_SYNC", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoCropLocalConfig", "init, isEnable43RatioVideo:" + Ni + ", localConfig:" + i17);
        if (i17 == 0 ? Ni == 1 : i17 == 1) {
            z17 = true;
        }
        return z17 ? new e06.d(0.75d, 1.7777777777777777d) : new e06.d(0.8571428571428571d, 1.7777777777777777d);
    }
}
