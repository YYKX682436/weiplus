package ix3;

/* loaded from: classes.dex */
public final class c3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f295377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f295378e;

    public c3(com.tencent.mm.ui.widget.dialog.k0 k0Var, int i17) {
        this.f295377d = k0Var;
        this.f295378e = i17;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.g(0, "以X实验为主", 0);
        g4Var.g(1, "以维修厂为主", 0);
        this.f295377d.f211851a2 = this.f295378e;
    }
}
