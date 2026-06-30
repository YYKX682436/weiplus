package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class h implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f129307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderActivityDescUI f129308e;

    public h(android.view.View view, com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI) {
        this.f129307d = view;
        this.f129308e = finderActivityDescUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f129307d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI = this.f129308e;
        int h17 = com.tencent.mm.ui.bl.h(finderActivityDescUI);
        android.view.View view = finderActivityDescUI.f128493t;
        if (view == null) {
            kotlin.jvm.internal.o.o("descContainer");
            throw null;
        }
        int paddingTop = view.getPaddingTop();
        android.view.View view2 = finderActivityDescUI.f128493t;
        if (view2 != null) {
            view2.setPadding(0, paddingTop + h17, 0, 0);
            return true;
        }
        kotlin.jvm.internal.o.o("descContainer");
        throw null;
    }
}
