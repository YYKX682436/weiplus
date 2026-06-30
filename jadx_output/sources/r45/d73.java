package r45;

/* loaded from: classes7.dex */
public class d73 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372194d;

    /* renamed from: e, reason: collision with root package name */
    public int f372195e;

    /* renamed from: f, reason: collision with root package name */
    public int f372196f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372197g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372198h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372199i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f372200m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d73)) {
            return false;
        }
        r45.d73 d73Var = (r45.d73) fVar;
        return n51.f.a(this.f372194d, d73Var.f372194d) && n51.f.a(java.lang.Integer.valueOf(this.f372195e), java.lang.Integer.valueOf(d73Var.f372195e)) && n51.f.a(java.lang.Integer.valueOf(this.f372196f), java.lang.Integer.valueOf(d73Var.f372196f)) && n51.f.a(this.f372197g, d73Var.f372197g) && n51.f.a(this.f372198h, d73Var.f372198h) && n51.f.a(this.f372199i, d73Var.f372199i) && n51.f.a(this.f372200m, d73Var.f372200m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372194d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f372195e);
            fVar.e(3, this.f372196f);
            com.tencent.mm.protobuf.g gVar = this.f372197g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str2 = this.f372198h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f372199i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f372200m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f372194d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f372195e) + b36.f.e(3, this.f372196f);
            com.tencent.mm.protobuf.g gVar2 = this.f372197g;
            if (gVar2 != null) {
                j17 += b36.f.b(4, gVar2);
            }
            java.lang.String str6 = this.f372198h;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f372199i;
            if (str7 != null) {
                j17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f372200m;
            return str8 != null ? j17 + b36.f.j(8, str8) : j17;
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
        r45.d73 d73Var = (r45.d73) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d73Var.f372194d = aVar2.k(intValue);
                return 0;
            case 2:
                d73Var.f372195e = aVar2.g(intValue);
                return 0;
            case 3:
                d73Var.f372196f = aVar2.g(intValue);
                return 0;
            case 4:
                d73Var.f372197g = aVar2.d(intValue);
                return 0;
            case 5:
                d73Var.f372198h = aVar2.k(intValue);
                return 0;
            case 6:
                d73Var.f372199i = aVar2.k(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                d73Var.f372200m = aVar2.k(intValue);
                return 0;
        }
    }
}
