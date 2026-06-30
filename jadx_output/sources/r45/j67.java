package r45;

/* loaded from: classes9.dex */
public class j67 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377615d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f377616e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j67)) {
            return false;
        }
        r45.j67 j67Var = (r45.j67) fVar;
        return n51.f.a(this.f377615d, j67Var.f377615d) && n51.f.a(this.f377616e, j67Var.f377616e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377615d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f377616e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f377615d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, this.f377616e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f377616e.clear();
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
        r45.j67 j67Var = (r45.j67) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            j67Var.f377615d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.i67 i67Var = new r45.i67();
            if (bArr2 != null && bArr2.length > 0) {
                i67Var.parseFrom(bArr2);
            }
            j67Var.f377616e.add(i67Var);
        }
        return 0;
    }
}
