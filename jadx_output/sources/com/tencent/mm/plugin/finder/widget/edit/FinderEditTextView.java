package com.tencent.mm.plugin.finder.widget.edit;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000f¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/finder/widget/edit/FinderEditTextView;", "Landroid/widget/FrameLayout;", "", "maxLines", "Ljz5/f0;", "setTextMaxLines", "gravity", "setTextGravity", "type", "setTextInputType", "", "visible", "setTextCursorVisible", "resId", "setTextCursorDrawable", "", "hint", "setTextHint", "getText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderEditTextView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f136947d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f136948e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderEditTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f136947d = "Finder.FinderEditTextView";
        a();
    }

    public final void a() {
        this.f136948e = new com.tencent.mm.ui.widget.MMEditText(getContext());
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        android.view.View view = this.f136948e;
        if (view == null) {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
        addView(view, layoutParams);
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f136948e;
        if (mMEditText != null) {
            mMEditText.setBackground(null);
        } else {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
    }

    public final java.lang.String getText() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f136948e;
        if (mMEditText != null) {
            return mMEditText.getText().toString();
        }
        kotlin.jvm.internal.o.o("editText");
        throw null;
    }

    public final void setTextCursorDrawable(int i17) {
        try {
            java.lang.reflect.Field declaredField = android.widget.TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.f136948e;
            if (mMEditText != null) {
                declaredField.set(mMEditText, java.lang.Integer.valueOf(i17));
            } else {
                kotlin.jvm.internal.o.o("editText");
                throw null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f136947d, "set cursor drawable error %s", e17.getMessage());
        }
    }

    public final void setTextCursorVisible(boolean z17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f136948e;
        if (mMEditText != null) {
            mMEditText.setCursorVisible(z17);
        } else {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
    }

    public final void setTextGravity(int i17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f136948e;
        if (mMEditText != null) {
            mMEditText.setGravity(i17);
        } else {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
    }

    public final void setTextHint(java.lang.String hint) {
        kotlin.jvm.internal.o.g(hint, "hint");
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f136948e;
        if (mMEditText != null) {
            mMEditText.setHint(hint);
        } else {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
    }

    public final void setTextInputType(int i17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f136948e;
        if (mMEditText != null) {
            mMEditText.setInputType(i17);
        } else {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
    }

    public final void setTextMaxLines(int i17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f136948e;
        if (mMEditText != null) {
            mMEditText.setMaxLines(i17);
        } else {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderEditTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f136947d = "Finder.FinderEditTextView";
        a();
    }
}
