package r45;

/* loaded from: classes2.dex */
public class tk5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f386523d;

    /* renamed from: e, reason: collision with root package name */
    public int f386524e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386525f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386526g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386527h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386528i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386529m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f386530n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f386531o;

    /* renamed from: p, reason: collision with root package name */
    public double f386532p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f386533q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f386534r;

    /* renamed from: s, reason: collision with root package name */
    public r45.wt3 f386535s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f386536t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f386537u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f386538v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f386539w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tk5)) {
            return false;
        }
        r45.tk5 tk5Var = (r45.tk5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386523d), java.lang.Integer.valueOf(tk5Var.f386523d)) && n51.f.a(java.lang.Integer.valueOf(this.f386524e), java.lang.Integer.valueOf(tk5Var.f386524e)) && n51.f.a(this.f386525f, tk5Var.f386525f) && n51.f.a(this.f386526g, tk5Var.f386526g) && n51.f.a(this.f386527h, tk5Var.f386527h) && n51.f.a(this.f386528i, tk5Var.f386528i) && n51.f.a(this.f386529m, tk5Var.f386529m) && n51.f.a(this.f386530n, tk5Var.f386530n) && n51.f.a(this.f386531o, tk5Var.f386531o) && n51.f.a(java.lang.Double.valueOf(this.f386532p), java.lang.Double.valueOf(tk5Var.f386532p)) && n51.f.a(this.f386533q, tk5Var.f386533q) && n51.f.a(this.f386534r, tk5Var.f386534r) && n51.f.a(this.f386535s, tk5Var.f386535s) && n51.f.a(this.f386536t, tk5Var.f386536t) && n51.f.a(this.f386537u, tk5Var.f386537u) && n51.f.a(this.f386538v, tk5Var.f386538v) && n51.f.a(this.f386539w, tk5Var.f386539w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f386523d);
            fVar.e(2, this.f386524e);
            java.lang.String str = this.f386525f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f386526g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f386527h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f386528i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f386529m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f386530n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f386531o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            fVar.c(10, this.f386532p);
            java.lang.String str8 = this.f386533q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f386534r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            r45.wt3 wt3Var = this.f386535s;
            if (wt3Var != null) {
                fVar.i(14, wt3Var.computeSize());
                this.f386535s.writeFields(fVar);
            }
            java.lang.String str10 = this.f386536t;
            if (str10 != null) {
                fVar.j(15, str10);
            }
            java.lang.String str11 = this.f386537u;
            if (str11 != null) {
                fVar.j(16, str11);
            }
            java.lang.String str12 = this.f386538v;
            if (str12 != null) {
                fVar.j(17, str12);
            }
            java.lang.String str13 = this.f386539w;
            if (str13 != null) {
                fVar.j(18, str13);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f386523d) + 0 + b36.f.e(2, this.f386524e);
            java.lang.String str14 = this.f386525f;
            if (str14 != null) {
                e17 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f386526g;
            if (str15 != null) {
                e17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f386527h;
            if (str16 != null) {
                e17 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f386528i;
            if (str17 != null) {
                e17 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f386529m;
            if (str18 != null) {
                e17 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f386530n;
            if (str19 != null) {
                e17 += b36.f.j(8, str19);
            }
            java.lang.String str20 = this.f386531o;
            if (str20 != null) {
                e17 += b36.f.j(9, str20);
            }
            int c17 = e17 + b36.f.c(10, this.f386532p);
            java.lang.String str21 = this.f386533q;
            if (str21 != null) {
                c17 += b36.f.j(11, str21);
            }
            java.lang.String str22 = this.f386534r;
            if (str22 != null) {
                c17 += b36.f.j(12, str22);
            }
            r45.wt3 wt3Var2 = this.f386535s;
            if (wt3Var2 != null) {
                c17 += b36.f.i(14, wt3Var2.computeSize());
            }
            java.lang.String str23 = this.f386536t;
            if (str23 != null) {
                c17 += b36.f.j(15, str23);
            }
            java.lang.String str24 = this.f386537u;
            if (str24 != null) {
                c17 += b36.f.j(16, str24);
            }
            java.lang.String str25 = this.f386538v;
            if (str25 != null) {
                c17 += b36.f.j(17, str25);
            }
            java.lang.String str26 = this.f386539w;
            return str26 != null ? c17 + b36.f.j(18, str26) : c17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.tk5 tk5Var = (r45.tk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tk5Var.f386523d = aVar2.g(intValue);
                return 0;
            case 2:
                tk5Var.f386524e = aVar2.g(intValue);
                return 0;
            case 3:
                tk5Var.f386525f = aVar2.k(intValue);
                return 0;
            case 4:
                tk5Var.f386526g = aVar2.k(intValue);
                return 0;
            case 5:
                tk5Var.f386527h = aVar2.k(intValue);
                return 0;
            case 6:
                tk5Var.f386528i = aVar2.k(intValue);
                return 0;
            case 7:
                tk5Var.f386529m = aVar2.k(intValue);
                return 0;
            case 8:
                tk5Var.f386530n = aVar2.k(intValue);
                return 0;
            case 9:
                tk5Var.f386531o = aVar2.k(intValue);
                return 0;
            case 10:
                tk5Var.f386532p = aVar2.e(intValue);
                return 0;
            case 11:
                tk5Var.f386533q = aVar2.k(intValue);
                return 0;
            case 12:
                tk5Var.f386534r = aVar2.k(intValue);
                return 0;
            case 13:
            default:
                return -1;
            case 14:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.wt3 wt3Var3 = new r45.wt3();
                    if (bArr != null && bArr.length > 0) {
                        wt3Var3.parseFrom(bArr);
                    }
                    tk5Var.f386535s = wt3Var3;
                }
                return 0;
            case 15:
                tk5Var.f386536t = aVar2.k(intValue);
                return 0;
            case 16:
                tk5Var.f386537u = aVar2.k(intValue);
                return 0;
            case 17:
                tk5Var.f386538v = aVar2.k(intValue);
                return 0;
            case 18:
                tk5Var.f386539w = aVar2.k(intValue);
                return 0;
        }
    }
}
