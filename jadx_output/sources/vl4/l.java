package vl4;

/* loaded from: classes11.dex */
public final class l extends sl4.g {
    public final jz5.g A;
    public boolean B;
    public final jz5.g C;
    public boolean D;

    public l() {
        super(bw5.eq0.TingChatRoom);
        this.A = jz5.h.b(new vl4.k(this));
        this.C = jz5.h.b(vl4.h.f437890d);
    }

    public final boolean A0(boolean z17) {
        boolean D0;
        jm4.d1 p17;
        if (!this.B) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingChatRoomFloatBallHelper", "checkAndAddFloatBall can not add floatball, not isBackground");
            return false;
        }
        jm4.g3 C0 = C0();
        if (((C0 == null || (p17 = ((jm4.h3) C0).p()) == null) ? null : ((jm4.e1) p17).a()) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingChatRoomFloatBallHelper", "onEnterBackground getCurRoomCategoryItem is null");
            return false;
        }
        if (((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).nj()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingChatRoomFloatBallHelper", "canAddFloatBall ting is playing");
            D0 = false;
        } else {
            D0 = D0();
        }
        if (D0) {
            if (!u()) {
                return e0();
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.TingChatRoomFloatBallHelper", "checkAndAddFloatBall has ball and ignore");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingChatRoomFloatBallHelper", "checkAndAddFloatBall can not add floatball");
        if (z17 | (!com.tencent.mm.plugin.ting.TingFlutterActivity.A)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingChatRoomFloatBallHelper", "checkAndAddFloatBall can not add floatball and STOP!");
            y0();
        }
        this.f409263r = false;
        this.f409260o = null;
        this.f409268w = null;
        return false;
    }

    public final void B0() {
        jm4.d1 p17;
        jm4.g3 C0 = C0();
        if (C0 == null || (p17 = ((jm4.h3) C0).p()) == null) {
            return;
        }
        jm4.e1 e1Var = (jm4.e1) p17;
        bw5.o50 a17 = e1Var.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingChatRoomFloatBallHelper", "exitChatRoom chatRoomCategory is null");
            return;
        }
        vl4.u uVar = vl4.u.f437904a;
        com.tencent.unit_rc.WeakPtr weakPtr = this.f409261p;
        com.tencent.unit_rc.BaseObjectDef baseObjectDef = weakPtr != null ? (b66.g) weakPtr.lock() : null;
        boolean c17 = uVar.c(baseObjectDef instanceof jm4.n2 ? (jm4.n2) baseObjectDef : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingChatRoomFloatBallHelper", "exitChatRoom exitChatRoom " + c17);
        if (c17) {
            bw5.o50 o50Var = new bw5.o50();
            o50Var.i(a17.c());
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            qk.f9.a(aj6, context, o50Var, null, true, null, 20, null);
            return;
        }
        bw5.o50 a18 = e1Var.a();
        if (a18 != null) {
            byte[] byteArray = a18.toByteArray();
            long cppPointer = e1Var.getCppPointer();
            kotlin.jvm.internal.o.d(byteArray);
            urgen.ur_0025.UR_5D5A.UR_2E85(cppPointer, byteArray);
        }
    }

    public final jm4.g3 C0() {
        com.tencent.unit_rc.WeakPtr weakPtr = this.f409261p;
        b66.g gVar = weakPtr != null ? (b66.g) weakPtr.lock() : null;
        jm4.n2 n2Var = gVar instanceof jm4.n2 ? (jm4.n2) gVar : null;
        if (n2Var != null) {
            return ((jm4.p2) n2Var).f();
        }
        return null;
    }

    public boolean D0() {
        return j0() != null;
    }

    @Override // sl4.a
    public void a() {
        vl4.u uVar = vl4.u.f437904a;
        com.tencent.unit_rc.WeakPtr weakPtr = this.f409261p;
        com.tencent.unit_rc.BaseObjectDef baseObjectDef = weakPtr != null ? (b66.g) weakPtr.lock() : null;
        if (uVar.b(baseObjectDef instanceof jm4.n2 ? (jm4.n2) baseObjectDef : null)) {
            return;
        }
        d();
    }

    @Override // com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        super.b(i17, str);
        this.f409262q = true;
        t().f93086f = 28;
        b66.n j07 = j0();
        if (j07 != null) {
            urgen.ur_2BA9.UR_C8FE.UR_29E0(((b66.q) j07).getCppPointer(), (vl4.j) ((jz5.n) this.A).getValue());
        }
    }

    @Override // sl4.g, sl4.a
    public void c(bl4.b info) {
        kotlin.jvm.internal.o.g(info, "info");
        super.c(info);
        if (il4.m.a(info.f21734c)) {
            boolean hj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).hj();
            com.tencent.mars.xlog.Log.i("MicroMsg.TingChatRoomFloatBallHelper", "checkRemoveTingFloatBallOrStop isIdle: " + hj6);
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
        return new com.tencent.mm.plugin.ting.playapp.chatroom.TingChatRoomFloatBallView(context, null);
    }

    @Override // sl4.g
    public java.lang.String g0() {
        return "TingChatRoomFloatBall";
    }

    @Override // sl4.g, sl4.a
    public void h() {
        super.h();
        this.B = false;
    }

    @Override // sl4.g
    public int h0() {
        return 53;
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
    public void n0() {
        B0();
    }

    @Override // sl4.g
    public void o0(qp1.j0 permissionCheckResult) {
        kotlin.jvm.internal.o.g(permissionCheckResult, "permissionCheckResult");
        jz5.g gVar = this.C;
        if (((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue() && !permissionCheckResult.h()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingChatRoomFloatBallHelper", "onFloatBallPermissionCheckResult: " + permissionCheckResult + " not ok and stop");
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

    @Override // sl4.g
    public void t0() {
        b66.n a17;
        b66.g i07 = i0();
        if (i07 != null && ((b66.i) i07).getAppId() == bw5.eq0.TingChatRoom) {
            boolean z17 = !this.D;
            b66.g i08 = i0();
            if (i08 == null || (a17 = ((b66.i) i08).a()) == null) {
                return;
            }
            if (z17) {
                b66.m.a(a17, null, 1, null);
            } else {
                b66.m.b(a17, null, 1, null);
            }
        }
    }

    @Override // sl4.g
    public void u0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, com.tencent.mm.plugin.ball.model.BallInfo ballInfo2) {
        B0();
    }

    @Override // sl4.g
    public boolean v0(int i17) {
        b66.g i07 = i0();
        if (i07 == null || ((b66.i) i07).getAppId() != bw5.eq0.TingChatRoom) {
            return false;
        }
        boolean z17 = i17 == 3;
        this.D = z17;
        return !z17;
    }
}
