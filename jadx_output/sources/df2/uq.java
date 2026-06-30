package df2;

/* loaded from: classes.dex */
public final class uq implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ar f231549d;

    public uq(df2.ar arVar) {
        this.f231549d = arVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        int intValue = ((java.lang.Number) obj).intValue();
        df2.ar arVar = this.f231549d;
        if (intValue == 2 || intValue == 3) {
            r45.lv1 lv1Var = arVar.f229746v;
            java.lang.String string = lv1Var != null ? lv1Var.getString(0) : null;
            if (string != null && !kotlin.jvm.internal.o.b(arVar.f229744t, string)) {
                com.tencent.mars.xlog.Log.i(arVar.f229737m, "autoShow:" + string + ", lastStatus:" + arVar.f229745u);
                if (zl2.r4.f473950a.w1()) {
                    df2.ar arVar2 = this.f231549d;
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    com.tencent.mm.plugin.finder.live.util.y.o(arVar2, kotlinx.coroutines.internal.b0.f310484a, null, new df2.tq(arVar2, null), 2, null);
                } else if (arVar.f229745u == 1 && arVar.e7(arVar.f229746v)) {
                    arVar.k7(false);
                }
                arVar.f229744t = string;
            }
        }
        arVar.f229745u = intValue;
        return jz5.f0.f302826a;
    }
}
