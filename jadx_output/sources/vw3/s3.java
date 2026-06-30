package vw3;

/* loaded from: classes12.dex */
public final class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.b50 f441107d;

    public s3(r45.b50 b50Var) {
        this.f441107d = b50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.cx4 cx4Var = new r45.cx4();
        cx4Var.f371899e = c01.id.c();
        cx4Var.f371898d = 0L;
        vg3.w4 w4Var = (vg3.w4) vg3.v4.f436761a.get(5);
        if (w4Var != null) {
            r45.b50 b50Var = this.f441107d;
            r45.cu5 cu5Var = b50Var.f370531e;
            w4Var.a(null, b50Var, 0, cu5Var != null ? cu5Var.f371841f.f192156a : null, false, cx4Var, null);
        }
        ((ku5.t0) ku5.t0.f312615d).B(vw3.r3.f441096d);
    }
}
