package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class br extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.br f126543d = new com.tencent.mm.plugin.finder.storage.br();

    public br() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(200, "双指外扩 fling触发时的距离阈值", null, null, 12, null);
        aVar.a("FINDER_SCALE_SPEED_FLING_CONFIG", kz5.c0.i(200, 100, 150, 200, 250, 300, java.lang.Integer.valueOf(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE)), kz5.c0.i("200", "100", "150", "200", "250", "300", "350"));
        return aVar;
    }
}
