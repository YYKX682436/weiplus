package w32;

/* loaded from: classes13.dex */
public class o extends u32.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final w32.p f442696d;

    /* renamed from: e, reason: collision with root package name */
    public final w32.n f442697e;

    public o(i32.d dVar, w32.c cVar) {
        this.f442696d = null;
        this.f442697e = null;
        iz5.a.d(null, dVar);
        iz5.a.d(null, cVar);
        this.f442696d = new w32.p(dVar);
        this.f442697e = new w32.n(cVar);
    }

    @Override // u32.w0
    public u32.m0 Ia() {
        w32.n nVar = this.f442697e;
        iz5.a.d(null, nVar);
        return nVar;
    }

    @Override // u32.w0
    public u32.t0 getReqObj() {
        w32.p pVar = this.f442696d;
        iz5.a.d(null, pVar);
        return pVar;
    }
}
