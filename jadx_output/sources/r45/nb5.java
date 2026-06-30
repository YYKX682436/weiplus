package r45;

/* loaded from: classes4.dex */
public class nb5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381229d;

    /* renamed from: e, reason: collision with root package name */
    public int f381230e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f381231f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nb5)) {
            return false;
        }
        r45.nb5 nb5Var = (r45.nb5) fVar;
        return n51.f.a(this.BaseResponse, nb5Var.BaseResponse) && n51.f.a(this.f381229d, nb5Var.f381229d) && n51.f.a(java.lang.Integer.valueOf(this.f381230e), java.lang.Integer.valueOf(nb5Var.f381230e)) && n51.f.a(this.f381231f, nb5Var.f381231f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381231f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f381229d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f381230e);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.f381229d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f381230e) + b36.f.g(4, 8, linkedList);
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
        r45.nb5 nb5Var = (r45.nb5) objArr[1];
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
                nb5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            nb5Var.f381229d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            nb5Var.f381230e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.s35 s35Var = new r45.s35();
            if (bArr3 != null && bArr3.length > 0) {
                s35Var.parseFrom(bArr3);
            }
            nb5Var.f381231f.add(s35Var);
        }
        return 0;
    }
}
