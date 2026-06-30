package dk2;

/* loaded from: classes3.dex */
public class mf implements dk2.zf, dk2.cg, dk2.ag, dk2.bg {

    /* renamed from: j, reason: collision with root package name */
    public static final dk2.lf f233772j = new dk2.lf(null);

    /* renamed from: a, reason: collision with root package name */
    public final r45.t12 f233773a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f233774b;

    /* renamed from: c, reason: collision with root package name */
    public int f233775c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f233776d;

    /* renamed from: e, reason: collision with root package name */
    public int f233777e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f233778f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f233779g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f233780h;

    /* renamed from: i, reason: collision with root package name */
    public r45.oj1 f233781i;

    public mf(r45.t12 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f233773a = msg;
        this.f233774b = "";
        this.f233780h = "";
    }

    @Override // dk2.eg
    public boolean A() {
        return this.f233776d;
    }

    @Override // dk2.cg
    public void B(boolean z17) {
        this.f233779g = z17;
    }

    @Override // dk2.zf
    public r45.xn1 C() {
        return (r45.xn1) this.f233773a.getCustom(11);
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        return null;
    }

    @Override // dk2.zf
    public java.lang.String a() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.xn1 xn1Var = (r45.xn1) this.f233773a.getCustom(8);
        if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) {
            return null;
        }
        return finderContact.getUsername();
    }

    public final boolean b() {
        return this.f233775c == 106;
    }

    @Override // dk2.eg
    public void c(boolean z17) {
        this.f233776d = z17;
    }

    @Override // dk2.cg
    public void d(boolean z17) {
        this.f233778f = z17;
    }

    @Override // dk2.zf
    public java.lang.String f() {
        java.lang.String string = this.f233773a.getString(9);
        return string == null ? "" : string;
    }

    @Override // dk2.cg
    public boolean g() {
        return this.f233779g;
    }

    @Override // dk2.zf
    public int getType() {
        return this.f233773a.getInteger(3);
    }

    @Override // dk2.zf
    public int h() {
        return this.f233775c;
    }

    @Override // dk2.zf
    public int i() {
        return this.f233773a.getInteger(17);
    }

    @Override // dk2.zf
    public java.lang.String j() {
        return this.f233773a.getString(2);
    }

    @Override // dk2.zf
    public java.lang.String k() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.xn1 xn1Var = (r45.xn1) this.f233773a.getCustom(8);
        if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) {
            return null;
        }
        return finderContact.getNickname();
    }

    @Override // dk2.zf
    public boolean l() {
        return this.f233773a.getInteger(12) == 1;
    }

    @Override // dk2.zf
    public long m() {
        return this.f233773a.getLong(5);
    }

    @Override // dk2.zf
    public boolean n() {
        return this.f233773a.getBoolean(15);
    }

    @Override // dk2.cg
    public boolean o() {
        return this.f233778f;
    }

    @Override // dk2.zf
    public int p() {
        return this.f233773a.getInteger(13);
    }

    public final void q(com.tencent.mm.protocal.protobuf.FinderContact finderContact, int i17) {
        r45.t12 t12Var = this.f233773a;
        if (((r45.xn1) t12Var.getCustom(8)) == null) {
            t12Var.set(8, new r45.xn1());
        }
        r45.xn1 xn1Var = (r45.xn1) t12Var.getCustom(8);
        if (xn1Var != null) {
            if (finderContact != null) {
                xn1Var.set(0, finderContact);
            }
            xn1Var.set(7, java.lang.Integer.valueOf(i17));
        }
        if (finderContact != null) {
            t12Var.set(0, finderContact.getNickname());
        }
    }

    @Override // dk2.zf
    public r45.xn1 r() {
        return (r45.xn1) this.f233773a.getCustom(8);
    }

    @Override // dk2.cg
    public int s() {
        return this.f233777e;
    }

    @Override // dk2.zf
    public java.lang.String u() {
        return "";
    }

    @Override // dk2.zf
    public java.lang.String v() {
        java.lang.String string = this.f233773a.getString(6);
        return string == null ? "" : string;
    }

    @Override // dk2.cg
    public void w(int i17) {
        this.f233777e = i17;
    }

    @Override // dk2.zf
    public java.lang.String x() {
        return this.f233774b;
    }

    @Override // dk2.zf
    public java.lang.String y() {
        return "";
    }

    @Override // dk2.zf
    public int z() {
        return this.f233773a.getInteger(16);
    }
}
