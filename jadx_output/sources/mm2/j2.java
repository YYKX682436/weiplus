package mm2;

/* loaded from: classes3.dex */
public final class j2 extends mm2.e {
    public static final mm2.v1 F = new mm2.v1(null);
    public static final jz5.g G = jz5.h.b(mm2.u1.f329454d);
    public static final java.util.List H = kz5.c0.i(1, 20002, 20032, 20034, 1000066, 20035, 20013, 20124);
    public static final com.tencent.mm.storage.u3 I = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_DANMAKU_COMMENT_MODE_NEW_V2_INT_SYNC;

    /* renamed from: J, reason: collision with root package name */
    public static final com.tencent.mm.storage.u3 f329160J = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_DANMAKU_SWITCH_GUIDE_BOOLEAN_SYNC;
    public static final java.util.List K = kz5.c0.i(20035, 20013, 20050);
    public static final jz5.g L = jz5.h.b(mm2.t1.f329426d);
    public final kotlinx.coroutines.flow.i2 A;
    public jz5.l B;
    public int C;
    public boolean D;
    public java.lang.Integer E;

    /* renamed from: f, reason: collision with root package name */
    public int f329161f;

    /* renamed from: g, reason: collision with root package name */
    public float f329162g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f329163h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f329164i;

    /* renamed from: m, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329165m;

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329166n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f329167o;

    /* renamed from: p, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f329168p;

    /* renamed from: q, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329169q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f329170r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f329171s;

    /* renamed from: t, reason: collision with root package name */
    public r45.o84 f329172t;

    /* renamed from: u, reason: collision with root package name */
    public mm2.y1 f329173u;

    /* renamed from: v, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f329174v;

    /* renamed from: w, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f329175w;

    /* renamed from: x, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f329176x;

    /* renamed from: y, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f329177y;

    /* renamed from: z, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f329178z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329161f = 2;
        this.f329162g = 0.8f;
        this.f329163h = jz5.h.b(mm2.f2.f329022d);
        u26.u uVar = u26.u.DROP_OLDEST;
        this.f329164i = kotlinx.coroutines.flow.r2.a(0, 1, uVar);
        java.lang.Object m17 = gm0.j1.u().c().m(I, 0);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        this.f329165m = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.valueOf(((java.lang.Integer) m17).intValue() == 1));
        this.f329166n = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.FALSE);
        this.f329167o = jz5.h.b(mm2.i2.f329137d);
        this.f329168p = kotlinx.coroutines.flow.r2.a(0, 1, uVar);
        this.f329169q = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.TRUE);
        this.f329174v = kotlinx.coroutines.flow.r2.a(0, 1, uVar);
        this.f329175w = kotlinx.coroutines.flow.r2.a(0, 1, uVar);
        this.f329176x = kotlinx.coroutines.flow.r2.a(0, 1, uVar);
        this.f329177y = kotlinx.coroutines.flow.r2.a(0, 1, uVar);
        this.f329178z = kotlinx.coroutines.flow.r2.a(0, 1, uVar);
        this.A = kotlinx.coroutines.flow.r2.a(0, 1, uVar);
        this.C = 3;
    }

    public static void T6(mm2.j2 j2Var, int i17, int i18, java.lang.Object obj) {
        java.util.LinkedList linkedList;
        if ((i18 & 1) != 0) {
            i17 = 8;
        }
        mm2.y1 y1Var = j2Var.f329173u;
        if ((y1Var != null ? y1Var.f329552a : null) == mm2.e2.f328998e && j2Var.Q6().isEmpty()) {
            try {
                int size = ((mm2.x4) j2Var.business(mm2.x4.class)).f329528f.size();
                java.util.List list = ((mm2.x4) j2Var.business(mm2.x4.class)).f329528f;
                synchronized (list) {
                    int size2 = list.size() - 1;
                    linkedList = null;
                    if (size2 >= 0) {
                        while (true) {
                            int i19 = size2 - 1;
                            dk2.zf zfVar = (dk2.zf) list.get(size2);
                            mm2.v1 v1Var = F;
                            kotlin.jvm.internal.o.d(zfVar);
                            if (v1Var.d(zfVar)) {
                                if (linkedList == null) {
                                    linkedList = new java.util.LinkedList();
                                }
                                linkedList.add(zfVar);
                                if (linkedList.size() >= i17) {
                                    break;
                                }
                            }
                            if (i19 < 0) {
                                break;
                            } else {
                                size2 = i19;
                            }
                        }
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("LiveDanmaku_step1_3，insertInitCommentList commentSize:");
                sb6.append(size);
                sb6.append(",initSize:");
                sb6.append(i17);
                sb6.append(",final init size:");
                sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
                com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", sb6.toString());
                if (linkedList != null && j2Var.Q6().isEmpty() && (!linkedList.isEmpty())) {
                    j2Var.Q6().addAll(linkedList);
                    ((kotlinx.coroutines.flow.q2) j2Var.f329164i).e(java.lang.Boolean.TRUE);
                }
            } catch (java.lang.Exception e17) {
                hc2.c.a(e17, "insertInitCommentList");
            }
        }
    }

    public final void N6(dk2.zf msg) {
        jz5.f0 f0Var;
        mm2.e2 e2Var;
        kotlin.jvm.internal.o.g(msg, "msg");
        mm2.y1 y1Var = this.f329173u;
        if (y1Var == null || (e2Var = y1Var.f329552a) == null) {
            f0Var = null;
        } else {
            int ordinal = e2Var.ordinal();
            mm2.v1 v1Var = F;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    boolean d17 = v1Var.d(msg);
                    com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", "LiveDanmaku_step1:self msg,valid:" + d17 + ",type:" + msg.getType() + ',' + msg.k() + ':' + msg.j());
                    if (d17) {
                        Q6().add(new mm2.a2(msg, true));
                        ((kotlinx.coroutines.flow.q2) this.f329164i).e(java.lang.Boolean.TRUE);
                    }
                }
            } else if (R6() && this.f329171s) {
                msg.p();
                if (v1Var.b(msg) != null) {
                    ((java.util.List) ((jz5.n) this.f329167o).getValue()).add(new mm2.a2(msg, true));
                    ((kotlinx.coroutines.flow.q2) this.f329168p).e(java.lang.Boolean.TRUE);
                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                    int a17 = v1Var.a(msg.p());
                    ((b92.d1) zbVar).getClass();
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Ij(2, a17);
                    com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", "LiveDanmaku_step1:self msg,type:" + msg.getType() + ',' + msg.k() + ':' + msg.j());
                }
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MMFinder.LiveDanmakuSlice", "addPostMsg but commentConfig is null!");
        }
    }

    public final boolean O6(boolean z17) {
        if (z17) {
            return (((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) this.f329166n).getValue()).booleanValue() && ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) this.f329165m).getValue()).booleanValue()) && !((mm2.c1) business(mm2.c1.class)).N7();
        }
        return false;
    }

    public final mm2.y1 P6() {
        if (this.f329173u == null) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", "getCommentConfigInfo is null!");
        }
        return this.f329173u;
    }

    public final java.util.List Q6() {
        return (java.util.List) ((jz5.n) this.f329163h).getValue();
    }

    public final boolean R6() {
        return !pm0.v.z(((mm2.c1) business(mm2.c1.class)).Q1, com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
    }

    public final int S6() {
        r45.o84 o84Var;
        if (!this.f329171s || (o84Var = this.f329172t) == null) {
            return -1;
        }
        if (o84Var != null) {
            return o84Var.getInteger(0);
        }
        return 0;
    }

    public final void U6(java.lang.String source, long j17) {
        kotlin.jvm.internal.o.g(source, "source");
        qs5.h[] hVarArr = qs5.h.f366433d;
        boolean z17 = !pm0.v.A(j17, 1);
        kotlinx.coroutines.flow.j2 j2Var = this.f329166n;
        if (z17 != ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) j2Var).getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", source + " onMsgExtFlagUpdate change " + ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) j2Var).getValue()).booleanValue() + " to " + z17);
            ((kotlinx.coroutines.flow.h3) j2Var).k(java.lang.Boolean.valueOf(z17));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V6(kotlinx.coroutines.flow.k r6, boolean r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof mm2.h2
            if (r0 == 0) goto L13
            r0 = r8
            mm2.h2 r0 = (mm2.h2) r0
            int r1 = r0.f329108f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f329108f = r1
            goto L18
        L13:
            mm2.h2 r0 = new mm2.h2
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f329106d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f329108f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2e:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5a
        L32:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4c
        L36:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.flow.j2 r8 = r5.f329166n
            if (r7 == 0) goto L4f
            kotlinx.coroutines.flow.j r7 = kotlinx.coroutines.flow.l.j(r8, r4)
            r0.f329108f = r4
            kotlinx.coroutines.flow.p0 r7 = (kotlinx.coroutines.flow.p0) r7
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        L4f:
            r0.f329108f = r3
            kotlinx.coroutines.flow.h3 r8 = (kotlinx.coroutines.flow.h3) r8
            java.lang.Object r6 = r8.a(r6, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            jz5.d r6 = new jz5.d
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.j2.V6(kotlinx.coroutines.flow.k, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void W6(float f17) {
        com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", "modify danmakuAlphaValue from:" + this.f329162g + " to " + f17);
        this.f329162g = f17;
    }

    public final void X6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", "set haveEnableCommentDanmaku from :" + this.D + " to " + z17);
        this.D = z17;
    }

    public final void Y6(int i17) {
        com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", "set curRows from " + this.C + " to " + i17);
        this.C = i17;
    }

    public final void Z6(r45.o84 o84Var) {
        this.f329172t = o84Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectedFloatMsg: msg_type=");
        sb6.append(o84Var != null ? java.lang.Integer.valueOf(o84Var.getInteger(0)) : null);
        sb6.append(", remain_count=");
        sb6.append(o84Var != null ? java.lang.Integer.valueOf(o84Var.getInteger(2)) : null);
        sb6.append(", used_count=");
        sb6.append(o84Var != null ? java.lang.Integer.valueOf(o84Var.getInteger(1)) : null);
        sb6.append(", priority=");
        sb6.append(o84Var != null ? java.lang.Integer.valueOf(o84Var.getInteger(3)) : null);
        com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", sb6.toString());
    }

    public final void a7(jz5.l lVar) {
        com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", "updateLikeMsgCallback " + lVar);
        this.B = lVar;
    }

    public final void b7(java.lang.String source, java.lang.Object updateMsg) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(updateMsg, "updateMsg");
        if (updateMsg instanceof dk2.zf) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(source);
            sb6.append(" syncCommentLikeMsg ");
            dk2.zf zfVar = (dk2.zf) updateMsg;
            sb6.append(zfVar.k());
            sb6.append(':');
            sb6.append(zfVar.j());
            com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", sb6.toString());
        } else if (updateMsg instanceof lm2.i0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(source);
            sb7.append(" syncBoxLikeMsg ");
            lm2.i0 i0Var = (lm2.i0) updateMsg;
            sb7.append(((lm2.c) i0Var).b());
            sb7.append(':');
            sb7.append(i0Var.j());
            com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", sb7.toString());
        }
        ((kotlinx.coroutines.flow.q2) this.A).e(updateMsg);
    }

    public final void c7(dk2.zf updateMsg) {
        kotlin.jvm.internal.o.g(updateMsg, "updateMsg");
        java.lang.String f17 = updateMsg.f();
        jz5.l lVar = this.B;
        if (kotlin.jvm.internal.o.b(f17, lVar != null ? (java.lang.String) lVar.f302833d : null)) {
            jz5.l lVar2 = this.B;
            boolean z17 = false;
            if (lVar2 != null && ((java.lang.Number) lVar2.f302834e).intValue() == 1) {
                a7(null);
                b7("commentMsg", updateMsg);
                return;
            }
            jz5.l lVar3 = this.B;
            if (lVar3 != null && ((java.lang.Number) lVar3.f302834e).intValue() == 2) {
                z17 = true;
            }
            if (z17) {
                a7(null);
                dk2.cg cgVar = updateMsg instanceof dk2.cg ? (dk2.cg) updateMsg : null;
                if (cgVar != null) {
                    cgVar.c(true);
                }
                com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", "syncLikeMsg for danmaku, " + updateMsg.k() + ':' + updateMsg.j());
            }
        }
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        this.f329173u = null;
        this.f329170r = null;
        this.f329171s = false;
        a7(null);
        X6(false);
    }
}
