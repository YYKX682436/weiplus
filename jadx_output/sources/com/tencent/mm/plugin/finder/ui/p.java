package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f129611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderActivityDescUI f129612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f129613f;

    public p(android.view.View view, com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI, boolean z17) {
        this.f129611d = view;
        this.f129612e = finderActivityDescUI;
        this.f129613f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        int height = this.f129611d.getHeight();
        com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI = this.f129612e;
        android.view.View view = finderActivityDescUI.f128493t;
        if (view == null) {
            kotlin.jvm.internal.o.o("descContainer");
            throw null;
        }
        int height2 = view.getHeight();
        if (!this.f129613f) {
            int b17 = i65.a.b(finderActivityDescUI.getContext(), 170);
            if (height - height2 > b17) {
                android.view.View view2 = finderActivityDescUI.f128493t;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("descContainer");
                    throw null;
                }
                android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.height = height - b17;
                android.view.View view3 = finderActivityDescUI.f128493t;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("descContainer");
                    throw null;
                }
                view3.setLayoutParams(layoutParams);
            }
            android.widget.TextView textView = finderActivityDescUI.B;
            if (textView == null) {
                kotlin.jvm.internal.o.o("cancelBtn");
                throw null;
            }
            textView.setText(com.tencent.mm.plugin.finder.ui.FinderActivityDescUI.c7(finderActivityDescUI));
            android.widget.TextView textView2 = finderActivityDescUI.B;
            if (textView2 != null) {
                textView2.setVisibility(0);
                return;
            } else {
                kotlin.jvm.internal.o.o("cancelBtn");
                throw null;
            }
        }
        int b18 = i65.a.b(finderActivityDescUI.getContext(), 170);
        if (height - height2 > b18) {
            android.view.View view4 = finderActivityDescUI.f128493t;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("descContainer");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
            layoutParams2.height = height - b18;
            android.view.View view5 = finderActivityDescUI.f128493t;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("descContainer");
                throw null;
            }
            view5.setLayoutParams(layoutParams2);
        }
        android.widget.TextView textView3 = finderActivityDescUI.A;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("participateBtn");
            throw null;
        }
        r45.h21 h21Var = finderActivityDescUI.Y;
        if (h21Var != null) {
            str = h21Var.getString(3);
            if (str == null) {
                str = "";
            }
        } else {
            str = null;
        }
        if (str == null) {
            str = finderActivityDescUI.getResources().getString(com.tencent.mm.R.string.f491256cj4);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        }
        textView3.setText(str);
        android.widget.TextView textView4 = finderActivityDescUI.A;
        if (textView4 != null) {
            textView4.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("participateBtn");
            throw null;
        }
    }
}
