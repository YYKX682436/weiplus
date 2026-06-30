package r45;

/* loaded from: classes4.dex */
public class rc5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384728d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384729e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384730f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rc5)) {
            return false;
        }
        r45.rc5 rc5Var = (r45.rc5) fVar;
        return n51.f.a(this.BaseRequest, rc5Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f384728d), java.lang.Integer.valueOf(rc5Var.f384728d)) && n51.f.a(this.f384729e, rc5Var.f384729e) && n51.f.a(this.f384730f, rc5Var.f384730f);
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
            fVar.e(2, this.f384728d);
            java.lang.String str = this.f384729e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f384730f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f384728d);
            java.lang.String str3 = this.f384729e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f384730f;
            return str4 != null ? i18 + b36.f.j(4, str4) : i18;
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
        r45.rc5 rc5Var = (r45.rc5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                rc5Var.f384728d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                rc5Var.f384729e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            rc5Var.f384730f = aVar2.k(intValue);
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
            rc5Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
