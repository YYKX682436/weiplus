package r45;

/* loaded from: classes2.dex */
public class v07 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f387791d;

    /* renamed from: e, reason: collision with root package name */
    public int f387792e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v07)) {
            return false;
        }
        r45.v07 v07Var = (r45.v07) fVar;
        return n51.f.a(this.BaseResponse, v07Var.BaseResponse) && n51.f.a(java.lang.Long.valueOf(this.f387791d), java.lang.Long.valueOf(v07Var.f387791d)) && n51.f.a(java.lang.Integer.valueOf(this.f387792e), java.lang.Integer.valueOf(v07Var.f387792e));
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
            fVar.h(2, this.f387791d);
            fVar.e(3, this.f387792e);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.h(2, this.f387791d) + b36.f.e(3, this.f387792e);
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
        r45.v07 v07Var = (r45.v07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                v07Var.f387791d = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            v07Var.f387792e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.parseFrom(bArr);
            }
            v07Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
