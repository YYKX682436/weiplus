package com.tencent.mm.ui.widget.bottomsheet;

/* loaded from: classes8.dex */
public class ViewTitleWithAnimation extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f211535d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f211536e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f211537f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f211538g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f211539h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f211540i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f211541m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f211542n;

    public ViewTitleWithAnimation(android.content.Context context) {
        super(context);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488231nr, this);
        this.f211535d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oqh);
        this.f211542n = findViewById(com.tencent.mm.R.id.ofq);
        this.f211536e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hlr);
        this.f211537f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487469oq0);
        this.f211538g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.omm);
        this.f211539h = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hmo);
        this.f211540i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.omn);
        this.f211541m = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.hw8);
    }

    public android.widget.ImageView getIconImageView() {
        return this.f211536e;
    }

    public void setCompanyText(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f211538g.setVisibility(8);
        } else {
            this.f211538g.setVisibility(0);
            this.f211538g.setText(str);
        }
    }

    public void setSubTitle(java.lang.String str) {
        this.f211537f.setText(str);
    }

    public void setTitle(java.lang.String str) {
        this.f211535d.setText(str);
    }

    public void setTopPaddingVisibility(int i17) {
        android.view.View view = this.f211542n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/bottomsheet/ViewTitleWithAnimation", "setTopPaddingVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/widget/bottomsheet/ViewTitleWithAnimation", "setTopPaddingVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public ViewTitleWithAnimation(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ViewTitleWithAnimation(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
