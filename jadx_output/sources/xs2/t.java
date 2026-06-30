package xs2;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f456377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f456378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xs2.u f456379f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wp.i f456380g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.Object obj, java.lang.Object obj2, xs2.u uVar, wp.i iVar) {
        super(0);
        this.f456377d = obj;
        this.f456378e = obj2;
        this.f456379f = uVar;
        this.f456380g = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lm2.c cVar = (lm2.c) this.f456377d;
        lm2.c cVar2 = (lm2.c) this.f456378e;
        cVar.f319374g = cVar2.f319374g;
        cVar.f319373f = cVar2.f319373f;
        cVar.f319375h = cVar2.f319375h;
        this.f456379f.b(this.f456380g);
        return jz5.f0.f302826a;
    }
}
