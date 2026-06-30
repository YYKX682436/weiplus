package dg3;

/* loaded from: classes3.dex */
public final class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f232322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dg3.k f232323e;

    public e(o25.y1 y1Var, dg3.k kVar) {
        this.f232322d = y1Var;
        this.f232323e = kVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        db5.h4 h4Var = menuItem instanceof db5.h4 ? (db5.h4) menuItem : null;
        if (h4Var != null) {
            ((com.tencent.mm.pluginsdk.forward.m) this.f232322d).aj(h4Var, new dg3.d(this.f232323e));
        }
    }
}
