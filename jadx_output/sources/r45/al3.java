package r45;

/* loaded from: classes2.dex */
public class al3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f370088d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370089e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370090f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f370091g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370092h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.al3)) {
            return false;
        }
        r45.al3 al3Var = (r45.al3) fVar;
        return n51.f.a(this.BaseResponse, al3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f370088d), java.lang.Integer.valueOf(al3Var.f370088d)) && n51.f.a(this.f370089e, al3Var.f370089e) && n51.f.a(this.f370090f, al3Var.f370090f) && n51.f.a(java.lang.Boolean.valueOf(this.f370091g), java.lang.Boolean.valueOf(al3Var.f370091g)) && n51.f.a(this.f370092h, al3Var.f370092h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f370088d);
            java.lang.String str = this.f370089e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f370090f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(5, this.f370091g);
            java.lang.String str3 = this.f370092h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f370088d);
            java.lang.String str4 = this.f370089e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f370090f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            int a17 = i18 + b36.f.a(5, this.f370091g);
            java.lang.String str6 = this.f370092h;
            return str6 != null ? a17 + b36.f.j(6, str6) : a17;
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
        r45.al3 al3Var = (r45.al3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    al3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                al3Var.f370088d = aVar2.g(intValue);
                return 0;
            case 3:
                al3Var.f370089e = aVar2.k(intValue);
                return 0;
            case 4:
                al3Var.f370090f = aVar2.k(intValue);
                return 0;
            case 5:
                al3Var.f370091g = aVar2.c(intValue);
                return 0;
            case 6:
                al3Var.f370092h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
