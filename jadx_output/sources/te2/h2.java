package te2;

/* loaded from: classes14.dex */
public final class h2 implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te2.l2 f418052a;

    public h2(te2.l2 l2Var) {
        this.f418052a = l2Var;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        te2.l2 l2Var = this.f418052a;
        java.lang.String str = l2Var.f418192e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set AVTransportURI fail ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : null);
        com.tencent.mars.xlog.Log.e(str, sb6.toString());
        android.os.Message obtainMessage = l2Var.f418197m.obtainMessage(l2Var.f418193f);
        obtainMessage.arg1 = eVar != null ? eVar.f2487c : 0;
        obtainMessage.sendToTarget();
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        te2.l2 l2Var = this.f418052a;
        x91.h hVar = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar != null) {
            hVar.f452651e.f452663a = x91.j.Transitioning;
        }
        te2.c2 c2Var = l2Var.f418196i;
        if (c2Var != null) {
            pm0.v.X(new te2.u2((te2.a3) c2Var, ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f));
        }
        x91.h hVar2 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar2 != null) {
            hVar2.c(new te2.g2(l2Var));
        }
    }
}
