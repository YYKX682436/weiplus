package pg2;

/* loaded from: classes3.dex */
public final class v extends ug5.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mn0.b0 f354190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f354191f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f354192g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f354193h;

    public v(mn0.b0 b0Var, yz5.q qVar, long j17, pg2.j0 j0Var) {
        this.f354190e = b0Var;
        this.f354191f = qVar;
        this.f354192g = j17;
        this.f354193h = j0Var;
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
        mn0.b0 b0Var = this.f354190e;
        nn0.c cVar = b0Var instanceof nn0.c ? (nn0.c) b0Var : null;
        if (cVar != null) {
            cVar.Y(new android.graphics.RectF());
        }
        android.content.Intent intent = new android.content.Intent();
        ug5.x.d(intent, performer, java.lang.String.valueOf(this.f354192g));
        this.f354191f.invoke(java.lang.Boolean.TRUE, performer, intent);
    }

    @Override // ug5.h
    public void b(ug5.v performer) {
        kotlin.jvm.internal.o.g(performer, "performer");
        android.content.Intent intent = new android.content.Intent();
        ug5.x.d(intent, performer, java.lang.String.valueOf(this.f354192g));
        this.f354191f.invoke(java.lang.Boolean.FALSE, performer, intent);
    }

    @Override // ug5.h
    public void e(android.content.Context context, boolean z17, ug5.v performer) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.e(context, z17, performer);
        pg2.j0.Ai(this.f354193h, performer, z17);
    }

    @Override // ug5.h
    public void g(android.content.Context context, ug5.v performer) {
        gp1.v Bi;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.g(context, performer);
        performer.f427658a.f427595i.put("key_first_frame_render", java.lang.Boolean.TRUE);
        java.lang.Object d17 = performer.d("key_ball_info");
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = d17 instanceof com.tencent.mm.plugin.ball.model.BallInfo ? (com.tencent.mm.plugin.ball.model.BallInfo) d17 : null;
        if (ballInfo == null || (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) == null) {
            return;
        }
        Bi.k(ballInfo, 0.001f);
    }
}
