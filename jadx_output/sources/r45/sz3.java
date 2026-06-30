package r45;

/* loaded from: classes7.dex */
public class sz3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f386031d;

    /* renamed from: e, reason: collision with root package name */
    public int f386032e;

    /* renamed from: f, reason: collision with root package name */
    public int f386033f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f386034g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sz3)) {
            return false;
        }
        r45.sz3 sz3Var = (r45.sz3) fVar;
        return n51.f.a(this.BaseResponse, sz3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f386031d), java.lang.Integer.valueOf(sz3Var.f386031d)) && n51.f.a(java.lang.Integer.valueOf(this.f386032e), java.lang.Integer.valueOf(sz3Var.f386032e)) && n51.f.a(java.lang.Integer.valueOf(this.f386033f), java.lang.Integer.valueOf(sz3Var.f386033f)) && n51.f.a(this.f386034g, sz3Var.f386034g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f386034g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f386031d);
            fVar.e(3, this.f386032e);
            fVar.e(4, this.f386033f);
            fVar.g(5, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f386031d) + b36.f.e(3, this.f386032e) + b36.f.e(4, this.f386033f) + b36.f.g(5, 1, linkedList);
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
        r45.sz3 sz3Var = (r45.sz3) objArr[1];
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
                sz3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            sz3Var.f386031d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            sz3Var.f386032e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            sz3Var.f386033f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        sz3Var.f386034g.add(aVar2.k(intValue));
        return 0;
    }
}
