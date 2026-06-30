package xn5;

/* loaded from: classes13.dex */
public final class x0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f455731d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f455732e;

    public x0(java.lang.String taskId, int i17, java.lang.String activityName) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(activityName, "activityName");
        this.f455731d = i17;
        this.f455732e = activityName;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator it = xn5.e1.f455664b.entrySet().iterator();
        while (it.hasNext()) {
            if (r26.i0.A((java.lang.String) ((java.util.Map.Entry) it.next()).getKey(), java.lang.String.valueOf(this.f455731d), false, 2, null)) {
                it.remove();
            }
        }
        xn5.h0 h0Var = (xn5.h0) xn5.q0.f455711j.get(this.f455732e);
        if (h0Var != null) {
            new xn5.z0(h0Var.f455677a).a();
        }
        return jz5.f0.f302826a;
    }
}
