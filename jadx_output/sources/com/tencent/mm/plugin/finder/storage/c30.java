package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class c30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.c30 f126560d = new com.tencent.mm.plugin.finder.storage.c30();

    public c30() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(100, "直播广场RecyclerView滑动速度", null, null, 12, null);
        aVar.a("NEARBY_RECYCLERVIEW_SPEED", kz5.c0.i(100, 50, 60, 70, 80, 90, 100, 130), kz5.c0.i("默认(1)", "0.5倍", "0.6倍", "0.7倍", "0.8倍", "0.9倍", "1倍", "1.3倍"));
        return aVar;
    }
}
