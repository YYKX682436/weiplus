package r45;

/* loaded from: classes4.dex */
public class u0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f386900d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f386901e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386902f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386903g;

    /* renamed from: h, reason: collision with root package name */
    public int f386904h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u0)) {
            return false;
        }
        r45.u0 u0Var = (r45.u0) fVar;
        return n51.f.a(this.BaseRequest, u0Var.BaseRequest) && n51.f.a(this.f386900d, u0Var.f386900d) && n51.f.a(java.lang.Integer.valueOf(this.f386901e), java.lang.Integer.valueOf(u0Var.f386901e)) && n51.f.a(this.f386902f, u0Var.f386902f) && n51.f.a(this.f386903g, u0Var.f386903g) && n51.f.a(java.lang.Integer.valueOf(this.f386904h), java.lang.Integer.valueOf(u0Var.f386904h));
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
            fVar.g(2, 8, this.f386900d);
            fVar.e(3, this.f386901e);
            java.lang.String str = this.f386902f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f386903g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f386904h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 8, this.f386900d) + b36.f.e(3, this.f386901e);
            java.lang.String str3 = this.f386902f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f386903g;
            if (str4 != null) {
                i18 += b36.f.j(5, str4);
            }
            return i18 + b36.f.e(6, this.f386904h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f386900d.clear();
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
        r45.u0 u0Var = (r45.u0) objArr[1];
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
                    u0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.hu huVar = new r45.hu();
                    if (bArr3 != null && bArr3.length > 0) {
                        huVar.parseFrom(bArr3);
                    }
                    u0Var.f386900d.add(huVar);
                }
                return 0;
            case 3:
                u0Var.f386901e = aVar2.g(intValue);
                return 0;
            case 4:
                u0Var.f386902f = aVar2.k(intValue);
                return 0;
            case 5:
                u0Var.f386903g = aVar2.k(intValue);
                return 0;
            case 6:
                u0Var.f386904h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
