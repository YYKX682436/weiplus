package pk2;

/* loaded from: classes3.dex */
public final class kb extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f355927h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355927h = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        int y17 = y();
        if (y17 == o9Var.L) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) o9Var.f356078d, 1, true);
            k0Var.f211872n = new pk2.ib(o9Var);
            k0Var.f211881s = new pk2.jb(this, o9Var);
            k0Var.v();
            return;
        }
        if (y17 == o9Var.f356098n) {
            E(o9Var);
        } else if (y17 == o9Var.f356123z0) {
            D(o9Var);
        }
    }

    public final void D(pk2.o9 o9Var) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = ((mm2.c1) o9Var.c(mm2.c1.class)).V5;
        if (finderJumpInfo != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.tencent.mm.ui.MMActivity context = o9Var.f356078d;
            kotlin.jvm.internal.o.g(context, "context");
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453252n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
        zl2.r4.f473950a.T2(7);
    }

    public final void E(pk2.o9 o9Var) {
        pk2.g8 g8Var;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_LOTTERY_HISTORY_SCENE", 2);
        intent.putExtra("KEY_LOTTERY_HISTORY_LIVE_ID", ((mm2.e1) o9Var.c(mm2.e1.class)).f328988r.getLong(0));
        intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", ((mm2.e1) o9Var.c(mm2.e1.class)).f328983m);
        intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_NONCE_ID", ((mm2.e1) o9Var.c(mm2.e1.class)).f328992v);
        intent.putExtra("KEY_LIVE_ANCHOR_USERNAME", ((mm2.c1) o9Var.c(mm2.c1.class)).f328852o);
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pk2.o9 o9Var2 = this.f364427a;
        c61.yb.H7((c61.yb) c17, o9Var2.f356078d, intent, 0L, null, 0, 0, false, 124, null);
        intent.putExtra("KEY_CUSTOM_TITLE", o9Var.f356078d.getString(com.tencent.mm.R.string.dyh));
        i95.m c18 = i95.n0.c(c61.ub.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) c18)).Oj(o9Var2.f356078d, intent, false);
        intent.putExtra("KEY_LIVE_COOKIES", ((mm2.e1) o9Var.c(mm2.e1.class)).f328985o);
        intent.putExtra("KEY_LOTTERY_HISTORY_SOURCE", 2);
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        java.lang.String str = a52.a.f1584l;
        if (str == null) {
            str = "";
        }
        intent.putExtra("KEY_FROM_COMMENT_SCENE", str);
        i95.m c19 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        ml2.r0.ek((ml2.r0) c19, ml2.p4.f327801o, "", null, 0, null, 28, null);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        pk2.d9 d9Var = o9Var.f356082f;
        ((cy1.a) rVar).Cj("finder_live_win_record_clk", (d9Var == null || (g8Var = d9Var.f355658a) == null) ? null : ((pk2.k9) g8Var).f355924a.f231013n, null, 25561);
    }

    public final boolean F() {
        boolean z17;
        mm2.c1 c1Var = (mm2.c1) this.f364427a.c(mm2.c1.class);
        if (!c1Var.U5) {
            return false;
        }
        if (!(in0.q.f292769b2 != null)) {
            if (!(sn0.b.f409964e2 != null)) {
                z17 = false;
                return (z17 || c1Var.V5 == null) ? false : true;
            }
        }
        z17 = true;
        if (z17) {
            return false;
        }
    }

    public final boolean G() {
        return kotlin.jvm.internal.o.b(((on2.z2) this.f364427a.c(on2.z2.class)).f347095p.getValue(), java.lang.Boolean.TRUE);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355927h;
    }

    @Override // qk2.f
    public boolean o() {
        return G() || F();
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        int y17 = y();
        int i17 = o9Var.L;
        if (y17 == i17) {
            menu.b(i17, com.tencent.mm.R.string.f491698dy3, com.tencent.mm.R.raw.icons_outlined_winningrecord);
            return;
        }
        int i18 = o9Var.f356098n;
        if (y17 == i18) {
            menu.b(i18, com.tencent.mm.R.string.dyh, com.tencent.mm.R.raw.icons_outlined_winningrecord);
            return;
        }
        int i19 = o9Var.f356123z0;
        if (y17 == i19) {
            menu.b(i19, com.tencent.mm.R.string.dxd, com.tencent.mm.R.raw.icons_outlined_winningrecord);
        }
    }

    @Override // qk2.h
    public int y() {
        boolean G = G();
        pk2.o9 o9Var = this.f364427a;
        if (G && F()) {
            return o9Var.L;
        }
        if (G()) {
            return o9Var.f356098n;
        }
        if (F()) {
            return o9Var.f356123z0;
        }
        return -1;
    }
}
