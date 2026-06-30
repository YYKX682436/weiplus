package s72;

/* loaded from: classes12.dex */
public final class p0 extends jm0.g implements o72.g4 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f404123f;

    /* renamed from: g, reason: collision with root package name */
    public int f404124g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f404125h;

    /* renamed from: i, reason: collision with root package name */
    public s72.l0 f404126i;

    /* renamed from: m, reason: collision with root package name */
    public final s72.v0 f404127m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f404128n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f404129o;

    /* renamed from: p, reason: collision with root package name */
    public o72.h4 f404130p;

    /* renamed from: q, reason: collision with root package name */
    public o72.o5 f404131q;

    /* renamed from: r, reason: collision with root package name */
    public o72.o5 f404132r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f404133s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f404134t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f404124g = -1;
        this.f404127m = new s72.v0(service);
        this.f404134t = jz5.h.b(new s72.o0(service));
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "[onAccountInit] GetPinOnTopService initialized");
        if (!X6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "Sync on top service disabled.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "Sync on top service enabled.");
        new com.tencent.mm.plugin.fav.api.RegisterGetPinTopCallbacksEvent().e();
        this.f404126i = new s72.l0(this);
        this.f404128n = true;
        this.f404133s = true;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BypCommonBizFavPinTopInChatNotifyEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BypCommonBizFavPinTopInChatNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.fav.api.sync.GetPinOnTopService$onAccountInit$1
            {
                this.__eventId = -501799176;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BypCommonBizFavPinTopInChatNotifyEvent bypCommonBizFavPinTopInChatNotifyEvent) {
                com.tencent.mm.autogen.events.BypCommonBizFavPinTopInChatNotifyEvent event = bypCommonBizFavPinTopInChatNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "[FavPinTopInChat] notified.");
                s72.p0.this.V6();
                return true;
            }
        };
        this.f404125h = iListener;
        iListener.alive();
        V6();
    }

    @Override // jm0.g
    public void S6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "[onAccountRelease] GetPinOnTopService destroyed.");
        if (X6()) {
            com.tencent.mm.sdk.event.IListener iListener = this.f404125h;
            if (iListener != null) {
                iListener.dead();
            }
            this.f404125h = null;
            this.f404126i = null;
            this.f404128n = false;
        }
    }

    public boolean T6(o72.r2 r2Var) {
        if (r2Var == null) {
            return false;
        }
        return !U6() || r2Var.field_type == 18;
    }

    public final boolean U6() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_pin_note_enforce_note_type_check, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "check note type enabled, " + fj6);
        return fj6;
    }

    public void V6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getPinOnTop], callbacks ready: ");
        sb6.append(this.f404130p != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", sb6.toString());
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f404134t).getValue(), null, new s72.m0(this, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W6(kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s72.p0.W6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean X6() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_pin_note_sync_all_platform, false);
    }

    public void Y6(int i17, boolean z17, o72.o5 o5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "[GetPinOnTopService] pinOnTop with favId = " + i17 + ", onTop = " + z17);
        if (o5Var != null) {
            if (z17) {
                this.f404131q = o5Var;
            } else {
                this.f404132r = o5Var;
            }
        }
        s72.v0 v0Var = this.f404127m;
        v0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PinOnTopService", "[pinOnTop] with favId = " + i17 + ", onTop = " + z17);
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) v0Var.f404162f).getValue(), null, new s72.t0(v0Var, i17, z17, null), 1, null);
    }

    public void Z6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "[processCancelOnTopRequestFromExternal]");
        if (this.f404130p != null) {
            mz4.b0.c().d(null);
            com.tencent.mm.sdk.platformtools.u3.h(new ih0.m$$b());
        }
    }

    public void a7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "[processOnTopRequestFromExternal]");
        if (this.f404130p != null) {
            int i17 = this.f404124g;
            if (i17 == -1) {
                com.tencent.mars.xlog.Log.e("FavGetPinOnTopServiceCallbacksImpl", "pinOnTopCallbackFromExternal not a valid favId");
                return;
            }
            o72.r2 re6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(i17);
            if (re6 == null) {
                com.tencent.mars.xlog.Log.e("FavGetPinOnTopServiceCallbacksImpl", "pinOnTopCallbackFromExternal no such item exists.");
                return;
            }
            if (!((s72.p0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj()).T6(re6)) {
                com.tencent.mars.xlog.Log.e("FavGetPinOnTopServiceCallbacksImpl", "pinOnTopCallbackFromExternal not a note type");
                return;
            }
            iz4.r rVar = new iz4.r();
            rVar.f296140e = re6.field_localId;
            if (re6.field_favProto != null) {
                rVar.f296144i = s82.e0.n(new java.util.ArrayList(), re6.field_favProto.f370964f, null, "");
            }
            if (rVar.f296144i.isEmpty()) {
                rVar.f296144i = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.l_l);
            }
            mz4.b0.c().d(rVar);
            com.tencent.mm.sdk.platformtools.u3.h(new ih0.m$$a());
        }
    }
}
