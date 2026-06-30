package df2;

/* loaded from: classes3.dex */
public final class uz implements ie2.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f231568d;

    public uz(df2.a00 a00Var) {
        this.f231568d = a00Var;
    }

    @Override // ie2.h
    public void j() {
        df2.a00 a00Var = this.f231568d;
        com.tencent.mm.plugin.finder.live.util.y.o(a00Var, null, null, new df2.tz(a00Var, null), 3, null);
    }

    @Override // ie2.h
    public java.lang.Object q(kotlin.coroutines.Continuation continuation) {
        df2.a00 a00Var = this.f231568d;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        com.tencent.mm.plugin.finder.live.util.y.o(a00Var, null, null, new df2.rz(rVar, a00Var, null), 3, null);
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f359186d ? j17 : jz5.f0.f302826a;
    }

    @Override // ie2.h
    public void s(android.os.Bundle bundle) {
        com.tencent.mm.view.MMPAGView b76 = this.f231568d.b7();
        if (b76 == null) {
            return;
        }
        b76.setProgress(1.0d);
    }
}
