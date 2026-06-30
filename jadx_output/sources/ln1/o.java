package ln1;

/* loaded from: classes12.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln1.z f319780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f319781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ln1.r f319782f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f319783g;

    public o(ln1.z zVar, long j17, ln1.r rVar, long j18) {
        this.f319780d = zVar;
        this.f319781e = j17;
        this.f319782f = rVar;
        this.f319783g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ln1.z zVar = this.f319780d;
        ln1.y yVar = new ln1.y(zVar, zVar.run(), this.f319781e);
        ln1.r rVar = this.f319782f;
        rVar.f319786a.put(java.lang.Long.valueOf(this.f319783g), yVar);
        rVar.f319790e.c();
    }
}
