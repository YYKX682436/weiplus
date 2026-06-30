package yo4;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv3.c f464317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f464318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.h70 f464319f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(zv3.c cVar, yz5.q qVar, r45.h70 h70Var) {
        super(1);
        this.f464317d = cVar;
        this.f464318e = qVar;
        this.f464319f = h70Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((zv3.f) this.f464317d).a();
        pm0.v.X(new yo4.u(this.f464318e, this.f464319f, (android.graphics.Bitmap) obj));
        return jz5.f0.f302826a;
    }
}
