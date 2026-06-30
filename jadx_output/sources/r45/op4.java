package r45;

/* loaded from: classes2.dex */
public class op4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382425d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382426e;

    /* renamed from: f, reason: collision with root package name */
    public long f382427f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.op4)) {
            return false;
        }
        r45.op4 op4Var = (r45.op4) fVar;
        return n51.f.a(this.BaseResponse, op4Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f382425d), java.lang.Integer.valueOf(op4Var.f382425d)) && n51.f.a(this.f382426e, op4Var.f382426e) && n51.f.a(java.lang.Long.valueOf(this.f382427f), java.lang.Long.valueOf(op4Var.f382427f));
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
            fVar.e(2, this.f382425d);
            java.lang.String str = this.f382426e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f382427f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f382425d);
            java.lang.String str2 = this.f382426e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.h(4, this.f382427f);
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
        r45.op4 op4Var = (r45.op4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                op4Var.f382425d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                op4Var.f382426e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            op4Var.f382427f = aVar2.i(intValue);
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
            op4Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
