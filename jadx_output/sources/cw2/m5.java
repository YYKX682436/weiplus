package cw2;

/* loaded from: classes13.dex */
public final class m5 {

    /* renamed from: a, reason: collision with root package name */
    public static final cw2.m5 f223867a = new cw2.m5();

    public final com.tencent.thumbplayer.api.TPOptionalParam a() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_player_use_soft_decoder, false);
        com.tencent.mars.xlog.Log.i("Finder.FinderThumbPlayerParamFactory", "getTPOptionalParam " + fj6);
        if (fj6) {
            com.tencent.thumbplayer.api.TPOptionalParam buildLong = new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(203, 3L);
            kotlin.jvm.internal.o.d(buildLong);
            return buildLong;
        }
        com.tencent.thumbplayer.api.TPOptionalParam buildBoolean = new com.tencent.thumbplayer.api.TPOptionalParam().buildBoolean(123, false);
        kotlin.jvm.internal.o.d(buildBoolean);
        return buildBoolean;
    }
}
