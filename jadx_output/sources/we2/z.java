package we2;

/* loaded from: classes3.dex */
public abstract class z extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f445267a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f445268b;

    public z(gk2.e liveContext) {
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f445267a = liveContext;
        this.f445268b = jz5.h.b(new we2.y(this));
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        java.util.ArrayList arrayList;
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(respWrapper, "respWrapper");
        r45.r71 r71Var = respWrapper.f445214a;
        if (r71Var == null || (list = r71Var.getList(14)) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                r45.ch1 ch1Var = (r45.ch1) obj;
                if (kz5.z.F((int[]) ((jz5.n) this.f445268b).getValue(), ch1Var.getInteger(1)) && f(ch1Var)) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList == null) {
            return false;
        }
        java.util.ArrayList arrayList2 = (arrayList.isEmpty() ^ true) || e() ? arrayList : null;
        if (arrayList2 == null) {
            return false;
        }
        d(new java.util.LinkedList(arrayList2));
        return true;
    }

    public abstract void d(java.util.LinkedList linkedList);

    public boolean e() {
        return this instanceof xe2.c;
    }

    public boolean f(r45.ch1 appMsg) {
        kotlin.jvm.internal.o.g(appMsg, "appMsg");
        return true;
    }

    public abstract int[] g();
}
