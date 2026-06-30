package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes3.dex */
public final class q2 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f173111d;

    /* renamed from: e, reason: collision with root package name */
    public final int f173112e;

    /* renamed from: f, reason: collision with root package name */
    public final int f173113f;

    public q2(com.tencent.mm.plugin.teenmode.ui.w2 w2Var, int i17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        i18 = (i27 & 2) != 0 ? 0 : i18;
        i19 = (i27 & 4) != 0 ? 3 : i19;
        this.f173111d = i17;
        this.f173112e = i18;
        this.f173113f = i19;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int v07 = parent.v0(view);
        int i17 = this.f173112e;
        int i18 = this.f173113f;
        int i19 = ((i17 / i18) * i18) - (i17 % i18 > 0 ? 0 : i18);
        int i27 = (i19 + i18) - 1;
        int i28 = this.f173111d;
        if (v07 < i18) {
            outRect.bottom = i28;
        } else {
            if (i19 <= v07 && v07 <= i27) {
                outRect.top = i28;
            } else {
                outRect.top = i28;
                outRect.bottom = i28;
            }
        }
        if (v07 % i18 == 0) {
            outRect.left = 0;
            outRect.right = i28;
        } else if (v07 % i18 == i18 - 1) {
            outRect.left = i28;
            outRect.right = 0;
        } else {
            outRect.left = i28;
            outRect.right = i28;
        }
    }
}
