package t52;

/* loaded from: classes15.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public final void a(r45.u53 u53Var, long j17) {
        if (u53Var == null) {
            return;
        }
        java.util.LinkedList linkedList = u53Var.f387050g;
        if (linkedList.isEmpty()) {
            return;
        }
        r45.t53 t53Var = (r45.t53) linkedList.getLast();
        long j18 = j17 - t53Var.f386153e;
        if (j18 < 0) {
            j18 = 0;
        }
        t53Var.f386154f = j18;
        if (linkedList.size() == 1) {
            return;
        }
        for (int size = linkedList.size() - 1; size > 0; size--) {
            java.lang.Object obj = linkedList.get(size - 1);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            r45.t53 t53Var2 = (r45.t53) obj;
            if (t53Var2.f386154f <= 0) {
                long j19 = ((r45.t53) linkedList.get(size)).f386153e - t53Var2.f386153e;
                if (j19 < 0) {
                    j19 = 0;
                }
                t53Var2.f386154f = j19;
            }
        }
    }
}
