package kh;

/* loaded from: classes12.dex */
public final class e extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kh.f f307783e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kh.f fVar, kh.f fVar2) {
        super(fVar, fVar2);
        this.f307783e = fVar;
    }

    @Override // rh.o2
    public rh.d3 a() {
        kh.f fVar = new kh.f();
        kh.p1 p1Var = kh.t1.f307916i;
        rh.d3 end = this.f395485b;
        kotlin.jvm.internal.o.f(end, "end");
        p1Var.a(this.f307783e, (kh.t1) end, fVar);
        return fVar;
    }
}
