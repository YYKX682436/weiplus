package r45;

/* loaded from: classes9.dex */
public class p65 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f382797d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382798e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382799f;

    /* renamed from: g, reason: collision with root package name */
    public int f382800g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382801h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382802i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382803m;

    /* renamed from: n, reason: collision with root package name */
    public int f382804n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f382805o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f382806p;

    /* renamed from: q, reason: collision with root package name */
    public long f382807q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f382808r = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p65)) {
            return false;
        }
        r45.p65 p65Var = (r45.p65) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f382797d), java.lang.Integer.valueOf(p65Var.f382797d)) && n51.f.a(this.f382798e, p65Var.f382798e) && n51.f.a(this.f382799f, p65Var.f382799f) && n51.f.a(java.lang.Integer.valueOf(this.f382800g), java.lang.Integer.valueOf(p65Var.f382800g)) && n51.f.a(this.f382801h, p65Var.f382801h) && n51.f.a(this.f382802i, p65Var.f382802i) && n51.f.a(this.f382803m, p65Var.f382803m) && n51.f.a(java.lang.Integer.valueOf(this.f382804n), java.lang.Integer.valueOf(p65Var.f382804n)) && n51.f.a(this.f382805o, p65Var.f382805o) && n51.f.a(this.f382806p, p65Var.f382806p) && n51.f.a(java.lang.Long.valueOf(this.f382807q), java.lang.Long.valueOf(p65Var.f382807q)) && n51.f.a(this.f382808r, p65Var.f382808r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382808r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f382797d);
            java.lang.String str = this.f382798e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f382799f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f382800g);
            java.lang.String str3 = this.f382801h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f382802i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f382803m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f382804n);
            java.lang.String str6 = this.f382805o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f382806p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            fVar.h(11, this.f382807q);
            fVar.g(12, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f382797d) + 0;
            java.lang.String str8 = this.f382798e;
            if (str8 != null) {
                e17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f382799f;
            if (str9 != null) {
                e17 += b36.f.j(3, str9);
            }
            int e18 = e17 + b36.f.e(4, this.f382800g);
            java.lang.String str10 = this.f382801h;
            if (str10 != null) {
                e18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f382802i;
            if (str11 != null) {
                e18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f382803m;
            if (str12 != null) {
                e18 += b36.f.j(7, str12);
            }
            int e19 = e18 + b36.f.e(8, this.f382804n);
            java.lang.String str13 = this.f382805o;
            if (str13 != null) {
                e19 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f382806p;
            if (str14 != null) {
                e19 += b36.f.j(10, str14);
            }
            return e19 + b36.f.h(11, this.f382807q) + b36.f.g(12, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.p65 p65Var = (r45.p65) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p65Var.f382797d = aVar2.g(intValue);
                return 0;
            case 2:
                p65Var.f382798e = aVar2.k(intValue);
                return 0;
            case 3:
                p65Var.f382799f = aVar2.k(intValue);
                return 0;
            case 4:
                p65Var.f382800g = aVar2.g(intValue);
                return 0;
            case 5:
                p65Var.f382801h = aVar2.k(intValue);
                return 0;
            case 6:
                p65Var.f382802i = aVar2.k(intValue);
                return 0;
            case 7:
                p65Var.f382803m = aVar2.k(intValue);
                return 0;
            case 8:
                p65Var.f382804n = aVar2.g(intValue);
                return 0;
            case 9:
                p65Var.f382805o = aVar2.k(intValue);
                return 0;
            case 10:
                p65Var.f382806p = aVar2.k(intValue);
                return 0;
            case 11:
                p65Var.f382807q = aVar2.i(intValue);
                return 0;
            case 12:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.e65 e65Var = new r45.e65();
                    if (bArr2 != null && bArr2.length > 0) {
                        e65Var.parseFrom(bArr2);
                    }
                    p65Var.f382808r.add(e65Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
