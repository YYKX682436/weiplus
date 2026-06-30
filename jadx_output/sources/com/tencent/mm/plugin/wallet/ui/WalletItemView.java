package com.tencent.mm.plugin.wallet.ui;

/* loaded from: classes3.dex */
public class WalletItemView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f179130d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f179131e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f179132f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f179133g;

    public WalletItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.mm.plugin.wxpay.j.f188585h, i17, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            this.f179132f = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId2 != 0) {
            this.f179133g = context.getString(resourceId2);
        }
        int i18 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d6x, (android.view.ViewGroup) this, true);
        this.f179130d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        this.f179131e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nsf);
        android.widget.TextView textView = this.f179130d;
        if (textView != null) {
            textView.setText(this.f179132f);
        }
        android.widget.TextView textView2 = this.f179131e;
        if (textView2 != null) {
            textView2.setText(this.f179133g);
            this.f179131e.setLines(i18);
        }
    }

    public java.lang.Object getData() {
        return null;
    }

    public int getType() {
        return 0;
    }

    public void setSummary(java.lang.String str) {
        this.f179133g = str;
        this.f179131e.setText(str);
    }

    public void setTitle(java.lang.String str) {
        this.f179132f = str;
        this.f179130d.setText(str);
    }

    public void setSummary(android.text.Spanned spanned) {
        java.lang.String obj = spanned.toString();
        this.f179133g = obj;
        this.f179131e.setText(obj);
    }

    public WalletItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
