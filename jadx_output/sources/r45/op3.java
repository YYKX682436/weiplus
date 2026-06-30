package r45;

/* loaded from: classes4.dex */
public class op3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382422d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382423e;

    /* renamed from: f, reason: collision with root package name */
    public r45.jq6 f382424f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.op3)) {
            return false;
        }
        r45.op3 op3Var = (r45.op3) fVar;
        return n51.f.a(this.BaseResponse, op3Var.BaseResponse) && n51.f.a(this.f382422d, op3Var.f382422d) && n51.f.a(this.f382423e, op3Var.f382423e) && n51.f.a(this.f382424f, op3Var.f382424f);
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
            java.lang.String str = this.f382422d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f382423e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.jq6 jq6Var = this.f382424f;
            if (jq6Var != null) {
                fVar.i(4, jq6Var.computeSize());
                this.f382424f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f382422d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f382423e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            r45.jq6 jq6Var2 = this.f382424f;
            return jq6Var2 != null ? i18 + b36.f.i(4, jq6Var2.computeSize()) : i18;
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
        r45.op3 op3Var = (r45.op3) objArr[1];
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
                op3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            op3Var.f382422d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            op3Var.f382423e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.jq6 jq6Var3 = new r45.jq6();
            if (bArr2 != null && bArr2.length > 0) {
                jq6Var3.parseFrom(bArr2);
            }
            op3Var.f382424f = jq6Var3;
        }
        return 0;
    }
}
