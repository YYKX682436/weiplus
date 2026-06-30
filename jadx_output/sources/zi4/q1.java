package zi4;

/* loaded from: classes4.dex */
public final class q1 extends zi4.o1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host, zi4.p1.f473248d);
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        kotlin.jvm.internal.o.g(host, "host");
    }

    @Override // zi4.o1
    public zi4.s1 b(com.tencent.mm.protobuf.f fVar) {
        java.util.LinkedList linkedList;
        bw5.ac acVar = (bw5.ac) fVar;
        if (acVar != null && (linkedList = acVar.f25124d) != null) {
            zi4.g0 g0Var = this.f473182f;
            g0Var.getClass();
            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = g0Var.f473218d;
            if (lifecycleScope != null) {
                v65.i.b(lifecycleScope, null, new zi4.f0(g0Var, linkedList, null), 1, null);
            }
        }
        return new zi4.s1(new bw5.bc(), 0L, null, 6, null);
    }
}
