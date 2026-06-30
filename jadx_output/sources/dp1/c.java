package dp1;

/* loaded from: classes14.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f242121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dp1.k f242122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dp1.l f242123f;

    public c(dp1.l lVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo, dp1.k kVar) {
        this.f242123f = lVar;
        this.f242121d = ballInfo;
        this.f242122e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dp1.q qVar = dp1.p.f242170a;
        android.content.Context context = view.getContext();
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f242121d;
        if (qVar.b(context, ballInfo)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallMenuAdapter", "onFloatBallListCloseBtn delegate intercept");
            yj0.a.h(this, "com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        dp1.l lVar = this.f242123f;
        boolean z17 = lVar.f242168m;
        dp1.k kVar = this.f242122e;
        if (z17) {
            int i17 = kVar.f242137e;
            java.util.List list = lVar.f242165g;
            if (list != null) {
                boolean z18 = false;
                if (list.size() > 1) {
                    int i18 = kVar.f242137e;
                    if (i18 >= 0 && i18 < lVar.f242165g.size()) {
                        z18 = true;
                    }
                    if (z18) {
                        lVar.f242165g.remove(kVar.f242137e);
                        lVar.notifyItemRemoved(kVar.f242137e);
                    }
                } else if (lVar.f242165g.size() == 1) {
                    int i19 = kVar.f242137e;
                    if (i19 >= 0 && i19 < lVar.f242165g.size()) {
                        z18 = true;
                    }
                    if (z18) {
                        lVar.f242165g.remove(kVar.f242137e);
                        rp1.i2 i2Var = lVar.f242169n;
                        if (i2Var != null) {
                            ((rp1.v1) i2Var).a(kVar, new dp1.d(lVar, kVar));
                        }
                    }
                }
            }
        } else {
            mp1.e eVar = lVar.f242166h;
            if (eVar != null) {
                eVar.b(ballInfo, kVar.getAdapterPosition());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
