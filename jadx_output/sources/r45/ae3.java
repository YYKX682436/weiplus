package r45;

/* loaded from: classes8.dex */
public class ae3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369966d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369967e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f369968f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ae3)) {
            return false;
        }
        r45.ae3 ae3Var = (r45.ae3) fVar;
        return n51.f.a(this.BaseResponse, ae3Var.BaseResponse) && n51.f.a(this.f369966d, ae3Var.f369966d) && n51.f.a(this.f369967e, ae3Var.f369967e) && n51.f.a(this.f369968f, ae3Var.f369968f);
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
            java.lang.String str = this.f369966d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f369967e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f369968f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f369966d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f369967e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f369968f;
            return str6 != null ? i18 + b36.f.j(4, str6) : i18;
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
        r45.ae3 ae3Var = (r45.ae3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                ae3Var.f369966d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                ae3Var.f369967e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            ae3Var.f369968f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.parseFrom(bArr);
            }
            ae3Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
