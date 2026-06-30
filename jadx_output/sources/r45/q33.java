package r45;

/* loaded from: classes9.dex */
public class q33 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383618d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383619e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383620f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383621g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383622h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383623i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q33)) {
            return false;
        }
        r45.q33 q33Var = (r45.q33) fVar;
        return n51.f.a(this.BaseRequest, q33Var.BaseRequest) && n51.f.a(this.f383618d, q33Var.f383618d) && n51.f.a(this.f383619e, q33Var.f383619e) && n51.f.a(this.f383620f, q33Var.f383620f) && n51.f.a(this.f383621g, q33Var.f383621g) && n51.f.a(this.f383622h, q33Var.f383622h) && n51.f.a(this.f383623i, q33Var.f383623i);
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
            java.lang.String str = this.f383618d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f383619e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f383620f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f383621g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f383622h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f383623i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str7 = this.f383618d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f383619e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f383620f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f383621g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f383622h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f383623i;
            return str12 != null ? i18 + b36.f.j(7, str12) : i18;
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
        r45.q33 q33Var = (r45.q33) objArr[1];
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
                    q33Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                q33Var.f383618d = aVar2.k(intValue);
                return 0;
            case 3:
                q33Var.f383619e = aVar2.k(intValue);
                return 0;
            case 4:
                q33Var.f383620f = aVar2.k(intValue);
                return 0;
            case 5:
                q33Var.f383621g = aVar2.k(intValue);
                return 0;
            case 6:
                q33Var.f383622h = aVar2.k(intValue);
                return 0;
            case 7:
                q33Var.f383623i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
