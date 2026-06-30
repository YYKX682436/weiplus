package com.tencent.mm.ui.base;

/* loaded from: classes5.dex */
public class MMFormMobileInputView extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f197362d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f197363e;

    /* renamed from: f, reason: collision with root package name */
    public final int f197364f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f197365g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f197366h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f197367i;

    public MMFormMobileInputView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f197364f = -1;
        this.f197366h = "";
        this.f197367i = "";
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463102i, i17, 0);
        this.f197364f = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.byl, this);
    }

    public void a(boolean z17) {
        android.widget.EditText editText = this.f197362d;
        this.f197365g = new int[]{editText.getPaddingLeft(), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom()};
        if (z17) {
            this.f197362d.setBackgroundResource(com.tencent.mm.R.drawable.c7a);
        } else {
            this.f197362d.setBackgroundResource(com.tencent.mm.R.drawable.c7b);
        }
        android.widget.EditText editText2 = this.f197362d;
        int[] iArr = this.f197365g;
        if (iArr != null) {
            editText2.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        android.widget.EditText editText3 = this.f197363e;
        this.f197365g = new int[]{editText3.getPaddingLeft(), editText3.getPaddingTop(), editText3.getPaddingRight(), editText3.getPaddingBottom()};
        if (z17) {
            this.f197363e.setBackgroundResource(com.tencent.mm.R.drawable.c7a);
        } else {
            this.f197363e.setBackgroundResource(com.tencent.mm.R.drawable.c7b);
        }
        android.widget.EditText editText4 = this.f197363e;
        int[] iArr2 = this.f197365g;
        if (iArr2 != null) {
            editText4.setPadding(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
        }
    }

    public java.lang.String getCountryCode() {
        android.widget.EditText editText = this.f197362d;
        return editText != null ? editText.getText().toString().trim() : "";
    }

    public android.widget.EditText getCountryCodeEditText() {
        return this.f197362d;
    }

    public java.lang.String getMobileNumber() {
        android.widget.EditText editText = this.f197363e;
        return editText != null ? com.tencent.mm.sdk.platformtools.c5.h(editText.getText().toString()) : "";
    }

    public android.widget.EditText getMobileNumberEditText() {
        return this.f197363e;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f197362d = (android.widget.EditText) findViewById(com.tencent.mm.R.id.cjw);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.tencent.mm.R.id.jn8);
        this.f197363e = editText;
        android.widget.EditText editText2 = this.f197362d;
        if (editText2 == null || editText == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMFormMobileInputView", "countryCodeET : %s, mobileNumberET : %s", editText2, editText);
        } else {
            int i17 = this.f197364f;
            if (i17 != -1) {
                editText.setHint(i17);
            }
        }
        android.widget.EditText editText3 = this.f197362d;
        if (editText3 == null || this.f197363e == null) {
            return;
        }
        if (editText3.hasFocus() || this.f197363e.hasFocus()) {
            a(true);
        } else {
            a(false);
        }
        db5.c2 c2Var = new db5.c2(this);
        this.f197362d.setOnFocusChangeListener(c2Var);
        this.f197363e.setOnFocusChangeListener(c2Var);
        android.widget.EditText editText4 = this.f197363e;
        editText4.addTextChangedListener(new al5.p1(editText4, null, 20));
        this.f197363e.addTextChangedListener(new db5.d2(this));
        this.f197362d.addTextChangedListener(new db5.e2(this));
    }

    public void setCountryCode(java.lang.String str) {
        android.widget.EditText editText = this.f197362d;
        if (editText != null) {
            editText.setText(str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFormMobileInputView", "countryCodeET is null!");
        }
    }

    public void setHint(java.lang.String str) {
        android.widget.EditText editText = this.f197363e;
        if (editText != null) {
            editText.setHint(str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFormMobileInputView", "mobileNumberET is null!");
        }
    }

    public void setMobileNumber(java.lang.String str) {
        android.widget.EditText editText = this.f197363e;
        if (editText != null) {
            editText.setText(str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFormMobileInputView", "mobileNumberET is null!");
        }
    }

    public void setOnCountryCodeChangedListener(db5.f2 f2Var) {
    }

    public MMFormMobileInputView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
