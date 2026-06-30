package r45;

/* loaded from: classes12.dex */
public class rg3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384826d;

    /* renamed from: e, reason: collision with root package name */
    public int f384827e;

    /* renamed from: f, reason: collision with root package name */
    public int f384828f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384829g;

    /* renamed from: h, reason: collision with root package name */
    public int f384830h;

    /* renamed from: i, reason: collision with root package name */
    public int f384831i;

    /* renamed from: m, reason: collision with root package name */
    public int f384832m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rg3)) {
            return false;
        }
        r45.rg3 rg3Var = (r45.rg3) fVar;
        return n51.f.a(this.BaseRequest, rg3Var.BaseRequest) && n51.f.a(this.f384826d, rg3Var.f384826d) && n51.f.a(java.lang.Integer.valueOf(this.f384827e), java.lang.Integer.valueOf(rg3Var.f384827e)) && n51.f.a(java.lang.Integer.valueOf(this.f384828f), java.lang.Integer.valueOf(rg3Var.f384828f)) && n51.f.a(this.f384829g, rg3Var.f384829g) && n51.f.a(java.lang.Integer.valueOf(this.f384830h), java.lang.Integer.valueOf(rg3Var.f384830h)) && n51.f.a(java.lang.Integer.valueOf(this.f384831i), java.lang.Integer.valueOf(rg3Var.f384831i)) && n51.f.a(java.lang.Integer.valueOf(this.f384832m), java.lang.Integer.valueOf(rg3Var.f384832m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f384826d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f384827e);
            fVar.e(4, this.f384828f);
            java.lang.String str2 = this.f384829g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f384830h);
            fVar.e(7, this.f384831i);
            fVar.e(8, this.f384832m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f384826d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f384827e) + b36.f.e(4, this.f384828f);
            java.lang.String str4 = this.f384829g;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            return e17 + b36.f.e(6, this.f384830h) + b36.f.e(7, this.f384831i) + b36.f.e(8, this.f384832m);
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
        r45.rg3 rg3Var = (r45.rg3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    rg3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                rg3Var.f384826d = aVar2.k(intValue);
                return 0;
            case 3:
                rg3Var.f384827e = aVar2.g(intValue);
                return 0;
            case 4:
                rg3Var.f384828f = aVar2.g(intValue);
                return 0;
            case 5:
                rg3Var.f384829g = aVar2.k(intValue);
                return 0;
            case 6:
                rg3Var.f384830h = aVar2.g(intValue);
                return 0;
            case 7:
                rg3Var.f384831i = aVar2.g(intValue);
                return 0;
            case 8:
                rg3Var.f384832m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
