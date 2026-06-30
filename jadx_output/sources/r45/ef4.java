package r45;

/* loaded from: classes4.dex */
public class ef4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f373391d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373392e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373393f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373394g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373395h;

    /* renamed from: i, reason: collision with root package name */
    public int f373396i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ef4)) {
            return false;
        }
        r45.ef4 ef4Var = (r45.ef4) fVar;
        return n51.f.a(this.BaseResponse, ef4Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f373391d), java.lang.Integer.valueOf(ef4Var.f373391d)) && n51.f.a(this.f373392e, ef4Var.f373392e) && n51.f.a(this.f373393f, ef4Var.f373393f) && n51.f.a(this.f373394g, ef4Var.f373394g) && n51.f.a(this.f373395h, ef4Var.f373395h) && n51.f.a(java.lang.Integer.valueOf(this.f373396i), java.lang.Integer.valueOf(ef4Var.f373396i));
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
            fVar.e(2, this.f373391d);
            java.lang.String str = this.f373392e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f373393f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f373394g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f373395h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f373396i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f373391d);
            java.lang.String str5 = this.f373392e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f373393f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f373394g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f373395h;
            if (str8 != null) {
                i18 += b36.f.j(6, str8);
            }
            return i18 + b36.f.e(7, this.f373396i);
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
        r45.ef4 ef4Var = (r45.ef4) objArr[1];
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
                    ef4Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                ef4Var.f373391d = aVar2.g(intValue);
                return 0;
            case 3:
                ef4Var.f373392e = aVar2.k(intValue);
                return 0;
            case 4:
                ef4Var.f373393f = aVar2.k(intValue);
                return 0;
            case 5:
                ef4Var.f373394g = aVar2.k(intValue);
                return 0;
            case 6:
                ef4Var.f373395h = aVar2.k(intValue);
                return 0;
            case 7:
                ef4Var.f373396i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
