package r45;

/* loaded from: classes2.dex */
public class ya6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f390928d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public long f390929e;

    /* renamed from: f, reason: collision with root package name */
    public long f390930f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ya6)) {
            return false;
        }
        r45.ya6 ya6Var = (r45.ya6) fVar;
        return n51.f.a(this.BaseResponse, ya6Var.BaseResponse) && n51.f.a(this.f390928d, ya6Var.f390928d) && n51.f.a(java.lang.Long.valueOf(this.f390929e), java.lang.Long.valueOf(ya6Var.f390929e)) && n51.f.a(java.lang.Long.valueOf(this.f390930f), java.lang.Long.valueOf(ya6Var.f390930f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390928d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.h(3, this.f390929e);
            fVar.h(4, this.f390930f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.h(3, this.f390929e) + b36.f.h(4, this.f390930f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.ya6 ya6Var = (r45.ya6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                ya6Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                ya6Var.f390929e = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            ya6Var.f390930f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = new com.tencent.mm.protocal.protobuf.SnsObject();
            if (bArr3 != null && bArr3.length > 0) {
                snsObject.parseFrom(bArr3);
            }
            ya6Var.f390928d.add(snsObject);
        }
        return 0;
    }
}
