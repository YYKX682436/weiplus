package cr5;

/* loaded from: classes11.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr5.f f222009d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(cr5.f fVar) {
        super(0);
        this.f222009d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f222009d.f222027b.getResources().getDisplayMetrics().density * 0.5f);
        return paint;
    }
}
