package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class v6 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f129943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderHomeAnimUI f129944e;

    public v6(android.view.View view, com.tencent.mm.plugin.finder.ui.FinderHomeAnimUI finderHomeAnimUI) {
        this.f129943d = view;
        this.f129944e = finderHomeAnimUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f129943d.getViewTreeObserver().removeOnPreDrawListener(this);
        android.graphics.Bitmap bitmap = com.tencent.mm.plugin.finder.ui.FinderHomeAnimUI.f128581e;
        com.tencent.mm.plugin.finder.ui.FinderHomeAnimUI finderHomeAnimUI = this.f129944e;
        finderHomeAnimUI.getContentView().postDelayed(finderHomeAnimUI.f128582d, 300L);
        return true;
    }
}
