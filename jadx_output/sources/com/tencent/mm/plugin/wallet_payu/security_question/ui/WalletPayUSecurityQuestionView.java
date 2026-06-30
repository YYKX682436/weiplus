package com.tencent.mm.plugin.wallet_payu.security_question.ui;

/* loaded from: classes5.dex */
public class WalletPayUSecurityQuestionView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f181285d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.tools.CustomFitTextView f181286e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f181287f;

    public WalletPayUSecurityQuestionView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        str = "";
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.mm.plugin.wxpay.j.f188578a, -1, 0);
            int resourceId = obtainStyledAttributes.getResourceId(13, 0);
            java.lang.String string = resourceId != 0 ? context.getString(resourceId) : "";
            int resourceId2 = obtainStyledAttributes.getResourceId(8, 0);
            str = resourceId2 != 0 ? context.getString(resourceId2) : "";
            boolean z18 = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
            z17 = z18;
            str2 = str;
            str = string;
        } else {
            str2 = "";
            z17 = false;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c9_, (android.view.ViewGroup) this, true);
        this.f181285d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o_q);
        this.f181286e = (com.tencent.mm.ui.tools.CustomFitTextView) inflate.findViewById(com.tencent.mm.R.id.f486387l26);
        this.f181285d.setText(str);
        com.tencent.mm.ui.tools.CustomFitTextView customFitTextView = this.f181286e;
        customFitTextView.d(str2, customFitTextView.f210035h, customFitTextView.f210038n, customFitTextView.f210036i, customFitTextView.getResources().getColor(com.tencent.mm.R.color.f479232tk));
        if (!z17) {
            this.f181286e.setEnabled(false);
            this.f181286e.setFocusable(false);
            this.f181286e.setClickable(false);
            this.f181286e.setBackgroundResource(com.tencent.mm.R.drawable.f482190b84);
            setBackgroundResource(com.tencent.mm.R.drawable.bfj);
            return;
        }
        this.f181286e.setEnabled(false);
        this.f181286e.setTextColor(getResources().getColor(com.tencent.mm.R.color.a_r));
        this.f181286e.setFocusable(false);
        this.f181286e.setClickable(false);
        this.f181286e.setBackgroundResource(com.tencent.mm.R.drawable.f482190b84);
        setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
    }

    public java.lang.String getCurrentQuestion() {
        return this.f181287f;
    }

    public void setQuestionText(java.lang.String str) {
        this.f181287f = str;
        android.text.method.KeyListener keyListener = this.f181286e.getKeyListener();
        this.f181286e.setInputType(1);
        this.f181286e.setKeyListener(null);
        setValStr(str);
        this.f181286e.setKeyListener(keyListener);
    }

    public void setValStr(java.lang.String str) {
        com.tencent.mm.ui.tools.CustomFitTextView customFitTextView = this.f181286e;
        customFitTextView.d(str, 3, false, -1, customFitTextView.getCurrentTextColor());
    }

    public WalletPayUSecurityQuestionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
