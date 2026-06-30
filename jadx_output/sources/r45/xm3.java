package r45;

/* loaded from: classes8.dex */
public class xm3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f390231d = false;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390232e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390233f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390234g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390235h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xm3)) {
            return false;
        }
        r45.xm3 xm3Var = (r45.xm3) fVar;
        return n51.f.a(this.BaseResponse, xm3Var.BaseResponse) && n51.f.a(java.lang.Boolean.valueOf(this.f390231d), java.lang.Boolean.valueOf(xm3Var.f390231d)) && n51.f.a(this.f390232e, xm3Var.f390232e) && n51.f.a(this.f390233f, xm3Var.f390233f) && n51.f.a(this.f390234g, xm3Var.f390234g) && n51.f.a(this.f390235h, xm3Var.f390235h);
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
            fVar.a(2, this.f390231d);
            java.lang.String str = this.f390232e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f390233f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f390234g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f390235h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.a(2, this.f390231d);
            java.lang.String str5 = this.f390232e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f390233f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f390234g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f390235h;
            return str8 != null ? i18 + b36.f.j(6, str8) : i18;
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
        r45.xm3 xm3Var = (r45.xm3) objArr[1];
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
                    xm3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                xm3Var.f390231d = aVar2.c(intValue);
                return 0;
            case 3:
                xm3Var.f390232e = aVar2.k(intValue);
                return 0;
            case 4:
                xm3Var.f390233f = aVar2.k(intValue);
                return 0;
            case 5:
                xm3Var.f390234g = aVar2.k(intValue);
                return 0;
            case 6:
                xm3Var.f390235h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
