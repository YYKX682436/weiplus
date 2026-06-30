package ps3;

/* loaded from: classes11.dex */
public final class m implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final ps3.c f358102d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f358103e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f358104f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f358105g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.radar.model.RadarAddContact$onFMsgInfoNotify$1 f358106h;

    /* renamed from: i, reason: collision with root package name */
    public final ps3.g f358107i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f358108m;

    /* JADX WARN: Type inference failed for: r3v1, types: [com.tencent.mm.plugin.radar.model.RadarAddContact$onFMsgInfoNotify$1] */
    public m(ps3.c delegate, android.content.Context context) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        kotlin.jvm.internal.o.g(context, "context");
        this.f358102d = delegate;
        this.f358103e = context;
        this.f358104f = new java.util.LinkedList();
        this.f358105g = new java.util.HashMap();
        this.f358106h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RadarSayHiMsgEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.radar.model.RadarAddContact$onFMsgInfoNotify$1
            {
                this.__eventId = -2067027249;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RadarSayHiMsgEvent radarSayHiMsgEvent) {
                com.tencent.mm.autogen.events.RadarSayHiMsgEvent event = radarSayHiMsgEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String str = event.f54641g.f6967a;
                com.tencent.mm.storage.e9 f17 = com.tencent.mm.storage.e9.f(str);
                ps3.m mVar = ps3.m.this;
                com.tencent.mm.storage.z3 a17 = ps3.m.a(mVar, f17);
                mVar.f(a17);
                kotlin.jvm.internal.o.d(str);
                java.util.HashMap hashMap = mVar.f358105g;
                hashMap.put(a17.d1(), str);
                hashMap.put(a17.J0(), str);
                com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                if (!Bi.j0(a17.J0())) {
                    Bi.l0(a17);
                }
                mVar.f358108m.post(new ps3.j(mVar, a17));
                return false;
            }
        };
        this.f358107i = new ps3.g(this);
        this.f358108m = new com.tencent.mm.sdk.platformtools.n3();
    }

    public static final com.tencent.mm.storage.z3 a(ps3.m mVar, com.tencent.mm.storage.e9 e9Var) {
        mVar.getClass();
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        if (e9Var != null) {
            z3Var.X1(e9Var.f193859a);
            z3Var.K1(e9Var.f193882x);
            z3Var.k1(e9Var.f193860b);
            z3Var.M1(e9Var.f193861c);
            z3Var.R1(e9Var.f193863e);
            z3Var.S1(e9Var.f193862d);
            z3Var.g3(e9Var.f193873o);
            z3Var.h3(e9Var.f193874p);
            z3Var.b3(e9Var.d());
            z3Var.L2(e9Var.a());
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.RadarAddContact", "verify is null! must be parsed error before!");
        }
        return z3Var;
    }

    public static final void b(ps3.m mVar, java.lang.String str, int i17) {
        mVar.getClass();
        com.tencent.mm.autogen.events.FMessageConversationStateOpEvent fMessageConversationStateOpEvent = new com.tencent.mm.autogen.events.FMessageConversationStateOpEvent();
        am.h9 h9Var = fMessageConversationStateOpEvent.f54225g;
        h9Var.getClass();
        h9Var.f6827b = str;
        h9Var.f6826a = i17;
        fMessageConversationStateOpEvent.e();
    }

    public final long c(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ps3.b bVar = new ps3.b(this, new ps3.f(this, username, currentTimeMillis));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(48);
        iz5.a.g(null, username.length() > 0);
        gm0.j1.d().a(30, bVar);
        bVar.f358073f = linkedList;
        bVar.f358074g = username;
        java.util.LinkedList linkedList2 = bVar.f358072e;
        linkedList2.add(username);
        ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).getClass();
        new r35.e4(this.f358103e, null).g(linkedList2, linkedList);
        return currentTimeMillis;
    }

    public final ps3.e d(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        java.util.LinkedList linkedList = this.f358104f;
        return (n17 == null || ((int) n17.E2) == 0) ? linkedList.contains(username) ? ps3.e.f358077e : ps3.e.f358076d : n17.r2() ? ps3.e.f358078f : this.f358105g.containsKey(username) ? ps3.e.f358079g : linkedList.contains(username) ? ps3.e.f358077e : ps3.e.f358076d;
    }

    public final void e(com.tencent.mm.storage.z3 z3Var) {
        f(z3Var);
        java.util.HashMap hashMap = this.f358105g;
        hashMap.remove(z3Var.d1());
        hashMap.remove(z3Var.J0());
        this.f358108m.post(new ps3.i(this, z3Var));
    }

    public final void f(com.tencent.mm.storage.z3 z3Var) {
        java.util.LinkedList linkedList = this.f358104f;
        if (linkedList.contains(z3Var.d1())) {
            linkedList.remove(z3Var.d1());
        }
        if (linkedList.contains(z3Var.J0())) {
            linkedList.remove(z3Var.J0());
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 stg, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(stg, "stg");
        if (obj == null || !(obj instanceof java.lang.String)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RadarAddContact", "onNotifyChange obj not String event:%d stg:%s obj:%s", java.lang.Integer.valueOf(i17), stg, obj);
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) obj, true);
        if (n17 == null || !n17.r2()) {
            return;
        }
        e(n17);
    }
}
