package r45;

/* loaded from: classes8.dex */
public class bk0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370813d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370814e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370815f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370816g;

    /* renamed from: h, reason: collision with root package name */
    public int f370817h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370818i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bk0)) {
            return false;
        }
        r45.bk0 bk0Var = (r45.bk0) fVar;
        return n51.f.a(this.BaseRequest, bk0Var.BaseRequest) && n51.f.a(this.f370813d, bk0Var.f370813d) && n51.f.a(this.f370814e, bk0Var.f370814e) && n51.f.a(this.f370815f, bk0Var.f370815f) && n51.f.a(this.f370816g, bk0Var.f370816g) && n51.f.a(java.lang.Integer.valueOf(this.f370817h), java.lang.Integer.valueOf(bk0Var.f370817h)) && n51.f.a(this.f370818i, bk0Var.f370818i);
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
            com.tencent.mm.protobuf.g gVar = this.f370813d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f370814e;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            java.lang.String str = this.f370815f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f370816g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f370817h);
            java.lang.String str3 = this.f370818i;
            if (str3 != null) {
                fVar.j(101, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar3 = this.f370813d;
            if (gVar3 != null) {
                i18 += b36.f.b(2, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f370814e;
            if (gVar4 != null) {
                i18 += b36.f.b(3, gVar4);
            }
            java.lang.String str4 = this.f370815f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f370816g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            int e17 = i18 + b36.f.e(6, this.f370817h);
            java.lang.String str6 = this.f370818i;
            return str6 != null ? e17 + b36.f.j(101, str6) : e17;
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
        r45.bk0 bk0Var = (r45.bk0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 101) {
            bk0Var.f370818i = aVar2.k(intValue);
            return 0;
        }
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
                    bk0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                bk0Var.f370813d = aVar2.d(intValue);
                return 0;
            case 3:
                bk0Var.f370814e = aVar2.d(intValue);
                return 0;
            case 4:
                bk0Var.f370815f = aVar2.k(intValue);
                return 0;
            case 5:
                bk0Var.f370816g = aVar2.k(intValue);
                return 0;
            case 6:
                bk0Var.f370817h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
