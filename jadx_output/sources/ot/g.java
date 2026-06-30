package ot;

@j95.b
/* loaded from: classes9.dex */
public final class g extends jm0.o implements pt.g0, pt.m0 {

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f348308m;

    static {
        new ot.c(null);
        f348308m = jz5.h.b(ot.b.f348296d);
    }

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(zu.d.class);
        set.add(tt.f.class);
        set.add(pu.k.class);
        set.add(pu.f0.class);
        set.add(ut.b.class);
        set.add(ut.d.class);
        set.add(ut.f.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Zi(com.tencent.mm.storage.f9 r11, r05.k r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof ot.d
            if (r0 == 0) goto L13
            r0 = r13
            ot.d r0 = (ot.d) r0
            int r1 = r0.f348301f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f348301f = r1
            goto L18
        L13:
            ot.d r0 = new ot.d
            r0.<init>(r10, r13)
        L18:
            r7 = r0
            java.lang.Object r13 = r7.f348299d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f348301f
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            kotlin.ResultKt.throwOnFailure(r13)
            goto L65
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = 2
            java.lang.Class[] r13 = new java.lang.Class[r13]
            r1 = 0
            java.lang.Class<du.c> r3 = du.c.class
            r13[r1] = r3
            java.lang.Class<du.a> r1 = du.a.class
            r13[r2] = r1
            java.util.List r13 = kz5.c0.i(r13)
            g75.z r3 = new g75.z
            r3.<init>()
            java.lang.String r1 = "MsgInfo"
            r3.l(r1, r11)
            java.lang.String r11 = "AppMsgObj"
            r3.l(r11, r12)
            g75.k r1 = g75.r.f269391p
            java.lang.String r4 = "SendAppMsg"
            r5 = 0
            r8 = 8
            r9 = 0
            r7.f348301f = r2
            r2 = r13
            java.lang.Object r13 = g75.k.b(r1, r2, r3, r4, r5, r7, r8, r9)
            if (r13 != r0) goto L65
            return r0
        L65:
            g75.x r13 = (g75.x) r13
            g75.z r11 = r13.f269405b
            java.lang.String r12 = "AppMsgResponse"
            java.lang.Object r11 = r11.d(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ot.g.Zi(com.tencent.mm.storage.f9, r05.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public int aj() {
        ut.d.f430602f.a();
        return com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.voice_default_dark : com.tencent.mm.R.raw.voice_default_light;
    }

    public int bj() {
        ut.d.f430602f.a();
        return com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.unknown_default_dark : com.tencent.mm.R.raw.unknown_default_light;
    }

    public int cj(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        ut.b.f430592f.a();
        com.tencent.mm.storage.i9 b17 = tg3.p1.f419206a.b(msgInfo.Q0(), msgInfo.getMsgId());
        if (b17 != null) {
            return b17.f195034o;
        }
        return 0;
    }

    public int fj(boolean z17, java.lang.String str, boolean z18, boolean z19) {
        ut.d.f430602f.a();
        return yu.i.f465763a.b(z17, str, z18, z19);
    }

    public long hj(long j17) {
        java.lang.Object m521constructorimpl;
        int e17 = c01.id.e();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            long j18 = e17;
            long j19 = j17 - j18;
            int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.file.RepairerConfigFileMsgMinusExpiredTime());
            long j27 = c17 > 0 ? c17 * 3600 : 86400L;
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Long.valueOf(j19 < j27 ? j18 + j27 : j17));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsg.AppMsgFeatureService", "getFileMsgExpiredTime error: " + m524exceptionOrNullimpl.getMessage());
            long j28 = (long) e17;
            long j29 = 86400 + j28;
            if (j28 >= j17) {
                j17 = j29;
            }
            m521constructorimpl = java.lang.Long.valueOf(j17);
        }
        return ((java.lang.Number) m521constructorimpl).longValue();
    }

    public int ij(com.tencent.mm.storage.f9 msgInfo, com.tencent.mm.pluginsdk.model.app.d dVar) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        int i17 = msgInfo.Z;
        if (i17 != 0) {
            return i17;
        }
        com.tencent.mm.storage.i9 b17 = tg3.p1.f419206a.b(msgInfo.Q0(), msgInfo.getMsgId());
        return b17 != null ? b17.f195026d : msgInfo.Z;
    }

    public int mj() {
        ut.d.f430602f.a();
        return com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.photo_default_dark : com.tencent.mm.R.raw.photo_default_light;
    }

    public int nj(java.lang.String str, com.tencent.mm.storage.f9 f9Var) {
        ut.d.f430602f.a();
        return yu.i.f465763a.b(false, str, false, f9Var != null && ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).cj(f9Var) == 6);
    }

    public int oj() {
        ut.d.f430602f.a();
        return com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.video_default_dark : com.tencent.mm.R.raw.video_default_light;
    }

    public void pj(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        if ((f9Var != null ? bm5.w.a(f9Var) : null) == bm5.v.f22747m) {
            ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).cj(f9Var, z17);
        }
        if ((f9Var != null ? bm5.w.a(f9Var) : null) == bm5.v.f22745h) {
            ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).ij(f9Var, z17);
        }
        if (f9Var != null) {
            if (!pt0.f0.f358209b1.c(bm5.w.a(f9Var))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.AppMsgFeatureService", "c2c path is close");
                return;
            }
            java.lang.String mj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), false);
            if (com.tencent.mm.vfs.w6.j(mj6)) {
                bm5.f0 f0Var = bm5.f0.f22564i;
                java.lang.String a17 = bm5.d0.a(f9Var, f0Var, false, true, 2, null);
                if (kotlin.jvm.internal.o.b(a17, mj6)) {
                    return;
                }
                boolean x17 = com.tencent.mm.vfs.w6.x(mj6, a17, true);
                com.tencent.mm.vfs.w6.h(mj6);
                zz.b bj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(a17, f9Var.getType(), null, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.AppMsgFeatureService", "appMsgCheckDup:%s ret:%s hitCache:%s copyResult:%s replaceResult:%s", a17, java.lang.Integer.valueOf(bj6.f477691a), java.lang.Boolean.valueOf(bj6.f477692b), java.lang.Boolean.valueOf(bj6.f477694d), java.lang.Long.valueOf(bj6.f477695e));
                bm5.c0.f22550a.c(bm5.z.f(bm5.y.f22756i.a(f9Var, f0Var)), true);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.AppMsgFeatureService", "move old appmsg thumb to c2c file success: " + x17 + ", src[" + mj6 + "] -> dst[" + a17 + "], talker: " + f9Var.Q0() + ", localId: " + f9Var.getMsgId() + ", svrId: " + f9Var.I0());
            }
        }
    }

    public boolean qj(int i17, java.lang.String toUser) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (kz5.z.D0(new java.lang.Integer[]{33, 36, 44, 48}).contains(java.lang.Integer.valueOf(i17))) {
            return j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigNewSendAppBrand()) == 1 || com.tencent.mm.storage.z3.J3(toUser);
        }
        return false;
    }

    public boolean rj(int i17, java.lang.String toUser) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        return i17 == 53 && (com.tencent.mm.storage.z3.J3(toUser) || j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigNewSendSolitaire()) == 1);
    }

    public boolean sj(int i17, java.lang.String toUser) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (kz5.z.D0(new java.lang.Integer[]{5, 101}).contains(java.lang.Integer.valueOf(i17))) {
            return com.tencent.mm.storage.z3.J3(toUser) || j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigNewSendUrl()) == 1;
        }
        return false;
    }

    public kotlinx.coroutines.flow.j tj(qi3.b0 task) {
        kotlin.jvm.internal.o.g(task, "task");
        if (!(task instanceof ru.j)) {
            throw new java.lang.UnsupportedOperationException("sendAsync only support BaseSendAppMsgTask Type");
        }
        if (task instanceof ut.q0) {
            pu.f0 a17 = pu.f0.f358300m.a();
            ut.q0 q0Var = (ut.q0) task;
            kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
            q0Var.f363678g = b17;
            v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) a17.f358305i).getValue(), null, new pu.b0(q0Var, a17, null), 1, null);
            return b17;
        }
        pu.k a18 = pu.k.f358320i.a();
        ru.j jVar = (ru.j) task;
        kotlinx.coroutines.flow.i2 b18 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        jVar.f363678g = b18;
        v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) a18.f358324h).getValue(), null, new pu.i(jVar, a18, null), 1, null);
        return b18;
    }

    public void uj(qi3.b0 task) {
        kotlin.jvm.internal.o.g(task, "task");
        if (!(task instanceof qi3.c)) {
            throw new java.lang.UnsupportedOperationException("sendSync only support BaseSendMsgTask Type");
        }
        kotlinx.coroutines.flow.j tj6 = tj(task);
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new ot.f(tj6, null), 1, null);
        }
    }

    public void vj(com.tencent.mm.storage.f9 msgInfo, com.tencent.mm.pluginsdk.model.app.d dVar, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        if (!pt0.f0.f358209b1.g()) {
            msgInfo.Z = i17;
            msgInfo.f236178r = true;
            return;
        }
        com.tencent.mm.storage.i9 a17 = tg3.p1.f419206a.a(msgInfo);
        a17.f195026d = i17;
        tg3.q1.a(a17, msgInfo);
        msgInfo.Z = 0;
        msgInfo.f236178r = true;
    }
}
