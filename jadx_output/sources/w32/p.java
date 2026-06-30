package w32;

/* loaded from: classes13.dex */
public class p extends u32.s0 {

    /* renamed from: e, reason: collision with root package name */
    public final i32.d f442698e;

    public p(i32.d dVar) {
        this.f442698e = null;
        iz5.a.d(null, dVar);
        this.f442698e = dVar;
    }

    @Override // u32.t0
    public int Hf() {
        return this.f442698e.b();
    }

    @Override // u32.t0
    public int W4() {
        return this.f442698e.f288120b;
    }

    @Override // u32.t0
    public int W5() {
        return this.f442698e.a();
    }

    @Override // u32.t0
    public long getDeviceId() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getDeviceId : ");
        i32.d dVar = this.f442698e;
        sb6.append(dVar.f288119a);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.RemoteExDeviceTaskRequest", sb6.toString());
        return dVar.f288119a;
    }

    @Override // u32.t0
    public byte[] z9() {
        return this.f442698e.c();
    }
}
