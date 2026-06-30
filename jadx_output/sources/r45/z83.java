package r45;

/* loaded from: classes4.dex */
public class z83 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public int f391789e;

    /* renamed from: f, reason: collision with root package name */
    public int f391790f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f391788d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f391791g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z83)) {
            return false;
        }
        r45.z83 z83Var = (r45.z83) fVar;
        return n51.f.a(this.BaseResponse, z83Var.BaseResponse) && n51.f.a(this.f391788d, z83Var.f391788d) && n51.f.a(java.lang.Integer.valueOf(this.f391789e), java.lang.Integer.valueOf(z83Var.f391789e)) && n51.f.a(java.lang.Integer.valueOf(this.f391790f), java.lang.Integer.valueOf(z83Var.f391790f)) && n51.f.a(this.f391791g, z83Var.f391791g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391791g;
        java.util.LinkedList linkedList2 = this.f391788d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 6, linkedList2);
            fVar.e(3, this.f391789e);
            fVar.e(4, this.f391790f);
            fVar.g(5, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 6, linkedList2) + b36.f.e(3, this.f391789e) + b36.f.e(4, this.f391790f) + b36.f.g(5, 2, linkedList);
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
        r45.z83 z83Var = (r45.z83) objArr[1];
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
                z83Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            z83Var.f391788d.add(aVar2.d(intValue));
            return 0;
        }
        if (intValue == 3) {
            z83Var.f391789e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            z83Var.f391790f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        z83Var.f391791g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
        return 0;
    }
}
