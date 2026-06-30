package qo1;

/* loaded from: classes5.dex */
public abstract class f0 implements qo1.j0 {

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.Object f365474v = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.affroam.g f365475a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.aff.affroam.o0 f365476b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f365477c;

    /* renamed from: d, reason: collision with root package name */
    public long f365478d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.a2 f365479e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Boolean f365480f;

    /* renamed from: g, reason: collision with root package name */
    public long f365481g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f365482h;

    /* renamed from: i, reason: collision with root package name */
    public final long f365483i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Object f365484j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.n0 f365485k;

    /* renamed from: l, reason: collision with root package name */
    public qo1.i0 f365486l;

    /* renamed from: m, reason: collision with root package name */
    public volatile int f365487m;

    /* renamed from: n, reason: collision with root package name */
    public long f365488n;

    /* renamed from: o, reason: collision with root package name */
    public long f365489o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f365490p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.a f365491q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Object f365492r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f365493s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f365494t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f365495u;

    public f0(com.tencent.wechat.aff.affroam.g pkgInfo, com.tencent.wechat.aff.affroam.o0 taskType) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(taskType, "taskType");
        this.f365475a = pkgInfo;
        this.f365476b = taskType;
        this.f365478d = -1L;
        this.f365481g = -1L;
        this.f365483i = pkgInfo.f215829d;
        this.f365484j = new java.lang.Object();
        this.f365485k = com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_INITED;
        this.f365486l = qo1.i0.f365502f;
        this.f365493s = true;
    }

    @Override // qo1.j0
    public long a() {
        return this.f365483i;
    }

    @Override // qo1.j0
    public com.tencent.wechat.aff.affroam.a2 c() {
        return this.f365479e;
    }

    @Override // qo1.j0
    public jz5.l d() {
        jz5.l lVar;
        synchronized (this.f365484j) {
            lVar = new jz5.l(this.f365485k, this.f365486l);
        }
        return lVar;
    }

    @Override // qo1.j0
    public boolean e() {
        boolean z17;
        synchronized (this.f365484j) {
            com.tencent.wechat.aff.affroam.n0 n0Var = this.f365485k;
            if (n0Var != com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_INITED && n0Var != com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_QUIT) {
                z17 = n0Var == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_PAUSED;
            }
        }
        return z17;
    }

    @Override // qo1.j0
    public boolean f() {
        boolean z17;
        synchronized (this.f365484j) {
            com.tencent.wechat.aff.affroam.n0 n0Var = this.f365485k;
            if (n0Var != com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_COMPLETED) {
                z17 = n0Var == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_STOPPED;
            }
        }
        return z17;
    }

    public final void g(com.tencent.wechat.aff.affroam.n0 n0Var, qo1.i0 i0Var) {
        com.tencent.mm.plugin.backup.roambackup.y1 y1Var;
        com.tencent.wechat.aff.affroam.n0 n0Var2 = this.f365485k;
        int ordinal = n0Var.ordinal();
        if (ordinal == 1) {
            this.f365495u = false;
            y1Var = com.tencent.mm.plugin.backup.roambackup.y1.A1;
        } else if (ordinal == 2) {
            y1Var = (n0Var2 == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_PAUSED || n0Var2 == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_QUIT) ? com.tencent.mm.plugin.backup.roambackup.y1.E1 : com.tencent.mm.plugin.backup.roambackup.y1.G1;
        } else if (ordinal != 3) {
            if (ordinal != 4) {
                if (ordinal != 5) {
                    if (ordinal != 7) {
                        y1Var = null;
                    } else {
                        if (this.f365495u) {
                            return;
                        }
                        this.f365495u = true;
                        y1Var = com.tencent.mm.plugin.backup.roambackup.y1.C1;
                    }
                } else {
                    if (this.f365495u) {
                        return;
                    }
                    this.f365495u = true;
                    y1Var = com.tencent.mm.plugin.backup.roambackup.y1.F1;
                }
            } else {
                if (this.f365495u) {
                    return;
                }
                this.f365495u = true;
                y1Var = com.tencent.mm.plugin.backup.roambackup.y1.B1;
            }
        } else {
            if (this.f365495u) {
                return;
            }
            this.f365495u = true;
            y1Var = com.tencent.mm.plugin.backup.roambackup.y1.D1;
        }
        com.tencent.mm.plugin.backup.roambackup.y1 y1Var2 = y1Var;
        if (y1Var2 != null) {
            com.tencent.mm.plugin.backup.roambackup.a2.a(com.tencent.mm.plugin.backup.roambackup.a2.f92567a, y1Var2, this.f365475a, this, null, null, new qo1.a(this, i0Var), 24, null);
        }
    }

    @Override // qo1.j0
    public long getStartTime() {
        return this.f365478d;
    }

    public int h() {
        com.tencent.wechat.aff.affroam.m0 a17;
        java.lang.Object obj = this.f365492r;
        com.tencent.wechat.aff.affroam.n0 n0Var = null;
        com.tencent.wechat.aff.affroam.m0 m0Var = obj instanceof com.tencent.wechat.aff.affroam.m0 ? (com.tencent.wechat.aff.affroam.m0) obj : null;
        if (m0Var == null) {
            return 256;
        }
        com.tencent.wechat.aff.affroam.a2 a2Var = this.f365479e;
        if (a2Var != null && (a17 = a2Var.a()) != null) {
            n0Var = a17.f215905g;
        }
        if (n0Var == null) {
            n0Var = com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_INITED;
        }
        if (n0Var != com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_PREPARING && n0Var != com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_RUNNING) {
            com.tencent.wechat.aff.affroam.n0 n0Var2 = com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_IMPORTING;
        }
        com.tencent.wechat.aff.affroam.a2 a2Var2 = new com.tencent.wechat.aff.affroam.a2();
        this.f365479e = a2Var2;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "[+] New task, pkgId=" + this.f365483i + " isBackupTask=" + this.f365476b);
        int d17 = a2Var2.d(m0Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[+] Initialize task, ret = ");
        sb6.append(d17);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", sb6.toString());
        if (d17 != 0) {
            return 258;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "taskInit pkgId=" + this.f365483i + ", taskType=" + this.f365476b);
        a2Var2.j("taskInit@Progress", new qo1.m(this));
        a2Var2.k("taskInit@StateChanged", new qo1.p(this));
        a2Var2.l("taskInit@TaskCompleted", new qo1.s(this));
        this.f365477c = 0L;
        a2Var2.h("taskInit@ConversationCompleted", new qo1.t(this));
        a2Var2.i("taskInit@Downgrade", new qo1.v(this));
        this.f365492r = a2Var2;
        this.f365491q = new qo1.b(this);
        return 0;
    }

    public final void i() {
        qo1.i0 i0Var;
        if (!this.f365493s) {
            g(com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_STOPPED, qo1.i0.f365502f);
            return;
        }
        yz5.a aVar = this.f365491q;
        this.f365491q = null;
        if (aVar == null) {
            return;
        }
        int intValue = ((java.lang.Number) aVar.invoke()).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "Run next=" + aVar.getClass().getName() + ", exitCode=" + intValue);
        if (this.f365491q != null) {
            ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: qo1.c
                @Override // java.lang.Runnable
                public final void run() {
                    qo1.f0.this.i();
                }
            }, n());
            return;
        }
        if (intValue == 1) {
            ((ku5.t0) ku5.t0.f312615d).h(new qo1.d(this), n());
            return;
        }
        if (intValue != 0) {
            if (intValue != 104) {
                switch (intValue) {
                    case 256:
                        i0Var = qo1.i0.f365513t;
                        break;
                    case 257:
                        i0Var = qo1.i0.f365514u;
                        break;
                    case 258:
                        i0Var = qo1.i0.f365515v;
                        break;
                    case APPTYPE_259_VALUE:
                        i0Var = qo1.i0.f365516w;
                        break;
                    default:
                        i0Var = qo1.i0.f365512s;
                        break;
                }
            } else {
                i0Var = qo1.i0.f365517x;
            }
            ((ku5.t0) ku5.t0.f312615d).h(new qo1.e(this, i0Var), n());
        }
    }

    public final void j() {
        java.lang.String str = this.f365475a.f215832g.f215989e;
        oo1.o oVar = oo1.o.f347151a;
        kotlin.jvm.internal.o.d(str);
        oVar.a(str);
        com.tencent.wechat.aff.affroam.o1 c17 = com.tencent.mm.plugin.backup.roambackup.u.f92737a.c(str);
        if (c17 != null) {
            c17.a(new qo1.g(this));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseRoamTask", "Fail to get device manager, try start task directly.");
            s();
        }
    }

    public final boolean k() {
        long j17;
        java.lang.Object obj;
        if (this.f365491q != null) {
            i();
            return true;
        }
        com.tencent.wechat.aff.affroam.a2 a2Var = this.f365479e;
        if (a2Var != null) {
            com.tencent.wechat.aff.affroam.n0 n0Var = a2Var.a().f215905g;
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "Find a exist task with state = " + n0Var);
            if (n0Var == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_PAUSED || n0Var == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_QUIT) {
                this.f365490p = true;
                this.f365492r = a2Var;
                this.f365491q = new qo1.h(this);
                i();
                return true;
            }
        }
        java.util.ArrayList c17 = com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().c();
        kotlin.jvm.internal.o.d(c17);
        java.util.Iterator it = c17.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            j17 = this.f365483i;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            com.tencent.wechat.aff.affroam.m0 m0Var = (com.tencent.wechat.aff.affroam.m0) obj;
            if (m0Var.f215911p == this.f365476b && m0Var.f215903e == j17) {
                break;
            }
        }
        com.tencent.wechat.aff.affroam.m0 m0Var2 = (com.tencent.wechat.aff.affroam.m0) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start backup task, pkgId=");
        sb6.append(j17);
        sb6.append(", taskInfo=");
        sb6.append(m0Var2 != null ? m0Var2.f215902d : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", sb6.toString());
        if (m0Var2 == null) {
            return false;
        }
        this.f365490p = true;
        this.f365492r = m0Var2;
        this.f365491q = new qo1.i(this);
        i();
        return true;
    }

    public int l() {
        java.lang.Object obj = this.f365492r;
        com.tencent.wechat.aff.affroam.a2 a2Var = obj instanceof com.tencent.wechat.aff.affroam.a2 ? (com.tencent.wechat.aff.affroam.a2) obj : null;
        if (a2Var == null) {
            return 256;
        }
        qo1.k kVar = new qo1.k(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "[+] Do task, pkgId=" + this.f365483i + ", isResume=" + this.f365490p + " isBackupTask=" + this.f365476b + ", sessionId = " + a2Var.a().f215902d);
        this.f365487m = 0;
        synchronized (f365474v) {
            if (this.f365490p) {
                a2Var.e(new qo1.x(kVar));
            } else {
                a2Var.f(new qo1.y(kVar));
            }
        }
        this.f365492r = null;
        this.f365491q = null;
        return 0;
    }

    public final long m() {
        com.tencent.wechat.aff.affroam.h1 b17 = com.tencent.mm.plugin.backup.roambackup.u.f92737a.b(this.f365483i);
        if (b17 == null) {
            return -1L;
        }
        com.tencent.wechat.aff.affroam.a2 a2Var = this.f365479e;
        if (a2Var == null) {
            return -2L;
        }
        return b17.c(a2Var.a().f215902d);
    }

    public abstract java.lang.String n();

    public final boolean o() {
        return this.f365476b == com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP;
    }

    public final synchronized boolean p() {
        java.lang.Boolean bool = this.f365480f;
        if (bool != null) {
            return bool.booleanValue();
        }
        long j17 = com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().h(this.f365483i).f215893m;
        boolean z17 = j17 > 0 && (java.lang.System.currentTimeMillis() / ((long) 1000)) - j17 > 604800;
        this.f365480f = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "isConsecutiveFailures=" + z17 + ", lastSuccessTime=" + j17);
        return z17;
    }

    public final void q(int i17) {
        boolean z17 = this.f365494t;
        long j17 = this.f365483i;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "[sendStatusNotifyToPc] StatusNotify has already sent. pkgId=" + j17);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", i17);
        jSONObject.put("packageId", j17);
        java.lang.String str = this.f365476b == com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_RESTORE ? "roamLiteStartRestoreResult" : "roamLiteStartBackupResult";
        this.f365494t = true;
        mv.y yVar = (mv.y) i95.n0.c(mv.y.class);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        ((com.tencent.mm.plugin.backup.roambackup.p1) yVar).Di(str, jSONObject2);
    }

    public final void r(com.tencent.wechat.aff.affroam.n0 value) {
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.wechat.aff.affroam.n0 old = this.f365485k;
        this.f365485k = value;
        kotlin.jvm.internal.o.g(old, "old");
        if (old == value) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "onStateChanged, state changed from " + old + " to " + value + ", pkgId=" + this.f365483i);
        com.tencent.wechat.aff.affroam.n0 n0Var = com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_PREPARING;
        if (value == n0Var) {
            this.f365488n = java.lang.System.currentTimeMillis();
        }
        if (old == n0Var && value == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_RUNNING) {
            this.f365489o = java.lang.System.currentTimeMillis() - this.f365488n;
        }
    }

    public abstract void s();

    @Override // qo1.j0
    public final void start() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "start task, pkgId=" + this.f365483i + ", isBackupTask=" + this.f365476b + ", pkgName=" + go1.d.f273944a.a(this.f365475a) + ", this=" + hashCode());
        ((ku5.t0) ku5.t0.f312615d).j(new qo1.z(this), n());
    }

    @Override // qo1.j0
    public final void stop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "stop task, pkgId=" + this.f365483i + ", isBackupTask=" + this.f365476b + ", this=" + hashCode());
        ((ku5.t0) ku5.t0.f312615d).j(new java.lang.Runnable() { // from class: qo1.a0
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.wechat.aff.affroam.n0 n0Var;
                qo1.i0 i0Var;
                qo1.f0 f0Var = qo1.f0.this;
                ((ku5.t0) ku5.t0.f312615d).A(f0Var.n());
                f0Var.f365493s = false;
                f0Var.f365492r = null;
                f0Var.f365491q = null;
                com.tencent.wechat.aff.affroam.a2 a2Var = f0Var.f365479e;
                if (a2Var == null) {
                    synchronized (f0Var.f365484j) {
                        n0Var = com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_STOPPED;
                        i0Var = qo1.i0.f365502f;
                        f0Var.g(n0Var, i0Var);
                        f0Var.f365486l = i0Var;
                        f0Var.r(n0Var);
                    }
                    com.tencent.mm.plugin.backup.roambackup.r0.f92684a.o(f0Var, n0Var, i0Var);
                    return;
                }
                com.tencent.wechat.aff.affroam.n0 n0Var2 = a2Var.a().f215905g;
                if (n0Var2 == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_STOPPED || n0Var2 == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_COMPLETED) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BaseRoamTask", "Task has stopped already. state=" + n0Var2);
                    nf.e.f(new qo1.b0(f0Var));
                    return;
                }
                if (f0Var.f365485k != com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_ERROR) {
                    a2Var.g(new qo1.e0(f0Var));
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "Falsely stop task. nativeState=" + n0Var2 + ", state=" + f0Var.f365485k + ", error=" + f0Var.f365486l);
                ((ku5.t0) ku5.t0.f312615d).h(new qo1.c0(f0Var), f0Var.n());
            }
        }, n());
    }
}
