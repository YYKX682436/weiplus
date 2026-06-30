package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class c4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.c4 f126561d = new com.tencent.mm.plugin.finder.storage.c4();

    public c4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "音量调整模式", null, null, 12, null);
        aVar.a("FINDER_AUDIO_VOLUME_CHANGE_MODE", kz5.c0.i(0, 1), kz5.c0.i("固定阈值", "动态增长"));
        return aVar;
    }
}
