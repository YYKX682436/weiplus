package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class g2 implements db5.v8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.o2 f207688a;

    public g2(com.tencent.mm.ui.conversation.o2 o2Var) {
        this.f207688a = o2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.CharSequence] */
    @Override // db5.v8
    public java.lang.CharSequence a(com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView, java.lang.CharSequence charSequence, java.lang.String str, int i17, int i18) {
        java.lang.CharSequence ellipsize;
        java.lang.String str2;
        java.lang.String str3 = str;
        float textSize = noMeasuredTextView.getPaint().getTextSize();
        com.tencent.mm.ui.conversation.o2 o2Var = this.f207688a;
        int b17 = i65.a.b(o2Var.f212608e, i18);
        float f17 = b17;
        noMeasuredTextView.getPaint().setTextSize(f17);
        float measureText = noMeasuredTextView.getPaint().measureText(" " + str3);
        noMeasuredTextView.getPaint().setTextSize(textSize);
        int measuredWidth = (noMeasuredTextView.getMeasuredWidth() - noMeasuredTextView.getCompoundPaddingRight()) - noMeasuredTextView.getCompoundPaddingLeft();
        double d17 = measuredWidth;
        if (measureText >= 0.6d * d17) {
            ellipsize = android.text.TextUtils.ellipsize(charSequence, noMeasuredTextView.getPaint(), (float) (d17 * 0.4d), android.text.TextUtils.TruncateAt.END);
            float measureText2 = noMeasuredTextView.getPaint().measureText(ellipsize.toString());
            noMeasuredTextView.getPaint().setTextSize(f17);
            ?? ellipsize2 = android.text.TextUtils.ellipsize(str3, noMeasuredTextView.getPaint(), (measuredWidth - measureText2) - 20.0f, android.text.TextUtils.TruncateAt.END);
            noMeasuredTextView.getPaint().setTextSize(textSize);
            str2 = ellipsize2;
        } else {
            ellipsize = android.text.TextUtils.ellipsize(charSequence, noMeasuredTextView.getPaint(), measuredWidth - measureText, android.text.TextUtils.TruncateAt.END);
            str2 = str3;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        ((ke0.e) xVar).getClass();
        android.text.SpannableString i19 = com.tencent.mm.pluginsdk.ui.span.c0.i(o2Var.f212608e, ((java.lang.Object) ellipsize) + " " + ((java.lang.Object) str2));
        android.content.res.ColorStateList e17 = i65.a.e(o2Var.f212608e, i17);
        i19.setSpan(new android.text.style.TextAppearanceSpan(null, 0, b17, e17, e17), ellipsize.length() + 1, ellipsize.length() + 1 + str2.length(), 33);
        return i19;
    }
}
