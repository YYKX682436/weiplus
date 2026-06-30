package gh;

/* loaded from: classes7.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f271818d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(java.lang.Object obj) {
        super(1);
        this.f271818d = obj;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze.n S;
        gh.t it = (gh.t) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if ((it instanceof gh.v) && (S = ((ae.d) ((gh.v) it)).f3350a.S()) != null && S.N != null) {
            S.N.f425432a.E.set(true);
            u81.f0 f0Var = S.N.f425432a;
            f0Var.getClass();
            java.util.LinkedList linkedList = new java.util.LinkedList(f0Var.D);
            ((java.util.concurrent.LinkedBlockingQueue) f0Var.D).clear();
            while (!linkedList.isEmpty()) {
                u81.n0 n0Var = (u81.n0) linkedList.poll();
                com.tencent.mm.sdk.platformtools.n3 n3Var = n0Var.f425453g;
                if (n3Var != null) {
                    n0Var.f425453g.removeCallbacks(n0Var.f425452f);
                    if (android.os.Looper.myLooper() == n3Var.getLooper()) {
                        ((u81.m0) n0Var.f425452f).run();
                    } else {
                        n0Var.c(n0Var.f425447a);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
