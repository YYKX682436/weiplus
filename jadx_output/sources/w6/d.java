package w6;

/* loaded from: classes13.dex */
public final class d extends java.lang.ref.WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final t6.h f443076a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f443077b;

    /* renamed from: c, reason: collision with root package name */
    public w6.z0 f443078c;

    public d(t6.h hVar, w6.r0 r0Var, java.lang.ref.ReferenceQueue referenceQueue, boolean z17) {
        super(r0Var, referenceQueue);
        w6.z0 z0Var;
        q7.n.b(hVar);
        this.f443076a = hVar;
        if (r0Var.f443193d && z17) {
            w6.z0 z0Var2 = r0Var.f443195f;
            q7.n.b(z0Var2);
            z0Var = z0Var2;
        } else {
            z0Var = null;
        }
        this.f443078c = z0Var;
        this.f443077b = r0Var.f443193d;
    }
}
