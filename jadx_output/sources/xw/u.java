package xw;

/* loaded from: classes2.dex */
public final class u implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f457562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f457563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f457564f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f457565g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f457566h;

    public u(android.widget.TextView textView, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, yz5.a aVar) {
        this.f457562d = textView;
        this.f457563e = str;
        this.f457564f = i17;
        this.f457565g = str3;
        this.f457566h = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        java.lang.String str;
        java.lang.String str2;
        android.widget.TextView textView = this.f457562d;
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        java.lang.String str3 = this.f457563e;
        textView.setText(str3);
        android.text.Layout layout = textView.getLayout();
        if (layout == null) {
            return;
        }
        int lineCount = layout.getLineCount();
        int i17 = this.f457564f;
        if (lineCount <= i17) {
            textView.setOnClickListener(null);
            return;
        }
        float width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
        android.text.TextPaint paint = textView.getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        int lineStart = layout.getLineStart(i17 - 1);
        int lineEnd = layout.getLineEnd(i17 - 1);
        while (true) {
            str = this.f457565g;
            if (lineEnd <= lineStart) {
                str2 = "";
                break;
            }
            str2 = str3.substring(lineStart, lineEnd);
            kotlin.jvm.internal.o.f(str2, "substring(...)");
            while (true) {
                if (!(str2.length() > 0) || (!r26.i0.n(str2, "\n", false) && !r26.i0.n(str2, "\r", false) && !r26.i0.n(str2, " ", false))) {
                    break;
                }
                str2 = str2.substring(0, str2.length() - 1);
                kotlin.jvm.internal.o.f(str2, "substring(...)");
            }
            if (paint.measureText(str2 + " ..." + str) <= width) {
                break;
            } else {
                lineEnd--;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String substring = str3.substring(0, lineStart);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        sb6.append(substring);
        sb6.append(str2);
        sb6.append(" ...");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(sb6.toString());
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(textView.getContext().getResources().getColor(com.tencent.mm.R.color.adg)), length, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setOnClickListener(new xw.t(textView, str3, this.f457566h));
    }
}
