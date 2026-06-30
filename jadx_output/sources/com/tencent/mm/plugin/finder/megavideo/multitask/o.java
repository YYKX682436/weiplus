package com.tencent.mm.plugin.finder.megavideo.multitask;

/* loaded from: classes8.dex */
public final class o extends ak3.i {

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f120876q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.app.Activity activity, com.tencent.mm.ui.base.CustomViewPager customViewPager, android.view.View mContentView) {
        super(activity, customViewPager);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(mContentView, "mContentView");
        this.f120876q = mContentView;
    }

    @Override // ak3.i, ak3.c
    public boolean g() {
        return false;
    }

    @Override // ak3.i, ak3.c
    public android.view.View getContentView() {
        return this.f5582d instanceof com.tencent.mm.ui.MMActivity ? super.getContentView() : this.f120876q;
    }

    @Override // ak3.i, ak3.c
    public android.view.View getMaskView() {
        return this.f5582d instanceof com.tencent.mm.ui.MMActivity ? super.getMaskView() : getContentView();
    }
}
