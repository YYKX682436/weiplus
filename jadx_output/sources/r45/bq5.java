package r45;

/* loaded from: classes8.dex */
public class bq5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public float f370991d;

    /* renamed from: e, reason: collision with root package name */
    public float f370992e;

    /* renamed from: f, reason: collision with root package name */
    public float f370993f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370994g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370995h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f370996i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f370997m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bq5)) {
            return false;
        }
        r45.bq5 bq5Var = (r45.bq5) fVar;
        return n51.f.a(this.BaseRequest, bq5Var.BaseRequest) && n51.f.a(java.lang.Float.valueOf(this.f370991d), java.lang.Float.valueOf(bq5Var.f370991d)) && n51.f.a(java.lang.Float.valueOf(this.f370992e), java.lang.Float.valueOf(bq5Var.f370992e)) && n51.f.a(java.lang.Float.valueOf(this.f370993f), java.lang.Float.valueOf(bq5Var.f370993f)) && n51.f.a(this.f370994g, bq5Var.f370994g) && n51.f.a(this.f370995h, bq5Var.f370995h) && n51.f.a(java.lang.Boolean.valueOf(this.f370996i), java.lang.Boolean.valueOf(bq5Var.f370996i)) && n51.f.a(java.lang.Boolean.valueOf(this.f370997m), java.lang.Boolean.valueOf(bq5Var.f370997m));
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
            fVar.d(2, this.f370991d);
            fVar.d(3, this.f370992e);
            fVar.d(4, this.f370993f);
            com.tencent.mm.protobuf.g gVar = this.f370994g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            java.lang.String str = this.f370995h;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.a(7, this.f370996i);
            fVar.a(8, this.f370997m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.d(2, this.f370991d) + b36.f.d(3, this.f370992e) + b36.f.d(4, this.f370993f);
            com.tencent.mm.protobuf.g gVar2 = this.f370994g;
            if (gVar2 != null) {
                i18 += b36.f.b(5, gVar2);
            }
            java.lang.String str2 = this.f370995h;
            if (str2 != null) {
                i18 += b36.f.j(6, str2);
            }
            return i18 + b36.f.a(7, this.f370996i) + b36.f.a(8, this.f370997m);
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
        r45.bq5 bq5Var = (r45.bq5) objArr[1];
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
                    bq5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                bq5Var.f370991d = aVar2.f(intValue);
                return 0;
            case 3:
                bq5Var.f370992e = aVar2.f(intValue);
                return 0;
            case 4:
                bq5Var.f370993f = aVar2.f(intValue);
                return 0;
            case 5:
                bq5Var.f370994g = aVar2.d(intValue);
                return 0;
            case 6:
                bq5Var.f370995h = aVar2.k(intValue);
                return 0;
            case 7:
                bq5Var.f370996i = aVar2.c(intValue);
                return 0;
            case 8:
                bq5Var.f370997m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
