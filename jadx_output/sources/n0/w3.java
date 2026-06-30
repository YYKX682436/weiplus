package n0;

/* loaded from: classes14.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.b4 f333740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(n0.b4 b4Var) {
        super(2);
        this.f333740d = b4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kotlinx.coroutines.q qVar;
        java.util.Set changed = (java.util.Set) obj;
        kotlin.jvm.internal.o.g(changed, "changed");
        kotlin.jvm.internal.o.g((x0.m) obj2, "<anonymous parameter 1>");
        n0.b4 b4Var = this.f333740d;
        synchronized (b4Var.f333447d) {
            if (((n0.o3) ((kotlinx.coroutines.flow.h3) b4Var.f333458o).getValue()).compareTo(n0.o3.Idle) >= 0) {
                ((java.util.ArrayList) b4Var.f333451h).add(changed);
                qVar = b4Var.s();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        }
        return jz5.f0.f302826a;
    }
}
