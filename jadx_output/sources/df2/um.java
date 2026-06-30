package df2;

/* loaded from: classes3.dex */
public final class um implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.cn f231538d;

    public um(df2.cn cnVar) {
        this.f231538d = cnVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        df2.cn cnVar = this.f231538d;
        com.tencent.mars.xlog.Log.i(cnVar.f229892p, "[guideResultData] pair = " + lVar);
        if (((java.lang.Boolean) lVar.f302833d).booleanValue()) {
            df2.cn.m7(cnVar);
        } else {
            cnVar.r7(false, (r45.wg7) lVar.f302834e, true);
        }
        cnVar.f229897u.postValue(lVar.f302833d);
        kotlinx.coroutines.r2 r2Var = cnVar.f229901y;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        cnVar.f229901y = com.tencent.mm.plugin.finder.live.util.y.o(cnVar, null, null, new df2.qm(cnVar, "guideResultData.observe", null), 3, null);
    }
}
