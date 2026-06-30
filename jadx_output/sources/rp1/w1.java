package rp1;

/* loaded from: classes14.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f398549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f398550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f398551f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatMenuView f398552g;

    public w1(com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView, int i17, int i18, boolean z17) {
        this.f398552g = floatMenuView;
        this.f398549d = i17;
        this.f398550e = i18;
        this.f398551f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.ball.view.FloatMenuView.I;
        com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView = this.f398552g;
        floatMenuView.j(this.f398549d, this.f398550e);
        dp1.l lVar = floatMenuView.f93579g;
        if (lVar != null) {
            lVar.f242163e = this.f398551f;
            lVar.notifyDataSetChanged();
        }
    }
}
