package fk3;

/* loaded from: classes8.dex */
public final class g implements ak3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fk3.o f263556a;

    public g(fk3.o oVar) {
        this.f263556a = oVar;
    }

    @Override // ak3.b
    public void onComplete(boolean z17) {
        r45.kr4 kr4Var;
        if (z17) {
            return;
        }
        jk3.e eVar = this.f263556a.f263586b;
        r45.jr4 jr4Var = (eVar == null || (kr4Var = ((jk3.b) eVar).f300079c) == null) ? null : (r45.jr4) kr4Var.getCustom(8);
        if (jr4Var == null) {
            return;
        }
        jr4Var.set(1, java.lang.Boolean.FALSE);
    }
}
