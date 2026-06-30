package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes8.dex */
public class ProfileNormalItemView extends com.tencent.mm.pluginsdk.ui.ProfileItemView {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f153777e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f153778f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View.OnClickListener f153779g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f153780h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f153781i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f153782m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f153783n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f153784o;

    public ProfileNormalItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f153780h = false;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rj.t.f396156f);
        this.f153777e = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
    }

    @Override // com.tencent.mm.pluginsdk.ui.ProfileItemView
    public void a() {
        this.f153781i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cep);
        this.f153782m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ceo);
        this.f153783n = findViewById(com.tencent.mm.R.id.m38);
        this.f153784o = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f486462uv1);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ProfileItemView
    public int getLayout() {
        return com.tencent.mm.R.layout.f489368cb3;
    }

    public ProfileNormalItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f153780h = false;
    }
}
