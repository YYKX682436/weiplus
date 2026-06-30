package r45;

/* loaded from: classes2.dex */
public class hb4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f376004d;

    /* renamed from: e, reason: collision with root package name */
    public int f376005e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f376006f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hb4)) {
            return false;
        }
        r45.hb4 hb4Var = (r45.hb4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f376004d), java.lang.Long.valueOf(hb4Var.f376004d)) && n51.f.a(java.lang.Integer.valueOf(this.f376005e), java.lang.Integer.valueOf(hb4Var.f376005e)) && n51.f.a(this.f376006f, hb4Var.f376006f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f376006f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f376004d);
            fVar.e(2, this.f376005e);
            fVar.g(3, 3, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f376004d) + 0 + b36.f.e(2, this.f376005e) + b36.f.g(3, 3, linkedList);
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
        r45.hb4 hb4Var = (r45.hb4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hb4Var.f376004d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            hb4Var.f376005e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        hb4Var.f376006f.add(java.lang.Long.valueOf(aVar2.i(intValue)));
        return 0;
    }
}
