package nr2;

/* loaded from: classes2.dex */
public final class g0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f339191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr2.j0 f339192e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ev2 f339193f;

    public g0(o25.y1 y1Var, nr2.j0 j0Var, r45.ev2 ev2Var) {
        this.f339191d = y1Var;
        this.f339192e = j0Var;
        this.f339193f = ev2Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        nr2.f0 f0Var = new nr2.f0(this.f339192e, this.f339193f);
        ((com.tencent.mm.pluginsdk.forward.m) this.f339191d).aj((db5.h4) menuItem, f0Var);
    }
}
