package r45;

/* loaded from: classes9.dex */
public class pd extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382952d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f382953e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.u66 f382954f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pd)) {
            return false;
        }
        r45.pd pdVar = (r45.pd) fVar;
        return n51.f.a(this.f382952d, pdVar.f382952d) && n51.f.a(this.f382953e, pdVar.f382953e) && n51.f.a(this.f382954f, pdVar.f382954f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382953e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382952d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            r45.u66 u66Var = this.f382954f;
            if (u66Var != null) {
                fVar.i(3, u66Var.computeSize());
                this.f382954f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f382952d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, linkedList);
            r45.u66 u66Var2 = this.f382954f;
            return u66Var2 != null ? j17 + b36.f.i(3, u66Var2.computeSize()) : j17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.pd pdVar = (r45.pd) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pdVar.f382952d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                r45.bn5 bn5Var = new r45.bn5();
                if (bArr2 != null && bArr2.length > 0) {
                    bn5Var.parseFrom(bArr2);
                }
                pdVar.f382953e.add(bn5Var);
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j19.get(i19);
            r45.u66 u66Var3 = new r45.u66();
            if (bArr3 != null && bArr3.length > 0) {
                u66Var3.parseFrom(bArr3);
            }
            pdVar.f382954f = u66Var3;
        }
        return 0;
    }
}
