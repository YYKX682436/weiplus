package r45;

/* loaded from: classes2.dex */
public class wo3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f389340d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389341e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389342f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wo3)) {
            return false;
        }
        r45.wo3 wo3Var = (r45.wo3) fVar;
        return n51.f.a(this.BaseResponse, wo3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f389340d), java.lang.Integer.valueOf(wo3Var.f389340d)) && n51.f.a(this.f389341e, wo3Var.f389341e) && n51.f.a(this.f389342f, wo3Var.f389342f);
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
            fVar.e(2, this.f389340d);
            java.lang.String str = this.f389341e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f389342f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f389340d);
            java.lang.String str3 = this.f389341e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f389342f;
            return str4 != null ? i18 + b36.f.j(4, str4) : i18;
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
        r45.wo3 wo3Var = (r45.wo3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                wo3Var.f389340d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                wo3Var.f389341e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            wo3Var.f389342f = aVar2.k(intValue);
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
            wo3Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
