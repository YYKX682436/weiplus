package r45;

/* loaded from: classes4.dex */
public class zt3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392365d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f392366e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zt3)) {
            return false;
        }
        r45.zt3 zt3Var = (r45.zt3) fVar;
        return n51.f.a(this.f392365d, zt3Var.f392365d) && n51.f.a(this.f392366e, zt3Var.f392366e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f392365d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f392366e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f392365d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, this.f392366e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f392366e.clear();
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
        r45.zt3 zt3Var = (r45.zt3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zt3Var.f392365d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.jj4 jj4Var = new r45.jj4();
            if (bArr2 != null && bArr2.length > 0) {
                jj4Var.parseFrom(bArr2);
            }
            zt3Var.f392366e.add(jj4Var);
        }
        return 0;
    }
}
