package mm2;

/* loaded from: classes3.dex */
public final class p1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.s1 f329343d;

    public p1(mm2.s1 s1Var) {
        this.f329343d = s1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.fd2 fd2Var = (r45.fd2) obj;
        mm2.s1 s1Var = this.f329343d;
        java.util.LinkedList linkedList = (java.util.LinkedList) ((kotlinx.coroutines.flow.h3) s1Var.f329388h).getValue();
        r45.p12 p12Var = null;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.p12 p12Var2 = (r45.p12) next;
                r45.q12 q12Var = (r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) s1Var.business(mm2.g1.class)).f329068f).getValue();
                boolean z17 = false;
                if (q12Var != null && p12Var2.getInteger(0) == q12Var.getInteger(0)) {
                    z17 = true;
                }
                if (z17) {
                    p12Var = next;
                    break;
                }
            }
            p12Var = p12Var;
        }
        if (p12Var != null) {
            p12Var.set(2, fd2Var);
        }
        return jz5.f0.f302826a;
    }
}
