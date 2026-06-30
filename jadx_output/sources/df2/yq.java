package df2;

/* loaded from: classes3.dex */
public final class yq implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ar f231889d;

    public yq(df2.ar arVar) {
        this.f231889d = arVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTimerUpdate remainTime:");
        df2.ar arVar = this.f231889d;
        sb6.append(((java.lang.Number) ((kotlinx.coroutines.flow.h3) arVar.f229742r).getValue()).intValue());
        sb6.append(", statue = ");
        r45.lv1 lv1Var = arVar.f229746v;
        sb6.append(lv1Var != null ? java.lang.Integer.valueOf(lv1Var.getInteger(6)) : null);
        com.tencent.mars.xlog.Log.i(arVar.f229737m, sb6.toString());
        r45.lv1 lv1Var2 = arVar.f229746v;
        if (lv1Var2 != null && lv1Var2.getInteger(6) == 1) {
            pm0.v.X(new df2.sq(arVar));
        } else {
            arVar.f229741q.d();
        }
        return true;
    }
}
