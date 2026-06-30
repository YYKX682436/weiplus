package r45;

/* loaded from: classes4.dex */
public class c06 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f371195d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371196e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c06)) {
            return false;
        }
        r45.c06 c06Var = (r45.c06) fVar;
        return n51.f.a(this.BaseResponse, c06Var.BaseResponse) && n51.f.a(java.lang.Long.valueOf(this.f371195d), java.lang.Long.valueOf(c06Var.f371195d)) && n51.f.a(this.f371196e, c06Var.f371196e);
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
            fVar.h(2, this.f371195d);
            java.lang.String str = this.f371196e;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.h(2, this.f371195d);
            java.lang.String str2 = this.f371196e;
            return str2 != null ? i18 + b36.f.j(3, str2) : i18;
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
        r45.c06 c06Var = (r45.c06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                c06Var.f371195d = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            c06Var.f371196e = aVar2.k(intValue);
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
            c06Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
