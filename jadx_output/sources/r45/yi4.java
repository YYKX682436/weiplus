package r45;

/* loaded from: classes8.dex */
public class yi4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391126d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391127e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391128f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391129g;

    /* renamed from: i, reason: collision with root package name */
    public float f391131i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f391132m;

    /* renamed from: n, reason: collision with root package name */
    public int f391133n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f391134o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f391135p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f391136q;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f391130h = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f391137r = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yi4)) {
            return false;
        }
        r45.yi4 yi4Var = (r45.yi4) fVar;
        return n51.f.a(this.f391126d, yi4Var.f391126d) && n51.f.a(this.f391127e, yi4Var.f391127e) && n51.f.a(this.f391128f, yi4Var.f391128f) && n51.f.a(this.f391129g, yi4Var.f391129g) && n51.f.a(this.f391130h, yi4Var.f391130h) && n51.f.a(java.lang.Float.valueOf(this.f391131i), java.lang.Float.valueOf(yi4Var.f391131i)) && n51.f.a(this.f391132m, yi4Var.f391132m) && n51.f.a(java.lang.Integer.valueOf(this.f391133n), java.lang.Integer.valueOf(yi4Var.f391133n)) && n51.f.a(this.f391134o, yi4Var.f391134o) && n51.f.a(java.lang.Boolean.valueOf(this.f391135p), java.lang.Boolean.valueOf(yi4Var.f391135p)) && n51.f.a(this.f391136q, yi4Var.f391136q) && n51.f.a(this.f391137r, yi4Var.f391137r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391137r;
        java.util.LinkedList linkedList2 = this.f391130h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391126d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f391127e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f391128f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f391129g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.g(5, 1, linkedList2);
            fVar.d(6, this.f391131i);
            java.lang.String str5 = this.f391132m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f391133n);
            java.lang.String str6 = this.f391134o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            fVar.a(10, this.f391135p);
            java.lang.String str7 = this.f391136q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            fVar.g(12, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f391126d;
            int j17 = str8 != null ? b36.f.j(1, str8) + 0 : 0;
            java.lang.String str9 = this.f391127e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f391128f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f391129g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            int g17 = j17 + b36.f.g(5, 1, linkedList2) + b36.f.d(6, this.f391131i);
            java.lang.String str12 = this.f391132m;
            if (str12 != null) {
                g17 += b36.f.j(7, str12);
            }
            int e17 = g17 + b36.f.e(8, this.f391133n);
            java.lang.String str13 = this.f391134o;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            int a17 = e17 + b36.f.a(10, this.f391135p);
            java.lang.String str14 = this.f391136q;
            if (str14 != null) {
                a17 += b36.f.j(11, str14);
            }
            return a17 + b36.f.g(12, 1, linkedList);
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
        r45.yi4 yi4Var = (r45.yi4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                yi4Var.f391126d = aVar2.k(intValue);
                return 0;
            case 2:
                yi4Var.f391127e = aVar2.k(intValue);
                return 0;
            case 3:
                yi4Var.f391128f = aVar2.k(intValue);
                return 0;
            case 4:
                yi4Var.f391129g = aVar2.k(intValue);
                return 0;
            case 5:
                yi4Var.f391130h.add(aVar2.k(intValue));
                return 0;
            case 6:
                yi4Var.f391131i = aVar2.f(intValue);
                return 0;
            case 7:
                yi4Var.f391132m = aVar2.k(intValue);
                return 0;
            case 8:
                yi4Var.f391133n = aVar2.g(intValue);
                return 0;
            case 9:
                yi4Var.f391134o = aVar2.k(intValue);
                return 0;
            case 10:
                yi4Var.f391135p = aVar2.c(intValue);
                return 0;
            case 11:
                yi4Var.f391136q = aVar2.k(intValue);
                return 0;
            case 12:
                yi4Var.f391137r.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }
}
