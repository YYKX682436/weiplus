package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes5.dex */
public final class u3 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117447d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f117448e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f117449f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f117450g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f117451h;

    /* renamed from: i, reason: collision with root package name */
    public r45.v11 f117452i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void T6(android.view.View view, java.lang.String title, java.lang.String subtitle, yz5.a action) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(subtitle, "subtitle");
        kotlin.jvm.internal.o.g(action, "action");
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc) : null;
        if (textView != null) {
            textView.setText(title);
        }
        android.widget.TextView textView2 = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.nrk) : null;
        if (textView2 != null) {
            textView2.setText(subtitle);
        }
        if (view != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.n3(action));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r0 == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f117447d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            int r0 = r0.length()
            if (r0 <= 0) goto Le
            r0 = r1
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 != r1) goto L13
            r0 = r1
            goto L14
        L13:
            r0 = r2
        L14:
            if (r0 == 0) goto L2b
            java.lang.String r0 = r4.f117448e
            if (r0 == 0) goto L27
            int r0 = r0.length()
            if (r0 <= 0) goto L22
            r0 = r1
            goto L23
        L22:
            r0 = r2
        L23:
            if (r0 != r1) goto L27
            r0 = r1
            goto L28
        L27:
            r0 = r2
        L28:
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            r1 = r2
        L2c:
            android.widget.TextView r0 = r4.f117451h
            if (r0 != 0) goto L31
            goto L34
        L31:
            r0.setEnabled(r1)
        L34:
            android.widget.TextView r0 = r4.f117451h
            if (r0 == 0) goto L4c
            androidx.appcompat.app.AppCompatActivity r2 = r4.getActivity()
            if (r1 == 0) goto L42
            r3 = 2131099825(0x7f0600b1, float:1.7812014E38)
            goto L45
        L42:
            r3 = 2131099901(0x7f0600fd, float:1.7812168E38)
        L45:
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
        L4c:
            android.widget.TextView r0 = r4.f117451h
            if (r0 != 0) goto L51
            goto L77
        L51:
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            androidx.appcompat.app.AppCompatActivity r3 = r4.getActivity()
            if (r1 == 0) goto L60
            r1 = 2131099789(0x7f06008d, float:1.7811941E38)
            goto L63
        L60:
            r1 = 2131099828(0x7f0600b4, float:1.781202E38)
        L63:
            int r1 = r3.getColor(r1)
            r2.setColor(r1)
            r1 = 8
            int r1 = pm0.v.S(r1)
            float r1 = (float) r1
            r2.setCornerRadius(r1)
            r0.setBackground(r2)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.u3.U6():void");
    }

    public final void V6(android.view.View view, boolean z17) {
        if (view != null) {
            view.setEnabled(!z17);
        }
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.nhj) : null;
        if (textView != null) {
            textView.setText(getActivity().getString(z17 ? com.tencent.mm.R.string.opc : com.tencent.mm.R.string.opd));
        }
        if (textView != null) {
            textView.setTextColor(getActivity().getColor(z17 ? com.tencent.mm.R.color.f478502m : com.tencent.mm.R.color.f478532ac));
        }
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.a4f) : null;
        if (findViewById == null) {
            return;
        }
        int i17 = z17 ? 4 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveCashOutMultiAuthUIC", "updateSubtypeView", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveCashOutMultiAuthUIC", "updateSubtypeView", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e9_;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById;
        r45.v11 v11Var = new r45.v11();
        byte[] byteArrayExtra = getActivity().getIntent().getByteArrayExtra("FinderLiveCashOutMuliAuth.KEY_MULTI_AUTH_DATA");
        if (byteArrayExtra != null) {
            try {
                v11Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        this.f117452i = v11Var;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.setMMTitle((java.lang.CharSequence) "");
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity2 = activity2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity2 : null;
        if (mMActivity2 != null) {
            mMActivity2.setBackGroundColorResource(com.tencent.mm.R.color.f478491c);
        }
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity3 = activity3 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity3 : null;
        if (mMActivity3 != null) {
            mMActivity3.setActionbarColor(getActivity().getColor(com.tencent.mm.R.color.f478491c));
        }
        androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity4 = activity4 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity4 : null;
        if (mMActivity4 != null) {
            mMActivity4.hideActionbarLine();
        }
        android.view.View findViewById2 = getRootView().findViewById(com.tencent.mm.R.id.uwm);
        this.f117449f = findViewById2;
        java.lang.String string = getActivity().getString(com.tencent.mm.R.string.opb);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = getActivity().getString(com.tencent.mm.R.string.opa);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        T6(findViewById2, string, string2, new com.tencent.mm.plugin.finder.live.viewmodel.p3(this));
        V6(this.f117449f, false);
        android.view.View findViewById3 = getRootView().findViewById(com.tencent.mm.R.id.ku_);
        this.f117450g = findViewById3;
        if (findViewById3 != null && (findViewById = findViewById3.findViewById(com.tencent.mm.R.id.ofy)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveCashOutMultiAuthUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveCashOutMultiAuthUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view = this.f117450g;
        java.lang.String string3 = getActivity().getString(com.tencent.mm.R.string.op_);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        java.lang.String string4 = getActivity().getString(com.tencent.mm.R.string.op9);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        T6(view, string3, string4, new com.tencent.mm.plugin.finder.live.viewmodel.r3(this));
        V6(this.f117450g, false);
        android.widget.TextView textView = (android.widget.TextView) getRootView().findViewById(com.tencent.mm.R.id.t4m);
        this.f117451h = textView;
        if (textView != null) {
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.t3(this));
        }
        U6();
    }
}
