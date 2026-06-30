package r45;

/* loaded from: classes8.dex */
public class fh4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f374350d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374351e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374352f;

    /* renamed from: g, reason: collision with root package name */
    public int f374353g;

    /* renamed from: h, reason: collision with root package name */
    public int f374354h;

    /* renamed from: i, reason: collision with root package name */
    public int f374355i;

    /* renamed from: m, reason: collision with root package name */
    public int f374356m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fh4)) {
            return false;
        }
        r45.fh4 fh4Var = (r45.fh4) fVar;
        return n51.f.a(this.BaseRequest, fh4Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f374350d), java.lang.Integer.valueOf(fh4Var.f374350d)) && n51.f.a(this.f374351e, fh4Var.f374351e) && n51.f.a(this.f374352f, fh4Var.f374352f) && n51.f.a(java.lang.Integer.valueOf(this.f374353g), java.lang.Integer.valueOf(fh4Var.f374353g)) && n51.f.a(java.lang.Integer.valueOf(this.f374354h), java.lang.Integer.valueOf(fh4Var.f374354h)) && n51.f.a(java.lang.Integer.valueOf(this.f374355i), java.lang.Integer.valueOf(fh4Var.f374355i)) && n51.f.a(java.lang.Integer.valueOf(this.f374356m), java.lang.Integer.valueOf(fh4Var.f374356m));
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
            fVar.e(2, this.f374350d);
            java.lang.String str = this.f374351e;
            if (str != null) {
                fVar.j(3, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f374352f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f374353g);
            fVar.e(6, this.f374354h);
            fVar.e(7, this.f374355i);
            fVar.e(8, this.f374356m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f374350d);
            java.lang.String str2 = this.f374351e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f374352f;
            if (gVar2 != null) {
                i18 += b36.f.b(4, gVar2);
            }
            return i18 + b36.f.e(5, this.f374353g) + b36.f.e(6, this.f374354h) + b36.f.e(7, this.f374355i) + b36.f.e(8, this.f374356m);
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
        r45.fh4 fh4Var = (r45.fh4) objArr[1];
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
                    fh4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                fh4Var.f374350d = aVar2.g(intValue);
                return 0;
            case 3:
                fh4Var.f374351e = aVar2.k(intValue);
                return 0;
            case 4:
                fh4Var.f374352f = aVar2.d(intValue);
                return 0;
            case 5:
                fh4Var.f374353g = aVar2.g(intValue);
                return 0;
            case 6:
                fh4Var.f374354h = aVar2.g(intValue);
                return 0;
            case 7:
                fh4Var.f374355i = aVar2.g(intValue);
                return 0;
            case 8:
                fh4Var.f374356m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
