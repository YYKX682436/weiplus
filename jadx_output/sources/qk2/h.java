package qk2;

/* loaded from: classes3.dex */
public abstract class h extends qk2.f {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f364434g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f364434g = "MoreActionMenuItem";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static void z(qk2.h hVar, int i17, int i18, java.lang.String str, boolean z17, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertRedDot");
        }
        if ((i19 & 2) != 0) {
            i18 = 1;
        }
        if ((i19 & 4) != 0) {
            str = null;
        }
        ?? r76 = z17;
        if ((i19 & 8) != 0) {
            r76 = 1;
        }
        int i27 = hVar.f364428b;
        java.lang.String str2 = i27 != 0 ? i27 != 1 ? i27 != 2 ? "assistant.more" : "audience.more" : "startlive.more" : "anchorlive.bottom.tools";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.f03 f03Var = new r45.f03();
        f03Var.f373887d = i18;
        f03Var.f373891h = 1;
        f03Var.f373892i = hVar.i();
        f03Var.f373893m = str2;
        f03Var.f373900t = r76;
        arrayList.add(f03Var);
        r45.f03 f03Var2 = new r45.f03();
        f03Var2.f373891h = 2;
        f03Var2.f373892i = str2;
        arrayList.add(f03Var2);
        ll2.e.f319133a.i(i17, arrayList, str);
    }

    public final void A() {
        B(this.f364427a);
        qk2.f.f(this, false, 1, null);
    }

    public abstract void B(pk2.o9 o9Var);

    public final void C(android.view.MenuItem menuItem) {
        if (menuItem instanceof db5.h4) {
            this.f364431e = new qk2.g(menuItem);
        }
    }

    public final void r(db5.g4 g4Var, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(g4Var, "<this>");
        C(g4Var.b(i17, i18, i19));
    }

    public final void s(db5.g4 g4Var, int i17, java.lang.CharSequence title, int i18) {
        kotlin.jvm.internal.o.g(g4Var, "<this>");
        kotlin.jvm.internal.o.g(title, "title");
        C(g4Var.g(i17, title, i18));
    }

    public final void t(db5.g4 g4Var, int i17, java.lang.CharSequence title, int i18, int i19) {
        kotlin.jvm.internal.o.g(g4Var, "<this>");
        kotlin.jvm.internal.o.g(title, "title");
        C(g4Var.h(i17, title, i18, i19));
    }

    public final void u(db5.g4 g4Var, int i17, java.lang.CharSequence title, int i18, java.lang.CharSequence desc, int i19) {
        kotlin.jvm.internal.o.g(g4Var, "<this>");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        db5.h4 h4Var = new db5.h4(g4Var.f228346f, i17, 0);
        h4Var.f228368i = title;
        h4Var.setIcon(i18);
        h4Var.f228373q = desc;
        h4Var.f228374r = i19;
        ((java.util.ArrayList) g4Var.f228344d).add(h4Var);
        C(h4Var);
    }

    public abstract void v(pk2.o9 o9Var, db5.g4 g4Var);

    public final void w(db5.g4 menu) {
        kotlin.jvm.internal.o.g(menu, "menu");
        if (h() && zl2.r4.F1(this.f364427a.f356074b)) {
            boolean z17 = ((mm2.n0) this.f364427a.f356074b.a(mm2.n0.class)).f329273r;
            if (!r() || z17) {
                java.lang.String str = this.f364434g;
                java.lang.String str2 = "skip add menuItem " + y() + ": blocked by coLive phase1 switch, isInviteeAnchor=" + z17 + ", allowCoLiveInitiator=" + r();
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i(str, str2, null);
                return;
            }
        }
        if (!re2.b.b(y())) {
            java.lang.String str3 = this.f364434g;
            java.lang.String str4 = "skip add menuItem " + y() + ": blocked by invitee perm gate";
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i(str3, str4, null);
            return;
        }
        if (o()) {
            v(this.f364427a, menu);
            q();
            if (p() || !(!(this instanceof pk2.m2))) {
                return;
            }
            ll2.e.f319133a.j(i(), false);
            return;
        }
        java.lang.String str5 = this.f364434g;
        java.lang.String str6 = "add menuItem " + y() + " failed, as it is not enabled";
        int i19 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i(str5, str6, null);
    }

    public boolean x() {
        return true;
    }

    public abstract int y();
}
