package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class zu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.zu f128471d = new com.tencent.mm.plugin.finder.storage.zu();

    public zu() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1000, "朋友星标过动画速率", null, null, 12, null);
        aVar.a("FINDER_STAR_COUNT_ANIM_DURATION", kz5.c0.i(500, 600, 700, 800, 900, 1000), kz5.c0.i("500ms", "600ms", "700ms", "800ms", "900ms", "1000ms"));
        return aVar;
    }
}
