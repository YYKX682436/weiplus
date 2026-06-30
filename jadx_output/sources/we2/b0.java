package we2;

/* loaded from: classes3.dex */
public abstract class b0 extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f445216a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f445217b;

    public b0(gk2.e liveContext) {
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f445216a = liveContext;
        this.f445217b = jz5.h.b(new we2.a0(this));
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        java.util.ArrayList arrayList;
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(respWrapper, "respWrapper");
        r45.r71 r71Var = respWrapper.f445214a;
        if (r71Var == null || (list = r71Var.getList(2)) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                r45.t12 t12Var = (r45.t12) obj;
                if (kz5.z.F((int[]) ((jz5.n) this.f445217b).getValue(), t12Var.getInteger(3)) && e(t12Var)) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList == null) {
            return false;
        }
        java.util.ArrayList arrayList2 = (arrayList.isEmpty() ^ true) || (this instanceof ye2.c) ? arrayList : null;
        if (arrayList2 == null) {
            return false;
        }
        d(new java.util.LinkedList(arrayList2));
        return true;
    }

    public abstract void d(java.util.LinkedList linkedList);

    public boolean e(r45.t12 appMsg) {
        kotlin.jvm.internal.o.g(appMsg, "appMsg");
        return true;
    }

    public abstract int[] f();
}
