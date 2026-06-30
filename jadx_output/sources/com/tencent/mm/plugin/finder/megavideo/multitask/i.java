package com.tencent.mm.plugin.finder.megavideo.multitask;

/* loaded from: classes8.dex */
public final class i extends ak3.i {

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f120867q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Rect f120868r;

    public i(android.app.Activity activity, com.tencent.mm.ui.base.CustomViewPager customViewPager, android.view.View view) {
        super(activity, customViewPager);
        this.f120867q = view;
        this.f120868r = new android.graphics.Rect();
    }

    @Override // ak3.i, ak3.c
    public boolean g() {
        return true;
    }

    @Override // ak3.i, ak3.c
    public android.view.View getContentView() {
        return this.f5582d instanceof com.tencent.mm.ui.MMActivity ? super.getContentView() : this.f120867q;
    }

    @Override // ak3.i, ak3.c
    public android.view.View getMaskView() {
        return this.f5582d instanceof com.tencent.mm.ui.MMActivity ? super.getMaskView() : getContentView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ak3.i
    public boolean n(int i17, android.view.ViewGroup parent, float f17, float f18) {
        kotlin.jvm.internal.o.g(parent, "parent");
        int childCount = parent.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = parent.getChildAt(i18);
            if ((childAt instanceof com.tencent.mm.plugin.finder.view.z) && ((com.tencent.mm.plugin.finder.view.z) childAt).canScrollHorizontally(i17, parent, f17, f18)) {
                android.graphics.Rect rect = this.f120868r;
                childAt.getGlobalVisibleRect(rect);
                if (rect.contains((int) f17, (int) f18)) {
                    return true;
                }
            } else if ((childAt instanceof android.view.ViewGroup) && n(i17, (android.view.ViewGroup) childAt, f17, f18)) {
                return true;
            }
        }
        return false;
    }
}
