package ef4;

@j95.b
/* loaded from: classes4.dex */
public final class w extends i95.w {

    /* renamed from: t, reason: collision with root package name */
    public static final ef4.v f252468t = new ef4.v(null);

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f252469u;

    /* renamed from: v, reason: collision with root package name */
    public static long f252470v;

    /* renamed from: d, reason: collision with root package name */
    public boolean f252471d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f252472e;

    /* renamed from: f, reason: collision with root package name */
    public nf4.l f252473f;

    /* renamed from: g, reason: collision with root package name */
    public nf4.g f252474g;

    /* renamed from: h, reason: collision with root package name */
    public nf4.n f252475h;

    /* renamed from: i, reason: collision with root package name */
    public nf4.a f252476i;

    /* renamed from: m, reason: collision with root package name */
    public nf4.p f252477m;

    /* renamed from: n, reason: collision with root package name */
    public nf4.i f252478n;

    /* renamed from: o, reason: collision with root package name */
    public hf4.f f252479o;

    /* renamed from: p, reason: collision with root package name */
    public ef4.f0 f252480p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.story.PluginStory$StorySynclistener f252481q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.story.model.StoryCore$ConfigChangedListener f252482r;

    /* renamed from: s, reason: collision with root package name */
    public volatile d95.b0 f252483s;

    static {
        new android.graphics.Point();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f252469u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExptChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.story.model.StoryCore$Companion$exptChangeListener$1
            {
                this.__eventId = -31521245;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExptChangeEvent exptChangeEvent) {
                com.tencent.mm.autogen.events.ExptChangeEvent event = exptChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                ef4.v vVar = ef4.w.f252468t;
                return true;
            }
        };
        f252470v = -1L;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.story.PluginStory$StorySynclistener] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.story.model.StoryCore$ConfigChangedListener] */
    public w() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f252472e = hashMap;
        this.f252481q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StorySyncEvent>() { // from class: com.tencent.mm.plugin.story.PluginStory$StorySynclistener
            {
                com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
                this.__eventId = 1194890618;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.StorySyncEvent storySyncEvent) {
                com.tencent.mm.autogen.events.StorySyncEvent event = storySyncEvent;
                kotlin.jvm.internal.o.g(event, "event");
                gm0.j1.n().f273288b.g(new ff4.m(128));
                return false;
            }
        };
        this.f252482r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent>() { // from class: com.tencent.mm.plugin.story.model.StoryCore$ConfigChangedListener
            {
                super(com.tencent.mm.app.a0.f53288d);
                this.__eventId = -443124368;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent dynamicConfigUpdatedEvent) {
                com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent event = dynamicConfigUpdatedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                ef4.v vVar = ef4.w.f252468t;
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryCore", "dynamicCfg changed, will loadConfig.");
                ef4.w.this.getClass();
                int i17 = bf4.i.f19719b;
                return false;
            }
        };
        hashMap.put(541145475, ef4.o.f252461a);
        hashMap.put(391276095, ef4.p.f252462a);
        hashMap.put(-2097386107, ef4.q.f252463a);
        hashMap.put(1540233546, ef4.r.f252464a);
        hashMap.put(-860939664, ef4.s.f252465a);
        hashMap.put(917584926, ef4.t.f252466a);
        hashMap.put(2106223442, ef4.u.f252467a);
    }

    public static final void wi(ef4.w wVar) {
        if (wVar.f252483s != null) {
            return;
        }
        wVar.f252483s = new d95.b0();
        java.lang.String str = gm0.j1.u().h() + "StoryMicroMsg.db";
        d95.b0 b0Var = wVar.f252483s;
        kotlin.jvm.internal.o.d(b0Var);
        if (b0Var.S(str, wVar.f252472e, true, true)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCore", "removeDirtyDB.");
        java.lang.String h17 = gm0.j1.u().h();
        kotlin.jvm.internal.o.f(h17, "getPrivateAccountPath(...)");
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(h17, false);
        if (s17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StoryCore", "removeDirtyDB files null");
            return;
        }
        for (com.tencent.mm.vfs.x1 x1Var : s17) {
            if (!x1Var.f213236f) {
                java.lang.String name = x1Var.f213232b;
                kotlin.jvm.internal.o.f(name, "name");
                if (r26.n0.B(name, "StoryMicroMsg", false)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.StoryCore", "removeDirtyDB will delete:%s", x1Var.f213231a);
                    x1Var.a();
                }
            }
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f252471d) {
            return;
        }
        this.f252471d = true;
        com.tencent.mm.vfs.w6.u(((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).wi());
        ye4.e eVar = (ye4.e) ((ze4.f) i95.n0.c(ze4.f.class));
        eVar.getClass();
        com.tencent.mm.vfs.w6.u(gm0.j1.u().d() + eVar.f461236e);
        alive();
        q25.b.b(new ef4.l(), "//story");
        ef4.v vVar = f252468t;
        nf4.g g17 = vVar.g();
        g17.add(g17);
        gf4.l lVar = gf4.l.f271354d;
        java.lang.String str = gf4.l.f271355e;
        boolean j17 = com.tencent.mm.vfs.w6.j(str);
        java.lang.String str2 = gf4.l.f271356f;
        if (j17 && !com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mm.vfs.w6.w(str, str2);
        }
        byte[] N = com.tencent.mm.vfs.w6.N(str2, 0, -1);
        if (N != null) {
            if (true ^ (N.length == 0)) {
                gf4.l.f271359i.parseFrom(N);
            }
        }
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.nfc.m.CTRL_INDEX, lVar);
        gm0.j1.n().f273288b.a(764, lVar);
        lVar.m();
        kf4.o oVar = kf4.o.f307484d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncFetcher", "init: ");
        vVar.g().add(oVar);
        vVar.i().add(oVar);
        pm0.v.V(1000L, kf4.e.f307473d);
        kf4.o.f307492o.alive();
        lVar.a(kf4.o.f307493p);
        f252469u.alive();
        ef4.c0.f252439b = "";
        com.tencent.mm.vfs.w6.u(vVar.b().concat("coming/"));
        com.tencent.mm.vfs.w6.u(vVar.b().concat("pic/"));
        com.tencent.mm.vfs.w6.u(vVar.b().concat("video/"));
        alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        dead();
        dead();
        q25.b.c("//story");
        ef4.v vVar = f252468t;
        nf4.g g17 = vVar.g();
        g17.remove(g17);
        gf4.l lVar = gf4.l.f271354d;
        com.tencent.mm.vfs.w6.R(gf4.l.f271356f, gf4.l.f271359i.toByteArray());
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.nfc.m.CTRL_INDEX, lVar);
        gm0.j1.n().f273288b.q(764, lVar);
        kf4.o oVar = kf4.o.f307484d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncFetcher", "destroy: ");
        vVar.g().remove(oVar);
        vVar.i().remove(oVar);
        kf4.o.f307491n.clear();
        kf4.o.f307492o.dead();
        lVar.j(kf4.o.f307493p);
        f252469u.dead();
    }
}
