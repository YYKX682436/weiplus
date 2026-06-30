package vx5;

/* loaded from: classes13.dex */
public class s implements com.tencent.xweb.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.xweb.pinus.sdk.q f441388a;

    public s(com.tencent.xweb.pinus.sdk.q qVar) {
        this.f441388a = qVar;
    }

    @Override // com.tencent.xweb.l0
    public void a() {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.r rVar = (com.tencent.xweb.pinus.sdk.r) this.f441388a;
        rVar.getClass();
        try {
            synchronized (rVar) {
                i0Var = rVar.f220466b;
                if (i0Var == null) {
                    i0Var = new by5.i0(rVar.f220465a, "proceed", new java.lang.Class[0]);
                    rVar.f220466b = i0Var;
                }
            }
            i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.l0
    public void cancel() {
        ((com.tencent.xweb.pinus.sdk.r) this.f441388a).a();
    }
}
