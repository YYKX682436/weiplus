package ym5;

/* loaded from: classes10.dex */
public final class n6 extends ym5.h {

    /* renamed from: x, reason: collision with root package name */
    public float f463449x;

    @Override // ym5.h
    public bn5.f a() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        l45.q presenter = getPresenter();
        kotlin.jvm.internal.o.f(presenter, "getPresenter(...)");
        return new bn5.o(context, presenter);
    }

    @Override // ym5.h
    public dn5.c b() {
        return new dn5.h(getContext(), getPresenter());
    }

    @Override // ym5.h
    public void d() {
        ((l45.n) getPresenter()).m(getConfig());
        removeAllViews();
        getTextEditView();
        this.f463449x = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479714d7);
        android.view.ViewGroup.LayoutParams layoutParams = getRubbishView().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        android.view.View rubbishView = getRubbishView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(rubbishView, arrayList.toArray(), "com/tencent/mm/view/VideoCoverDrawingView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rubbishView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(rubbishView, "com/tencent/mm/view/VideoCoverDrawingView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(getRubbishView(), layoutParams2);
        addView(getBaseBoardView(), new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-1, (int) getResources().getDimension(com.tencent.mm.R.dimen.f480411x6));
        layoutParams3.gravity = 80;
        addView(getFooterBg(), layoutParams3);
        addView(getBaseFooterView(), layoutParams3);
        addView(getTextEditView(), new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.view.View textEditView = getTextEditView();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(textEditView, arrayList2.toArray(), "com/tencent/mm/view/VideoCoverDrawingView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textEditView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(textEditView, "com/tencent/mm/view/VideoCoverDrawingView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-1, qk.w9.a(getContext()));
        layoutParams4.gravity = 80;
        layoutParams4.bottomMargin += com.tencent.mm.ui.bl.c(getContext());
        getBaseFooterView().setVisibility(8);
        l45.q presenter = getPresenter();
        if (presenter != null) {
            dl.y yVar = (dl.y) ((l45.n) presenter).d(qk.g6.TEXT);
            if (yVar != null) {
                yVar.C = true;
                yVar.G = true;
            }
        }
    }

    @Override // ym5.h
    public qk.g6[] getFeatures() {
        if (this.f463347g == null) {
            this.f463347g = new qk.g6[]{qk.g6.TEXT};
        }
        qk.g6[] mFeaturesTypes = this.f463347g;
        kotlin.jvm.internal.o.f(mFeaturesTypes, "mFeaturesTypes");
        return mFeaturesTypes;
    }

    @Override // ym5.h
    public android.view.View getRubbishView() {
        if (this.f463351n == null) {
            this.f463352o = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.d3a, (android.view.ViewGroup) this, false);
        }
        android.view.View mRubbishView = this.f463352o;
        kotlin.jvm.internal.o.f(mRubbishView, "mRubbishView");
        return mRubbishView;
    }

    @Override // ym5.h
    public android.view.View getTextEditView() {
        if (this.f463351n == null) {
            android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.d3_, (android.view.ViewGroup) null);
            this.f463351n = inflate;
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.o4a);
            kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.view.PhotoEditText");
            this.f463357t = (com.tencent.mm.view.PhotoEditText) findViewById;
            android.view.View findViewById2 = this.f463351n.findViewById(com.tencent.mm.R.id.d6w);
            kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.Button");
            this.f463355r = (android.widget.Button) findViewById2;
            android.view.View findViewById3 = this.f463351n.findViewById(com.tencent.mm.R.id.d6s);
            kotlin.jvm.internal.o.e(findViewById3, "null cannot be cast to non-null type android.widget.Button");
            this.f463356s = (android.widget.Button) findViewById3;
            android.view.View findViewById4 = this.f463351n.findViewById(com.tencent.mm.R.id.mii);
            kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type com.tencent.mm.view.footer.SelectColorBar");
            com.tencent.mm.view.footer.SelectColorBar selectColorBar = (com.tencent.mm.view.footer.SelectColorBar) findViewById4;
            this.f463357t.setTextColor(-1);
            android.view.View findViewById5 = this.f463351n.findViewById(com.tencent.mm.R.id.agw);
            kotlin.jvm.internal.o.e(findViewById5, "null cannot be cast to non-null type com.tencent.mm.view.TextModeSelectView");
            com.tencent.mm.view.TextModeSelectView textModeSelectView = (com.tencent.mm.view.TextModeSelectView) findViewById5;
            this.f463358u = textModeSelectView;
            textModeSelectView.setTag(-707825);
            this.f463358u.setMode(kz5.c0.i(1, 2, 3));
            this.f463358u.setModeResourceMap(kz5.c1.k(new jz5.l(1, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_text_style1)), new jz5.l(2, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_text_style2)), new jz5.l(3, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_text_style3))));
            this.f463358u.setColorFilter(-1);
            this.f463358u.setModeChangeListener(new ym5.h6(selectColorBar, this));
            selectColorBar.setSelectColor(-1);
            selectColorBar.setSelectColorListener(new ym5.i6(this));
            this.f463355r.setOnClickListener(new ym5.j6(this));
            this.f463356s.setOnClickListener(new ym5.k6(this));
            this.f463351n.setOnClickListener(ym5.l6.f463434d);
        }
        android.view.View mTextEditView = this.f463351n;
        kotlin.jvm.internal.o.f(mTextEditView, "mTextEditView");
        return mTextEditView;
    }
}
