package pg2;

/* loaded from: classes3.dex */
public final class e0 extends ug5.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mn0.b0 f354097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c50.e1 f354098f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f354099g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f354100h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f354101i;

    public e0(mn0.b0 b0Var, c50.e1 e1Var, yz5.q qVar, long j17, pg2.j0 j0Var) {
        this.f354097e = b0Var;
        this.f354098f = e1Var;
        this.f354099g = qVar;
        this.f354100h = j17;
        this.f354101i = j0Var;
    }

    @Override // ug5.h
    public void a(android.animation.Animator animation, ug5.v performer) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.a(animation, performer);
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            eVar.e();
        }
        mn0.b0 b0Var = this.f354097e;
        nn0.c cVar = b0Var instanceof nn0.c ? (nn0.c) b0Var : null;
        if (cVar != null) {
            cVar.Y(new android.graphics.RectF());
        }
        android.content.Intent intent = new android.content.Intent();
        ug5.x.d(intent, performer, java.lang.String.valueOf(this.f354100h));
        this.f354099g.invoke(java.lang.Boolean.TRUE, performer, intent);
    }

    @Override // ug5.h
    public void b(ug5.v performer) {
        kotlin.jvm.internal.o.g(performer, "performer");
        android.content.Intent intent = new android.content.Intent();
        ug5.x.d(intent, performer, java.lang.String.valueOf(this.f354100h));
        this.f354099g.invoke(java.lang.Boolean.FALSE, performer, intent);
    }

    @Override // ug5.h
    public void c(android.animation.Animator animation, ug5.v performer) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.c(animation, performer);
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            c50.e1 e1Var = this.f354098f;
            eVar.f(e1Var != null ? e1Var.f38598b : 240L);
        }
    }

    @Override // ug5.h
    public void d(float f17, android.graphics.Rect clipRect, android.graphics.Rect canvasRect, ug5.v performer) {
        kotlin.jvm.internal.o.g(clipRect, "clipRect");
        kotlin.jvm.internal.o.g(canvasRect, "canvasRect");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.d(f17, clipRect, canvasRect, performer);
        mn0.b0 b0Var = this.f354097e;
        nn0.c cVar = b0Var instanceof nn0.c ? (nn0.c) b0Var : null;
        if (cVar != null) {
            cVar.Y(ug5.x.g(clipRect, canvasRect));
        }
    }

    @Override // ug5.h
    public void e(android.content.Context context, boolean z17, ug5.v performer) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.e(context, z17, performer);
        pg2.j0.Ai(this.f354101i, performer, z17);
    }

    @Override // ug5.h
    public void f() {
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // ug5.h
    public void g(android.content.Context context, ug5.v performer) {
        gp1.v Bi;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.g(context, performer);
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            eVar.d();
        }
        mn0.b0 b0Var = this.f354097e;
        performer.f("key_player_view", new java.lang.ref.WeakReference(((mn0.y) b0Var).o()));
        performer.f427658a.f427595i.put("key_first_frame_render", java.lang.Boolean.TRUE);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = (com.tencent.rtmp.ui.TXCloudVideoView) performer.f427660c;
        if (tXCloudVideoView != null) {
            ((mn0.y) b0Var).O(tXCloudVideoView, new pg2.d0(this.f354098f, performer, elapsedRealtime));
        }
        java.lang.Object d17 = performer.d("key_ball_info");
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = d17 instanceof com.tencent.mm.plugin.ball.model.BallInfo ? (com.tencent.mm.plugin.ball.model.BallInfo) d17 : null;
        if (ballInfo == null || (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) == null) {
            return;
        }
        Bi.k(ballInfo, 0.001f);
    }
}
