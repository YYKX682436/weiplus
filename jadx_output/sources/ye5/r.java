package ye5;

/* loaded from: classes9.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f461280d;

    public r(com.tencent.mm.storage.f9 f9Var) {
        this.f461280d = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f65.y0 y0Var = f65.y0.f260019a;
        java.lang.String z07 = this.f461280d.z0();
        if (z07 == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).b(new f65.r0(z07), "MicroMsg.VideoSendReporter");
    }
}
