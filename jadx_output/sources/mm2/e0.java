package mm2;

/* loaded from: classes3.dex */
public final class e0 extends mm2.e {

    /* renamed from: v, reason: collision with root package name */
    public static int f328965v;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f328966f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f328967g;

    /* renamed from: h, reason: collision with root package name */
    public final im5.c f328968h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f328969i;

    /* renamed from: m, reason: collision with root package name */
    public androidx.lifecycle.j0 f328970m;

    /* renamed from: n, reason: collision with root package name */
    public long f328971n;

    /* renamed from: o, reason: collision with root package name */
    public int f328972o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f328973p;

    /* renamed from: q, reason: collision with root package name */
    public long f328974q;

    /* renamed from: r, reason: collision with root package name */
    public int f328975r;

    /* renamed from: s, reason: collision with root package name */
    public lm2.h0 f328976s;

    /* renamed from: t, reason: collision with root package name */
    public r45.qt2 f328977t;

    /* renamed from: u, reason: collision with root package name */
    public lm2.g f328978u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f328966f = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.FALSE);
        this.f328968h = new im5.c();
        this.f328969i = true;
        this.f328970m = new androidx.lifecycle.j0();
        this.f328972o = -1;
        this.f328973p = true;
    }

    public final void N6(r45.qm1 box) {
        lm2.j0 c17;
        r45.qn qnVar;
        lm2.j0 j0Var;
        kotlin.jvm.internal.o.g(box, "box");
        com.tencent.mm.plugin.finder.assist.o0 o0Var = com.tencent.mm.plugin.finder.assist.o0.f102420a;
        o0Var.c("Finder.LiveBoxSlice", "LiveBoxSlice enterBox: " + box.getString(1));
        java.lang.String string = box.getString(1);
        if (string == null) {
            string = "";
        }
        boolean z17 = false;
        if (string.length() == 0) {
            com.tencent.mars.xlog.Log.w("Finder.LiveBoxSlice", "enterBox but boxId isEmpty");
            return;
        }
        r45.qm1 qm1Var = (r45.qm1) this.f328970m.getValue();
        if (kotlin.jvm.internal.o.b(qm1Var != null ? qm1Var.getString(1) : null, string)) {
            return;
        }
        lm2.h0 h0Var = this.f328976s;
        if (h0Var != null) {
            long c18 = c01.id.c();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) h0Var.f319396c.getValue();
            if (concurrentHashMap != null && concurrentHashMap.containsKey(string)) {
                z17 = true;
            }
            if (z17) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) h0Var.f319396c.getValue();
                if (concurrentHashMap2 != null && (j0Var = (lm2.j0) concurrentHashMap2.get(string)) != null) {
                    j0Var.f319410c = c18;
                    j0Var.f319411d.f384105h = c18;
                }
            } else {
                com.tencent.mars.xlog.Log.e("Finder.BoxDataStore", "enterBox without prepare");
            }
        }
        lm2.h0 h0Var2 = this.f328976s;
        if (h0Var2 != null && (c17 = h0Var2.c()) != null && (qnVar = c17.f319411d) != null) {
            o0Var.c("Finder.LiveBoxSlice", "LiveBoxSlice startPollingMsg, boxContext hashCode:" + qnVar.hashCode() + ", logInfo: " + o0Var.b(qnVar));
            lm2.h0 h0Var3 = this.f328976s;
            if (h0Var3 != null) {
                r45.qt2 qt2Var = this.f328977t;
                com.tencent.mars.xlog.Log.i("Finder.BoxDataStore", "startPollingMsg, boxId:" + box.getString(1) + ", boxContext " + o0Var.b(qnVar) + ", " + qnVar.f384102e);
                com.tencent.mars.xlog.Log.i("Finder.BoxDataStore", "stopPollingMsg");
                km2.m0 m0Var = h0Var3.f319400g;
                if (m0Var != null) {
                    kotlinx.coroutines.r2 r2Var = m0Var.f309146d;
                    if (r2Var != null) {
                        kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                    }
                    m0Var.f309146d = null;
                }
                km2.m0 m0Var2 = new km2.m0(new lm2.s(h0Var3, box, qnVar, qt2Var), kotlinx.coroutines.q1.f310570c, 1000L);
                h0Var3.f319400g = m0Var2;
                m0Var2.f309146d = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(m0Var2.f309144b), null, null, new km2.l0(m0Var2, null), 3, null);
            }
        }
        this.f328970m.setValue(box);
        this.f328971n = c01.id.c();
    }

    public final void O6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveBoxSlice exitBox: ");
        r45.qm1 qm1Var = (r45.qm1) this.f328970m.getValue();
        sb6.append(qm1Var != null ? qm1Var.getString(1) : null);
        java.lang.String str = sb6.toString();
        kotlin.jvm.internal.o.g(str, "str");
        com.tencent.mars.xlog.Log.i("Finder.LiveBoxSlice", "mainFlowLog ".concat(str));
        if (this.f328970m.getValue() == null) {
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("LiveBoxSlice stopPollingMsg: ");
        r45.qm1 qm1Var2 = (r45.qm1) this.f328970m.getValue();
        sb7.append(qm1Var2 != null ? qm1Var2.getString(1) : null);
        java.lang.String str2 = sb7.toString();
        kotlin.jvm.internal.o.g(str2, "str");
        com.tencent.mars.xlog.Log.i("Finder.LiveBoxSlice", "mainFlowLog ".concat(str2));
        lm2.h0 h0Var = this.f328976s;
        if (h0Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.BoxDataStore", "stopPollingMsg");
            km2.m0 m0Var = h0Var.f319400g;
            if (m0Var != null) {
                kotlinx.coroutines.r2 r2Var = m0Var.f309146d;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                m0Var.f309146d = null;
            }
        }
        this.f328970m.setValue(null);
        this.f328971n = 0L;
    }

    public final boolean P6() {
        r45.qm1 qm1Var = (r45.qm1) this.f328970m.getValue();
        if (qm1Var == null) {
            return false;
        }
        int integer = qm1Var.getInteger(0);
        int i17 = qs5.v.f366472a;
        return integer == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q6(r45.qt2 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof mm2.z
            if (r0 == 0) goto L13
            r0 = r8
            mm2.z r0 = (mm2.z) r0
            int r1 = r0.f329597g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f329597g = r1
            goto L18
        L13:
            mm2.z r0 = new mm2.z
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f329595e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f329597g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r7 = r0.f329594d
            mm2.e0 r7 = (mm2.e0) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L89
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "LiveBoxSlice initData, hasInit:"
            r8.<init>(r2)
            boolean r2 = r6.f328967g
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "str"
            kotlin.jvm.internal.o.g(r8, r2)
            java.lang.String r2 = "mainFlowLog "
            java.lang.String r8 = r2.concat(r8)
            java.lang.String r2 = "Finder.LiveBoxSlice"
            com.tencent.mars.xlog.Log.i(r2, r8)
            r6.f328977t = r7
            boolean r7 = r6.f328967g
            if (r7 != 0) goto La2
            r6.f328967g = r4
            lm2.n r7 = lm2.n.f319427a
            java.lang.Class<mm2.e1> r7 = mm2.e1.class
            androidx.lifecycle.c1 r7 = r6.business(r7)
            mm2.e1 r7 = (mm2.e1) r7
            r45.nw1 r7 = r7.f328988r
            r8 = 0
            long r7 = r7.getLong(r8)
            r0.f329594d = r6
            r0.f329597g = r4
            lm2.k r2 = new lm2.k
            r4 = 0
            java.lang.String r5 = "initData"
            r2.<init>(r5, r7, r4)
            java.lang.Object r7 = kotlinx.coroutines.z0.f(r2, r0)
            if (r7 != r1) goto L84
            goto L85
        L84:
            r7 = r3
        L85:
            if (r7 != r1) goto L88
            return r1
        L88:
            r7 = r6
        L89:
            lm2.g r8 = new lm2.g
            r8.<init>()
            r7.f328978u = r8
            lm2.h0 r8 = new lm2.h0
            lm2.g r0 = r7.f328978u
            if (r0 != 0) goto L9b
            lm2.g r0 = new lm2.g
            r0.<init>()
        L9b:
            gk2.e r1 = r7.f328963d
            r8.<init>(r1, r0)
            r7.f328976s = r8
        La2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.e0.Q6(r45.qt2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void R6(java.lang.String tag, r45.ch1 msg) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = "postLikeMsg, seq:" + msg.getLong(12);
        kotlin.jvm.internal.o.g(str, "str");
        com.tencent.mars.xlog.Log.i(tag, "localLikeLog ".concat(str));
        lm2.h0 h0Var = this.f328976s;
        if (!(h0Var != null ? h0Var.h(msg) : false)) {
            com.tencent.mars.xlog.Log.i(tag, "update failed, don't request cgi");
            return;
        }
        db2.q2 q2Var = new db2.q2(msg, this.f328963d, this.f328977t);
        r45.kv0 kv0Var = (r45.kv0) q2Var.f228126u.getCustom(1);
        if (kv0Var != null) {
            kv0Var.set(6, 1);
        }
        pq5.g l17 = q2Var.l();
        l17.f(this.f328968h);
        l17.K(new mm2.a0(tag, this, msg));
    }

    public final void S6(java.lang.String boxId, r45.ch1 msg) {
        lm2.c cVar;
        kotlin.jvm.internal.o.g(boxId, "boxId");
        kotlin.jvm.internal.o.g(msg, "msg");
        lm2.h0 h0Var = this.f328976s;
        if (h0Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.BoxDataStore", "insertLocal " + msg.getString(2));
            cVar = lm2.h0.f319392i.b(msg);
            if (cVar != null) {
                cVar.f319371d = true;
                pm0.v.X(new lm2.c0(h0Var, boxId, cVar));
            }
        } else {
            cVar = null;
        }
        db2.q2 q2Var = new db2.q2(msg, this.f328963d, this.f328977t);
        r45.kv0 kv0Var = (r45.kv0) q2Var.f228126u.getCustom(1);
        if (kv0Var != null) {
            kv0Var.set(6, 1);
        }
        pq5.g l17 = q2Var.l();
        l17.f(this.f328968h);
        l17.K(new mm2.c0(cVar, this));
    }

    public final java.lang.Object T6(java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        return kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new mm2.d0(str, this, z17, null), continuation);
    }

    public final void U6(boolean z17) {
        if (z17 != this.f328973p) {
            com.tencent.mars.xlog.Log.i("Finder.LiveBoxSlice", "reachLastVisibleComment from " + this.f328973p + " to " + z17 + '!');
        }
        this.f328973p = z17;
    }

    public final void V6(int i17) {
        if (i17 != this.f328975r) {
            com.tencent.mars.xlog.Log.i("Finder.LiveBoxSlice", "unReadAtMeMsgPos from " + this.f328975r + " to " + i17);
        }
        this.f328975r = i17;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        this.f328968h.dead();
        this.f328970m = new androidx.lifecycle.j0();
        lm2.h0 h0Var = this.f328976s;
        if (h0Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.BoxDataStore", "release");
            h0Var.f319396c = new androidx.lifecycle.j0(new java.util.concurrent.ConcurrentHashMap());
            h0Var.f319397d.clear();
            h0Var.f319398e = new androidx.lifecycle.j0(new java.util.concurrent.ConcurrentHashMap());
            km2.m0 m0Var = h0Var.f319400g;
            if (m0Var != null) {
                kotlinx.coroutines.r2 r2Var = m0Var.f309146d;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                m0Var.f309146d = null;
            }
            h0Var.f319400g = null;
            km2.m0 m0Var2 = h0Var.f319401h;
            if (m0Var2 != null) {
                kotlinx.coroutines.r2 r2Var2 = m0Var2.f309146d;
                if (r2Var2 != null) {
                    kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
                }
                m0Var2.f309146d = null;
            }
            h0Var.f319401h = null;
        }
        this.f328976s = null;
        this.f328978u = null;
        this.f328972o = -1;
        U6(true);
        this.f328967g = false;
        this.f328974q = 0L;
        V6(0);
        this.f328971n = 0L;
    }
}
