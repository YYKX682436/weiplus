package com.tencent.mm.ui.base;

/* loaded from: classes5.dex */
public class MMFormInputView extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f197357d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f197358e;

    /* renamed from: f, reason: collision with root package name */
    public final int f197359f;

    /* renamed from: g, reason: collision with root package name */
    public final int f197360g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f197361h;

    public MMFormInputView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f197359f = -1;
        this.f197360g = -1;
        this.f197361h = null;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463102i, i17, 0);
        this.f197360g = obtainStyledAttributes.getResourceId(1, -1);
        this.f197359f = obtainStyledAttributes.getResourceId(3, -1);
        int resourceId = obtainStyledAttributes.getResourceId(2, -1);
        obtainStyledAttributes.recycle();
        android.view.View.inflate(context, resourceId, this);
    }

    public void a(android.text.TextWatcher textWatcher) {
        android.widget.EditText editText;
        if (textWatcher == null || (editText = this.f197358e) == null) {
            com.tencent.mm.ui.yk.f("MicroMsg.MMFormInputView", "watcher : %s, contentET : %s", textWatcher, this.f197358e);
        } else {
            editText.addTextChangedListener(textWatcher);
        }
    }

    public android.widget.EditText getContentEditText() {
        return this.f197358e;
    }

    public android.text.Editable getText() {
        android.widget.EditText editText = this.f197358e;
        if (editText != null) {
            return editText.getText();
        }
        com.tencent.mm.ui.yk.b("MicroMsg.MMFormInputView", "contentET is null!", new java.lang.Object[0]);
        return null;
    }

    public android.widget.TextView getTitleTextView() {
        return this.f197357d;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        this.f197357d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.tencent.mm.R.id.d98);
        this.f197358e = editText;
        android.widget.TextView textView = this.f197357d;
        if (textView == null || editText == null) {
            com.tencent.mm.ui.yk.f("MicroMsg.MMFormInputView", "titleTV : %s, contentET : %s", textView, editText);
        } else {
            int i17 = this.f197359f;
            if (i17 != -1) {
                textView.setText(i17);
            }
            int i18 = this.f197360g;
            if (i18 != -1) {
                this.f197358e.setHint(i18);
            }
        }
        android.widget.EditText editText2 = this.f197358e;
        if (editText2 != null) {
            editText2.setOnFocusChangeListener(new db5.b2(this));
        }
    }

    public void setFocusListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f197361h = onFocusChangeListener;
    }

    public void setHint(java.lang.String str) {
        android.widget.EditText editText = this.f197358e;
        if (editText != null) {
            editText.setHint(str);
        } else {
            com.tencent.mm.ui.yk.b("MicroMsg.MMFormInputView", "contentET is null!", new java.lang.Object[0]);
        }
    }

    public void setImeOption(int i17) {
        android.widget.EditText editText = this.f197358e;
        if (editText != null) {
            editText.setImeOptions(i17);
        } else {
            com.tencent.mm.ui.yk.b("MicroMsg.MMFormInputView", "contentET is null!", new java.lang.Object[0]);
        }
    }

    public void setInputType(int i17) {
        android.widget.EditText editText = this.f197358e;
        if (editText != null) {
            editText.setInputType(i17);
        } else {
            com.tencent.mm.ui.yk.b("MicroMsg.MMFormInputView", "contentET is null!", new java.lang.Object[0]);
        }
    }

    public void setText(java.lang.String str) {
        android.widget.EditText editText = this.f197358e;
        if (editText != null) {
            editText.setText(str);
        } else {
            com.tencent.mm.ui.yk.b("MicroMsg.MMFormInputView", "contentET is null!", new java.lang.Object[0]);
        }
    }

    public void setTitle(java.lang.String str) {
        android.widget.TextView textView = this.f197357d;
        if (textView != null) {
            textView.setText(str);
        } else {
            com.tencent.mm.ui.yk.b("MicroMsg.MMFormInputView", "titleTV is null!", new java.lang.Object[0]);
        }
    }

    public void setHint(int i17) {
        android.widget.EditText editText = this.f197358e;
        if (editText != null) {
            editText.setHint(i17);
        } else {
            com.tencent.mm.ui.yk.b("MicroMsg.MMFormInputView", "contentET is null!", new java.lang.Object[0]);
        }
    }

    public void setTitle(int i17) {
        android.widget.TextView textView = this.f197357d;
        if (textView != null) {
            textView.setText(i17);
        } else {
            com.tencent.mm.ui.yk.b("MicroMsg.MMFormInputView", "titleTV is null!", new java.lang.Object[0]);
        }
    }

    public MMFormInputView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
