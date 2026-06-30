package on2;

/* loaded from: classes3.dex */
public final class b0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ on2.v0 f346844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s71.b f346845b;

    public b0(on2.v0 v0Var, s71.b bVar) {
        this.f346844a = v0Var;
        this.f346845b = bVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        r45.cz1 cz1Var;
        r45.gm4 gm4Var;
        if (z17) {
            on2.v0 v0Var = this.f346844a;
            r45.ht1 ht1Var = v0Var.R;
            boolean z18 = ht1Var != null && ht1Var.getInteger(10) == 3;
            s71.b bVar = this.f346845b;
            if (z18) {
                r45.ht1 ht1Var2 = v0Var.R;
                if (ht1Var2 == null || (gm4Var = (r45.gm4) ht1Var2.getCustom(13)) == null || pf5.e.launch$default(v0Var, kotlinx.coroutines.q1.f310570c, null, new on2.j0(v0Var, bVar, gm4Var, null), 2, null) == null) {
                    com.tencent.mars.xlog.Log.e("FinderLiveLotteryAudienceUIC", "post addr but lotteryInfo is empty!");
                    return;
                }
                return;
            }
            r45.ht1 ht1Var3 = v0Var.R;
            if (ht1Var3 == null || (cz1Var = (r45.cz1) ht1Var3.getCustom(1)) == null || pf5.e.launch$default(v0Var, kotlinx.coroutines.q1.f310570c, null, new on2.l0(v0Var, bVar, cz1Var, null), 2, null) == null) {
                com.tencent.mars.xlog.Log.e("FinderLiveLotteryAudienceUIC", "post addr but lotteryInfo is empty!");
            }
        }
    }
}
