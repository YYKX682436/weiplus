package r45;

/* loaded from: classes2.dex */
public class py4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f383478d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383479e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383480f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.py4)) {
            return false;
        }
        r45.py4 py4Var = (r45.py4) fVar;
        return n51.f.a(this.BaseResponse, py4Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f383478d), java.lang.Integer.valueOf(py4Var.f383478d)) && n51.f.a(this.f383479e, py4Var.f383479e) && n51.f.a(this.f383480f, py4Var.f383480f);
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
            fVar.e(2, this.f383478d);
            java.lang.String str = this.f383479e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f383480f;
            if (str2 != null) {
                fVar.j(100, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f383478d);
            java.lang.String str3 = this.f383479e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f383480f;
            return str4 != null ? i18 + b36.f.j(100, str4) : i18;
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
        r45.py4 py4Var = (r45.py4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                py4Var.f383478d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                py4Var.f383479e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 100) {
                return -1;
            }
            py4Var.f383480f = aVar2.k(intValue);
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
            py4Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
