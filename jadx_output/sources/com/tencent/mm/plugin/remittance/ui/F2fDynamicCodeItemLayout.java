package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes3.dex */
public class F2fDynamicCodeItemLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f157098d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f157099e;

    public F2fDynamicCodeItemLayout(android.content.Context context) {
        super(context);
        a();
    }

    public final void a() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.ce6, this);
        this.f157098d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486672m31);
        this.f157099e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486673m32);
    }

    public F2fDynamicCodeItemLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public F2fDynamicCodeItemLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
