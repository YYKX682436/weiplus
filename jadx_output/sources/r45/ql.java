package r45;

/* loaded from: classes4.dex */
public class ql extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f384080d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f384081e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ql)) {
            return false;
        }
        r45.ql qlVar = (r45.ql) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f384080d), java.lang.Long.valueOf(qlVar.f384080d)) && n51.f.a(this.f384081e, qlVar.f384081e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384081e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f384080d);
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f384080d) + 0 + b36.f.g(2, 8, linkedList);
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
        r45.ql qlVar = (r45.ql) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qlVar.f384080d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.kw3 kw3Var = new r45.kw3();
            if (bArr2 != null && bArr2.length > 0) {
                kw3Var.parseFrom(bArr2);
            }
            qlVar.f384081e.add(kw3Var);
        }
        return 0;
    }
}
