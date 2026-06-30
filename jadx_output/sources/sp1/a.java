package sp1;

/* loaded from: classes8.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp1.b f410946d;

    public a(sp1.b bVar) {
        this.f410946d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/view/item/FloatBallViewNormalItem$setOnDeleteListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onViewDeleteButtonClick ");
        sp1.b bVar = this.f410946d;
        sb6.append(bVar.f410947d.f357393d.f93049g);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewNormalItem", sb6.toString());
        com.tencent.mm.plugin.ball.service.s H0 = com.tencent.mm.plugin.ball.service.s.H0();
        ballInfo = bVar.getBallInfo();
        H0.U(ballInfo);
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/item/FloatBallViewNormalItem$setOnDeleteListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
