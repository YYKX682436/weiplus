package r45;

/* loaded from: classes4.dex */
public class cf5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f371524d;

    /* renamed from: e, reason: collision with root package name */
    public int f371525e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371526f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cf5)) {
            return false;
        }
        r45.cf5 cf5Var = (r45.cf5) fVar;
        return n51.f.a(this.BaseRequest, cf5Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f371524d), java.lang.Integer.valueOf(cf5Var.f371524d)) && n51.f.a(java.lang.Integer.valueOf(this.f371525e), java.lang.Integer.valueOf(cf5Var.f371525e)) && n51.f.a(this.f371526f, cf5Var.f371526f);
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
            fVar.e(2, this.f371524d);
            fVar.e(3, this.f371525e);
            java.lang.String str = this.f371526f;
            if (str != null) {
                fVar.j(100, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f371524d) + b36.f.e(3, this.f371525e);
            java.lang.String str2 = this.f371526f;
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
        r45.cf5 cf5Var = (r45.cf5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                cf5Var.f371524d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                cf5Var.f371525e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 100) {
                return -1;
            }
            cf5Var.f371526f = aVar2.k(intValue);
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
            cf5Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
