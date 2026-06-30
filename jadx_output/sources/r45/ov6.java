package r45;

/* loaded from: classes8.dex */
public class ov6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382560d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382561e;

    /* renamed from: f, reason: collision with root package name */
    public int f382562f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f382563g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public int f382564h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382565i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382566m;

    /* renamed from: n, reason: collision with root package name */
    public int f382567n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f382568o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f382569p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ov6)) {
            return false;
        }
        r45.ov6 ov6Var = (r45.ov6) fVar;
        return n51.f.a(this.f382560d, ov6Var.f382560d) && n51.f.a(this.f382561e, ov6Var.f382561e) && n51.f.a(java.lang.Integer.valueOf(this.f382562f), java.lang.Integer.valueOf(ov6Var.f382562f)) && n51.f.a(this.f382563g, ov6Var.f382563g) && n51.f.a(java.lang.Integer.valueOf(this.f382564h), java.lang.Integer.valueOf(ov6Var.f382564h)) && n51.f.a(this.f382565i, ov6Var.f382565i) && n51.f.a(this.f382566m, ov6Var.f382566m) && n51.f.a(java.lang.Integer.valueOf(this.f382567n), java.lang.Integer.valueOf(ov6Var.f382567n)) && n51.f.a(this.f382568o, ov6Var.f382568o) && n51.f.a(this.f382569p, ov6Var.f382569p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382563g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382560d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f382561e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f382562f);
            fVar.g(4, 8, linkedList);
            fVar.e(5, this.f382564h);
            java.lang.String str3 = this.f382565i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f382566m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f382567n);
            java.lang.String str5 = this.f382568o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f382569p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f382560d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f382561e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int e17 = j17 + b36.f.e(3, this.f382562f) + b36.f.g(4, 8, linkedList) + b36.f.e(5, this.f382564h);
            java.lang.String str9 = this.f382565i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f382566m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            int e18 = e17 + b36.f.e(8, this.f382567n);
            java.lang.String str11 = this.f382568o;
            if (str11 != null) {
                e18 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f382569p;
            return str12 != null ? e18 + b36.f.j(10, str12) : e18;
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
        r45.ov6 ov6Var = (r45.ov6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ov6Var.f382560d = aVar2.k(intValue);
                return 0;
            case 2:
                ov6Var.f382561e = aVar2.k(intValue);
                return 0;
            case 3:
                ov6Var.f382562f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.pv6 pv6Var = new r45.pv6();
                    if (bArr2 != null && bArr2.length > 0) {
                        pv6Var.parseFrom(bArr2);
                    }
                    ov6Var.f382563g.add(pv6Var);
                }
                return 0;
            case 5:
                ov6Var.f382564h = aVar2.g(intValue);
                return 0;
            case 6:
                ov6Var.f382565i = aVar2.k(intValue);
                return 0;
            case 7:
                ov6Var.f382566m = aVar2.k(intValue);
                return 0;
            case 8:
                ov6Var.f382567n = aVar2.g(intValue);
                return 0;
            case 9:
                ov6Var.f382568o = aVar2.k(intValue);
                return 0;
            case 10:
                ov6Var.f382569p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
