package fx2;

/* loaded from: classes8.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fx2.c f267112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f267113e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fx2.c cVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f267112d = cVar;
        this.f267113e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f267113e;
        fx2.c cVar = this.f267112d;
        cVar.f267118c = bitmap;
        cVar.invalidateSelf();
        return jz5.f0.f302826a;
    }
}
