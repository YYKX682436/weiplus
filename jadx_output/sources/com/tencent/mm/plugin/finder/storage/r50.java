package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class r50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.r50 f127467d = new com.tencent.mm.plugin.finder.storage.r50();

    public r50() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(600, "snap 敏感度", null, null, 12, null);
        aVar.a("TIMELINE_SNAP_THRESHOLD", kz5.c0.i(1, 300, 600, 1200, 2400, 4800, 6000), kz5.c0.i("1", "300", "600", "1200", "2400", "4800", "6000"));
        return aVar;
    }
}
