package com.tencent.mm.plugin.product.ui;

/* loaded from: classes3.dex */
public class MallProductItemView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f153199d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f153200e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f153201f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f153202g;

    public MallProductItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.mm.plugin.wxpay.j.f188582e, i17, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            this.f153201f = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId2 != 0) {
            this.f153202g = context.getString(resourceId2);
        }
        int i18 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cad, (android.view.ViewGroup) this, true);
        this.f153199d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        this.f153200e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nsf);
        this.f153199d.setText(this.f153201f);
        this.f153200e.setText(this.f153202g);
        this.f153200e.setLines(i18);
    }

    public java.lang.Object getData() {
        return null;
    }

    public int getType() {
        return 0;
    }

    public void setSummary(java.lang.String str) {
        this.f153202g = str;
        this.f153200e.setText(str);
    }

    public void setTitle(java.lang.String str) {
        this.f153201f = str;
        this.f153199d.setText(str);
    }

    public void setSummary(android.text.Spanned spanned) {
        java.lang.String obj = spanned.toString();
        this.f153202g = obj;
        this.f153200e.setText(obj);
    }

    public MallProductItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
