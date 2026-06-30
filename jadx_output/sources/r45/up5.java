package r45;

/* loaded from: classes9.dex */
public class up5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f387549d;

    /* renamed from: e, reason: collision with root package name */
    public int f387550e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f387551f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f387552g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.up5)) {
            return false;
        }
        r45.up5 up5Var = (r45.up5) fVar;
        return n51.f.a(this.BaseResponse, up5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f387549d), java.lang.Integer.valueOf(up5Var.f387549d)) && n51.f.a(java.lang.Integer.valueOf(this.f387550e), java.lang.Integer.valueOf(up5Var.f387550e)) && n51.f.a(this.f387551f, up5Var.f387551f) && n51.f.a(this.f387552g, up5Var.f387552g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387552g;
        java.util.LinkedList linkedList2 = this.f387551f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f387549d);
            fVar.e(3, this.f387550e);
            fVar.g(4, 8, linkedList2);
            fVar.g(5, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f387549d) + b36.f.e(3, this.f387550e) + b36.f.g(4, 8, linkedList2) + b36.f.g(5, 2, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.up5 up5Var = (r45.up5) objArr[1];
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
                up5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            up5Var.f387549d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            up5Var.f387550e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            up5Var.f387552g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.hm0 hm0Var = new r45.hm0();
            if (bArr3 != null && bArr3.length > 0) {
                hm0Var.parseFrom(bArr3);
            }
            up5Var.f387551f.add(hm0Var);
        }
        return 0;
    }
}
