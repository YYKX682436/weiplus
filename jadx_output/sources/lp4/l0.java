package lp4;

/* loaded from: classes10.dex */
public final class l0 extends yt3.a implements vm5.a {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.videocomposition.play.VideoCompositionPlayView f320373f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f320374g;

    /* renamed from: h, reason: collision with root package name */
    public final lp4.k0 f320375h;

    /* renamed from: i, reason: collision with root package name */
    public bp4.c0 f320376i;

    /* renamed from: m, reason: collision with root package name */
    public rm5.v f320377m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.videocomposition.play.VideoCompositionPlayView playView, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(playView, "playView");
        kotlin.jvm.internal.o.g(status, "status");
        this.f320373f = playView;
        this.f320374g = new java.util.LinkedList();
        this.f320375h = new lp4.k0(this, status);
        playView.setPlayerCallback(this);
    }

    public static void C(lp4.l0 l0Var, rm5.v vVar, boolean z17, boolean z18, long j17, int i17, java.lang.Object obj) {
        boolean z19 = (i17 & 2) != 0 ? true : z17;
        boolean z27 = (i17 & 4) != 0 ? true : z18;
        if ((i17 & 8) != 0) {
            j17 = -1;
        }
        long j18 = j17;
        if (vVar == null) {
            l0Var.getClass();
        } else {
            l0Var.f320377m = vVar;
            l0Var.f320373f.q(vVar, z19, z27, j18);
        }
    }

    public final void A(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorPreviewPlugin", "seek to " + j17);
        this.f320373f.j(j17);
    }

    public final void B(long j17, long j18) {
        this.f320373f.k(j17, j18);
    }

    @Override // vm5.a
    public void a(long j17) {
        for (bp4.z zVar : this.f320374g) {
            if (zVar instanceof bp4.a0) {
                ((bp4.a0) zVar).c(j17);
            }
        }
    }

    @Override // vm5.a
    public void e() {
    }

    @Override // vm5.a
    public void g() {
        for (bp4.z zVar : this.f320374g) {
            if (zVar instanceof bp4.a0) {
                ((bp4.a0) zVar).onFinish();
            }
        }
    }

    @Override // vm5.a
    public void i() {
    }

    @Override // yt3.r2
    public void release() {
        this.f320374g.clear();
    }

    @Override // vm5.a
    public void s() {
        for (bp4.z zVar : this.f320374g) {
            if (zVar instanceof bp4.a0) {
                ((bp4.a0) zVar).n(this.f320375h);
            }
        }
        long position = this.f320373f.getPosition();
        rm5.v vVar = this.f320377m;
        long i17 = position - ((vVar != null ? vVar.i() : 0L) / 1000);
        bp4.c0 c0Var = this.f320376i;
        if (c0Var != null) {
            bp4.c0.m(c0Var, i17, null, 2, null);
        }
    }

    @Override // vm5.a
    public void x() {
        ju3.d0.k(this.f465332d, ju3.c0.R2, null, 2, null);
    }

    public final void z(bp4.z callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.LinkedList linkedList = this.f320374g;
        if (linkedList.contains(callback)) {
            return;
        }
        linkedList.add(callback);
    }
}
