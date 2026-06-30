package com.tencent.mm.plugin.finder.member.question.view;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/B#\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u00100\u001a\u00020\u000f¢\u0006\u0004\b.\u00101J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006R\"\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0005\u0010\rR\"\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$¨\u00062"}, d2 = {"Lcom/tencent/mm/plugin/finder/member/question/view/QALikeTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "Ljz5/f0;", "setEndText", "", "setOrinText", "h", "Ljava/lang/CharSequence;", "getOriText", "()Ljava/lang/CharSequence;", "setOriText", "(Ljava/lang/CharSequence;)V", "oriText", "", "i", "I", "getMaxLine", "()I", "setMaxLine", "(I)V", "maxLine", "m", "getEndText", "endText", "n", "getResultText", "setResultText", "resultText", "Landroid/widget/TextView;", "o", "Landroid/widget/TextView;", "getEndTextView", "()Landroid/widget/TextView;", "setEndTextView", "(Landroid/widget/TextView;)V", "endTextView", "p", "getNameTextView", "setNameTextView", "nameTextView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class QALikeTextView extends androidx.appcompat.widget.AppCompatTextView {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f121361r = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f121362g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public java.lang.CharSequence oriText;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int maxLine;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public java.lang.CharSequence endText;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public java.lang.CharSequence resultText;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView endTextView;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView nameTextView;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f121369q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QALikeTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.oriText = "";
        this.maxLine = 3;
        this.endText = "";
        this.resultText = "";
        this.f121369q = new ko2.h(this);
        this.endTextView = new android.widget.TextView(context);
        this.nameTextView = new android.widget.TextView(context);
    }

    public final java.lang.CharSequence getEndText() {
        return this.endText;
    }

    public final android.widget.TextView getEndTextView() {
        return this.endTextView;
    }

    public final int getMaxLine() {
        return this.maxLine;
    }

    public final android.widget.TextView getNameTextView() {
        return this.nameTextView;
    }

    public final java.lang.CharSequence getOriText() {
        return this.oriText;
    }

    public final java.lang.CharSequence getResultText() {
        return this.resultText;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        post(this.f121369q);
    }

    public final void setEndText(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.o.g(charSequence, "<set-?>");
        this.endText = charSequence;
    }

    public final void setEndTextView(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.endTextView = textView;
    }

    public final void setMaxLine(int i17) {
        this.maxLine = i17;
    }

    public final void setNameTextView(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.nameTextView = textView;
    }

    public final void setOriText(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.o.g(charSequence, "<set-?>");
        this.oriText = charSequence;
    }

    public final void setOrinText(java.lang.CharSequence text) {
        kotlin.jvm.internal.o.g(text, "text");
        if (kotlin.jvm.internal.o.b(text, this.oriText)) {
            return;
        }
        this.f121362g = false;
        this.oriText = text;
        setText(text);
    }

    public final void setResultText(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.o.g(charSequence, "<set-?>");
        this.resultText = charSequence;
    }

    public final void setEndText(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        if (kotlin.jvm.internal.o.b(text, this.endText)) {
            return;
        }
        this.endText = text;
        this.f121362g = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QALikeTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.oriText = "";
        this.maxLine = 3;
        this.endText = "";
        this.resultText = "";
        this.f121369q = new ko2.h(this);
        this.endTextView = new android.widget.TextView(context);
        this.nameTextView = new android.widget.TextView(context);
    }
}
