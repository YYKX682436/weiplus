package r45;

/* loaded from: classes4.dex */
public class ze extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f391947d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f391948e;

    /* renamed from: f, reason: collision with root package name */
    public int f391949f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ze)) {
            return false;
        }
        r45.ze zeVar = (r45.ze) fVar;
        return n51.f.a(this.BaseRequest, zeVar.BaseRequest) && n51.f.a(this.f391947d, zeVar.f391947d) && n51.f.a(java.lang.Integer.valueOf(this.f391948e), java.lang.Integer.valueOf(zeVar.f391948e)) && n51.f.a(java.lang.Integer.valueOf(this.f391949f), java.lang.Integer.valueOf(zeVar.f391949f));
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
            fVar.g(2, 8, this.f391947d);
            fVar.e(3, this.f391948e);
            fVar.e(4, this.f391949f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 8, this.f391947d) + b36.f.e(3, this.f391948e) + b36.f.e(4, this.f391949f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f391947d.clear();
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
        r45.ze zeVar = (r45.ze) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                zeVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                zeVar.f391948e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            zeVar.f391949f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.y55 y55Var = new r45.y55();
            if (bArr3 != null && bArr3.length > 0) {
                y55Var.parseFrom(bArr3);
            }
            zeVar.f391947d.add(y55Var);
        }
        return 0;
    }
}
