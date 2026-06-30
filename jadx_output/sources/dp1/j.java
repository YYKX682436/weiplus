package dp1;

/* loaded from: classes14.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f242134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dp1.l f242135e;

    public j(dp1.l lVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f242135e = lVar;
        this.f242134d = ballInfo;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f242134d;
        ballInfo.M.f93090m = 1;
        this.f242135e.f242166h.a(ballInfo);
        yj0.a.h(this, "com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
