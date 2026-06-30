package vu0;

/* loaded from: classes5.dex */
public final class g0 implements su0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vu0.o0 f440092a;

    public g0(vu0.o0 o0Var) {
        this.f440092a = o0Var;
    }

    @Override // su0.l
    public void a(java.lang.String groupID, r45.ne4 ne4Var) {
        java.lang.Object json;
        kotlin.jvm.internal.o.g(groupID, "groupID");
        if (ne4Var != null && (json = ne4Var.toJSON()) != null) {
            json.toString();
        }
        vu0.o0 o0Var = this.f440092a;
        o0Var.f440132e.b(groupID, ne4Var, true, new vu0.f0(ne4Var));
        java.util.List a17 = o0Var.f440132e.a();
        if (a17 != null) {
            o0Var.f440130c.c(a17);
        }
        wu0.d dVar = o0Var.f440133f;
        dVar.getClass();
        dVar.f449656c.removeMessages(100, groupID);
    }

    @Override // su0.l
    public void onCancel() {
        this.f440092a.f440130c.onCancel();
    }
}
