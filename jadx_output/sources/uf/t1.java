package uf;

/* loaded from: classes7.dex */
public final class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c2 f427104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f427105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uf.v1 f427106f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f427107g;

    public t1(uf.c2 c2Var, int i17, uf.v1 v1Var, int i18) {
        this.f427104d = c2Var;
        this.f427105e = i17;
        this.f427106f = v1Var;
        this.f427107g = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        uf.c2 c2Var = this.f427104d;
        if (c2Var.f427010w != null) {
            boolean z17 = !c2Var.f426996f.f426985d.isEmpty();
            int i17 = this.f427107g;
            uf.v1 v1Var = this.f427106f;
            int i18 = this.f427105e;
            if (!z17 || i18 > c2Var.f426996f.f426985d.size()) {
                uf.c2.b(c2Var, v1Var.x(i18).f271568a, i17);
            } else {
                uf.c2.b(c2Var, v1Var.x(i18).f271568a, i17);
            }
        }
    }
}
