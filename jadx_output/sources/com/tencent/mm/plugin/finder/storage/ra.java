package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ra extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ra f127475d = new com.tencent.mm.plugin.finder.storage.ra();

    public ra() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(300, "视频号timeline双击爱心赞最大间隔(毫秒)", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_double_like_max_time_android, false);
        aVar.a("FINDER_DOUBLE_TAP_LIKE_MAX_TIME", kz5.c0.i(300, 310, java.lang.Integer.valueOf(com.tencent.mapsdk.internal.km.f50100e), 330, 340, java.lang.Integer.valueOf(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE), java.lang.Integer.valueOf(com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1), 370, 380, 390, 2000), kz5.c0.i("300(默认)", "310", "320", "330", "340", "350", "360", "370", "380", "390", "2000"));
        return aVar;
    }
}
