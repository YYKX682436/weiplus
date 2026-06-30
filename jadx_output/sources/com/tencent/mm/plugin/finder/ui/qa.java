package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class qa implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderModifyNameUI f129727d;

    public qa(com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI) {
        this.f129727d = finderModifyNameUI;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        if (i38 != i27) {
            com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI = this.f129727d;
            int dimensionPixelSize = finderModifyNameUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
            if (i38 < i27) {
                android.view.View view2 = finderModifyNameUI.f128633y;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("inputContainer");
                    throw null;
                }
                if (view2.getHeight() < dimensionPixelSize) {
                    android.view.View view3 = finderModifyNameUI.f128633y;
                    if (view3 != null) {
                        view3.scrollBy(0, i27 - i38);
                        return;
                    } else {
                        kotlin.jvm.internal.o.o("inputContainer");
                        throw null;
                    }
                }
                return;
            }
            android.view.View view4 = finderModifyNameUI.f128633y;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("inputContainer");
                throw null;
            }
            if (view4.getScrollY() > 0) {
                android.view.View view5 = finderModifyNameUI.f128633y;
                if (view5 != null) {
                    view5.scrollBy(0, i27 - i38);
                } else {
                    kotlin.jvm.internal.o.o("inputContainer");
                    throw null;
                }
            }
        }
    }
}
