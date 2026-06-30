package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/view/MMEmojiCompatTextView;", "Landroid/widget/TextView;", "Lkg5/b;", "getEmojiTextViewProcessor", "", "getSizePx", "", "Landroid/text/InputFilter;", "filters", "Ljz5/f0;", "setFilters", "([Landroid/text/InputFilter;)V", "", "allCaps", "setAllCaps", "", "emojiTextProcessType", "setEmojiTextProcessType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class MMEmojiCompatTextView extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public kg5.b f213326d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MMEmojiCompatTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final kg5.b getEmojiTextViewProcessor() {
        if (this.f213326d == null) {
            float sizePx = getSizePx();
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f213326d = new kg5.b(this, sizePx, context);
        }
        kg5.b bVar = this.f213326d;
        kotlin.jvm.internal.o.e(bVar, "null cannot be cast to non-null type com.tencent.mm.ui.emoji.replace.EmojiTextProcessor");
        return bVar;
    }

    private final float getSizePx() {
        return (getTextSize() * i65.a.q(getContext())) / i65.a.g(getContext());
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z17) {
        super.setAllCaps(z17);
        kg5.b emojiTextViewProcessor = getEmojiTextViewProcessor();
        if (!z17) {
            emojiTextViewProcessor.getClass();
            return;
        }
        android.widget.TextView textView = emojiTextViewProcessor.f307738a;
        android.text.method.TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (transformationMethod == null || (transformationMethod instanceof android.text.method.PasswordTransformationMethod)) {
            return;
        }
        kg5.c cVar = transformationMethod instanceof kg5.c ? (kg5.c) transformationMethod : null;
        if (cVar == null) {
            cVar = new kg5.c(transformationMethod, emojiTextViewProcessor.f307739b, emojiTextViewProcessor.f307740c);
        }
        textView.setTransformationMethod(cVar);
    }

    public final void setEmojiTextProcessType(int i17) {
        android.text.InputFilter[] filters = getEmojiTextViewProcessor().f307738a.getFilters();
        kotlin.jvm.internal.o.d(filters);
        for (android.text.InputFilter inputFilter : filters) {
            if (inputFilter instanceof kg5.a) {
                kg5.a aVar = (kg5.a) inputFilter;
                aVar.f307736e = i17;
                aVar.f307737f = true;
                return;
            }
        }
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] filters) {
        kotlin.jvm.internal.o.g(filters, "filters");
        kg5.b emojiTextViewProcessor = getEmojiTextViewProcessor();
        emojiTextViewProcessor.getClass();
        int length = filters.length;
        int length2 = filters.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length2) {
                android.text.InputFilter[] inputFilterArr = new android.text.InputFilter[filters.length + 1];
                java.lang.System.arraycopy(filters, 0, inputFilterArr, 0, length);
                inputFilterArr[length] = emojiTextViewProcessor.f307741d;
                filters = inputFilterArr;
                break;
            }
            if (filters[i17] instanceof kg5.a) {
                break;
            } else {
                i17++;
            }
        }
        super.setFilters(filters);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMEmojiCompatTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
