package nr2;

/* loaded from: classes2.dex */
public final class m implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.do2 f339268d;

    public m(r45.do2 info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f339268d = info;
    }

    public final int a() {
        r45.n11 n11Var;
        boolean p17 = p();
        r45.do2 do2Var = this.f339268d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.getCustom(0);
            if (uz0Var != null) {
                return uz0Var.getInteger(5);
            }
            return 0;
        }
        if (!q() || (n11Var = (r45.n11) do2Var.getCustom(1)) == null) {
            return 0;
        }
        return n11Var.getInteger(5);
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact b() {
        r45.n11 n11Var;
        boolean p17 = p();
        r45.do2 do2Var = this.f339268d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.getCustom(0);
            if (uz0Var != null) {
                return (com.tencent.mm.protocal.protobuf.FinderContact) uz0Var.getCustom(11);
            }
            return null;
        }
        if (!q() || (n11Var = (r45.n11) do2Var.getCustom(1)) == null) {
            return null;
        }
        return (com.tencent.mm.protocal.protobuf.FinderContact) n11Var.getCustom(11);
    }

    public final java.lang.String c() {
        r45.n11 n11Var;
        java.lang.String string;
        boolean p17 = p();
        r45.do2 do2Var = this.f339268d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.getCustom(0);
            if (uz0Var == null || (string = uz0Var.getString(3)) == null) {
                return "";
            }
        } else if (!q() || (n11Var = (r45.n11) do2Var.getCustom(1)) == null || (string = n11Var.getString(3)) == null) {
            return "";
        }
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    public final java.lang.String e() {
        r45.n11 n11Var;
        java.lang.String string;
        boolean p17 = p();
        r45.do2 do2Var = this.f339268d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.getCustom(0);
            if (uz0Var == null || (string = uz0Var.getString(2)) == null) {
                return "";
            }
        } else if (!q() || (n11Var = (r45.n11) do2Var.getCustom(1)) == null || (string = n11Var.getString(2)) == null) {
            return "";
        }
        return string;
    }

    public final int f() {
        r45.n11 n11Var;
        boolean p17 = p();
        r45.do2 do2Var = this.f339268d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.getCustom(0);
            if (uz0Var != null) {
                return uz0Var.getInteger(4);
            }
            return 0;
        }
        if (!q() || (n11Var = (r45.n11) do2Var.getCustom(1)) == null) {
            return 0;
        }
        return n11Var.getInteger(4);
    }

    public final boolean g() {
        boolean p17 = p();
        r45.do2 do2Var = this.f339268d;
        if (p17) {
            cu2.g0 g0Var = cu2.g0.f222404a;
            r45.uz0 uz0Var = (r45.uz0) do2Var.getCustom(0);
            if (g0Var.b(uz0Var != null ? uz0Var.getLong(0) : 0L) != null) {
                return true;
            }
        } else if (q()) {
            cu2.g0 g0Var2 = cu2.g0.f222404a;
            r45.n11 n11Var = (r45.n11) do2Var.getCustom(1);
            if (g0Var2.b(n11Var != null ? n11Var.getLong(0) : 0L) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return nr2.m.class.hashCode();
    }

    public final int i() {
        r45.n11 n11Var;
        boolean p17 = p();
        r45.do2 do2Var = this.f339268d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.getCustom(0);
            if (uz0Var != null) {
                return uz0Var.getInteger(10);
            }
            return 0;
        }
        if (!q() || (n11Var = (r45.n11) do2Var.getCustom(1)) == null) {
            return 0;
        }
        return n11Var.getInteger(10);
    }

    public final long j() {
        r45.n11 n11Var;
        boolean p17 = p();
        r45.do2 do2Var = this.f339268d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.getCustom(0);
            if (uz0Var != null) {
                return uz0Var.getLong(8);
            }
            return 0L;
        }
        if (!q() || (n11Var = (r45.n11) do2Var.getCustom(1)) == null) {
            return 0L;
        }
        return n11Var.getLong(8);
    }

    public final java.lang.String k() {
        r45.n11 n11Var;
        java.lang.String string;
        boolean p17 = p();
        r45.do2 do2Var = this.f339268d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.getCustom(0);
            if (uz0Var == null || (string = uz0Var.getString(1)) == null) {
                return "";
            }
        } else if (!q() || (n11Var = (r45.n11) do2Var.getCustom(1)) == null || (string = n11Var.getString(1)) == null) {
            return "";
        }
        return string;
    }

    public final long l() {
        r45.n11 n11Var;
        boolean p17 = p();
        r45.do2 do2Var = this.f339268d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.getCustom(0);
            if (uz0Var != null) {
                return uz0Var.getLong(0);
            }
            return 0L;
        }
        if (!q() || (n11Var = (r45.n11) do2Var.getCustom(1)) == null) {
            return 0L;
        }
        return n11Var.getLong(0);
    }

    public final int n() {
        r45.do2 do2Var = this.f339268d;
        if (do2Var.getInteger(2) != 0) {
            return do2Var.getInteger(2);
        }
        if (p()) {
            return 1;
        }
        return q() ? 2 : 0;
    }

    public final java.lang.String o() {
        r45.n11 n11Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String username;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        boolean p17 = p();
        r45.do2 do2Var = this.f339268d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.getCustom(0);
            if (uz0Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) uz0Var.getCustom(11)) == null || (username = finderContact2.getUsername()) == null) {
                return "";
            }
        } else if (!q() || (n11Var = (r45.n11) do2Var.getCustom(1)) == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) n11Var.getCustom(11)) == null || (username = finderContact.getUsername()) == null) {
            return "";
        }
        return username;
    }

    public final boolean p() {
        r45.uz0 uz0Var = (r45.uz0) this.f339268d.getCustom(0);
        return (uz0Var != null ? uz0Var.getLong(0) : 0L) != 0;
    }

    public final boolean q() {
        r45.n11 n11Var = (r45.n11) this.f339268d.getCustom(1);
        return (n11Var != null ? n11Var.getLong(0) : 0L) != 0;
    }
}
