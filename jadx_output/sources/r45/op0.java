package r45;

/* loaded from: classes9.dex */
public class op0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382407d;

    /* renamed from: e, reason: collision with root package name */
    public int f382408e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382409f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382410g;

    /* renamed from: h, reason: collision with root package name */
    public int f382411h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382412i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382413m;

    /* renamed from: n, reason: collision with root package name */
    public int f382414n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f382415o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f382416p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f382417q;

    /* renamed from: r, reason: collision with root package name */
    public int f382418r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f382419s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f382420t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.LinkedList f382421u = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.op0)) {
            return false;
        }
        r45.op0 op0Var = (r45.op0) fVar;
        return n51.f.a(this.f382407d, op0Var.f382407d) && n51.f.a(java.lang.Integer.valueOf(this.f382408e), java.lang.Integer.valueOf(op0Var.f382408e)) && n51.f.a(this.f382409f, op0Var.f382409f) && n51.f.a(this.f382410g, op0Var.f382410g) && n51.f.a(java.lang.Integer.valueOf(this.f382411h), java.lang.Integer.valueOf(op0Var.f382411h)) && n51.f.a(this.f382412i, op0Var.f382412i) && n51.f.a(this.f382413m, op0Var.f382413m) && n51.f.a(java.lang.Integer.valueOf(this.f382414n), java.lang.Integer.valueOf(op0Var.f382414n)) && n51.f.a(this.f382415o, op0Var.f382415o) && n51.f.a(this.f382416p, op0Var.f382416p) && n51.f.a(this.f382417q, op0Var.f382417q) && n51.f.a(java.lang.Integer.valueOf(this.f382418r), java.lang.Integer.valueOf(op0Var.f382418r)) && n51.f.a(java.lang.Boolean.valueOf(this.f382419s), java.lang.Boolean.valueOf(op0Var.f382419s)) && n51.f.a(java.lang.Boolean.valueOf(this.f382420t), java.lang.Boolean.valueOf(op0Var.f382420t)) && n51.f.a(this.f382421u, op0Var.f382421u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382407d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f382408e);
            java.lang.String str2 = this.f382409f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f382410g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f382411h);
            java.lang.String str4 = this.f382412i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f382413m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f382414n);
            java.lang.String str6 = this.f382415o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f382416p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f382417q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            fVar.e(12, this.f382418r);
            fVar.a(13, this.f382419s);
            fVar.a(14, this.f382420t);
            fVar.g(15, 8, this.f382421u);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f382407d;
            int j17 = (str9 != null ? b36.f.j(1, str9) + 0 : 0) + b36.f.e(2, this.f382408e);
            java.lang.String str10 = this.f382409f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f382410g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            int e17 = j17 + b36.f.e(5, this.f382411h);
            java.lang.String str12 = this.f382412i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f382413m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            int e18 = e17 + b36.f.e(8, this.f382414n);
            java.lang.String str14 = this.f382415o;
            if (str14 != null) {
                e18 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f382416p;
            if (str15 != null) {
                e18 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f382417q;
            if (str16 != null) {
                e18 += b36.f.j(11, str16);
            }
            return e18 + b36.f.e(12, this.f382418r) + b36.f.a(13, this.f382419s) + b36.f.a(14, this.f382420t) + b36.f.g(15, 8, this.f382421u);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f382421u.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.op0 op0Var = (r45.op0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                op0Var.f382407d = aVar2.k(intValue);
                return 0;
            case 2:
                op0Var.f382408e = aVar2.g(intValue);
                return 0;
            case 3:
                op0Var.f382409f = aVar2.k(intValue);
                return 0;
            case 4:
                op0Var.f382410g = aVar2.k(intValue);
                return 0;
            case 5:
                op0Var.f382411h = aVar2.g(intValue);
                return 0;
            case 6:
                op0Var.f382412i = aVar2.k(intValue);
                return 0;
            case 7:
                op0Var.f382413m = aVar2.k(intValue);
                return 0;
            case 8:
                op0Var.f382414n = aVar2.g(intValue);
                return 0;
            case 9:
                op0Var.f382415o = aVar2.k(intValue);
                return 0;
            case 10:
                op0Var.f382416p = aVar2.k(intValue);
                return 0;
            case 11:
                op0Var.f382417q = aVar2.k(intValue);
                return 0;
            case 12:
                op0Var.f382418r = aVar2.g(intValue);
                return 0;
            case 13:
                op0Var.f382419s = aVar2.c(intValue);
                return 0;
            case 14:
                op0Var.f382420t = aVar2.c(intValue);
                return 0;
            case 15:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.np0 np0Var = new r45.np0();
                    if (bArr2 != null && bArr2.length > 0) {
                        np0Var.parseFrom(bArr2);
                    }
                    op0Var.f382421u.add(np0Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
