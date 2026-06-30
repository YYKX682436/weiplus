package rp1;

/* loaded from: classes13.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallView f398513d;

    public q(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView) {
        this.f398513d = contentFloatBallView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.ball.view.ContentFloatBallCollapseView collapseView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/view/ContentFloatBallView$initCollapseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCollapseViewClick isCurrentCollapsedState: ");
        rp1.h hVar = com.tencent.mm.plugin.ball.view.ContentFloatBallView.T;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f398513d;
        sb6.append(contentFloatBallView.w());
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", sb6.toString());
        collapseView = contentFloatBallView.getCollapseView();
        if (collapseView.getVisibility() == 0 && !contentFloatBallView.x()) {
            android.graphics.PointF pointF = contentFloatBallView.C;
            contentFloatBallView.z(pointF.x, pointF.y);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/ContentFloatBallView$initCollapseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
