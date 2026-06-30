package vh0;

/* loaded from: classes3.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh0.a1 f436978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f436979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f436980f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xj.m f436981g;

    public v1(vh0.a1 a1Var, kotlin.jvm.internal.h0 h0Var, android.view.View view, xj.m mVar) {
        this.f436978d = a1Var;
        this.f436979e = h0Var;
        this.f436980f = view;
        this.f436981g = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/yuanbao/YuanBaoAdTipService$attachAdTipView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoAdTipService", "ad_desc_content_ll click");
        vh0.a1 a1Var = this.f436978d;
        if (a1Var != null) {
            a1Var.a();
        }
        android.view.View inflate = android.view.View.inflate(view.getContext(), com.tencent.mm.R.layout.e0e, null);
        kotlin.jvm.internal.h0 h0Var = this.f436979e;
        db5.d5 d5Var = (db5.d5) h0Var.f310123d;
        if (d5Var != null && d5Var.isShowing()) {
            db5.d5 d5Var2 = (db5.d5) h0Var.f310123d;
            if (d5Var2 != null) {
                d5Var2.dismiss();
            }
            yj0.a.h(this, "com/tencent/mm/feature/yuanbao/YuanBaoAdTipService$attachAdTipView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        db5.d5 d5Var3 = new db5.d5(inflate, -2, -2);
        d5Var3.setTouchable(true);
        d5Var3.setFocusable(false);
        h0Var.f310123d = d5Var3;
        android.view.View view2 = this.f436980f;
        int measuredHeight = view2.getMeasuredHeight();
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.og7);
        if (linearLayout != null) {
            linearLayout.setBackgroundColor(linearLayout.getContext().getColor(com.tencent.mm.R.color.f478492d));
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.u3b);
            linearLayout2.setOnTouchListener(new vh0.t1(inflate));
            linearLayout2.setOnClickListener(new vh0.u1(a1Var, h0Var, this.f436981g));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.co6);
        if (weImageView != null) {
            weImageView.setVisibility(0);
            weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.f478492d));
            android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            i17 = view2.getWidth();
            view2.getHeight();
            ((android.widget.LinearLayout.LayoutParams) layoutParams).leftMargin = ((int) (i17 * 1.5d)) + com.tencent.mm.ui.zk.a(view2.getContext(), 7);
        } else {
            i17 = 0;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int b17 = i65.a.b(view2.getContext(), 10);
        db5.d5 d5Var4 = (db5.d5) h0Var.f310123d;
        if (d5Var4 != null) {
            d5Var4.showAtLocation(view2, 0, (iArr[0] - ((int) (i17 * 1.5d))) - b17, (iArr[1] + measuredHeight) - b17);
        }
        yj0.a.h(this, "com/tencent/mm/feature/yuanbao/YuanBaoAdTipService$attachAdTipView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
