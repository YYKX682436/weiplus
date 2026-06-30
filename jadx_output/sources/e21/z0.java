package e21;

/* loaded from: classes11.dex */
public final class z0 implements xg3.o0 {

    /* renamed from: h, reason: collision with root package name */
    public static e21.r f246609h;

    /* renamed from: n, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f246612n;

    /* renamed from: o, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.n2 f246613o;

    /* renamed from: d, reason: collision with root package name */
    public static final e21.z0 f246605d = new e21.z0();

    /* renamed from: e, reason: collision with root package name */
    public static final e21.e0 f246606e = new e21.e0();

    /* renamed from: f, reason: collision with root package name */
    public static final int f246607f = 20;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f246608g = jz5.h.b(e21.x0.f246598d);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f246610i = jz5.h.b(e21.v0.f246592d);

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f246611m = jz5.h.b(e21.y0.f246601d);

    static {
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 10, u26.u.DROP_OLDEST, 1, null);
        f246612n = b17;
        f246613o = kotlinx.coroutines.flow.l.a(b17);
    }

    public static final java.lang.Object a(e21.z0 z0Var, xg3.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        z0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.OplogServiceKt", "dealWith(Sync) option " + e21.a1.a(q0Var));
        return (q0Var.b() == 0 && q0Var.f454427f > 0 && kotlin.jvm.internal.o.b("@openim", q0Var.f454429h)) ? z0Var.h(q0Var, continuation) : (q0Var.b() == 0 && q0Var.f454427f > 0 && kotlin.jvm.internal.o.b("@byp", q0Var.f454429h)) ? z0Var.f(q0Var, continuation) : z0Var.g(q0Var, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(e21.z0 r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.z0.b(e21.z0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void c(xg3.q0 q0Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.z3.b(true);
        kotlin.jvm.internal.o.f(b17, "toString(...)");
        v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) f246610i).getValue(), null, new e21.m0(q0Var, b17, currentTimeMillis, null), 1, null);
    }

    public final void d(xg3.q0 q0Var, xg3.n0 n0Var, java.lang.ref.WeakReference weakReference) {
        xg3.n0 n0Var2;
        if (q0Var == null || v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) f246611m).getValue(), null, new e21.n0(q0Var, n0Var, weakReference, null), 1, null) == null) {
            if (n0Var != null) {
                o(n0Var, -1, "", "");
            }
            if (weakReference == null || (n0Var2 = (xg3.n0) weakReference.get()) == null) {
                return;
            }
            o(n0Var2, -1, "", "");
        }
    }

    public void e(xg3.q0 q0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealWithFlow called with operation: ");
        sb6.append(q0Var != null ? e21.a1.a(q0Var) : null);
        sb6.append(", subscriptionCount: ");
        sb6.append(((java.lang.Number) ((v26.s0) ((v26.b) f246612n).i()).getValue()).intValue());
        com.tencent.mars.xlog.Log.i("MicroMsg.OplogServiceKt", sb6.toString());
        d(q0Var, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(xg3.q0 r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.z0.f(xg3.q0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(xg3.q0 r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.z0.g(xg3.q0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(xg3.q0 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof e21.q0
            if (r0 == 0) goto L13
            r0 = r7
            e21.q0 r0 = (e21.q0) r0
            int r1 = r0.f246570g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f246570g = r1
            goto L18
        L13:
            e21.q0 r0 = new e21.q0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f246568e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f246570g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.f246567d
            xg3.q0 r6 = (xg3.q0) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L59
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.throwOnFailure(r7)
            r45.z05 r7 = new r45.z05
            r7.<init>()
            int r2 = r6.f454427f
            r7.f391570d = r2
            com.tencent.mm.protobuf.g r2 = new com.tencent.mm.protobuf.g
            byte[] r4 = r6.a()
            r2.<init>(r4)
            r7.f391571e = r2
            com.tencent.mm.modelbase.i r7 = r7.b()
            r0.f246567d = r6
            r0.f246570g = r3
            java.lang.Object r7 = rm0.h.b(r7, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            com.tencent.mm.modelbase.f r7 = (com.tencent.mm.modelbase.f) r7
            com.tencent.mm.protobuf.f r0 = r7.f70618d
            r45.a15 r0 = (r45.a15) r0
            if (r0 == 0) goto L6f
            r45.ie r0 = r0.getBaseResponse()
            if (r0 == 0) goto L6f
            int r0 = r0.f376959d
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            goto L70
        L6f:
            r1 = 0
        L70:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "dealWith(Sync) OpenIM cgiResp: errCode: "
            r0.<init>(r2)
            int r2 = r7.f70616b
            r0.append(r2)
            java.lang.String r2 = " errType: "
            r0.append(r2)
            int r2 = r7.f70615a
            r0.append(r2)
            java.lang.String r2 = " errMsg: "
            r0.append(r2)
            java.lang.String r2 = r7.f70617c
            r0.append(r2)
            java.lang.String r2 = " ret: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.OplogServiceKt"
            com.tencent.mars.xlog.Log.i(r2, r0)
            boolean r0 = r7.b()
            java.lang.String r2 = ""
            if (r0 == 0) goto Lbc
            e21.f0 r0 = new e21.f0
            if (r1 == 0) goto Lb2
            int r1 = r1.intValue()
            goto Lb3
        Lb2:
            r1 = 0
        Lb3:
            java.lang.String r7 = r7.f70617c
            if (r7 != 0) goto Lb8
            r7 = r2
        Lb8:
            r0.<init>(r6, r1, r2, r7)
            goto Lc7
        Lbc:
            e21.f0 r0 = new e21.f0
            java.lang.String r7 = r7.f70617c
            if (r7 != 0) goto Lc3
            r7 = r2
        Lc3:
            r1 = -1
            r0.<init>(r6, r1, r2, r7)
        Lc7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.z0.h(xg3.q0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.util.Map i() {
        return (java.util.Map) ((jz5.n) f246608g).getValue();
    }

    public final e21.r j() {
        gm0.b0 u17;
        l75.k0 k0Var;
        if (f246609h == null && gm0.j1.h() && gm0.j1.a()) {
            synchronized (e21.r.class) {
                if (f246609h == null && (u17 = gm0.j1.u()) != null && (k0Var = u17.f273153f) != null) {
                    f246609h = new e21.r(k0Var);
                }
            }
        }
        return f246609h;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(xg3.q0 r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.z0.k(xg3.q0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.util.List r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.z0.l(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(xg3.q0 r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e21.z0.m(xg3.q0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void n(xg3.q0 q0Var, e21.x xVar) {
        e21.r j17 = j();
        java.lang.Integer valueOf = j17 != null ? java.lang.Integer.valueOf(j17.m0(q0Var)) : null;
        java.lang.Integer num = (java.lang.Integer) i().get(java.lang.Integer.valueOf(q0Var.f454423b));
        e21.r j18 = j();
        f246606e.c(q0Var, num, j18 != null ? j18.getCount() : 0, xVar);
        i().remove(java.lang.Integer.valueOf(q0Var.f454423b));
        com.tencent.mars.xlog.Log.i("MicroMsg.OplogServiceKt", "remove Operation res=" + valueOf + ' ' + e21.a1.a(q0Var));
    }

    public final void o(xg3.n0 n0Var, int i17, java.lang.String str, java.lang.String str2) {
        try {
            n0Var.a(i17, str, str2);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OplogServiceKt", th6, "safeNotifyOpLogResult callback error, ret=" + i17 + " title=" + str, new java.lang.Object[0]);
        }
    }
}
