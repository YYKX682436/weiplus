package mr3;

/* loaded from: classes5.dex */
public final class s implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mr3.v f330895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mr3.l f330896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f330897f;

    public s(mr3.v vVar, mr3.l lVar, in5.s0 s0Var) {
        this.f330895d = vVar;
        this.f330896e = lVar;
        this.f330897f = s0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        yz5.l lVar = this.f330895d.f330907g;
        mr3.l lVar2 = this.f330896e;
        lVar.invoke(lVar2);
        androidx.recyclerview.widget.f2 f2Var = this.f330897f.f293122f;
        xm3.t0 t0Var = f2Var instanceof xm3.t0 ? (xm3.t0) f2Var : null;
        if (t0Var == null || (mvvmList = t0Var.I) == null) {
            return;
        }
        mvvmList.u(lVar2);
    }
}
