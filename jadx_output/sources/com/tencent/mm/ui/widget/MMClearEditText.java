package com.tencent.mm.ui.widget;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B\u001d\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0018\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/tencent/mm/ui/widget/MMClearEditText;", "Lcom/tencent/mm/ui/widget/MMEditText;", "Landroid/view/View$OnFocusChangeListener;", "l", "Ljz5/f0;", "setOnFocusChangeListener", "Landroid/view/View$OnTouchListener;", "getDefaultOnTouchListener", "", "G", "Z", "getMEnableRestoreState", "()Z", "setMEnableRestoreState", "(Z)V", "mEnableRestoreState", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "H", "Landroid/graphics/drawable/Drawable;", "getImgX", "()Landroid/graphics/drawable/Drawable;", "setImgX", "(Landroid/graphics/drawable/Drawable;)V", "imgX", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MMClearEditText extends com.tencent.mm.ui.widget.MMEditText {
    public static final /* synthetic */ int K = 0;

    /* renamed from: G, reason: from kotlin metadata */
    public boolean mEnableRestoreState;

    /* renamed from: H, reason: from kotlin metadata */
    public android.graphics.drawable.Drawable imgX;
    public android.view.View.OnFocusChangeListener I;

    /* renamed from: J, reason: collision with root package name */
    public final android.view.View.OnTouchListener f211305J;

    public MMClearEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.imgX = com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f_);
        this.f211305J = new al5.v0(this);
        r();
    }

    private final void r() {
        if (this.imgX == null) {
            this.imgX = com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f_);
        }
        android.graphics.drawable.Drawable drawable = this.imgX;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.imgX.getIntrinsicHeight());
        com.tencent.mars.xlog.Log.i("MicroMsg.MMClearEditText", "imgX width %d height %d", java.lang.Integer.valueOf(this.imgX.getIntrinsicWidth()), java.lang.Integer.valueOf(this.imgX.getIntrinsicHeight()));
        u();
        setHeight(this.imgX.getIntrinsicHeight() + (getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479898ib) * 5));
        setOnTouchListener(this.f211305J);
        addTextChangedListener(new al5.t0(this));
        super.setOnFocusChangeListener(new al5.u0(this));
        jg5.c.f299665a.a(this, 1);
    }

    /* renamed from: getDefaultOnTouchListener, reason: from getter */
    public final android.view.View.OnTouchListener getF211305J() {
        return this.f211305J;
    }

    public final android.graphics.drawable.Drawable getImgX() {
        return this.imgX;
    }

    public final boolean getMEnableRestoreState() {
        return this.mEnableRestoreState;
    }

    @Override // com.tencent.mm.ui.widget.MMEditText, fl5.i
    public fl5.i getRealEditText() {
        return this;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof android.widget.TextView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        if (!this.mEnableRestoreState) {
            parcelable = android.view.View.BaseSavedState.EMPTY_STATE;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // com.tencent.mm.ui.widget.MMEditText
    public void s(java.lang.String srcString) {
        kotlin.jvm.internal.o.g(srcString, "srcString");
        int selectionStart = getSelectionStart();
        setText(pg5.d.a(getContext(), srcString));
        int length = getText().length() - srcString.length();
        if (length <= 0) {
            setSelection(selectionStart);
            return;
        }
        int i17 = selectionStart + length;
        if (i17 <= getText().length()) {
            setSelection(i17);
        }
    }

    public final void setImgX(android.graphics.drawable.Drawable drawable) {
        this.imgX = drawable;
    }

    public final void setMEnableRestoreState(boolean z17) {
        this.mEnableRestoreState = z17;
    }

    @Override // com.tencent.mm.ui.widget.MMEditText, android.view.View, fl5.i
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.I = onFocusChangeListener;
    }

    public final void u() {
        if (r26.n0.N(getText().toString()) || !isFocused()) {
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
        } else {
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.imgX, getCompoundDrawables()[3]);
        }
    }

    public MMClearEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.imgX = com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f_);
        this.f211305J = new al5.v0(this);
        r();
    }
}
