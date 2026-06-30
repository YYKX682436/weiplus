package pp1;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f357409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f357410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f357411f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f357412g;

    public g(pp1.z zVar, boolean z17, boolean z18, yz5.a aVar) {
        this.f357409d = zVar;
        this.f357410e = z17;
        this.f357411f = z18;
        this.f357412g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pp1.z zVar = this.f357409d;
        boolean z17 = this.f357410e;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = zVar.f357448f;
        kotlin.jvm.internal.o.d(contentFloatBallView);
        zVar.n(z17, true, 1.0f, contentFloatBallView.getCollapseScale(), this.f357411f);
        ((ku5.t0) ku5.t0.f312615d).B(new pp1.f(this.f357409d, this.f357410e, this.f357412g));
    }
}
