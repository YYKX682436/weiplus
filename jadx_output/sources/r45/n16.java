package r45;

/* loaded from: classes4.dex */
public class n16 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380995d;

    /* renamed from: e, reason: collision with root package name */
    public int f380996e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380997f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n16)) {
            return false;
        }
        r45.n16 n16Var = (r45.n16) fVar;
        return n51.f.a(this.BaseRequest, n16Var.BaseRequest) && n51.f.a(this.f380995d, n16Var.f380995d) && n51.f.a(java.lang.Integer.valueOf(this.f380996e), java.lang.Integer.valueOf(n16Var.f380996e)) && n51.f.a(this.f380997f, n16Var.f380997f);
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
            java.lang.String str = this.f380995d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f380996e);
            java.lang.String str2 = this.f380997f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f380995d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f380996e);
            java.lang.String str4 = this.f380997f;
            return str4 != null ? e17 + b36.f.j(4, str4) : e17;
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
        r45.n16 n16Var = (r45.n16) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                n16Var.f380995d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                n16Var.f380996e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            n16Var.f380997f = aVar2.k(intValue);
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
            n16Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
