package r45;

/* loaded from: classes2.dex */
public class k95 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378511d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378512e;

    /* renamed from: f, reason: collision with root package name */
    public float f378513f;

    /* renamed from: g, reason: collision with root package name */
    public float f378514g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378515h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378516i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k95)) {
            return false;
        }
        r45.k95 k95Var = (r45.k95) fVar;
        return n51.f.a(this.f378511d, k95Var.f378511d) && n51.f.a(this.f378512e, k95Var.f378512e) && n51.f.a(java.lang.Float.valueOf(this.f378513f), java.lang.Float.valueOf(k95Var.f378513f)) && n51.f.a(java.lang.Float.valueOf(this.f378514g), java.lang.Float.valueOf(k95Var.f378514g)) && n51.f.a(this.f378515h, k95Var.f378515h) && n51.f.a(this.f378516i, k95Var.f378516i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378511d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378512e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.d(3, this.f378513f);
            fVar.d(4, this.f378514g);
            java.lang.String str3 = this.f378515h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f378516i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f378511d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f378512e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int d17 = j17 + b36.f.d(3, this.f378513f) + b36.f.d(4, this.f378514g);
            java.lang.String str7 = this.f378515h;
            if (str7 != null) {
                d17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f378516i;
            return str8 != null ? d17 + b36.f.j(6, str8) : d17;
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
        r45.k95 k95Var = (r45.k95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k95Var.f378511d = aVar2.k(intValue);
                return 0;
            case 2:
                k95Var.f378512e = aVar2.k(intValue);
                return 0;
            case 3:
                k95Var.f378513f = aVar2.f(intValue);
                return 0;
            case 4:
                k95Var.f378514g = aVar2.f(intValue);
                return 0;
            case 5:
                k95Var.f378515h = aVar2.k(intValue);
                return 0;
            case 6:
                k95Var.f378516i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
