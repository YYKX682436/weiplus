package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.w1 f173759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.j2 f173760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f173761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f173762g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f173763h;

    public c2(com.tencent.mm.plugin.textstatus.ui.w1 w1Var, com.tencent.mm.plugin.textstatus.ui.j2 j2Var, java.util.List list, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2) {
        this.f173759d = w1Var;
        this.f173760e = j2Var;
        this.f173761f = list;
        this.f173762g = linearLayout;
        this.f173763h = linearLayout2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.textstatus.ui.w1 w1Var = this.f173759d;
        android.view.ViewGroup.LayoutParams layoutParams = w1Var.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            android.widget.LinearLayout linearLayout = this.f173763h;
            layoutParams2.width = linearLayout.getWidth();
            layoutParams2.height = linearLayout.getHeight();
            w1Var.setLayoutParams(layoutParams2);
            linearLayout.getWidth();
            linearLayout.getHeight();
        }
        com.tencent.mm.plugin.textstatus.ui.j2 j2Var = this.f173760e;
        j2Var.f173996f.getClass();
        if (((java.lang.Boolean) ((jz5.n) di4.i.f232787f).getValue()).booleanValue()) {
            mj4.h hVar = (mj4.h) kz5.n0.Z(this.f173761f);
            java.lang.String l17 = hVar != null ? ((mj4.k) hVar).l() : "";
            android.widget.LinearLayout linearLayout2 = this.f173762g;
            if (linearLayout2 == null) {
                return;
            }
            com.tencent.mm.plugin.textstatus.ui.StatusPostEntryButton statusPostEntryButton = new com.tencent.mm.plugin.textstatus.ui.StatusPostEntryButton(j2Var.f173995e, null, 0, 6, null);
            bi4.h1 h1Var = j2Var.f173996f;
            int i17 = kotlin.jvm.internal.o.b(h1Var.f21049a, en1.a.a()) ? com.tencent.mm.R.string.pin : com.tencent.mm.R.string.pim;
            android.content.Context context = j2Var.f173995e;
            java.lang.String string = context.getString(i17);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            statusPostEntryButton.setTitle(string);
            int applyDimension = (int) android.util.TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics());
            statusPostEntryButton.setPadding(statusPostEntryButton.getPaddingLeft(), applyDimension, statusPostEntryButton.getPaddingRight(), applyDimension);
            statusPostEntryButton.setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.x1(j2Var, l17));
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 1;
            layoutParams3.topMargin = (int) android.util.TypedValue.applyDimension(1, 24.0f, context.getResources().getDisplayMetrics());
            linearLayout2.addView(statusPostEntryButton, layoutParams3);
            j2Var.f173997g = statusPostEntryButton;
            qj4.s.f363958a.a(j2Var.f173997g, new qj4.l(h1Var.f21049a, true, h1Var.f21051c, l17, null, null, null, 48, null));
        }
    }
}
