package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class dj implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f134145e;

    public dj(android.view.View view, com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f134144d = view;
        this.f134145e = blVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f134144d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f134145e;
        int h17 = com.tencent.mm.ui.bl.h(blVar.getActivity());
        android.view.View findViewById = blVar.findViewById(com.tencent.mm.R.id.e5b);
        if (findViewById != null) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            kb2.b bVar = kb2.b.f306225a;
            layoutParams.height += h17;
            findViewById.setLayoutParams(layoutParams);
            findViewById.setPadding(0, h17, 0, 0);
        }
        android.view.View findViewById2 = blVar.findViewById(com.tencent.mm.R.id.jtz);
        if (findViewById2 == null) {
            return true;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
        layoutParams2.height += h17;
        findViewById2.setLayoutParams(layoutParams2);
        findViewById2.setPadding(findViewById2.getPaddingLeft(), h17, findViewById2.getPaddingRight(), findViewById2.getPaddingBottom());
        return true;
    }
}
