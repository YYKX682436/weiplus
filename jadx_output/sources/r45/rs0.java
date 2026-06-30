package r45;

/* loaded from: classes4.dex */
public class rs0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385169d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f385170e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f385171f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rs0)) {
            return false;
        }
        r45.rs0 rs0Var = (r45.rs0) fVar;
        return n51.f.a(this.BaseRequest, rs0Var.BaseRequest) && n51.f.a(this.f385169d, rs0Var.f385169d) && n51.f.a(this.f385170e, rs0Var.f385170e) && n51.f.a(this.f385171f, rs0Var.f385171f);
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
            java.lang.String str = this.f385169d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f385170e);
            fVar.g(4, 1, this.f385171f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f385169d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.g(3, 1, this.f385170e) + b36.f.g(4, 1, this.f385171f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f385170e.clear();
            this.f385171f.clear();
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
        r45.rs0 rs0Var = (r45.rs0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                rs0Var.f385169d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                rs0Var.f385170e.add(aVar2.k(intValue));
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            rs0Var.f385171f.add(aVar2.k(intValue));
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr2 = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr2 != null && bArr2.length > 0) {
                heVar3.parseFrom(bArr2);
            }
            rs0Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
