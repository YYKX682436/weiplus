package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.d4 f126624d = new com.tencent.mm.plugin.finder.storage.d4();

    public d4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(0.125f, "音量增长速度");
        lb2.j.d(dVar, e42.c0.clicfg_finder_audio_volume_change_speed, false, 2, null);
        dVar.a("FINDER_AUDIO_VOLUME_CHANGE_SPEED", kz5.c0.i(java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.125f), java.lang.Float.valueOf(0.25f), java.lang.Float.valueOf(0.5f), java.lang.Float.valueOf(0.75f)), kz5.c0.i("0", "0.125", "0.25", "0.5", "0.75"));
        return dVar;
    }
}
