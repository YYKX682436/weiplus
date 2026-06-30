package r45;

/* loaded from: classes4.dex */
public class t0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386043d;

    /* renamed from: e, reason: collision with root package name */
    public int f386044e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386045f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t0)) {
            return false;
        }
        r45.t0 t0Var = (r45.t0) fVar;
        return n51.f.a(this.BaseResponse, t0Var.BaseResponse) && n51.f.a(this.f386043d, t0Var.f386043d) && n51.f.a(java.lang.Integer.valueOf(this.f386044e), java.lang.Integer.valueOf(t0Var.f386044e)) && n51.f.a(this.f386045f, t0Var.f386045f);
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
            java.lang.String str = this.f386043d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f386044e);
            java.lang.String str2 = this.f386045f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f386043d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f386044e);
            java.lang.String str4 = this.f386045f;
            return str4 != null ? e17 + b36.f.j(4, str4) : e17;
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
        r45.t0 t0Var = (r45.t0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                t0Var.f386043d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                t0Var.f386044e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            t0Var.f386045f = aVar2.k(intValue);
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
            t0Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
