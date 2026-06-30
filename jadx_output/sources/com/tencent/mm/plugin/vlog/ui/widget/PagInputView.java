package com.tencent.mm.plugin.vlog.ui.widget;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001b\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002R6\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/widget/PagInputView;", "Lcom/tencent/mm/ui/widget/InsectRelativeLayout;", "", "visible", "Ljz5/f0;", "setImeVisibility", "", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "setup", "getResult", "show", "setShow", "Lkotlin/Function1;", "Lcom/tencent/mm/plugin/vlog/ui/widget/ChangeTextCallback;", "t", "Lyz5/l;", "getTextChangeCallback", "()Lyz5/l;", "setTextChangeCallback", "(Lyz5/l;)V", "textChangeCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PagInputView extends com.tencent.mm.ui.widget.InsectRelativeLayout {

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f176123o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f176124p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.EditText f176125q;

    /* renamed from: r, reason: collision with root package name */
    public int f176126r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f176127s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public yz5.l textChangeCallback;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Runnable f176129u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagInputView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View.inflate(context, com.tencent.mm.R.layout.a5o, this);
        setBackgroundResource(com.tencent.mm.R.color.a7p);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.d6_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f176123o = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.d6a);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f176124p = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.d6v);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.EditText editText = (android.widget.EditText) findViewById3;
        this.f176125q = editText;
        editText.setOnFocusChangeListener(new cq4.a(this));
        findViewById.setOnClickListener(new cq4.b(this));
        findViewById2.setOnClickListener(new cq4.c(this));
        setOnClickListener(new cq4.d(this));
        this.f176129u = new cq4.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setImeVisibility(boolean z17) {
        java.lang.Runnable runnable = this.f176129u;
        if (z17) {
            post(runnable);
            return;
        }
        removeCallbacks(runnable);
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    @Override // com.tencent.mm.ui.widget.InsectRelativeLayout
    public boolean a(int i17) {
        this.f176126r = i17;
        boolean z17 = i17 > com.tencent.mm.ui.bl.c(getContext());
        if (!this.f176127s) {
            return false;
        }
        if (!z17) {
            return true;
        }
        this.f176127s = false;
        return false;
    }

    public final java.lang.String getResult() {
        return this.f176125q.getText().toString();
    }

    public final yz5.l getTextChangeCallback() {
        return this.textChangeCallback;
    }

    public final void setShow(boolean z17) {
        android.widget.EditText editText = this.f176125q;
        if (z17) {
            setVisibility(0);
            setPadding(0, 0, 0, this.f176126r);
            editText.requestFocus();
        } else {
            editText.clearFocus();
            this.f176127s = true;
            setVisibility(8);
        }
    }

    public final void setTextChangeCallback(yz5.l lVar) {
        this.textChangeCallback = lVar;
    }

    public final void setup(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        android.widget.EditText editText = this.f176125q;
        editText.setText(text);
        editText.setSelection(0, text.length());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagInputView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
