package r45;

/* loaded from: classes4.dex */
public class zx4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392455d;

    /* renamed from: e, reason: collision with root package name */
    public r45.va5 f392456e;

    /* renamed from: f, reason: collision with root package name */
    public double f392457f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f392458g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zx4)) {
            return false;
        }
        r45.zx4 zx4Var = (r45.zx4) fVar;
        return n51.f.a(this.f392455d, zx4Var.f392455d) && n51.f.a(this.f392456e, zx4Var.f392456e) && n51.f.a(java.lang.Double.valueOf(this.f392457f), java.lang.Double.valueOf(zx4Var.f392457f)) && n51.f.a(this.f392458g, zx4Var.f392458g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f392458g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f392455d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.va5 va5Var = this.f392456e;
            if (va5Var != null) {
                fVar.i(2, va5Var.computeSize());
                this.f392456e.writeFields(fVar);
            }
            fVar.c(3, this.f392457f);
            fVar.g(4, 4, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f392455d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.va5 va5Var2 = this.f392456e;
            if (va5Var2 != null) {
                j17 += b36.f.i(2, va5Var2.computeSize());
            }
            return j17 + b36.f.c(3, this.f392457f) + b36.f.g(4, 4, linkedList);
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
        r45.zx4 zx4Var = (r45.zx4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zx4Var.f392455d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                zx4Var.f392457f = aVar2.e(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            zx4Var.f392458g.add(java.lang.Double.valueOf(aVar2.e(intValue)));
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.va5 va5Var3 = new r45.va5();
            if (bArr2 != null && bArr2.length > 0) {
                va5Var3.parseFrom(bArr2);
            }
            zx4Var.f392456e = va5Var3;
        }
        return 0;
    }
}
