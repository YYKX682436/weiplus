package xl4;

/* loaded from: classes11.dex */
public final class e extends sl4.g {
    public final jz5.g A;
    public boolean B;
    public final jz5.g C;

    public e() {
        super(bw5.eq0.FinderAudio);
        this.A = jz5.h.b(new xl4.d(this));
        this.C = jz5.h.b(xl4.a.f455123d);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.B
            r1 = 0
            java.lang.String r2 = "MicroMsg.FinderAudioFloatBallHelper"
            if (r0 != 0) goto Ld
            java.lang.String r4 = "checkAndAddFloatBall can not add floatball, not isBackground"
            com.tencent.mars.xlog.Log.i(r2, r4)
            return r1
        Ld:
            java.lang.Class<qk.g9> r0 = qk.g9.class
            i95.m r0 = i95.n0.c(r0)
            qk.g9 r0 = (qk.g9) r0
            rk4.z8 r0 = (rk4.z8) r0
            boolean r0 = r0.nj()
            if (r0 == 0) goto L24
            java.lang.String r0 = "canAddFloatBall ting is playing"
            com.tencent.mars.xlog.Log.w(r2, r0)
        L22:
            r0 = r1
            goto L33
        L24:
            b66.n r0 = r3.j0()
            if (r0 != 0) goto L2b
            goto L22
        L2b:
            int r0 = r0.i()
            boolean r0 = il4.m.a(r0)
        L33:
            if (r0 != 0) goto L51
            java.lang.String r0 = "checkAndAddFloatBall can not add floatball"
            com.tencent.mars.xlog.Log.i(r2, r0)
            boolean r0 = com.tencent.mm.plugin.ting.TingFlutterActivity.A
            r0 = r0 ^ 1
            r4 = r4 | r0
            if (r4 == 0) goto L49
            java.lang.String r4 = "checkAndAddFloatBall can not add floatball and STOP!"
            com.tencent.mars.xlog.Log.i(r2, r4)
            r3.y0()
        L49:
            r3.f409263r = r1
            r4 = 0
            r3.f409260o = r4
            r3.f409268w = r4
            return r1
        L51:
            boolean r4 = r3.u()
            if (r4 == 0) goto L5d
            java.lang.String r4 = "checkAndAddFloatBall has ball and ignore"
            com.tencent.mars.xlog.Log.w(r2, r4)
            return r1
        L5d:
            boolean r4 = r3.e0()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xl4.e.A0(boolean):boolean");
    }

    @Override // sl4.a
    public void a() {
        bw5.o50 b17;
        b66.a e17;
        int i17 = jm4.s0.f300422d;
        jm4.q0 q0Var = (jm4.q0) urgen.ur_0025.UR_BC1F.UR_8AEC();
        bw5.o50 o50Var = q0Var != null ? (bw5.o50) jm4.r5.d(urgen.ur_0025.UR_BC1F.UR_A31C(((jm4.s0) q0Var).getCppPointer()), new bw5.o50()) : null;
        b66.n j07 = j0();
        bw5.dr0 a17 = (j07 == null || (e17 = ((b66.q) j07).e()) == null) ? null : ((b66.c) e17).a();
        if (a17 != null) {
            java.lang.String c17 = o50Var != null ? o50Var.c() : null;
            bw5.cp0 b18 = a17.b();
            if (kotlin.jvm.internal.o.b(c17, (b18 == null || (b17 = b18.b()) == null) ? null : b17.c())) {
                i95.m c18 = i95.n0.c(o40.e.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                o40.e.ta((o40.e) c18, context, null, null, 6, null);
                return;
            }
        }
        i95.m c19 = i95.n0.c(o40.e.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((wy2.g) ((o40.e) c19)).Di(context2, null, null, true);
    }

    @Override // com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        super.b(i17, str);
        t().f93086f = 29;
        b66.n j07 = j0();
        if (j07 != null) {
            urgen.ur_2BA9.UR_C8FE.UR_29E0(((b66.q) j07).getCppPointer(), (xl4.c) ((jz5.n) this.A).getValue());
        }
    }

    @Override // sl4.g, sl4.a
    public void c(bl4.b info) {
        kotlin.jvm.internal.o.g(info, "info");
        super.c(info);
        if (il4.m.a(info.f21734c)) {
            boolean hj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).hj();
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderAudioFloatBallHelper", "checkRemoveTingFloatBallOrStop isIdle: " + hj6);
            if (hj6) {
                return;
            }
            ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).zj();
        }
    }

    @Override // sl4.g
    public bl4.a f0() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new com.tencent.mm.plugin.ting.playapp.finderaudio.FinderAudioFloatBallView(context, null);
    }

    @Override // sl4.g
    public java.lang.String g0() {
        return "FinderAudioFloatBallKey";
    }

    @Override // sl4.g, sl4.a
    public void h() {
        super.h();
        this.B = false;
    }

    @Override // sl4.g
    public int h0() {
        return 52;
    }

    @Override // sl4.g, sl4.a
    public void i(boolean z17) {
        if (this.B) {
            return;
        }
        this.B = true;
        A0(z17);
    }

    @Override // sl4.g
    public void o0(qp1.j0 permissionCheckResult) {
        kotlin.jvm.internal.o.g(permissionCheckResult, "permissionCheckResult");
        jz5.g gVar = this.C;
        if (((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue() && !permissionCheckResult.h()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderAudioFloatBallHelper", "onFloatBallPermissionCheckResult: " + permissionCheckResult + " not ok and stop");
            y0();
        }
        if (permissionCheckResult == qp1.j0.Already_Has) {
            bl4.b bVar = this.f409260o;
            yl4.a.c(bVar != null ? bVar.f21737f : null, bVar != null ? bVar.f21738g : null);
            return;
        }
        if (permissionCheckResult == qp1.j0.Allow) {
            bl4.b bVar2 = this.f409260o;
            yl4.a.f(bVar2 != null ? bVar2.f21737f : null, bVar2 != null ? bVar2.f21738g : null);
        } else if (permissionCheckResult == qp1.j0.Refuse && ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue()) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.omm);
            e4Var.c();
        }
    }

    @Override // sl4.g
    public void p0() {
    }

    @Override // sl4.g
    public void q0() {
    }

    @Override // sl4.g
    public void r0() {
    }
}
