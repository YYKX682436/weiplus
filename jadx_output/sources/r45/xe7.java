package r45;

/* loaded from: classes2.dex */
public class xe7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f390041d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390042e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390043f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xe7)) {
            return false;
        }
        r45.xe7 xe7Var = (r45.xe7) fVar;
        return n51.f.a(this.BaseRequest, xe7Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f390041d), java.lang.Integer.valueOf(xe7Var.f390041d)) && n51.f.a(this.f390042e, xe7Var.f390042e) && n51.f.a(this.f390043f, xe7Var.f390043f);
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
            fVar.e(2, this.f390041d);
            com.tencent.mm.protobuf.g gVar = this.f390042e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            java.lang.String str = this.f390043f;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f390041d);
            com.tencent.mm.protobuf.g gVar2 = this.f390042e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            java.lang.String str2 = this.f390043f;
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
        r45.xe7 xe7Var = (r45.xe7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                xe7Var.f390041d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                xe7Var.f390042e = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            xe7Var.f390043f = aVar2.k(intValue);
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
            xe7Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
