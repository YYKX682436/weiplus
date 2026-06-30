package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class b4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.b4 f126500d = new com.tencent.mm.plugin.finder.storage.b4();

    public b4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "音量动态增长开关", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_audio_volume_change_enable, false, 2, null);
        aVar.a("FINDER_AUDIO_VOLUME_CHANGE_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("0", "1"));
        return aVar;
    }
}
