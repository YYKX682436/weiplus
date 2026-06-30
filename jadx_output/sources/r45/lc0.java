package r45;

/* loaded from: classes2.dex */
public class lc0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379298d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f379299e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lc0)) {
            return false;
        }
        r45.lc0 lc0Var = (r45.lc0) fVar;
        return n51.f.a(this.f379298d, lc0Var.f379298d) && n51.f.a(this.f379299e, lc0Var.f379299e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379298d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f379299e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f379298d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, this.f379299e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f379299e.clear();
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
        r45.lc0 lc0Var = (r45.lc0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lc0Var.f379298d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.xz4 xz4Var = new r45.xz4();
            if (bArr2 != null && bArr2.length > 0) {
                xz4Var.parseFrom(bArr2);
            }
            lc0Var.f379299e.add(xz4Var);
        }
        return 0;
    }
}
