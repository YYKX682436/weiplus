package com.tencent.mm.ui.search;

/* loaded from: classes2.dex */
public class FTSSearchView extends android.widget.LinearLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f209834q = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f209835d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f209836e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f209837f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f209838g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSEditTextView f209839h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f209840i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f209841m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f209842n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f209843o;

    /* renamed from: p, reason: collision with root package name */
    public tj5.w f209844p;

    public FTSSearchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209843o = false;
        a();
    }

    public final void a() {
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) getContext().getSystemService("layout_inflater");
        boolean z17 = this.f209843o;
        layoutInflater.inflate(z17 ? com.tencent.mm.R.layout.bbq : com.tencent.mm.R.layout.bbp, (android.view.ViewGroup) this, true);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.mdr);
        this.f209837f = linearLayout;
        if (z17) {
            linearLayout.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478512u));
        }
        this.f209838g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.h1e);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.b5i);
        this.f209835d = textView;
        textView.setOnClickListener(new tj5.q(this));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.meb);
        this.f209842n = weImageView;
        weImageView.setVisibility(z17 ? 8 : 0);
        this.f209839h = (com.tencent.mm.ui.search.FTSEditTextView) findViewById(com.tencent.mm.R.id.gfl);
        if (this.f209841m) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.gfn);
            this.f209840i = findViewById;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/search/FTSSearchView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/search/FTSSearchView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f209840i.setOnClickListener(new tj5.r(this));
        }
        this.f209842n.setOnClickListener(new tj5.s(this));
    }

    public com.tencent.mm.ui.search.FTSEditTextView getFtsEditText() {
        return this.f209839h;
    }

    public android.widget.LinearLayout getSearchContainer() {
        return this.f209837f;
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView getSearchIcon() {
        return this.f209842n;
    }

    public void setCancelBtnVisible(int i17) {
        android.widget.TextView textView = this.f209835d;
        if (textView != null) {
            textView.setVisibility(i17);
        }
    }

    public void setImageSearchListener(tj5.v vVar) {
    }

    public void setSearchViewListener(tj5.w wVar) {
        this.f209844p = wVar;
    }

    public FTSSearchView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f209843o = false;
        a();
    }

    public FTSSearchView(android.content.Context context, boolean z17) {
        super(context);
        this.f209843o = false;
        this.f209841m = z17;
        a();
    }

    public FTSSearchView(android.content.Context context, boolean z17, boolean z18) {
        super(context);
        this.f209843o = false;
        this.f209841m = z17;
        this.f209843o = z18;
        a();
    }
}
