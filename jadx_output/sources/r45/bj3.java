package r45;

/* loaded from: classes4.dex */
public class bj3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370800d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370801e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370802f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f370803g = true;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bj3)) {
            return false;
        }
        r45.bj3 bj3Var = (r45.bj3) fVar;
        return n51.f.a(this.BaseResponse, bj3Var.BaseResponse) && n51.f.a(this.f370800d, bj3Var.f370800d) && n51.f.a(this.f370801e, bj3Var.f370801e) && n51.f.a(this.f370802f, bj3Var.f370802f) && n51.f.a(java.lang.Boolean.valueOf(this.f370803g), java.lang.Boolean.valueOf(bj3Var.f370803g));
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
            java.lang.String str = this.f370800d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f370801e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f370802f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.a(5, this.f370803g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f370800d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f370801e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f370802f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            return i18 + b36.f.a(5, this.f370803g);
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
        r45.bj3 bj3Var = (r45.bj3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                bj3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            bj3Var.f370800d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            bj3Var.f370801e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            bj3Var.f370802f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        bj3Var.f370803g = aVar2.c(intValue);
        return 0;
    }
}
