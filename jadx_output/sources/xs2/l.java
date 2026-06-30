package xs2;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xs2.m f456346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f456347e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xs2.m mVar, int i17) {
        super(0);
        this.f456346d = mVar;
        this.f456347e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xs2.o oVar = this.f456346d.f456351f;
        if (oVar != null) {
            oVar.a(this.f456347e);
        }
        return jz5.f0.f302826a;
    }
}
