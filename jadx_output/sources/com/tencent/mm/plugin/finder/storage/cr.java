package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class cr extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.cr f126601d = new com.tencent.mm.plugin.finder.storage.cr();

    public cr() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(300, "双指外扩 fling触发时的速度阈值", null, null, 12, null);
        aVar.a("FINDER_SCALE_SPEED_FLING_CONFIG", kz5.c0.i(300, 200, 250, 300, java.lang.Integer.valueOf(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE), 400, 450, 500), kz5.c0.i("300", "200", "250", "300", "350", "450", "500"));
        return aVar;
    }
}
