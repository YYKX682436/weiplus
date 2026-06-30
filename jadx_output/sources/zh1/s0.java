package zh1;

/* loaded from: classes8.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f472940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh1.f1 f472941e;

    public s0(android.widget.TextView textView, zh1.f1 f1Var) {
        this.f472940d = textView;
        this.f472941e = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int lineEnd;
        java.lang.String concat;
        android.widget.TextView textView = this.f472940d;
        int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
        android.text.TextPaint paint = textView.getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        zh1.f1 f1Var = this.f472941e;
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(f1Var.f472880a, paint, width, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (staticLayout.getLineCount() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "getFirstLineEndPos, lineCount(" + staticLayout.getLineCount() + ") is illegal");
            lineEnd = 0;
        } else {
            lineEnd = staticLayout.getLineEnd(0);
        }
        if (!(1 <= lineEnd && lineEnd <= f1Var.f472880a.length())) {
            textView.setText(f1Var.f472883d);
            return;
        }
        if (lineEnd == f1Var.f472880a.length()) {
            concat = f1Var.f472880a;
        } else {
            java.lang.String substring = f1Var.f472880a.substring(0, lineEnd - 1);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            concat = substring.concat("…");
        }
        textView.setText(concat + '\n' + f1Var.f472881b);
    }
}
