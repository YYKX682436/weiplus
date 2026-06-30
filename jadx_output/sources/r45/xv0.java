package r45;

/* loaded from: classes7.dex */
public class xv0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390473d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f390474e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f390475f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xv0)) {
            return false;
        }
        r45.xv0 xv0Var = (r45.xv0) fVar;
        return n51.f.a(this.BaseResponse, xv0Var.BaseResponse) && n51.f.a(this.f390473d, xv0Var.f390473d) && n51.f.a(java.lang.Boolean.valueOf(this.f390474e), java.lang.Boolean.valueOf(xv0Var.f390474e)) && n51.f.a(this.f390475f, xv0Var.f390475f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390475f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f390473d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.a(3, this.f390474e);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f390473d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            return i18 + b36.f.a(3, this.f390474e) + b36.f.g(4, 8, linkedList);
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
        r45.xv0 xv0Var = (r45.xv0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                xv0Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            xv0Var.f390473d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            xv0Var.f390474e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.vv0 vv0Var = new r45.vv0();
            if (bArr3 != null && bArr3.length > 0) {
                vv0Var.parseFrom(bArr3);
            }
            xv0Var.f390475f.add(vv0Var);
        }
        return 0;
    }
}
