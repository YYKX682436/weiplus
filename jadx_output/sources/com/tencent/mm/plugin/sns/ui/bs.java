package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class bs {
    public final com.tencent.mm.sdk.event.IListener A;
    public final com.tencent.mm.sdk.event.IListener B;
    public final java.util.HashMap C;
    public android.view.View D;
    public boolean E;
    public final android.view.View.OnClickListener F;
    public final android.view.View.OnClickListener G;
    public final com.tencent.mm.plugin.sns.ui.widget.g3 H;
    public final android.view.View.OnClickListener I;

    /* renamed from: J, reason: collision with root package name */
    public final android.view.View.OnClickListener f168034J;
    public final android.view.View.OnTouchListener K;
    public final com.tencent.mm.sdk.event.IListener L;
    public final com.tencent.mm.sdk.event.IListener M;
    public final java.util.List N;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.x4 f168035a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.l1 f168036b;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f168039e;

    /* renamed from: f, reason: collision with root package name */
    public rl5.r f168040f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f168041g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f168042h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.kw f168043i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.tm f168044j;

    /* renamed from: k, reason: collision with root package name */
    public final int f168045k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f168046l;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.animation.TranslateAnimation f168048n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.animation.TranslateAnimation f168049o;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.q1 f168055u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f168056v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f168057w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.Set f168058x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.r4 f168059y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f168060z;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f168037c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f168038d = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.pointers.PBool f168047m = new com.tencent.mm.pointers.PBool();

    /* renamed from: p, reason: collision with root package name */
    public int f168050p = -1;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f168051q = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f168052r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f168053s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashMap f168054t = new java.util.HashMap();

    public bs(com.tencent.mm.ui.MMActivity mMActivity, android.widget.ListView listView, com.tencent.mm.plugin.sns.ui.listener.i iVar, com.tencent.mm.plugin.sns.ui.l1 l1Var, int i17, com.tencent.mm.plugin.sns.ui.x4 x4Var) {
        this.f168045k = 0;
        this.f168046l = false;
        new com.tencent.mm.sdk.platformtools.n3();
        new java.util.HashMap();
        new java.util.HashMap();
        this.f168056v = false;
        this.f168057w = false;
        this.f168058x = new java.util.HashSet();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f168060z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTranslateStartEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$1
            {
                this.__eventId = 1200144606;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsTranslateStartEvent snsTranslateStartEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$1");
                com.tencent.mm.autogen.events.SnsTranslateStartEvent snsTranslateStartEvent2 = snsTranslateStartEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$1");
                if (snsTranslateStartEvent2 instanceof com.tencent.mm.autogen.events.SnsTranslateStartEvent) {
                    am.fx fxVar = snsTranslateStartEvent2.f54849g;
                    int i18 = fxVar.f6710a;
                    com.tencent.mm.plugin.sns.ui.bs bsVar = com.tencent.mm.plugin.sns.ui.bs.this;
                    if (i18 == 1) {
                        java.lang.String str = fxVar.f6711b;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        bsVar.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(str);
                        if (b17 != null) {
                            java.lang.String localid = b17.getLocalid();
                            java.util.HashMap hashMap = bsVar.f168051q;
                            if (hashMap.containsKey(localid) && ((java.lang.Integer) hashMap.get(localid)).equals(1)) {
                                hashMap.put(localid, 2);
                            }
                            com.tencent.mm.plugin.sns.model.s6.a(str, 2);
                            bsVar.m();
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    } else if (i18 == 2) {
                        java.lang.String str2 = fxVar.f6711b;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        bsVar.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commentTranslateStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        com.tencent.mm.plugin.sns.model.s6.a(str2, 2);
                        bsVar.m();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentTranslateStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$1");
                return false;
            }
        };
        this.A = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTranslateFinishEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$2
            {
                this.__eventId = 2139223297;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsTranslateFinishEvent snsTranslateFinishEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$2");
                com.tencent.mm.autogen.events.SnsTranslateFinishEvent snsTranslateFinishEvent2 = snsTranslateFinishEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$2");
                if (snsTranslateFinishEvent2 instanceof com.tencent.mm.autogen.events.SnsTranslateFinishEvent) {
                    am.dx dxVar = snsTranslateFinishEvent2.f54847g;
                    java.lang.String str = dxVar.f6506b;
                    int i18 = dxVar.f6505a;
                    com.tencent.mm.plugin.sns.ui.bs bsVar = com.tencent.mm.plugin.sns.ui.bs.this;
                    if (i18 == 1) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        bsVar.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postDescTranslateFinish", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        com.tencent.mm.plugin.sns.model.s6.a(str, 2);
                        bsVar.m();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postDescTranslateFinish", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    } else if (i18 == 2) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        bsVar.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commentTranslateFinish", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        com.tencent.mm.plugin.sns.model.s6.a(str, 2);
                        bsVar.m();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentTranslateFinish", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$2");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$2");
                return false;
            }
        };
        this.B = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsUnTranslateEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$3
            {
                this.__eventId = -868441523;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsUnTranslateEvent snsUnTranslateEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$3");
                com.tencent.mm.autogen.events.SnsUnTranslateEvent snsUnTranslateEvent2 = snsUnTranslateEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$3");
                if (snsUnTranslateEvent2 instanceof com.tencent.mm.autogen.events.SnsUnTranslateEvent) {
                    am.gx gxVar = snsUnTranslateEvent2.f54850g;
                    java.lang.String str = gxVar.f6797b;
                    int i18 = gxVar.f6796a;
                    com.tencent.mm.plugin.sns.ui.bs bsVar = com.tencent.mm.plugin.sns.ui.bs.this;
                    if (i18 == 1) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        bsVar.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        com.tencent.mm.plugin.sns.model.s6.k(str, 2);
                        bsVar.m();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    } else if (i18 == 2) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        bsVar.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        com.tencent.mm.plugin.sns.model.s6.k(str, 2);
                        bsVar.m();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$3");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$3");
                return false;
            }
        };
        java.util.HashMap hashMap = new java.util.HashMap();
        this.C = hashMap;
        hashMap.put(6, com.tencent.mm.plugin.sns.ui.item.r0.class);
        hashMap.put(2, com.tencent.mm.plugin.sns.ui.item.l0.class);
        hashMap.put(3, com.tencent.mm.plugin.sns.ui.item.l0.class);
        hashMap.put(4, com.tencent.mm.plugin.sns.ui.item.l0.class);
        hashMap.put(5, com.tencent.mm.plugin.sns.ui.item.l0.class);
        hashMap.put(0, com.tencent.mm.plugin.sns.ui.item.l0.class);
        hashMap.put(24, com.tencent.mm.plugin.sns.ui.item.t0.class);
        hashMap.put(1, com.tencent.mm.plugin.sns.ui.item.l0.class);
        hashMap.put(7, com.tencent.mm.plugin.sns.ui.item.l0.class);
        hashMap.put(8, com.tencent.mm.plugin.sns.ui.item.l0.class);
        hashMap.put(9, com.tencent.mm.plugin.sns.ui.item.l0.class);
        hashMap.put(13, com.tencent.mm.plugin.sns.ui.item.k.class);
        hashMap.put(27, com.tencent.mm.plugin.sns.ui.item.y.class);
        hashMap.put(28, com.tencent.mm.plugin.sns.ui.item.y.class);
        hashMap.put(29, com.tencent.mm.plugin.sns.ui.item.y.class);
        hashMap.put(30, com.tencent.mm.plugin.sns.ui.item.y.class);
        hashMap.put(31, com.tencent.mm.plugin.sns.ui.item.y.class);
        hashMap.put(32, com.tencent.mm.plugin.sns.ui.item.y.class);
        hashMap.put(39, com.tencent.mm.plugin.sns.ui.item.y.class);
        hashMap.put(47, com.tencent.mm.plugin.sns.ui.item.y.class);
        hashMap.put(41, com.tencent.mm.plugin.sns.ui.item.y.class);
        hashMap.put(35, com.tencent.mm.plugin.sns.ui.item.y.class);
        hashMap.put(15, com.tencent.mm.plugin.sns.ui.item.p0.class);
        hashMap.put(10, com.tencent.mm.plugin.sns.ui.item.l0.class);
        hashMap.put(12, com.tencent.mm.plugin.sns.ui.item.l0.class);
        hashMap.put(16, com.tencent.mm.plugin.sns.ui.item.l0.class);
        hashMap.put(17, com.tencent.mm.plugin.sns.ui.item.a0.class);
        hashMap.put(18, com.tencent.mm.plugin.sns.ui.item.s.class);
        hashMap.put(20, com.tencent.mm.plugin.sns.ui.item.n.class);
        hashMap.put(33, com.tencent.mm.plugin.sns.ui.item.n.class);
        hashMap.put(25, com.tencent.mm.plugin.sns.ui.item.n.class);
        hashMap.put(21, com.tencent.mm.plugin.sns.ui.item.c0.class);
        hashMap.put(19, o74.i.class);
        hashMap.put(22, com.tencent.mm.plugin.sns.ui.item.a1.class);
        hashMap.put(23, o74.b.class);
        hashMap.put(26, q74.d.class);
        hashMap.put(34, r74.a.class);
        hashMap.put(42, s74.p0.class);
        hashMap.put(44, v74.n.class);
        hashMap.put(48, t74.e2.class);
        hashMap.put(49, p74.q.class);
        hashMap.put(40, com.tencent.mm.plugin.sns.ui.item.f0.class);
        this.E = false;
        this.F = new com.tencent.mm.plugin.sns.ui.es(this);
        this.G = new com.tencent.mm.plugin.sns.ui.fs(this);
        this.H = new com.tencent.mm.plugin.sns.ui.gs(this);
        this.I = new com.tencent.mm.plugin.sns.ui.hs(this);
        this.f168034J = new com.tencent.mm.plugin.sns.ui.is(this);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.K = new com.tencent.mm.sdk.platformtools.o8();
        new java.util.HashMap();
        this.L = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$13
            {
                this.__eventId = -1155728636;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
            
                if (r6 != 7) goto L19;
             */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent r6) {
                /*
                    r5 = this;
                    java.lang.String r0 = "callback"
                    java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$13"
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    com.tencent.mm.autogen.events.MusicPlayerEvent r6 = (com.tencent.mm.autogen.events.MusicPlayerEvent) r6
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    boolean r2 = r6 instanceof com.tencent.mm.autogen.events.MusicPlayerEvent
                    if (r2 == 0) goto L48
                    am.jk r6 = r6.f54512g
                    int r6 = r6.f7036b
                    com.tencent.mm.plugin.sns.ui.bs r2 = com.tencent.mm.plugin.sns.ui.bs.this
                    if (r6 == 0) goto L43
                    r3 = 1
                    if (r6 == r3) goto L43
                    r3 = 2
                    if (r6 == r3) goto L43
                    r3 = 3
                    if (r6 == r3) goto L43
                    r3 = 4
                    if (r6 == r3) goto L28
                    r3 = 7
                    if (r6 == r3) goto L43
                    goto L48
                L28:
                    com.tencent.mm.plugin.sns.ui.x4 r6 = r2.f168035a
                    r6.notifyDataSetChanged()
                    java.lang.String r6 = "access$1200"
                    java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter"
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r2)
                    java.lang.String r3 = "processPlayError"
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
                    il4.l r4 = il4.l.f292142a
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r2)
                    goto L48
                L43:
                    com.tencent.mm.plugin.sns.ui.x4 r6 = r2.f168035a
                    r6.notifyDataSetChanged()
                L48:
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    r6 = 0
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$13.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.M = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicCheckErrorEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$14
            {
                this.__eventId = -1443570203;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicCheckErrorEvent musicCheckErrorEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$14");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$14");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineBaseAdapter", "musicCheckErrorListener check error");
                if (musicCheckErrorEvent.f54511g.f6956a == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimeLineBaseAdapter", "musicCheckErrorListener, must has error.");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$14");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    com.tencent.mm.plugin.sns.ui.bs.this.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processPlayError", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    il4.l lVar = il4.l.f292142a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processPlayError", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$14");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$14");
                return false;
            }
        };
        this.N = new java.util.ArrayList();
        this.f168035a = x4Var;
        this.f168036b = l1Var;
        com.tencent.mm.plugin.sns.model.l4.hj().getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idleStart", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idleStart", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f168042h = mMActivity;
        this.f168039e = iVar;
        android.view.LayoutInflater.from(mMActivity);
        new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) mMActivity, 1, false);
        new java.util.ArrayList();
        new java.util.ArrayList();
        this.f168040f = new rl5.r(mMActivity);
        this.f168044j = new com.tencent.mm.plugin.sns.ui.tm(mMActivity);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        this.f168048n = translateAnimation;
        translateAnimation.setStartOffset(100L);
        translateAnimation.setDuration(200L);
        android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
        this.f168049o = translateAnimation2;
        translateAnimation2.setStartOffset(100L);
        translateAnimation2.setDuration(200L);
        com.tencent.mm.plugin.sns.model.l7 l7Var = l1Var.f169703d;
        this.f168055u = new com.tencent.mm.plugin.sns.ui.q1(mMActivity, 0, l7Var);
        this.f168043i = new com.tencent.mm.plugin.sns.ui.kw(mMActivity, new com.tencent.mm.plugin.sns.ui.js(this, x4Var), 0, l7Var);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        try {
            j62.e g17 = j62.e.g();
            e42.d0 d0Var = e42.d0.clicfg_gallery_image_edit_icon_hide;
            this.f168045k = com.tencent.mm.sdk.platformtools.t8.D1(g17.a("clicfg_sns_like_collapse_lines", "0", false, true), 0);
            this.f168046l = com.tencent.mm.sdk.platformtools.t8.D1(j62.e.g().a("clicfg_sns_like_collapse_enable", "0", false, true), 0) == 1;
        } catch (java.lang.NumberFormatException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsTimeLineBaseAdapter", "parse like collapse config error: %s", e17.getMessage());
        }
        this.f168056v = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_WS_FOLD_DEBUG_INT_SYNC, 0) == 1;
        this.f168057w = true;
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("SnsTimelineMMKV");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineBaseAdapter", "SnsCrashProtect isNeedSkipCrashItem:%s", java.lang.Boolean.TRUE);
        java.lang.String string = M.getString("SnsTimelineMMKVLastShowItemId", "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(150, 91);
            M.D("SnsTimelineMMKVLastShowItemId", "");
            java.lang.String string2 = M.getString("SnsTimelineMMKVLastCrashItemId", "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string2) || !string2.equals(string)) {
                M.D("SnsTimelineMMKVLastCrashItemId", string);
                M.A("SnsTimelineMMKVLastCrashItemCount", 1);
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimeLineBaseAdapter", "SnsCrashProtect, last crash item id:%s, crash time:%s", string, 1);
            } else {
                int i18 = M.getInt("SnsTimelineMMKVLastCrashItemCount", 0) + 1;
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimeLineBaseAdapter", "SnsCrashProtect, last crash item id:%s, crash time:%s", string, java.lang.Integer.valueOf(i18));
                if (i18 >= 10) {
                    g0Var.A(150, 92);
                    java.util.Set stringSet = M.getStringSet("SnsTimelineMMKVNeedSkipItem", new java.util.HashSet());
                    stringSet = stringSet.size() > 10 ? new java.util.HashSet() : stringSet;
                    stringSet.add(string2);
                    M.F("SnsTimelineMMKVNeedSkipItem", stringSet);
                    M.D("SnsTimelineMMKVLastCrashItemId", "");
                    M.A("SnsTimelineMMKVLastCrashItemCount", 0);
                } else {
                    M.A("SnsTimelineMMKVLastCrashItemCount", i18);
                }
            }
        }
        this.f168058x = M.getStringSet("SnsTimelineMMKVNeedSkipItem", new java.util.HashSet());
    }

    public static java.lang.String e(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReditectUrl", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(str, "timeline");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReditectUrl", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return wi6;
    }

    public static java.lang.String h(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTruncUrl", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTruncUrl", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return str;
        }
        int indexOf = str.indexOf("://");
        if (indexOf != -1) {
            str = str.substring(indexOf + 3);
        }
        int indexOf2 = str.indexOf("/");
        if (indexOf2 != -1) {
            str = str.substring(0, indexOf2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTruncUrl", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return str;
    }

    public static int i(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        if (i17 != 15 && i17 != 5) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimeLineBaseAdapter", "getVideoAdViewType, but contentStyle is " + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 1;
        }
        if (!snsInfo.isAd() || snsInfo.getAdXml() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineBaseAdapter", "getVideoAdViewType, not ad and contentStyle is " + i17);
            if (i17 == 15) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 9;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 1;
        }
        if (snsInfo.getAdXml().isCardAd()) {
            if (snsInfo.isDynamicAD()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 42;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 13;
        }
        if (snsInfo.isFullCardAd()) {
            int a17 = fd4.g.a(snsInfo);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return a17;
        }
        if (snsInfo.isSphereCardAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 15;
        }
        if (snsInfo.isFinderTopicCardAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 23;
        }
        if (snsInfo.isSlideFullCardAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 26;
        }
        if (snsInfo.isCombinedGridAD()) {
            if (snsInfo.isDynamicAD()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 42;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 34;
        }
        if (snsInfo.isLookbookCardAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 44;
        }
        if (snsInfo.isFlipCardAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 48;
        }
        if (snsInfo.isSlideCardAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 49;
        }
        if (snsInfo.isDynamicAD()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 42;
        }
        if (i17 == 15) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 19;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoAdViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return 1;
    }

    public static int j(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        int k17 = k(snsInfo, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return k17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x0127. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:104:0x012a. Please report as an issue. */
    public static int k(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        if (z17 && snsInfo.isWsFold()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 22;
        }
        if (timeLine == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimeLineBaseAdapter", "obj is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 1;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String str = timeLine.Id;
        if (str == null) {
            str = "null";
        }
        objArr[0] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineBaseAdapter", "getViewType Id:%s", objArr);
        r45.a90 a90Var = timeLine.ContentObj;
        if (a90Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimeLineBaseAdapter", "obj.ContentObj is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 1;
        }
        java.util.LinkedList linkedList = a90Var.f369840h;
        int size = linkedList != null ? linkedList.size() : 0;
        if (snsInfo.isPhoto()) {
            if (z17 && timeLine.showFlag == 1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 12;
            }
            if (snsInfo.isAd() && snsInfo.getAdXml() != null) {
                if (snsInfo.getAdXml().isCardAd()) {
                    if (snsInfo.isDynamicAD()) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        return 42;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    return 13;
                }
                if (snsInfo.isFullCardAd()) {
                    int a17 = fd4.g.a(snsInfo);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    return a17;
                }
                if (snsInfo.isSphereCardAd()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    return 15;
                }
                if (snsInfo.isCombinedGridAD()) {
                    if (snsInfo.isDynamicAD()) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        return 42;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    return 34;
                }
                if (snsInfo.isLookbookCardAd()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    return 44;
                }
                if (snsInfo.isDynamicAD()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    return 42;
                }
            }
            if (size <= 1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 2;
            }
            if (size <= 3) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 3;
            }
            if (size <= 6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 4;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 5;
        }
        r45.a90 a90Var2 = timeLine.ContentObj;
        int i17 = a90Var2.f369837e;
        if (i17 == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 6;
        }
        if (i17 == 21) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 10;
        }
        if (i17 != 59) {
            if (i17 == 4) {
                r45.y8 y8Var = timeLine.AppInfo;
                if (kotlin.jvm.internal.o.b("wx5aa333606550dfd5", y8Var != null ? y8Var.f390846d : "")) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    return 24;
                }
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_new_music_type_flag, bm5.h0.RepairerConfig_Mv_CardDownLevel_Int, 0) == 1) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    return 1;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 0;
            }
            if (i17 == 5) {
                if (!snsInfo.isAd() || snsInfo.getAdXml() == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    return 1;
                }
                int i18 = i(5, snsInfo);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return i18;
            }
            if (i17 == 7) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 2;
            }
            if (i17 == 8) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 3;
            }
            if (i17 == 14) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 7;
            }
            if (i17 == 15) {
                if (z17 && timeLine.sightFolded == 1) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    return 12;
                }
                if (!snsInfo.isAd() || snsInfo.getAdXml() == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    return 9;
                }
                int i19 = i(15, snsInfo);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return i19;
            }
            if (i17 != 28) {
                if (i17 != 29) {
                    if (i17 == 33) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        return 17;
                    }
                    if (i17 == 34) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        return 20;
                    }
                    if (i17 != 55 && i17 != 56) {
                        switch (i17) {
                            case 36:
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                return 21;
                            case 37:
                            case 38:
                                break;
                            case 39:
                                int i27 = a90Var2.f369850u;
                                if (i27 == 3 || i27 == 100000000) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                    return 16;
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                return 1;
                            default:
                                switch (i17) {
                                    case 42:
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                        return 24;
                                    case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                        return 25;
                                    case 44:
                                    case 46:
                                        break;
                                    case 45:
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                        return 33;
                                    case 47:
                                        if (je4.g.d(com.tencent.mm.sdk.platformtools.x2.f193071a, timeLine)) {
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                            return 24;
                                        }
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                        return 1;
                                    case 48:
                                        if (je4.g.d(com.tencent.mm.sdk.platformtools.x2.f193071a, timeLine)) {
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                            return 40;
                                        }
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                        return 1;
                                    default:
                                        switch (i17) {
                                            case 50:
                                                break;
                                            case 51:
                                            case 52:
                                            case 53:
                                                break;
                                            default:
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                                return 1;
                                        }
                                }
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 16;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return 18;
    }

    public static boolean l(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDisplaySummary", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        if (timeLineObject.ContentObj.f369837e == 9) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDisplaySummary", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return true;
        }
        boolean z17 = (com.tencent.mm.plugin.sns.model.d6.k() & 1) <= 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDisplaySummary", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x069c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05d5 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View a(com.tencent.mm.plugin.sns.storage.SnsInfo r31, int r32, int r33, android.view.View r34) {
        /*
            Method dump skipped, instructions count: 2066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.bs.a(com.tencent.mm.plugin.sns.storage.SnsInfo, int, int, android.view.View):android.view.View");
    }

    public void b(android.widget.LinearLayout linearLayout, java.lang.Runnable runnable, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) linearLayout.findViewById(com.tencent.mm.R.id.f482869qc);
        if (weImageView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimeLineBaseAdapter", "no likedView to scale !");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return;
        }
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100L);
        scaleAnimation.setRepeatCount(0);
        scaleAnimation.setFillAfter(true);
        scaleAnimation2.setDuration(100L);
        scaleAnimation2.setRepeatCount(0);
        scaleAnimation2.setFillAfter(true);
        weImageView.clearAnimation();
        weImageView.startAnimation(scaleAnimation);
        scaleAnimation.setAnimationListener(new com.tencent.mm.plugin.sns.ui.cs(this, weImageView, scaleAnimation2));
        scaleAnimation2.setAnimationListener(new com.tencent.mm.plugin.sns.ui.ds(this, linearLayout, runnable, snsInfo));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
    }

    public com.tencent.mm.plugin.sns.storage.SnsInfo c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        com.tencent.mm.plugin.sns.storage.SnsInfo item = this.f168035a.getItem(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return item;
    }

    public rl5.r d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPopupMenu", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        rl5.r rVar = this.f168040f;
        if (rVar != null) {
            rVar.a();
        }
        rl5.r rVar2 = new rl5.r(this.f168042h);
        this.f168040f = rVar2;
        rVar2.L = new com.tencent.mm.plugin.sns.ui.bs$$a();
        rVar2.M = new com.tencent.mm.plugin.sns.ui.bs$$b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPopupMenu", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return rVar2;
    }

    public com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        java.util.LinkedList linkedList = this.f168037c;
        if (linkedList.size() == 0) {
            com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout snsCommentCollapseLayout = new com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout(this.f168042h);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return snsCommentCollapseLayout;
        }
        com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout snsCommentCollapseLayout2 = (com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout) linkedList.removeFirst();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return snsCommentCollapseLayout2;
    }

    public com.tencent.mm.plugin.sns.ui.r4 g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeline", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        al5.f3 f3Var = this.f168042h;
        if (f3Var instanceof com.tencent.mm.plugin.sns.ui.r4) {
            com.tencent.mm.plugin.sns.ui.r4 r4Var = (com.tencent.mm.plugin.sns.ui.r4) f3Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeline", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return r4Var;
        }
        com.tencent.mm.plugin.sns.ui.r4 r4Var2 = this.f168059y;
        if (r4Var2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeline", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return r4Var2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeline", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return null;
    }

    public void m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineBaseAdapter", "notifyDataSetChanged: ");
        this.f168035a.notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
    }

    public void n(java.lang.String str, com.tencent.mm.plugin.sns.ui.ks ksVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerLikedCallback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        if (ksVar != null) {
            this.f168053s.put(str, ksVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerLikedCallback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
    }

    public void o(boolean z17, java.lang.String str) {
        java.util.HashMap hashMap;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCollapseLikeTextBySelf", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        com.tencent.mm.plugin.sns.ui.ks ksVar = (com.tencent.mm.plugin.sns.ui.ks) this.f168053s.get(str);
        if (ksVar != null && com.tencent.mm.sdk.platformtools.t8.D0(ksVar.getKey(), str)) {
            com.tencent.mm.plugin.sns.ui.SnsLikesTextView snsLikesTextView = (com.tencent.mm.plugin.sns.ui.SnsLikesTextView) ksVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLiked", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
            if (snsLikesTextView.f167247n > 0 && (hashMap = snsLikesTextView.f167252s) != null) {
                java.lang.Integer num = (java.lang.Integer) hashMap.get(snsLikesTextView.f167240d);
                if (num == null) {
                    snsLikesTextView.f167252s.put(snsLikesTextView.f167240d, 0);
                } else if (z17) {
                    if (num.intValue() == 1) {
                        snsLikesTextView.f167252s.put(snsLikesTextView.f167240d, 3);
                        snsLikesTextView.a();
                    }
                } else if (num.intValue() == 3) {
                    snsLikesTextView.f167252s.put(snsLikesTextView.f167240d, 1);
                    snsLikesTextView.a();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLiked", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCollapseLikeTextBySelf", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
    }

    public void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateShowIntercation", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        this.E = !this.E;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineBaseAdapter", "updateShowIntercation, current showIntercation = " + this.E);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateShowIntercation", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
    }
}
