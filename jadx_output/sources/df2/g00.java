package df2;

/* loaded from: classes3.dex */
public final class g00 implements ie2.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.m00 f230183d;

    public g00(df2.m00 m00Var) {
        this.f230183d = m00Var;
    }

    @Override // ie2.h
    public void j() {
        df2.m00 m00Var = this.f230183d;
        com.tencent.mm.plugin.finder.live.util.y.o(m00Var, null, null, new df2.f00(m00Var, null), 3, null);
    }

    @Override // ie2.h
    public java.lang.Object q(kotlin.coroutines.Continuation continuation) {
        df2.m00 m00Var = this.f230183d;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        com.tencent.mm.plugin.finder.live.util.y.o(m00Var, null, null, new df2.e00(rVar, m00Var, null), 3, null);
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f359186d ? j17 : jz5.f0.f302826a;
    }

    @Override // ie2.h
    public void s(android.os.Bundle bundle) {
        df2.m00 m00Var = this.f230183d;
        com.tencent.mm.view.MMPAGView c76 = m00Var.c7();
        if (c76 != null) {
            c76.setProgress(1.0d);
        }
        android.view.View findViewById = m00Var.findViewById(com.tencent.mm.R.id.f483752by4);
        if (findViewById != null) {
            findViewById.setOnClickListener(new df2.l00(m00Var));
        }
    }
}
