package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class he implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.MMFragmentActivity f208863d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.o8 f208864e;

    /* renamed from: f, reason: collision with root package name */
    public zy2.ka f208865f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.t1 f208866g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f208868i;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f208870n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f208871o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.af f208872p;

    /* renamed from: q, reason: collision with root package name */
    public final d70.j f208873q;

    /* renamed from: r, reason: collision with root package name */
    public final l75.z0 f208874r;

    /* renamed from: s, reason: collision with root package name */
    public final mv.z f208875s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f208876t;

    /* renamed from: u, reason: collision with root package name */
    public final zy2.ja f208877u;

    /* renamed from: h, reason: collision with root package name */
    public boolean f208867h = false;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f208869m = new com.tencent.mm.ui.se(this);

    public he() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f208870n = new com.tencent.mm.ui.MainTabUnreadMgr$2(this, a0Var);
        this.f208871o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent>(a0Var) { // from class: com.tencent.mm.ui.MainTabUnreadMgr$3
            {
                this.__eventId = 1507664325;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent searchSysMsgNotifyEvent) {
                com.tencent.mm.ui.he heVar = com.tencent.mm.ui.he.this;
                heVar.f208868i = true;
                java.lang.Runnable runnable = heVar.f208869m;
                com.tencent.mm.sdk.platformtools.u3.l(runnable);
                com.tencent.mm.sdk.platformtools.u3.h(runnable);
                return false;
            }
        };
        this.f208873q = new com.tencent.mm.ui.ye(this);
        this.f208874r = new com.tencent.mm.ui.ze(this);
        this.f208875s = new mv.z() { // from class: com.tencent.mm.ui.he$$a
            @Override // mv.z
            public final void a(mv.e0 e0Var) {
                final com.tencent.mm.ui.he heVar = com.tencent.mm.ui.he.this;
                heVar.getClass();
                if (e0Var == null || e0Var.f331496c != mv.f0.f331502e) {
                    return;
                }
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.he$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.ui.he.this.b();
                    }
                });
            }
        };
        this.f208876t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UnreadChangeEvent>(a0Var) { // from class: com.tencent.mm.ui.MainTabUnreadMgr$10
            {
                this.__eventId = 1649005931;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UnreadChangeEvent unreadChangeEvent) {
                unreadChangeEvent.getClass();
                com.tencent.mm.ui.he heVar = com.tencent.mm.ui.he.this;
                heVar.getClass();
                nm.j.f338443g.a(new com.tencent.mm.ui.we(heVar));
                return false;
            }
        };
        this.f208877u = new com.tencent.mm.ui.re(this);
    }

    public void a(int i17) {
        com.tencent.mm.ui.t1 t1Var = this.f208866g;
        if (t1Var != null) {
            t1Var.setTo(i17);
        }
        zy2.ka kaVar = this.f208865f;
        if (kaVar != null) {
            ((com.tencent.mm.plugin.finder.extension.reddot.g) kaVar).f105528b = i17;
        }
        if (i17 != 3) {
            b00.q2 q2Var = (b00.q2) ((c00.b4) i95.n0.c(c00.b4.class));
            if (q2Var.f16756g) {
                q2Var.f16756g = false;
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("session_out", null, kz5.c1.k(new jz5.l("page_id", "my_page"), new jz5.l("if_red_dot", 1), new jz5.l("expose_id", q2Var.f16753d), new jz5.l("stay_time_ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - q2Var.f16754e))), 12, false);
                q2Var.f16753d = "";
                q2Var.f16754e = 0L;
                return;
            }
            return;
        }
        com.tencent.mm.ui.t1 t1Var2 = this.f208866g;
        boolean z17 = t1Var2 != null && t1Var2.getSettingsPoint();
        ((oh3.i) ((p90.k) i95.n0.c(p90.k.class))).wi(2, z17);
        b00.q2 q2Var2 = (b00.q2) ((c00.b4) i95.n0.c(c00.b4.class));
        q2Var2.getClass();
        if (((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Ri()) {
            if (q2Var2.f16753d.length() > 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMEcsReportService", "sessionIn exposeId=" + q2Var2.f16753d + " pageEnterTime=" + q2Var2.f16754e + " needReportPageEvent=" + q2Var2.f16756g);
            }
            q2Var2.f16753d = java.lang.String.valueOf(c01.id.c());
            q2Var2.f16754e = android.os.SystemClock.elapsedRealtime();
            if (z17) {
                com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("MyTab");
                if (L0 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MMEcsReportService", "sessionIn exposeId=" + q2Var2.f16753d + " ctrlInfo is null");
                    return;
                }
                int type = L0.getType();
                if (type < 700000 || type >= 799999) {
                    return;
                }
                q2Var2.f16756g = true;
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("session_in", null, kz5.c1.k(new jz5.l("page_id", "my_page"), new jz5.l("if_red_dot", 1), new jz5.l("reddot_id", L0.field_tips_uuid), new jz5.l("expose_id", q2Var2.f16753d), new jz5.l("reddot_ext_info", L0.field_ctrInfo.f388499t), new jz5.l("reddot_rec_timestamp", java.lang.Long.valueOf(L0.field_time)), new jz5.l("reddot_type", java.lang.Integer.valueOf(L0.getType()))), 12, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0452  */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.he.b():void");
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj != null && (obj instanceof java.lang.String) && a1Var == c01.d9.b().r() && com.tencent.mm.storage.z3.H3((java.lang.String) obj)) {
            nm.j.f338443g.a(new com.tencent.mm.ui.we(this));
        }
    }
}
