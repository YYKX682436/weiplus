package qv4;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final qv4.h0 f366978d = new qv4.h0();

    public h0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(pm0.v.S(15));
        paint.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        return java.lang.Float.valueOf(paint.measureText("测"));
    }
}
