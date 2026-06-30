package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class x10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.x10 f128280d = new com.tencent.mm.plugin.finder.storage.x10();

    public x10() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "红点预加载忽略标志位直接触发", null, null, 12, null);
        aVar.a("IGNORE_RED_DOT_PRELOAD_FLAG", kz5.c0.i(0, 1), kz5.c0.i("关", "开"));
        return aVar;
    }
}
