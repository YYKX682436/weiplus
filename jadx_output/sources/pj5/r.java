package pj5;

/* loaded from: classes9.dex */
public final class r implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f355403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pj5.l f355404e;

    public r(in5.s0 s0Var, pj5.l lVar) {
        this.f355403d = s0Var;
        this.f355404e = lVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            in5.s0 s0Var = this.f355403d;
            java.lang.Object obj = s0Var.f293121e;
            androidx.lifecycle.y yVar = obj instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) obj : null;
            if (yVar != null) {
                androidx.lifecycle.q a17 = androidx.lifecycle.z.a(yVar);
                r45.lo5 lo5Var = new r45.lo5();
                pj5.l lVar = this.f355404e;
                lo5Var.f379675d = lVar.f355387d.f379675d;
                com.tencent.mm.modelsimple.t1.a(a17, 2, lo5Var, new pj5.q(s0Var, lVar));
            }
        }
    }
}
