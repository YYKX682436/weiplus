package com.tencent.mm.plugin.finder.ui.at;

/* loaded from: classes.dex */
public final class c implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f128877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.at.l f128878e;

    public c(android.view.View view, com.tencent.mm.plugin.finder.ui.at.l lVar) {
        this.f128877d = view;
        this.f128878e = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f128877d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return true;
        }
        layoutParams.height = com.tencent.mm.ui.bl.h(this.f128878e.getContext());
        return true;
    }
}
