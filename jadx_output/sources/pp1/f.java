package pp1;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f357406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f357407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f357408f;

    public f(pp1.z zVar, boolean z17, yz5.a aVar) {
        this.f357406d = zVar;
        this.f357407e = z17;
        this.f357408f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pp1.z zVar = this.f357406d;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = zVar.f357448f;
        if (contentFloatBallView != null) {
            contentFloatBallView.U(0.0f);
        }
        pp1.z.c(zVar);
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView2 = zVar.f357448f;
        if (contentFloatBallView2 != null) {
            boolean z17 = this.f357407e;
            contentFloatBallView2.R(z17 ? 1 : 2, z17);
        }
        yz5.a aVar = this.f357408f;
        if (aVar != null) {
            aVar.invoke();
        }
        zVar.f357455p = false;
    }
}
