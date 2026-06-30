package dk2;

/* loaded from: classes3.dex */
public final class u implements dk2.zf {

    /* renamed from: a, reason: collision with root package name */
    public final r45.t12 f234136a;

    /* renamed from: b, reason: collision with root package name */
    public int f234137b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f234138c;

    public u(r45.t12 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f234136a = msg;
        this.f234137b = 1;
    }

    @Override // dk2.zf
    public r45.xn1 C() {
        return (r45.xn1) this.f234136a.getCustom(11);
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        return null;
    }

    @Override // dk2.zf
    public java.lang.String a() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.xn1 xn1Var = (r45.xn1) this.f234136a.getCustom(8);
        if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) {
            return null;
        }
        return finderContact.getUsername();
    }

    @Override // dk2.zf
    public java.lang.String f() {
        java.lang.String string = this.f234136a.getString(9);
        return string == null ? "" : string;
    }

    @Override // dk2.zf
    public int getType() {
        return this.f234136a.getInteger(3);
    }

    @Override // dk2.zf
    public int i() {
        return this.f234136a.getInteger(17);
    }

    @Override // dk2.zf
    public java.lang.String j() {
        return this.f234136a.getString(2);
    }

    @Override // dk2.zf
    public java.lang.String k() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.xn1 xn1Var = (r45.xn1) this.f234136a.getCustom(8);
        if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) {
            return null;
        }
        return finderContact.getNickname();
    }

    @Override // dk2.zf
    public boolean l() {
        return this.f234136a.getInteger(12) == 1;
    }

    @Override // dk2.zf
    public long m() {
        return this.f234136a.getLong(5);
    }

    @Override // dk2.zf
    public boolean n() {
        return this.f234136a.getBoolean(15);
    }

    @Override // dk2.zf
    public int p() {
        return this.f234136a.getInteger(13);
    }

    @Override // dk2.zf
    public r45.xn1 r() {
        return (r45.xn1) this.f234136a.getCustom(8);
    }

    @Override // dk2.zf
    public java.lang.String u() {
        return "";
    }

    @Override // dk2.zf
    public java.lang.String v() {
        java.lang.String string = this.f234136a.getString(6);
        return string == null ? "" : string;
    }

    @Override // dk2.zf
    public java.lang.String y() {
        return "";
    }

    @Override // dk2.zf
    public int z() {
        return this.f234136a.getInteger(16);
    }
}
