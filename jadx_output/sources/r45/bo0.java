package r45;

/* loaded from: classes9.dex */
public class bo0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f370905d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370906e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370907f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370908g;

    /* renamed from: h, reason: collision with root package name */
    public int f370909h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370910i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f370911m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bo0)) {
            return false;
        }
        r45.bo0 bo0Var = (r45.bo0) fVar;
        return n51.f.a(this.BaseResponse, bo0Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f370905d), java.lang.Integer.valueOf(bo0Var.f370905d)) && n51.f.a(this.f370906e, bo0Var.f370906e) && n51.f.a(this.f370907f, bo0Var.f370907f) && n51.f.a(this.f370908g, bo0Var.f370908g) && n51.f.a(java.lang.Integer.valueOf(this.f370909h), java.lang.Integer.valueOf(bo0Var.f370909h)) && n51.f.a(this.f370910i, bo0Var.f370910i) && n51.f.a(this.f370911m, bo0Var.f370911m);
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
            fVar.e(2, this.f370905d);
            java.lang.String str = this.f370906e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f370907f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f370908g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f370909h);
            java.lang.String str4 = this.f370910i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f370911m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f370905d);
            java.lang.String str6 = this.f370906e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f370907f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f370908g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            int e17 = i18 + b36.f.e(6, this.f370909h);
            java.lang.String str9 = this.f370910i;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f370911m;
            return str10 != null ? e17 + b36.f.j(8, str10) : e17;
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
        r45.bo0 bo0Var = (r45.bo0) objArr[1];
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
                    bo0Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                bo0Var.f370905d = aVar2.g(intValue);
                return 0;
            case 3:
                bo0Var.f370906e = aVar2.k(intValue);
                return 0;
            case 4:
                bo0Var.f370907f = aVar2.k(intValue);
                return 0;
            case 5:
                bo0Var.f370908g = aVar2.k(intValue);
                return 0;
            case 6:
                bo0Var.f370909h = aVar2.g(intValue);
                return 0;
            case 7:
                bo0Var.f370910i = aVar2.k(intValue);
                return 0;
            case 8:
                bo0Var.f370911m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
