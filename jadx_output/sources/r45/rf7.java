package r45;

/* loaded from: classes4.dex */
public class rf7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f384817d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384818e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384819f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384820g;

    /* renamed from: h, reason: collision with root package name */
    public int f384821h;

    /* renamed from: i, reason: collision with root package name */
    public int f384822i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rf7)) {
            return false;
        }
        r45.rf7 rf7Var = (r45.rf7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f384817d), java.lang.Integer.valueOf(rf7Var.f384817d)) && n51.f.a(this.f384818e, rf7Var.f384818e) && n51.f.a(this.f384819f, rf7Var.f384819f) && n51.f.a(this.f384820g, rf7Var.f384820g) && n51.f.a(java.lang.Integer.valueOf(this.f384821h), java.lang.Integer.valueOf(rf7Var.f384821h)) && n51.f.a(java.lang.Integer.valueOf(this.f384822i), java.lang.Integer.valueOf(rf7Var.f384822i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f384817d);
            java.lang.String str = this.f384818e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f384819f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f384820g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f384821h);
            fVar.e(6, this.f384822i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f384817d) + 0;
            java.lang.String str4 = this.f384818e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f384819f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f384820g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            return e17 + b36.f.e(5, this.f384821h) + b36.f.e(6, this.f384822i);
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
        r45.rf7 rf7Var = (r45.rf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rf7Var.f384817d = aVar2.g(intValue);
                return 0;
            case 2:
                rf7Var.f384818e = aVar2.k(intValue);
                return 0;
            case 3:
                rf7Var.f384819f = aVar2.k(intValue);
                return 0;
            case 4:
                rf7Var.f384820g = aVar2.k(intValue);
                return 0;
            case 5:
                rf7Var.f384821h = aVar2.g(intValue);
                return 0;
            case 6:
                rf7Var.f384822i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
