package r45;

/* loaded from: classes7.dex */
public class qp5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384183d;

    /* renamed from: e, reason: collision with root package name */
    public int f384184e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384185f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384186g;

    /* renamed from: h, reason: collision with root package name */
    public int f384187h;

    /* renamed from: i, reason: collision with root package name */
    public int f384188i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384189m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f384190n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f384191o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qp5)) {
            return false;
        }
        r45.qp5 qp5Var = (r45.qp5) fVar;
        return n51.f.a(this.f384183d, qp5Var.f384183d) && n51.f.a(java.lang.Integer.valueOf(this.f384184e), java.lang.Integer.valueOf(qp5Var.f384184e)) && n51.f.a(this.f384185f, qp5Var.f384185f) && n51.f.a(this.f384186g, qp5Var.f384186g) && n51.f.a(java.lang.Integer.valueOf(this.f384187h), java.lang.Integer.valueOf(qp5Var.f384187h)) && n51.f.a(java.lang.Integer.valueOf(this.f384188i), java.lang.Integer.valueOf(qp5Var.f384188i)) && n51.f.a(this.f384189m, qp5Var.f384189m) && n51.f.a(this.f384190n, qp5Var.f384190n) && n51.f.a(this.f384191o, qp5Var.f384191o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384183d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f384184e);
            java.lang.String str2 = this.f384185f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f384186g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f384187h);
            fVar.e(6, this.f384188i);
            java.lang.String str4 = this.f384189m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f384190n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f384191o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f384183d;
            int j17 = (str7 != null ? 0 + b36.f.j(1, str7) : 0) + b36.f.e(2, this.f384184e);
            java.lang.String str8 = this.f384185f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f384186g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f384187h) + b36.f.e(6, this.f384188i);
            java.lang.String str10 = this.f384189m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f384190n;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f384191o;
            return str12 != null ? e17 + b36.f.j(9, str12) : e17;
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
        r45.qp5 qp5Var = (r45.qp5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qp5Var.f384183d = aVar2.k(intValue);
                return 0;
            case 2:
                qp5Var.f384184e = aVar2.g(intValue);
                return 0;
            case 3:
                qp5Var.f384185f = aVar2.k(intValue);
                return 0;
            case 4:
                qp5Var.f384186g = aVar2.k(intValue);
                return 0;
            case 5:
                qp5Var.f384187h = aVar2.g(intValue);
                return 0;
            case 6:
                qp5Var.f384188i = aVar2.g(intValue);
                return 0;
            case 7:
                qp5Var.f384189m = aVar2.k(intValue);
                return 0;
            case 8:
                qp5Var.f384190n = aVar2.k(intValue);
                return 0;
            case 9:
                qp5Var.f384191o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
