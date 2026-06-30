package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.y1 f128336d = new com.tencent.mm.plugin.finder.storage.y1();

    public y1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "是否允许软编回退", null, null, 12, null);
        aVar.a("USERINFO_FINDER_ENABLE_SOFT_ENCODE_FALLBACK_INT_SYNC", kz5.c0.i(0, 1), kz5.c0.i("关", "开"));
        return aVar;
    }
}
