package g63;

/* loaded from: classes8.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public g63.t0 f269106a;

    /* renamed from: b, reason: collision with root package name */
    public final g63.j f269107b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f269108c;

    /* renamed from: d, reason: collision with root package name */
    public final u53.a0 f269109d;

    /* renamed from: e, reason: collision with root package name */
    public final z53.t f269110e;

    /* renamed from: f, reason: collision with root package name */
    public final g63.d0 f269111f;

    /* renamed from: g, reason: collision with root package name */
    public final l75.q0 f269112g;

    /* renamed from: h, reason: collision with root package name */
    public final l75.q0 f269113h;

    public f0(g63.t0 t0Var, g63.j adapter) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f269106a = t0Var;
        this.f269107b = adapter;
        this.f269108c = true;
        this.f269109d = (u53.a0) i95.n0.c(u53.a0.class);
        this.f269110e = ((t53.m0) i95.n0.c(t53.m0.class)).Ui();
        this.f269111f = new g63.d0(this);
        this.f269112g = new g63.a0(this);
        this.f269113h = new g63.c0(this);
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("GameLife.ConversationPresenter", "checkHistoryConversation");
        m33.l1 l1Var = (m33.l1) i95.n0.c(m33.l1.class);
        g63.u uVar = new g63.u(this);
        com.tencent.mm.plugin.game.p0 p0Var = (com.tencent.mm.plugin.game.p0) l1Var;
        p0Var.getClass();
        if (((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GAME_LIFE_HISTORY_DELETED_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue()) {
            uVar.a(null);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.t0(p0Var, uVar));
    }
}
