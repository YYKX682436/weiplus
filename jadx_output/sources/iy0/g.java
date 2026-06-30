package iy0;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iy0.h f295714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(iy0.h hVar) {
        super(0);
        this.f295714d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(((java.lang.Number) ((jz5.n) this.f295714d.f295719e).getValue()).intValue());
        return paint;
    }
}
