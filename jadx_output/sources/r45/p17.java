package r45;

/* loaded from: classes9.dex */
public class p17 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382668d;

    /* renamed from: e, reason: collision with root package name */
    public int f382669e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f382670f;

    /* renamed from: g, reason: collision with root package name */
    public int f382671g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f382672h;

    /* renamed from: i, reason: collision with root package name */
    public int f382673i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f382674m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f382675n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p17)) {
            return false;
        }
        r45.p17 p17Var = (r45.p17) fVar;
        return n51.f.a(this.BaseRequest, p17Var.BaseRequest) && n51.f.a(this.f382668d, p17Var.f382668d) && n51.f.a(java.lang.Integer.valueOf(this.f382669e), java.lang.Integer.valueOf(p17Var.f382669e)) && n51.f.a(this.f382670f, p17Var.f382670f) && n51.f.a(java.lang.Integer.valueOf(this.f382671g), java.lang.Integer.valueOf(p17Var.f382671g)) && n51.f.a(java.lang.Boolean.valueOf(this.f382672h), java.lang.Boolean.valueOf(p17Var.f382672h)) && n51.f.a(java.lang.Integer.valueOf(this.f382673i), java.lang.Integer.valueOf(p17Var.f382673i)) && n51.f.a(this.f382674m, p17Var.f382674m) && n51.f.a(this.f382675n, p17Var.f382675n);
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
            java.lang.String str = this.f382668d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f382669e);
            com.tencent.mm.protobuf.g gVar = this.f382670f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f382671g);
            fVar.a(6, this.f382672h);
            fVar.e(7, this.f382673i);
            com.tencent.mm.protobuf.g gVar2 = this.f382674m;
            if (gVar2 != null) {
                fVar.b(8, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f382675n;
            if (gVar3 != null) {
                fVar.b(9, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f382668d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f382669e);
            com.tencent.mm.protobuf.g gVar4 = this.f382670f;
            if (gVar4 != null) {
                e17 += b36.f.b(4, gVar4);
            }
            int e18 = e17 + b36.f.e(5, this.f382671g) + b36.f.a(6, this.f382672h) + b36.f.e(7, this.f382673i);
            com.tencent.mm.protobuf.g gVar5 = this.f382674m;
            if (gVar5 != null) {
                e18 += b36.f.b(8, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f382675n;
            return gVar6 != null ? e18 + b36.f.b(9, gVar6) : e18;
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
        r45.p17 p17Var = (r45.p17) objArr[1];
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
                    p17Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                p17Var.f382668d = aVar2.k(intValue);
                return 0;
            case 3:
                p17Var.f382669e = aVar2.g(intValue);
                return 0;
            case 4:
                p17Var.f382670f = aVar2.d(intValue);
                return 0;
            case 5:
                p17Var.f382671g = aVar2.g(intValue);
                return 0;
            case 6:
                p17Var.f382672h = aVar2.c(intValue);
                return 0;
            case 7:
                p17Var.f382673i = aVar2.g(intValue);
                return 0;
            case 8:
                p17Var.f382674m = aVar2.d(intValue);
                return 0;
            case 9:
                p17Var.f382675n = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
