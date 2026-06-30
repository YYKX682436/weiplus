package r45;

/* loaded from: classes4.dex */
public class nn2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381524d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381525e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381526f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381527g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381528h;

    /* renamed from: i, reason: collision with root package name */
    public int f381529i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nn2)) {
            return false;
        }
        r45.nn2 nn2Var = (r45.nn2) fVar;
        return n51.f.a(this.f381524d, nn2Var.f381524d) && n51.f.a(this.f381525e, nn2Var.f381525e) && n51.f.a(this.f381526f, nn2Var.f381526f) && n51.f.a(this.f381527g, nn2Var.f381527g) && n51.f.a(this.f381528h, nn2Var.f381528h) && n51.f.a(java.lang.Integer.valueOf(this.f381529i), java.lang.Integer.valueOf(nn2Var.f381529i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381524d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f381525e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f381526f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f381527g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f381528h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f381529i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f381524d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f381525e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f381526f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f381527g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f381528h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            return j17 + b36.f.e(6, this.f381529i);
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
        r45.nn2 nn2Var = (r45.nn2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nn2Var.f381524d = aVar2.k(intValue);
                return 0;
            case 2:
                nn2Var.f381525e = aVar2.k(intValue);
                return 0;
            case 3:
                nn2Var.f381526f = aVar2.k(intValue);
                return 0;
            case 4:
                nn2Var.f381527g = aVar2.k(intValue);
                return 0;
            case 5:
                nn2Var.f381528h = aVar2.k(intValue);
                return 0;
            case 6:
                nn2Var.f381529i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
