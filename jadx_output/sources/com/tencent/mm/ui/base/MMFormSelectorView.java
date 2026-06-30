package com.tencent.mm.ui.base;

/* loaded from: classes5.dex */
public class MMFormSelectorView extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f197368d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f197369e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f197370f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f197371g;

    public MMFormSelectorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463102i, i17, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            this.f197370f = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            this.f197371g = context.getString(resourceId2);
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(2, -1);
        obtainStyledAttributes.recycle();
        android.view.View.inflate(context, resourceId3, this);
    }

    public java.lang.String getText() {
        android.widget.EditText editText = this.f197369e;
        if (editText != null) {
            return editText.getText().toString();
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MMFormSelectorView", "contentET is null!");
        return null;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        this.f197368d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.tencent.mm.R.id.d98);
        this.f197369e = editText;
        android.widget.TextView textView = this.f197368d;
        if (textView == null || editText == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMFormSelectorView", "titleTV : %s, contentET : %s", textView, editText);
            return;
        }
        java.lang.String str = this.f197370f;
        if (str != null) {
            textView.setText(str);
        }
        java.lang.String str2 = this.f197371g;
        if (str2 != null) {
            this.f197369e.setHint(str2);
        }
    }

    public void setHint(java.lang.String str) {
        android.widget.EditText editText = this.f197369e;
        if (editText != null) {
            editText.setHint(str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFormSelectorView", "contentET is null!");
        }
    }

    public void setText(java.lang.String str) {
        android.widget.EditText editText = this.f197369e;
        if (editText != null) {
            editText.setText(str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFormSelectorView", "contentET is null!");
        }
    }

    public void setTitle(java.lang.String str) {
        android.widget.TextView textView = this.f197368d;
        if (textView != null) {
            textView.setText(str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFormSelectorView", "titleTV is null!");
        }
    }

    public void setHint(int i17) {
        android.widget.EditText editText = this.f197369e;
        if (editText != null) {
            editText.setHint(i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFormSelectorView", "contentET is null!");
        }
    }

    public void setTitle(int i17) {
        android.widget.TextView textView = this.f197368d;
        if (textView != null) {
            textView.setText(i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFormSelectorView", "titleTV is null!");
        }
    }

    public MMFormSelectorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
