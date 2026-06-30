package xq;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ xq.a f455969a = new xq.a();

    public final android.graphics.RectF a(com.tencent.mm.ui.widget.MMNeat7extView textView) {
        kotlin.jvm.internal.o.g(textView, "textView");
        ks5.a layout = textView.getLayout();
        java.lang.CharSequence a17 = textView.a();
        com.tencent.mm.smiley.r0 r0Var = null;
        android.text.Spannable spannable = a17 instanceof android.text.Spannable ? (android.text.Spannable) a17 : null;
        if (layout != null && spannable != null) {
            int i17 = 0;
            java.lang.Object[] spans = spannable.getSpans(0, spannable.length(), com.tencent.mm.smiley.r0.class);
            kotlin.jvm.internal.o.f(spans, "getSpans(...)");
            com.tencent.mm.smiley.r0[] r0VarArr = (com.tencent.mm.smiley.r0[]) spans;
            int length = r0VarArr.length;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                com.tencent.mm.smiley.r0 r0Var2 = r0VarArr[i17];
                if (r0Var2.f193352f) {
                    r0Var = r0Var2;
                    break;
                }
                i17++;
            }
            if (r0Var != null) {
                return r0Var.f193355i;
            }
        }
        return new android.graphics.RectF();
    }
}
