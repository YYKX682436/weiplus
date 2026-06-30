package zl4;

/* loaded from: classes11.dex */
public final class e extends sl4.g {
    public final jz5.g A;
    public boolean B;
    public final jz5.g C;

    public e() {
        super(bw5.eq0.AudioRadio);
        this.A = jz5.h.b(new zl4.d(this));
        this.C = jz5.h.b(zl4.a.f474074d);
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
            java.lang.String r2 = "MicroMsg.TingRadioChannelFloatBallHelper"
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
        throw new UnsupportedOperationException("Method not decompiled: zl4.e.A0(boolean):boolean");
    }

    @Override // sl4.a
    public void a() {
        ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).getClass();
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((rk4.k8) aj6).w(context, bw5.ar0.TingScene_Minimization);
    }

    @Override // com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        super.b(i17, str);
        t().f93086f = 26;
        b66.n j07 = j0();
        if (j07 != null) {
            urgen.ur_2BA9.UR_C8FE.UR_29E0(((b66.q) j07).getCppPointer(), (zl4.c) ((jz5.n) this.A).getValue());
        }
    }

    @Override // sl4.g, sl4.a
    public void c(bl4.b info) {
        kotlin.jvm.internal.o.g(info, "info");
        super.c(info);
        if (il4.m.a(info.f21734c)) {
            boolean hj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).hj();
            com.tencent.mars.xlog.Log.i("MicroMsg.TingRadioChannelFloatBallHelper", "checkRemoveTingFloatBallOrStop isIdle: " + hj6);
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
        return new com.tencent.mm.plugin.ting.playapp.radio_channel.floatball.TingRadioChannelFloatBallView(context, null);
    }

    @Override // sl4.g
    public java.lang.String g0() {
        return "TingRadioChannelFloatBall";
    }

    @Override // sl4.g, sl4.a
    public void h() {
        super.h();
        this.B = false;
    }

    @Override // sl4.g
    public int h0() {
        return 39;
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
            com.tencent.mars.xlog.Log.i("MicroMsg.TingRadioChannelFloatBallHelper", "onFloatBallPermissionCheckResult: " + permissionCheckResult + " not ok and stop");
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
        bl4.b bVar = this.f409260o;
        yl4.a.d(false, bVar != null ? bVar.f21737f : null, bVar != null ? bVar.f21738g : null);
    }

    @Override // sl4.g
    public void q0() {
        bl4.b bVar = this.f409260o;
        yl4.a.d(true, bVar != null ? bVar.f21737f : null, bVar != null ? bVar.f21738g : null);
    }

    @Override // sl4.g
    public void r0() {
        bl4.b bVar = this.f409260o;
        yl4.a.e(bVar != null ? bVar.f21737f : null, bVar != null ? bVar.f21738g : null);
    }
}
