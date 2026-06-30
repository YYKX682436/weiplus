package r45;

/* loaded from: classes9.dex */
public class rl6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f384987d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384988e;

    /* renamed from: f, reason: collision with root package name */
    public int f384989f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rl6)) {
            return false;
        }
        r45.rl6 rl6Var = (r45.rl6) fVar;
        return n51.f.a(this.f384987d, rl6Var.f384987d) && n51.f.a(this.f384988e, rl6Var.f384988e) && n51.f.a(java.lang.Integer.valueOf(this.f384989f), java.lang.Integer.valueOf(rl6Var.f384989f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384987d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f384988e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f384989f);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str2 = this.f384988e;
            if (str2 != null) {
                g17 += b36.f.j(2, str2);
            }
            return g17 + b36.f.e(3, this.f384989f);
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
        r45.rl6 rl6Var = (r45.rl6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                rl6Var.f384988e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            rl6Var.f384989f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.hl6 hl6Var = new r45.hl6();
            if (bArr2 != null && bArr2.length > 0) {
                hl6Var.parseFrom(bArr2);
            }
            rl6Var.f384987d.add(hl6Var);
        }
        return 0;
    }
}
