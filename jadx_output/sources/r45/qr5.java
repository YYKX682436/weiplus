package r45;

/* loaded from: classes4.dex */
public class qr5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384225d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384226e;

    /* renamed from: f, reason: collision with root package name */
    public int f384227f;

    /* renamed from: g, reason: collision with root package name */
    public int f384228g;

    /* renamed from: h, reason: collision with root package name */
    public int f384229h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384230i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qr5)) {
            return false;
        }
        r45.qr5 qr5Var = (r45.qr5) fVar;
        return n51.f.a(this.BaseResponse, qr5Var.BaseResponse) && n51.f.a(this.f384225d, qr5Var.f384225d) && n51.f.a(this.f384226e, qr5Var.f384226e) && n51.f.a(java.lang.Integer.valueOf(this.f384227f), java.lang.Integer.valueOf(qr5Var.f384227f)) && n51.f.a(java.lang.Integer.valueOf(this.f384228g), java.lang.Integer.valueOf(qr5Var.f384228g)) && n51.f.a(java.lang.Integer.valueOf(this.f384229h), java.lang.Integer.valueOf(qr5Var.f384229h)) && n51.f.a(this.f384230i, qr5Var.f384230i);
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
            java.lang.String str = this.f384225d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f384226e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f384227f);
            fVar.e(5, this.f384228g);
            fVar.e(6, this.f384229h);
            java.lang.String str3 = this.f384230i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f384225d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f384226e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f384227f) + b36.f.e(5, this.f384228g) + b36.f.e(6, this.f384229h);
            java.lang.String str6 = this.f384230i;
            return str6 != null ? e17 + b36.f.j(7, str6) : e17;
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
        r45.qr5 qr5Var = (r45.qr5) objArr[1];
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
                    qr5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                qr5Var.f384225d = aVar2.k(intValue);
                return 0;
            case 3:
                qr5Var.f384226e = aVar2.k(intValue);
                return 0;
            case 4:
                qr5Var.f384227f = aVar2.g(intValue);
                return 0;
            case 5:
                qr5Var.f384228g = aVar2.g(intValue);
                return 0;
            case 6:
                qr5Var.f384229h = aVar2.g(intValue);
                return 0;
            case 7:
                qr5Var.f384230i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
