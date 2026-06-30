package r45;

/* loaded from: classes2.dex */
public class xq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390330e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f390329d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f390331f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xq0)) {
            return false;
        }
        r45.xq0 xq0Var = (r45.xq0) fVar;
        return n51.f.a(this.f390329d, xq0Var.f390329d) && n51.f.a(this.f390330e, xq0Var.f390330e) && n51.f.a(this.f390331f, xq0Var.f390331f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390331f;
        java.util.LinkedList linkedList2 = this.f390329d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 2, linkedList2);
            java.lang.String str = this.f390330e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 5, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 2, linkedList2) + 0;
            java.lang.String str2 = this.f390330e;
            if (str2 != null) {
                g17 += b36.f.j(2, str2);
            }
            return g17 + b36.f.g(3, 5, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.xq0 xq0Var = (r45.xq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xq0Var.f390329d.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 2) {
            xq0Var.f390330e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        xq0Var.f390331f.add(java.lang.Float.valueOf(aVar2.f(intValue)));
        return 0;
    }
}
