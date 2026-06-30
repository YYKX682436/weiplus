package r45;

/* loaded from: classes4.dex */
public class l2 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f379083d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379084e;

    /* renamed from: f, reason: collision with root package name */
    public int f379085f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l2)) {
            return false;
        }
        r45.l2 l2Var = (r45.l2) fVar;
        return n51.f.a(this.BaseResponse, l2Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f379083d), java.lang.Integer.valueOf(l2Var.f379083d)) && n51.f.a(this.f379084e, l2Var.f379084e) && n51.f.a(java.lang.Integer.valueOf(this.f379085f), java.lang.Integer.valueOf(l2Var.f379085f));
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
            fVar.e(2, this.f379083d);
            java.lang.String str = this.f379084e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f379085f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f379083d);
            java.lang.String str2 = this.f379084e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.e(4, this.f379085f);
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
        r45.l2 l2Var = (r45.l2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                l2Var.f379083d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                l2Var.f379084e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            l2Var.f379085f = aVar2.g(intValue);
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
            l2Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
