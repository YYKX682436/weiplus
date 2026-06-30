package r45;

/* loaded from: classes2.dex */
public class u04 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386908d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f386909e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u04)) {
            return false;
        }
        r45.u04 u04Var = (r45.u04) fVar;
        return n51.f.a(this.f386908d, u04Var.f386908d) && n51.f.a(this.f386909e, u04Var.f386909e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386908d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f386909e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f386908d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, this.f386909e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f386909e.clear();
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
        r45.u04 u04Var = (r45.u04) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            u04Var.f386908d = aVar2.k(intValue);
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
            u04Var.f386909e.add(xz4Var);
        }
        return 0;
    }
}
