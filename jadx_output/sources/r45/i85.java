package r45;

/* loaded from: classes2.dex */
public class i85 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f376813d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f376814e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i85)) {
            return false;
        }
        r45.i85 i85Var = (r45.i85) fVar;
        return n51.f.a(this.BaseRequest, i85Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f376813d), java.lang.Integer.valueOf(i85Var.f376813d)) && n51.f.a(java.lang.Boolean.valueOf(this.f376814e), java.lang.Boolean.valueOf(i85Var.f376814e));
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
            fVar.e(2, this.f376813d);
            fVar.a(3, this.f376814e);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f376813d) + b36.f.a(3, this.f376814e);
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
        r45.i85 i85Var = (r45.i85) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                i85Var.f376813d = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            i85Var.f376814e = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            i85Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
