package r45;

/* loaded from: classes11.dex */
public class qk0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f384069d;

    /* renamed from: e, reason: collision with root package name */
    public int f384070e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384071f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384072g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f384073h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f384074i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f384075m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f384076n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qk0)) {
            return false;
        }
        r45.qk0 qk0Var = (r45.qk0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f384069d), java.lang.Integer.valueOf(qk0Var.f384069d)) && n51.f.a(java.lang.Integer.valueOf(this.f384070e), java.lang.Integer.valueOf(qk0Var.f384070e)) && n51.f.a(this.f384071f, qk0Var.f384071f) && n51.f.a(this.f384072g, qk0Var.f384072g) && n51.f.a(this.f384073h, qk0Var.f384073h) && n51.f.a(this.f384074i, qk0Var.f384074i) && n51.f.a(this.f384075m, qk0Var.f384075m) && n51.f.a(this.f384076n, qk0Var.f384076n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f384069d);
            fVar.e(2, this.f384070e);
            java.lang.String str = this.f384071f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f384072g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f384073h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f384074i;
            if (gVar2 != null) {
                fVar.b(6, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f384075m;
            if (gVar3 != null) {
                fVar.b(7, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f384076n;
            if (gVar4 != null) {
                fVar.b(8, gVar4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f384069d) + 0 + b36.f.e(2, this.f384070e);
            java.lang.String str3 = this.f384071f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f384072g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            com.tencent.mm.protobuf.g gVar5 = this.f384073h;
            if (gVar5 != null) {
                e17 += b36.f.b(5, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f384074i;
            if (gVar6 != null) {
                e17 += b36.f.b(6, gVar6);
            }
            com.tencent.mm.protobuf.g gVar7 = this.f384075m;
            if (gVar7 != null) {
                e17 += b36.f.b(7, gVar7);
            }
            com.tencent.mm.protobuf.g gVar8 = this.f384076n;
            return gVar8 != null ? e17 + b36.f.b(8, gVar8) : e17;
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
        r45.qk0 qk0Var = (r45.qk0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qk0Var.f384069d = aVar2.g(intValue);
                return 0;
            case 2:
                qk0Var.f384070e = aVar2.g(intValue);
                return 0;
            case 3:
                qk0Var.f384071f = aVar2.k(intValue);
                return 0;
            case 4:
                qk0Var.f384072g = aVar2.k(intValue);
                return 0;
            case 5:
                qk0Var.f384073h = aVar2.d(intValue);
                return 0;
            case 6:
                qk0Var.f384074i = aVar2.d(intValue);
                return 0;
            case 7:
                qk0Var.f384075m = aVar2.d(intValue);
                return 0;
            case 8:
                qk0Var.f384076n = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
