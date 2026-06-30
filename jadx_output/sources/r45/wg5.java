package r45;

/* loaded from: classes2.dex */
public class wg5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f389148d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389149e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wg5)) {
            return false;
        }
        r45.wg5 wg5Var = (r45.wg5) fVar;
        return n51.f.a(this.BaseRequest, wg5Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f389148d), java.lang.Integer.valueOf(wg5Var.f389148d)) && n51.f.a(this.f389149e, wg5Var.f389149e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f389148d);
            java.lang.String str = this.f389149e;
            if (str != null) {
                fVar.j(100, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f389148d);
            java.lang.String str2 = this.f389149e;
            return str2 != null ? i18 + b36.f.j(100, str2) : i18;
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
        r45.wg5 wg5Var = (r45.wg5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                wg5Var.f389148d = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 100) {
                return -1;
            }
            wg5Var.f389149e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            wg5Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
