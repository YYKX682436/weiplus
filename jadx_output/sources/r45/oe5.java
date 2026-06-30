package r45;

/* loaded from: classes8.dex */
public class oe5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f382200d;

    /* renamed from: e, reason: collision with root package name */
    public long f382201e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f382202f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f382203g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oe5)) {
            return false;
        }
        r45.oe5 oe5Var = (r45.oe5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f382200d), java.lang.Integer.valueOf(oe5Var.f382200d)) && n51.f.a(java.lang.Long.valueOf(this.f382201e), java.lang.Long.valueOf(oe5Var.f382201e)) && n51.f.a(this.f382202f, oe5Var.f382202f) && n51.f.a(java.lang.Integer.valueOf(this.f382203g), java.lang.Integer.valueOf(oe5Var.f382203g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382202f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f382200d);
            fVar.h(2, this.f382201e);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f382203g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f382200d) + 0 + b36.f.h(2, this.f382201e) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f382203g);
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
        r45.oe5 oe5Var = (r45.oe5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            oe5Var.f382200d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            oe5Var.f382201e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            oe5Var.f382203g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.xe5 xe5Var = new r45.xe5();
            if (bArr2 != null && bArr2.length > 0) {
                xe5Var.parseFrom(bArr2);
            }
            oe5Var.f382202f.add(xe5Var);
        }
        return 0;
    }
}
