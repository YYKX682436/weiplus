package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class y10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.y10 f128337d = new com.tencent.mm.plugin.finder.storage.y10();

    public y10() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "打开评论抽屉是否调整feed位置", null, null, 12, null);
        aVar.a("IS_ADJUST_FEED_WHEN_OPEN_DRAWER", kz5.c0.i(0, 1), kz5.c0.i("默认模式(关闭)", "自动调整模式"));
        return aVar;
    }
}
