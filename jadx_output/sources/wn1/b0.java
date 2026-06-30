package wn1;

/* loaded from: classes9.dex */
public class b0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f447398d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f447399e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f447400f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f447401g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.b0)) {
            return false;
        }
        wn1.b0 b0Var = (wn1.b0) fVar;
        return n51.f.a(this.f447398d, b0Var.f447398d) && n51.f.a(this.f447399e, b0Var.f447399e) && n51.f.a(this.f447400f, b0Var.f447400f) && n51.f.a(this.f447401g, b0Var.f447401g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f447400f;
        java.util.LinkedList linkedList2 = this.f447399e;
        java.util.LinkedList linkedList3 = this.f447398d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 3, linkedList3);
            fVar.g(2, 1, linkedList2);
            fVar.g(3, 1, linkedList);
            java.lang.String str = this.f447401g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 3, linkedList3) + 0 + b36.f.g(2, 1, linkedList2) + b36.f.g(3, 1, linkedList);
            java.lang.String str2 = this.f447401g;
            return str2 != null ? g17 + b36.f.j(4, str2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
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
        wn1.b0 b0Var = (wn1.b0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            b0Var.f447398d.add(java.lang.Long.valueOf(aVar2.i(intValue)));
            return 0;
        }
        if (intValue == 2) {
            b0Var.f447399e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            b0Var.f447400f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        b0Var.f447401g = aVar2.k(intValue);
        return 0;
    }
}
