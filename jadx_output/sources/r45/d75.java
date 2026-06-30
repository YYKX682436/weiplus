package r45;

/* loaded from: classes2.dex */
public class d75 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f372204d;

    /* renamed from: e, reason: collision with root package name */
    public int f372205e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f372206f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d75)) {
            return false;
        }
        r45.d75 d75Var = (r45.d75) fVar;
        return n51.f.a(this.BaseResponse, d75Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f372204d), java.lang.Integer.valueOf(d75Var.f372204d)) && n51.f.a(java.lang.Integer.valueOf(this.f372205e), java.lang.Integer.valueOf(d75Var.f372205e)) && n51.f.a(this.f372206f, d75Var.f372206f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372206f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f372204d);
            fVar.e(3, this.f372205e);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f372204d) + b36.f.e(3, this.f372205e) + b36.f.g(4, 8, linkedList);
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
        r45.d75 d75Var = (r45.d75) objArr[1];
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
                d75Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            d75Var.f372204d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            d75Var.f372205e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.m75 m75Var = new r45.m75();
            if (bArr3 != null && bArr3.length > 0) {
                m75Var.parseFrom(bArr3);
            }
            d75Var.f372206f.add(m75Var);
        }
        return 0;
    }
}
