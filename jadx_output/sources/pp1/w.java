package pp1;

/* loaded from: classes14.dex */
public final class w implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f357443d;

    public w(pp1.z zVar) {
        this.f357443d = zVar;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        pp1.a data = (pp1.a) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemClickListener onClick position: ");
        sb6.append(i17);
        sb6.append(", size:");
        pp1.z zVar = this.f357443d;
        sb6.append(zVar.f357451i.size());
        sb6.append(", isExpanded:");
        sb6.append(pp1.z.B);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", sb6.toString());
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = zVar.f357448f;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = data.f357393d;
        if (contentFloatBallView != null) {
            contentFloatBallView.D(ballInfo);
        }
        kotlin.jvm.internal.o.g(ballInfo, "ballInfo");
        android.view.View b17 = qp1.g0.f365722a.b(itemView);
        if (b17 != null) {
            int[] iArr = new int[2];
            b17.getLocationOnScreen(iArr);
            int i18 = iArr[0];
            int i19 = iArr[1];
            int width = b17.getWidth();
            int height = b17.getHeight();
            qp1.g0.f365723b = new qp1.c(ballInfo, new com.tencent.mm.plugin.ball.model.BallSizeAndPosInfo(new android.graphics.Point(width, height), new android.graphics.Point(i18, i19)));
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewUtils", "updateBallViewPosition position: (" + i18 + ", " + i19 + "), size: (" + width + ", " + height + ')');
        }
        if (ballInfo.f93050h == null) {
            ((gp1.v) ((jz5.n) zVar.f357453n).getValue()).h0(ballInfo);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ni(1);
    }
}
