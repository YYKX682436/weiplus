package rr3;

/* loaded from: classes3.dex */
public final class q implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr3.r f399208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399209e;

    public q(rr3.r rVar, int i17) {
        this.f399208d = rVar;
        this.f399209e = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        rr3.r rVar = this.f399208d;
        rr3.z zVar = rVar.f399211e;
        java.lang.Object obj = rVar.f399210d.get(this.f399209e);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.tc5 tc5Var = (r45.tc5) obj;
        zVar.getClass();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = zVar.f399224g;
        if (u3Var != null) {
            u3Var.dismiss();
            zVar.f399224g = null;
        }
        zVar.f399224g = db5.e1.Q(zVar.getContext(), null, zVar.getString(com.tencent.mm.R.string.f490604zq), true, true, rr3.y.f399220d);
        java.lang.String str = ((com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoAuthMainUI) ((jz5.n) zVar.f399225h).getValue()).f154193e;
        if (str != null) {
            new nw4.b(3, str, "", tc5Var.f386310d, 7).l().K(new rr3.x(zVar, tc5Var, 7));
        } else {
            kotlin.jvm.internal.o.o("appId");
            throw null;
        }
    }
}
