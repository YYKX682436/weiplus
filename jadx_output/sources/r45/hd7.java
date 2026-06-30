package r45;

/* loaded from: classes7.dex */
public class hd7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376069d;

    /* renamed from: e, reason: collision with root package name */
    public int f376070e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376071f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376072g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376073h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376074i;

    /* renamed from: m, reason: collision with root package name */
    public int f376075m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hd7)) {
            return false;
        }
        r45.hd7 hd7Var = (r45.hd7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376069d), java.lang.Integer.valueOf(hd7Var.f376069d)) && n51.f.a(java.lang.Integer.valueOf(this.f376070e), java.lang.Integer.valueOf(hd7Var.f376070e)) && n51.f.a(this.f376071f, hd7Var.f376071f) && n51.f.a(this.f376072g, hd7Var.f376072g) && n51.f.a(this.f376073h, hd7Var.f376073h) && n51.f.a(this.f376074i, hd7Var.f376074i) && n51.f.a(java.lang.Integer.valueOf(this.f376075m), java.lang.Integer.valueOf(hd7Var.f376075m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376069d);
            fVar.e(2, this.f376070e);
            java.lang.String str = this.f376071f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f376072g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f376073h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f376074i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f376075m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f376069d) + 0 + b36.f.e(2, this.f376070e);
            java.lang.String str5 = this.f376071f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f376072g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f376073h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f376074i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            return e17 + b36.f.e(7, this.f376075m);
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
        r45.hd7 hd7Var = (r45.hd7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hd7Var.f376069d = aVar2.g(intValue);
                return 0;
            case 2:
                hd7Var.f376070e = aVar2.g(intValue);
                return 0;
            case 3:
                hd7Var.f376071f = aVar2.k(intValue);
                return 0;
            case 4:
                hd7Var.f376072g = aVar2.k(intValue);
                return 0;
            case 5:
                hd7Var.f376073h = aVar2.k(intValue);
                return 0;
            case 6:
                hd7Var.f376074i = aVar2.k(intValue);
                return 0;
            case 7:
                hd7Var.f376075m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
