package j93;

/* loaded from: classes.dex */
public final class r0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f298488d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f298488d = jz5.h.b(new j93.q0(this));
    }

    public static final void T6(j93.r0 r0Var, java.util.List list) {
        jz5.f0 f0Var;
        j75.f stateCenter;
        r0Var.getClass();
        java.util.List e17 = g95.e.f269801a.e(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(e17, 10));
        java.util.Iterator it = ((java.util.ArrayList) e17).iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) it.next();
            ri5.h hVar = ri5.j.I;
            int i17 = ri5.j.Z;
            java.lang.String d17 = z3Var.d1();
            kotlin.jvm.internal.o.f(d17, "getUsername(...)");
            java.lang.String a17 = hVar.a(d17, i17, 0);
            ti5.d dVar = new ti5.d(null, null, 0, 0, 0, 0, null, false, 255, null);
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = r0Var.P6();
            if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
                f0Var = null;
            } else {
                stateCenter.B3(new wi5.t0(ti5.d.f419663i.b(r0Var.getActivity(), a17, z3Var, i17, dVar), -1, 1));
                f0Var = jz5.f0.f302826a;
            }
            arrayList.add(f0Var);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new j93.n0(this));
    }
}
