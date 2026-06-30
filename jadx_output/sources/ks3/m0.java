package ks3;

/* loaded from: classes2.dex */
public class m0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f311716d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f311717e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f311718f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.m0)) {
            return false;
        }
        ks3.m0 m0Var = (ks3.m0) fVar;
        return n51.f.a(this.BaseResponse, m0Var.BaseResponse) && n51.f.a(this.f311716d, m0Var.f311716d) && n51.f.a(this.f311717e, m0Var.f311717e) && n51.f.a(this.f311718f, m0Var.f311718f);
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
            java.lang.String str = this.f311716d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f311717e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f311718f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f311716d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f311717e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f311718f;
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
        ks3.m0 m0Var = (ks3.m0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                m0Var.f311716d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                m0Var.f311717e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            m0Var.f311718f = aVar2.k(intValue);
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
            m0Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
