package v22;

/* loaded from: classes10.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.z f432867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(v22.z zVar) {
        super(0);
        this.f432867d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        v22.z zVar = this.f432867d;
        d32.j jVar = zVar.f432878i;
        if (jVar == null) {
            kotlin.jvm.internal.o.o("mixPixelBuffer");
            throw null;
        }
        jVar.f226158k.post(new d32.i(new v22.w(zVar)));
        return jz5.f0.f302826a;
    }
}
