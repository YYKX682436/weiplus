package com.tenpay.android.wechat;

/* loaded from: classes8.dex */
public class TenPayRelativeLayout extends android.widget.RelativeLayout {
    private java.lang.String accessibilityClassName;

    public TenPayRelativeLayout(android.content.Context context) {
        super(context);
        init(context, null);
    }

    private void init(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tenpay.R.styleable.TenPayRelativeLayout);
            this.accessibilityClassName = obtainStyledAttributes.getString(com.tenpay.R.styleable.TenPayRelativeLayout_TenPayAccessibilityClassName);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return android.text.TextUtils.isEmpty(this.accessibilityClassName) ? super.getAccessibilityClassName() : this.accessibilityClassName;
    }

    public TenPayRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public TenPayRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        init(context, attributeSet);
    }

    public TenPayRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        init(context, attributeSet);
    }
}
