package com.tencent.mm.ui.base;

/* loaded from: classes12.dex */
public class MMAutoSwitchEditTextView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f197316d;

    /* renamed from: e, reason: collision with root package name */
    public final int f197317e;

    /* renamed from: f, reason: collision with root package name */
    public final int f197318f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f197319g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f197320h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f197321i;

    /* renamed from: m, reason: collision with root package name */
    public final db5.q1 f197322m;

    /* renamed from: n, reason: collision with root package name */
    public final int f197323n;

    public MMAutoSwitchEditTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197321i = new java.util.ArrayList();
        this.f197322m = new db5.q1(this, null);
        this.f197323n = 100;
        this.f197320h = context;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f447183a);
        int integer = obtainStyledAttributes.getInteger(0, 3);
        this.f197316d = integer;
        this.f197317e = obtainStyledAttributes.getInteger(3, 4);
        this.f197318f = obtainStyledAttributes.getInteger(2, 2);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            this.f197319g = context.getString(resourceId);
        }
        obtainStyledAttributes.recycle();
        if (context instanceof android.app.Activity) {
            this.f197323n = ((((android.app.Activity) context).getWindowManager().getDefaultDisplay().getWidth() - 80) - ((integer - 1) * 20)) / integer;
        }
        setPadding(i65.a.b(context, 20), 0, i65.a.b(context, 20), 0);
        for (int i17 = 0; i17 < this.f197316d; i17++) {
            com.tencent.mm.ui.base.MMAutoSwitchEditText mMAutoSwitchEditText = (com.tencent.mm.ui.base.MMAutoSwitchEditText) android.view.View.inflate(this.f197320h, com.tencent.mm.R.layout.f488164iy, null);
            mMAutoSwitchEditText.setInputType(this.f197318f);
            java.lang.String str = this.f197319g;
            if (str != null && str.length() > 0) {
                mMAutoSwitchEditText.setKeyListener(android.text.method.DigitsKeyListener.getInstance(str));
            }
            mMAutoSwitchEditText.setIndex(i17);
            mMAutoSwitchEditText.setMaxInputCount(this.f197317e);
            db5.q1 q1Var = this.f197322m;
            mMAutoSwitchEditText.setOnExceedMaxLimitCount(q1Var);
            mMAutoSwitchEditText.setOnDelAllContent(q1Var);
            mMAutoSwitchEditText.setOnTextInputChanged(q1Var);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(this.f197323n, -2);
            if (i17 > 0) {
                layoutParams.leftMargin = 20;
            } else {
                layoutParams.leftMargin = 0;
            }
            layoutParams.weight = 1.0f;
            mMAutoSwitchEditText.setLayoutParams(layoutParams);
            this.f197321i.add(mMAutoSwitchEditText);
            addView(mMAutoSwitchEditText);
        }
    }

    public java.lang.String getText() {
        java.util.Iterator it = this.f197321i.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            com.tencent.mm.ui.base.MMAutoSwitchEditText mMAutoSwitchEditText = (com.tencent.mm.ui.base.MMAutoSwitchEditText) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mMAutoSwitchEditText.getText().toString().trim())) {
                str = str + mMAutoSwitchEditText.getText().toString().trim();
            }
        }
        return str;
    }

    public void setOnInputFinished(db5.o1 o1Var) {
    }

    public void setOnTextChanged(db5.p1 p1Var) {
    }
}
