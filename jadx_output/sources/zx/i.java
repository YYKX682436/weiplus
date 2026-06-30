package zx;

/* loaded from: classes14.dex */
public abstract class i {
    public static final void a(zx.u uVar, boolean z17, boolean z18, android.view.View view) {
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.vcj);
        com.tencent.mm.feature.chatbot.brand.ui.view.FirstLinePrefixedTextView firstLinePrefixedTextView = (com.tencent.mm.feature.chatbot.brand.ui.view.FirstLinePrefixedTextView) view.findViewById(com.tencent.mm.R.id.usm);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.uvw);
        if (z17) {
            textView.setVisibility(0);
            ly.g.d(view, 16, android.graphics.Color.parseColor(com.tencent.mm.ui.bk.C() ? "#172A20" : "#E6F9EF"));
        } else if (z18) {
            textView.setVisibility(8);
            ly.g.d(view, 16, android.graphics.Color.parseColor(com.tencent.mm.ui.bk.C() ? "#10FFFFFF" : "#10000000"));
        } else {
            textView.setVisibility(8);
            view.setBackgroundColor(e1.a0.h(e1.y.f246319j));
        }
        boolean z19 = uVar.f476969a;
        com.tencent.wechat.aff.chatbot.l lVar = uVar.f476972d;
        if (z19) {
            textView2.setVisibility(8);
            firstLinePrefixedTextView.setVisibility(0);
            java.lang.String str = lVar.f216349o[4] ? lVar.f216344g : "";
            kotlin.jvm.internal.o.f(str, "getQuery(...)");
            java.lang.String leadingText = uVar.f476970b;
            kotlin.jvm.internal.o.g(leadingText, "leadingText");
            firstLinePrefixedTextView.f65323h = str;
            android.view.View view2 = firstLinePrefixedTextView.f65319d;
            kotlin.jvm.internal.o.e(view2, "null cannot be cast to non-null type android.widget.TextView");
            ((android.widget.TextView) view2).setText(leadingText);
            firstLinePrefixedTextView.requestLayout();
            firstLinePrefixedTextView.setRestLineIndentSp(6.0f);
            firstLinePrefixedTextView.setGapDp(4.0f);
            return;
        }
        firstLinePrefixedTextView.setVisibility(8);
        textView2.setVisibility(0);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) (lVar.f216349o[2] ? lVar.f216342e : ""));
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(context.getColor(com.tencent.mm.R.color.f478520a84));
        boolean[] zArr = lVar.f216349o;
        append.setSpan(foregroundColorSpan, 0, (zArr[2] ? lVar.f216342e : "").length(), 33);
        if (lVar.f216346i) {
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            java.lang.String string = context.getString(com.tencent.mm.R.string.n8w);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            spannableStringBuilder.append((java.lang.CharSequence) string).setSpan(new android.text.style.ForegroundColorSpan(context.getColor(com.tencent.mm.R.color.Brand_100)), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
            android.content.Context context2 = textView2.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan((int) android.util.TypedValue.applyDimension(2, 12.0f, context2.getResources().getDisplayMetrics())), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("：");
        sb6.append(zArr[4] ? lVar.f216344g : "");
        spannableStringBuilder.append((java.lang.CharSequence) sb6.toString());
        textView2.setText(spannableStringBuilder);
    }
}
