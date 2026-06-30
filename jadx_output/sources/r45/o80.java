package r45;

/* loaded from: classes10.dex */
public class o80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f382018d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f382019e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o80)) {
            return false;
        }
        r45.o80 o80Var = (r45.o80) fVar;
        return n51.f.a(this.f382018d, o80Var.f382018d) && n51.f.a(java.lang.Integer.valueOf(this.f382019e), java.lang.Integer.valueOf(o80Var.f382019e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f382018d);
            fVar.e(2, this.f382019e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f382018d) + 0 + b36.f.e(2, this.f382019e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f382018d.clear();
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
        r45.o80 o80Var = (r45.o80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            o80Var.f382019e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.c5 c5Var = new r45.c5();
            if (bArr2 != null && bArr2.length > 0) {
                c5Var.parseFrom(bArr2);
            }
            o80Var.f382018d.add(c5Var);
        }
        return 0;
    }
}
