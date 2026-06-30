package r45;

/* loaded from: classes7.dex */
public class u87 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f387138d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387139e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f387140f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f387141g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f387142h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f387143i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f387144m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f387145n = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u87)) {
            return false;
        }
        r45.u87 u87Var = (r45.u87) fVar;
        return n51.f.a(this.BaseRequest, u87Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f387138d), java.lang.Integer.valueOf(u87Var.f387138d)) && n51.f.a(this.f387139e, u87Var.f387139e) && n51.f.a(this.f387140f, u87Var.f387140f) && n51.f.a(java.lang.Integer.valueOf(this.f387141g), java.lang.Integer.valueOf(u87Var.f387141g)) && n51.f.a(java.lang.Integer.valueOf(this.f387142h), java.lang.Integer.valueOf(u87Var.f387142h)) && n51.f.a(java.lang.Integer.valueOf(this.f387143i), java.lang.Integer.valueOf(u87Var.f387143i)) && n51.f.a(java.lang.Integer.valueOf(this.f387144m), java.lang.Integer.valueOf(u87Var.f387144m)) && n51.f.a(java.lang.Integer.valueOf(this.f387145n), java.lang.Integer.valueOf(u87Var.f387145n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387140f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f387138d);
            java.lang.String str = this.f387139e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            fVar.e(5, this.f387141g);
            fVar.e(6, this.f387142h);
            fVar.e(7, this.f387143i);
            fVar.e(8, this.f387144m);
            fVar.e(9, this.f387145n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f387138d);
            java.lang.String str2 = this.f387139e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.g(4, 8, linkedList) + b36.f.e(5, this.f387141g) + b36.f.e(6, this.f387142h) + b36.f.e(7, this.f387143i) + b36.f.e(8, this.f387144m) + b36.f.e(9, this.f387145n);
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
        r45.u87 u87Var = (r45.u87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    u87Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                u87Var.f387138d = aVar2.g(intValue);
                return 0;
            case 3:
                u87Var.f387139e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.w87 w87Var = new r45.w87();
                    if (bArr3 != null && bArr3.length > 0) {
                        w87Var.parseFrom(bArr3);
                    }
                    u87Var.f387140f.add(w87Var);
                }
                return 0;
            case 5:
                u87Var.f387141g = aVar2.g(intValue);
                return 0;
            case 6:
                u87Var.f387142h = aVar2.g(intValue);
                return 0;
            case 7:
                u87Var.f387143i = aVar2.g(intValue);
                return 0;
            case 8:
                u87Var.f387144m = aVar2.g(intValue);
                return 0;
            case 9:
                u87Var.f387145n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
