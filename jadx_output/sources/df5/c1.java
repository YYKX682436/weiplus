package df5;

/* loaded from: classes11.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.d1 f232060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(df5.d1 d1Var) {
        super(0);
        this.f232060d = d1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        df5.d1 d1Var = this.f232060d;
        textPaint.setTextSize(android.util.TypedValue.applyDimension(1, d1Var.f232073b.f432364c.f432394a.f432416a, d1Var.f232072a.getResources().getDisplayMetrics()));
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        return java.lang.Integer.valueOf((int) (((fontMetricsInt.descent - fontMetricsInt.ascent) * (d1Var.f232073b.f432364c.f432394a.f432420e - 1.0f)) + 0.5f));
    }
}
