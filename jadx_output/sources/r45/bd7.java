package r45;

/* loaded from: classes4.dex */
public class bd7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370684d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370685e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f370686f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bd7)) {
            return false;
        }
        r45.bd7 bd7Var = (r45.bd7) fVar;
        return n51.f.a(this.f370684d, bd7Var.f370684d) && n51.f.a(this.f370685e, bd7Var.f370685e) && n51.f.a(this.f370686f, bd7Var.f370686f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f370686f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370684d;
            if (str != null) {
                fVar.j(1, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f370685e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f370684d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f370685e;
            if (gVar2 != null) {
                j17 += b36.f.b(2, gVar2);
            }
            return j17 + b36.f.g(3, 8, linkedList);
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
        r45.bd7 bd7Var = (r45.bd7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bd7Var.f370684d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            bd7Var.f370685e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.yc7 yc7Var = new r45.yc7();
            if (bArr2 != null && bArr2.length > 0) {
                yc7Var.parseFrom(bArr2);
            }
            bd7Var.f370686f.add(yc7Var);
        }
        return 0;
    }
}
