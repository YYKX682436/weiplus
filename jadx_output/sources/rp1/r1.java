package rp1;

/* loaded from: classes14.dex */
public class r1 implements mp1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatMenuView f398520a;

    public r1(com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView) {
        this.f398520a = floatMenuView;
    }

    @Override // mp1.e
    public void a(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        int i17 = com.tencent.mm.plugin.ball.view.FloatMenuView.I;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f398520a.f93586q).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.ball.ui.d) ((mp1.f) it.next())).a(ballInfo);
        }
    }

    @Override // mp1.e
    public void b(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, int i17) {
        com.tencent.mm.plugin.ball.view.FloatMenuView.b(this.f398520a, ballInfo, i17);
    }
}
