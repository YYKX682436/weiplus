package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class b5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.b5 f126502d = new com.tencent.mm.plugin.finder.storage.b5();

    public b5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "右下角按钮轮播策略（在视频被划走后失效）", null, null, 12, null);
        aVar.a("FINDER_BTN_CAROUSEL_PLAY_STRATEGY", kz5.c0.i(0, 1, 2), kz5.c0.i("当前视频只播一种轮播", "当前视频只播一次轮播", "无限制"));
        return aVar;
    }
}
