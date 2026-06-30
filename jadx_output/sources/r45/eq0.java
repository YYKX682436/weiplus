package r45;

/* loaded from: classes4.dex */
public class eq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373670d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f373671e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.eq0)) {
            return false;
        }
        r45.eq0 eq0Var = (r45.eq0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373670d), java.lang.Integer.valueOf(eq0Var.f373670d)) && n51.f.a(this.f373671e, eq0Var.f373671e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373670d);
            fVar.g(2, 8, this.f373671e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f373670d) + 0 + b36.f.g(2, 8, this.f373671e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f373671e.clear();
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
        r45.eq0 eq0Var = (r45.eq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            eq0Var.f373670d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ns0 ns0Var = new r45.ns0();
            if (bArr2 != null && bArr2.length > 0) {
                ns0Var.parseFrom(bArr2);
            }
            eq0Var.f373671e.add(ns0Var);
        }
        return 0;
    }
}
