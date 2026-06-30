package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class a5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.a5 f126384d = new com.tencent.mm.plugin.finder.storage.a5();

    public a5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "右下角按钮轮播动画冲突策略", null, null, 12, null);
        aVar.a("FINDER_BTN_CAROUSEL_CONFLICT_STRATEGY", kz5.c0.i(0, 1), kz5.c0.i("忽略新来的动画", "取消上一个还在执行的动画"));
        return aVar;
    }
}
