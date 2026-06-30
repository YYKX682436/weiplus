package hb2;

/* loaded from: classes8.dex */
public final class s0 extends hb2.w0 implements i95.m {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.s0 f280090e = new hb2.s0();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280091f = "Finder.FinderModifyUserService";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.ri2 cmdBufItem = (r45.ri2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 1;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280091f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        ya2.g gVar;
        ya2.b2 b17;
        r45.ri2 cmdBufItem = (r45.ri2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        int integer = cmdRef.getInteger(1);
        java.lang.String str = f280091f;
        com.tencent.mars.xlog.Log.i(str, "[handleUpdateResult] username=" + username + ", retCode=" + integer);
        if (integer != 0 || (b17 = (gVar = ya2.h.f460484a).b(username)) == null) {
            return;
        }
        m92.c cVar = new m92.c(username);
        java.lang.String string = cmdBufItem.getString(0);
        if (string != null) {
            b17.field_nickname = string;
            cVar.field_nickname = string;
        }
        java.lang.String string2 = cmdBufItem.getString(1);
        if (string2 != null) {
            b17.field_signature = string2;
            cVar.field_signature = string2;
        }
        java.lang.String string3 = cmdBufItem.getString(3);
        if (string3 != null) {
            b17.field_avatarUrl = string3;
            cVar.field_avatarUrl = string3;
        }
        g92.b bVar = g92.b.f269769e;
        bVar.C(cVar, m92.j.f324992g);
        gVar.o(b17);
        java.lang.String field_username = b17.field_username;
        kotlin.jvm.internal.o.f(field_username, "field_username");
        m92.b j37 = g92.a.j3(bVar, field_username, false, 2, null);
        int i17 = j37 != null ? j37.field_extFlag : 0;
        if (cmdBufItem.getInteger(18) == 1) {
            i17 |= 262144;
            com.tencent.mars.xlog.Log.i(str, "showFinderInWxSwitch turn on");
        } else if (cmdBufItem.getInteger(18) == 2) {
            i17 &= -262145;
            com.tencent.mars.xlog.Log.i(str, "showFinderInWxSwitch turn off");
        }
        m92.c cVar2 = new m92.c(b17.D0());
        cVar2.field_extFlag = i17;
        bVar.C(cVar2, m92.j.f324997o);
    }

    public void n(boolean z17, zy2.gc gcVar, java.lang.String str) {
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(29, java.lang.Integer.valueOf(z17 ? 1 : 2));
        if (str != null) {
            hb2.w0.a(f280090e, str, ri2Var, gcVar, false, true, null, 40, null);
        }
    }

    public void o(boolean z17, zy2.gc gcVar, java.lang.String str) {
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(26, java.lang.Integer.valueOf(z17 ? 1 : 2));
        if (str != null) {
            hb2.w0.a(f280090e, str, ri2Var, gcVar, false, false, null, 56, null);
        }
    }

    public void q(java.lang.String coverUrl, zy2.gc gcVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(20, coverUrl);
        if (str != null) {
            hb2.w0.a(f280090e, str, ri2Var, gcVar, false, true, null, 40, null);
        }
    }

    public void r(java.lang.String country, java.lang.String province, java.lang.String city, int i17, zy2.gc gcVar, java.lang.String str) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(country, "country");
        kotlin.jvm.internal.o.g(province, "province");
        kotlin.jvm.internal.o.g(city, "city");
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(4, country);
        ri2Var.set(5, province);
        ri2Var.set(6, city);
        ri2Var.set(11, java.lang.Integer.valueOf(i17));
        r45.ae3 ae3Var = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).f257411e;
        if (ae3Var != null) {
            ri2Var.set(17, new r45.hz0());
            r45.hz0 hz0Var = (r45.hz0) ri2Var.getCustom(17);
            if (hz0Var != null) {
                hz0Var.set(0, ae3Var.f369966d);
            }
            r45.hz0 hz0Var2 = (r45.hz0) ri2Var.getCustom(17);
            if (hz0Var2 != null) {
                hz0Var2.set(1, ae3Var.f369967e);
            }
            r45.hz0 hz0Var3 = (r45.hz0) ri2Var.getCustom(17);
            if (hz0Var3 != null) {
                hz0Var3.set(2, ae3Var.f369968f);
            }
            if (str != null) {
                hb2.w0.a(f280090e, str, ri2Var, gcVar, false, false, null, 56, null);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var != null) {
                return;
            }
        }
        if (str != null) {
            hb2.w0.a(this, str, ri2Var, gcVar, false, false, null, 56, null);
        }
    }

    public void s(int i17, int i18, zy2.gc gcVar, java.lang.String str) {
        r45.ri2 ri2Var = new r45.ri2();
        if (i18 == 0) {
            ri2Var.set(23, java.lang.Integer.valueOf(i17));
        } else if (i18 == 1) {
            ri2Var.set(28, java.lang.Integer.valueOf(i17));
        } else if (i18 == 2) {
            ri2Var.set(27, java.lang.Integer.valueOf(i17));
        }
        if (str != null) {
            hb2.w0.a(f280090e, str, ri2Var, gcVar, false, false, null, 56, null);
        }
    }

    public void t(int i17, int i18, zy2.gc gcVar, java.lang.String str) {
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(7, java.lang.Integer.valueOf(i17));
        ri2Var.set(12, java.lang.Integer.valueOf(i18));
        if (str != null) {
            hb2.w0.a(f280090e, str, ri2Var, gcVar, false, false, null, 56, null);
        }
    }

    public void u(boolean z17, zy2.gc gcVar, java.lang.String str) {
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(18, java.lang.Integer.valueOf(z17 ? 1 : 2));
        if (str != null) {
            hb2.w0.a(f280090e, str, ri2Var, gcVar, false, false, null, 56, null);
        }
    }
}
