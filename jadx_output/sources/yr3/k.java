package yr3;

/* loaded from: classes11.dex */
public final class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.o f464892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yr3.m f464893e;

    public k(yr3.o oVar, yr3.m mVar) {
        this.f464892d = oVar;
        this.f464893e = mVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.s5 s5Var;
        r45.p5 p5Var;
        r45.l5 l5Var;
        int i18;
        r45.o5 o5Var;
        int i19;
        r45.o5 o5Var2;
        r45.o5 o5Var3;
        r45.z5 z5Var;
        r45.s5 s5Var2;
        r45.p5 p5Var2;
        r45.l5 l5Var2;
        r45.o5 o5Var4;
        r45.z5 z5Var2;
        if (i17 == 0) {
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(this.f464892d.f464961d, "", "", true, true, yr3.j.f464873d);
            android.widget.TextView textView = Q.f212004d;
            if (textView != null) {
                textView.setVisibility(8);
            }
            yr3.f fVar = this.f464893e.f464929e;
            if (!(fVar != null && fVar.f464806e)) {
                if (fVar != null && (s5Var = fVar.f464802a) != null && (p5Var = s5Var.f385514i) != null && (l5Var = p5Var.f382753d) != null) {
                    i18 = l5Var.f379138d;
                }
                i18 = 0;
            } else if (fVar == null || (o5Var4 = fVar.f464803b) == null || (z5Var2 = o5Var4.R) == null) {
                if (fVar != null && (s5Var2 = fVar.f464802a) != null && (p5Var2 = s5Var2.f385514i) != null && (l5Var2 = p5Var2.f382753d) != null) {
                    i18 = l5Var2.f379138d;
                }
                i18 = 0;
            } else {
                i18 = z5Var2.f391718e;
            }
            if (!(fVar != null && fVar.f464806e)) {
                if (fVar != null && (o5Var = fVar.f464803b) != null) {
                    i19 = o5Var.f381916g;
                }
                i19 = -1;
            } else if (fVar == null || (o5Var3 = fVar.f464803b) == null || (z5Var = o5Var3.R) == null) {
                if (fVar != null && (o5Var2 = fVar.f464803b) != null) {
                    i19 = o5Var2.f381916g;
                }
                i19 = -1;
            } else {
                i19 = z5Var.f391719f;
            }
            com.tencent.mm.plugin.profile.ui.tab.s sVar = (com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class);
            yr3.i iVar = new yr3.i(Q, this.f464893e, i18, i19, this.f464892d);
            sVar.getClass();
            sVar.Ai().a(i18, i19, new com.tencent.mm.plugin.profile.ui.tab.i(iVar));
        }
    }
}
