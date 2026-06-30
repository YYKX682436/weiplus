package il2;

/* loaded from: classes3.dex */
public final class n implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ il2.r f292074d;

    public n(il2.r rVar) {
        this.f292074d = rVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.p5 p5Var = (mm2.p5) obj;
        int ordinal = p5Var.f329349a.ordinal();
        il2.r rVar = this.f292074d;
        if (ordinal == 0) {
            il2.r.t1(rVar, p5Var);
            return;
        }
        if (ordinal == 1) {
            rVar.b0(1, p5Var.f329350b, new il2.l(p5Var, rVar));
        } else {
            if (ordinal != 2) {
                return;
            }
            long j17 = p5Var.f329350b;
            il2.m mVar = new il2.m(p5Var, rVar);
            rVar.getClass();
            com.tencent.mm.plugin.finder.live.util.y.m(rVar, null, null, new il2.f(rVar, j17, mVar, null), 3, null);
        }
    }
}
