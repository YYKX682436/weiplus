package qn2;

/* loaded from: classes3.dex */
public final class r0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qn2.v0 f365144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s71.b f365145b;

    public r0(qn2.v0 v0Var, s71.b bVar) {
        this.f365144a = v0Var;
        this.f365145b = bVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        r45.cz1 cz1Var;
        if (z17) {
            qn2.v0 v0Var = this.f365144a;
            km2.z zVar = ((on2.z2) v0Var.f365176a.P0(on2.z2.class)).f347092m;
            if (zVar == null || (cz1Var = zVar.f309232d) == null) {
                com.tencent.mars.xlog.Log.e("VisitorLotteryCardDoneWidget", "post addr but lotteryInfo is empty!");
            } else {
                com.tencent.mm.plugin.finder.live.util.y.e(v0Var.f365176a, kotlinx.coroutines.q1.f310570c, null, new qn2.q0(v0Var, this.f365145b, cz1Var, null), 2, null);
            }
        }
    }
}
