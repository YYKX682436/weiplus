package r45;

/* loaded from: classes2.dex */
public class ra6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384697d;

    /* renamed from: e, reason: collision with root package name */
    public long f384698e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384699f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ra6)) {
            return false;
        }
        r45.ra6 ra6Var = (r45.ra6) fVar;
        return n51.f.a(this.BaseRequest, ra6Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f384697d), java.lang.Integer.valueOf(ra6Var.f384697d)) && n51.f.a(java.lang.Long.valueOf(this.f384698e), java.lang.Long.valueOf(ra6Var.f384698e)) && n51.f.a(this.f384699f, ra6Var.f384699f);
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
            fVar.e(2, this.f384697d);
            fVar.h(3, this.f384698e);
            java.lang.String str = this.f384699f;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f384697d) + b36.f.h(3, this.f384698e);
            java.lang.String str2 = this.f384699f;
            return str2 != null ? i18 + b36.f.j(4, str2) : i18;
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
        r45.ra6 ra6Var = (r45.ra6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                ra6Var.f384697d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                ra6Var.f384698e = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            ra6Var.f384699f = aVar2.k(intValue);
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
            ra6Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
