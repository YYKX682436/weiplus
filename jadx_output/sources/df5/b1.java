package df5;

/* loaded from: classes11.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.d1 f232055d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(df5.d1 d1Var) {
        super(0);
        this.f232055d = d1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setTypeface(android.graphics.Typeface.MONOSPACE);
        df5.d1 d1Var = this.f232055d;
        textPaint.setTextSize(android.util.TypedValue.applyDimension(1, d1Var.f232073b.f432364c.f432394a.f432416a, d1Var.f232072a.getResources().getDisplayMetrics()));
        return textPaint;
    }
}
