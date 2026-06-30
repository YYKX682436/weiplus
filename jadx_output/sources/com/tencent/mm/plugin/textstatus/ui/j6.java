package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class j6 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f174004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174005e;

    public j6(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f174004d = viewGroup;
        this.f174005e = textStatusDoWhatActivityV2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view;
        android.view.View view2;
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.ViewGroup viewGroup = this.f174004d;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f174005e;
        com.tencent.mm.plugin.appbrand.service.l5 l5Var = textStatusDoWhatActivityV2.f173556x;
        if (l5Var != null && (view = l5Var.getView()) != null) {
            com.tencent.mm.sdk.platformtools.d2.a(textStatusDoWhatActivityV2);
            i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 50);
            int k17 = ((((i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a) - com.tencent.mm.ui.bl.h(com.tencent.mm.sdk.platformtools.x2.f193071a)) - textStatusDoWhatActivityV2.e7().getHeight()) - i65.a.a(view.getContext(), 248.0f)) - i65.a.a(view.getContext(), 32.0f)) - com.tencent.mm.ui.bl.c(view.getContext());
            if (k17 <= 0) {
                k17 = ym5.x.a(view.getContext(), 300.0f);
            }
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, k17);
            layoutParams.addRule(9);
            layoutParams.addRule(12);
            view.setLayoutParams(layoutParams);
            com.tencent.mm.plugin.appbrand.service.l5 l5Var2 = textStatusDoWhatActivityV2.f173556x;
            if (l5Var2 != null && (view2 = l5Var2.getView()) != null) {
                view2.requestLayout();
            }
            view.setOutlineProvider(new bk4.e2(true, false, i65.a.b(view.getContext(), 12)));
            view.setClipToOutline(true);
            viewGroup.addView(view);
            view.setTranslationY(k17);
        }
        return true;
    }
}
