package r45;

/* loaded from: classes2.dex */
public class pn0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383213d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383214e;

    /* renamed from: f, reason: collision with root package name */
    public long f383215f;

    /* renamed from: h, reason: collision with root package name */
    public int f383217h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383218i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f383219m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f383220n;

    /* renamed from: p, reason: collision with root package name */
    public int f383222p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f383223q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f383224r;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f383216g = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f383221o = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pn0)) {
            return false;
        }
        r45.pn0 pn0Var = (r45.pn0) fVar;
        return n51.f.a(this.f383213d, pn0Var.f383213d) && n51.f.a(this.f383214e, pn0Var.f383214e) && n51.f.a(java.lang.Long.valueOf(this.f383215f), java.lang.Long.valueOf(pn0Var.f383215f)) && n51.f.a(this.f383216g, pn0Var.f383216g) && n51.f.a(java.lang.Integer.valueOf(this.f383217h), java.lang.Integer.valueOf(pn0Var.f383217h)) && n51.f.a(this.f383218i, pn0Var.f383218i) && n51.f.a(this.f383219m, pn0Var.f383219m) && n51.f.a(this.f383220n, pn0Var.f383220n) && n51.f.a(this.f383221o, pn0Var.f383221o) && n51.f.a(java.lang.Integer.valueOf(this.f383222p), java.lang.Integer.valueOf(pn0Var.f383222p)) && n51.f.a(this.f383223q, pn0Var.f383223q) && n51.f.a(this.f383224r, pn0Var.f383224r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383221o;
        java.util.LinkedList linkedList2 = this.f383216g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383213d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f383214e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f383215f);
            fVar.g(4, 8, linkedList2);
            fVar.e(5, this.f383217h);
            java.lang.String str3 = this.f383218i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f383219m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f383220n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.g(9, 1, linkedList);
            fVar.e(10, this.f383222p);
            java.lang.String str6 = this.f383223q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f383224r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f383213d;
            int j17 = str8 != null ? b36.f.j(1, str8) + 0 : 0;
            java.lang.String str9 = this.f383214e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int h17 = j17 + b36.f.h(3, this.f383215f) + b36.f.g(4, 8, linkedList2) + b36.f.e(5, this.f383217h);
            java.lang.String str10 = this.f383218i;
            if (str10 != null) {
                h17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f383219m;
            if (str11 != null) {
                h17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f383220n;
            if (str12 != null) {
                h17 += b36.f.j(8, str12);
            }
            int g17 = h17 + b36.f.g(9, 1, linkedList) + b36.f.e(10, this.f383222p);
            java.lang.String str13 = this.f383223q;
            if (str13 != null) {
                g17 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f383224r;
            return str14 != null ? g17 + b36.f.j(12, str14) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.pn0 pn0Var = (r45.pn0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pn0Var.f383213d = aVar2.k(intValue);
                return 0;
            case 2:
                pn0Var.f383214e = aVar2.k(intValue);
                return 0;
            case 3:
                pn0Var.f383215f = aVar2.i(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.yl ylVar = new r45.yl();
                    if (bArr2 != null && bArr2.length > 0) {
                        ylVar.parseFrom(bArr2);
                    }
                    pn0Var.f383216g.add(ylVar);
                }
                return 0;
            case 5:
                pn0Var.f383217h = aVar2.g(intValue);
                return 0;
            case 6:
                pn0Var.f383218i = aVar2.k(intValue);
                return 0;
            case 7:
                pn0Var.f383219m = aVar2.k(intValue);
                return 0;
            case 8:
                pn0Var.f383220n = aVar2.k(intValue);
                return 0;
            case 9:
                pn0Var.f383221o.add(aVar2.k(intValue));
                return 0;
            case 10:
                pn0Var.f383222p = aVar2.g(intValue);
                return 0;
            case 11:
                pn0Var.f383223q = aVar2.k(intValue);
                return 0;
            case 12:
                pn0Var.f383224r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
