package r45;

/* loaded from: classes4.dex */
public class u3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386973d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f386974e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386975f;

    /* renamed from: g, reason: collision with root package name */
    public int f386976g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386977h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u3)) {
            return false;
        }
        r45.u3 u3Var = (r45.u3) fVar;
        return n51.f.a(this.BaseRequest, u3Var.BaseRequest) && n51.f.a(this.f386973d, u3Var.f386973d) && n51.f.a(this.f386974e, u3Var.f386974e) && n51.f.a(this.f386975f, u3Var.f386975f) && n51.f.a(java.lang.Integer.valueOf(this.f386976g), java.lang.Integer.valueOf(u3Var.f386976g)) && n51.f.a(this.f386977h, u3Var.f386977h);
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
            java.lang.String str = this.f386973d;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f386974e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            java.lang.String str2 = this.f386975f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f386976g);
            java.lang.String str3 = this.f386977h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f386973d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f386974e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            java.lang.String str5 = this.f386975f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            int e17 = i18 + b36.f.e(5, this.f386976g);
            java.lang.String str6 = this.f386977h;
            return str6 != null ? e17 + b36.f.j(6, str6) : e17;
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
        r45.u3 u3Var = (r45.u3) objArr[1];
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
                    u3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                u3Var.f386973d = aVar2.k(intValue);
                return 0;
            case 3:
                u3Var.f386974e = aVar2.d(intValue);
                return 0;
            case 4:
                u3Var.f386975f = aVar2.k(intValue);
                return 0;
            case 5:
                u3Var.f386976g = aVar2.g(intValue);
                return 0;
            case 6:
                u3Var.f386977h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
