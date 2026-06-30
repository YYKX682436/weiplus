package r45;

/* loaded from: classes8.dex */
public class xi4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390145d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390146e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390147f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390148g;

    /* renamed from: h, reason: collision with root package name */
    public int f390149h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390150i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xi4)) {
            return false;
        }
        r45.xi4 xi4Var = (r45.xi4) fVar;
        return n51.f.a(this.f390145d, xi4Var.f390145d) && n51.f.a(this.f390146e, xi4Var.f390146e) && n51.f.a(this.f390147f, xi4Var.f390147f) && n51.f.a(this.f390148g, xi4Var.f390148g) && n51.f.a(java.lang.Integer.valueOf(this.f390149h), java.lang.Integer.valueOf(xi4Var.f390149h)) && n51.f.a(this.f390150i, xi4Var.f390150i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390145d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f390146e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f390147f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f390148g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f390149h);
            java.lang.String str5 = this.f390150i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f390145d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f390146e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f390147f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f390148g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f390149h);
            java.lang.String str10 = this.f390150i;
            return str10 != null ? e17 + b36.f.j(6, str10) : e17;
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
        r45.xi4 xi4Var = (r45.xi4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xi4Var.f390145d = aVar2.k(intValue);
                return 0;
            case 2:
                xi4Var.f390146e = aVar2.k(intValue);
                return 0;
            case 3:
                xi4Var.f390147f = aVar2.k(intValue);
                return 0;
            case 4:
                xi4Var.f390148g = aVar2.k(intValue);
                return 0;
            case 5:
                xi4Var.f390149h = aVar2.g(intValue);
                return 0;
            case 6:
                xi4Var.f390150i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
