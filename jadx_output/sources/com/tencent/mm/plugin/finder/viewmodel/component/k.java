package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class k extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f134906d;

    /* renamed from: e, reason: collision with root package name */
    public final int f134907e;

    public k(com.tencent.mm.plugin.finder.viewmodel.component.s sVar, int i17, int i18) {
        this.f134906d = i17;
        this.f134907e = i18;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, int i17, androidx.recyclerview.widget.RecyclerView parent) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(parent, "parent");
        super.getItemOffsets(outRect, i17, parent);
        int i18 = i17 % 3;
        int i19 = this.f134906d;
        if (i18 == 0) {
            outRect.left = i19;
            outRect.right = 0;
            return;
        }
        outRect.left = this.f134907e;
        if (i18 == 2) {
            outRect.right = i19;
        } else {
            outRect.right = 0;
        }
    }
}
