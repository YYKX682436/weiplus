package r45;

/* loaded from: classes2.dex */
public class sy5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f386018d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f386019e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sy5)) {
            return false;
        }
        r45.sy5 sy5Var = (r45.sy5) fVar;
        return n51.f.a(this.BaseResponse, sy5Var.BaseResponse) && n51.f.a(java.lang.Long.valueOf(this.f386018d), java.lang.Long.valueOf(sy5Var.f386018d)) && n51.f.a(this.f386019e, sy5Var.f386019e);
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
            fVar.h(2, this.f386018d);
            com.tencent.mm.protobuf.g gVar = this.f386019e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.h(2, this.f386018d);
            com.tencent.mm.protobuf.g gVar2 = this.f386019e;
            return gVar2 != null ? i18 + b36.f.b(3, gVar2) : i18;
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
        r45.sy5 sy5Var = (r45.sy5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                sy5Var.f386018d = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            sy5Var.f386019e = aVar2.d(intValue);
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
            sy5Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
