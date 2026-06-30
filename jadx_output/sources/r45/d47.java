package r45;

/* loaded from: classes4.dex */
public class d47 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372114d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372115e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f372116f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f372117g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d47)) {
            return false;
        }
        r45.d47 d47Var = (r45.d47) fVar;
        return n51.f.a(this.f372114d, d47Var.f372114d) && n51.f.a(this.f372115e, d47Var.f372115e) && n51.f.a(this.f372116f, d47Var.f372116f) && n51.f.a(java.lang.Integer.valueOf(this.f372117g), java.lang.Integer.valueOf(d47Var.f372117g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372116f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372114d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372115e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, linkedList);
            fVar.e(4, this.f372117g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f372114d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f372115e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.g(3, 1, linkedList) + b36.f.e(4, this.f372117g);
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
        r45.d47 d47Var = (r45.d47) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            d47Var.f372114d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            d47Var.f372115e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            d47Var.f372116f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        d47Var.f372117g = aVar2.g(intValue);
        return 0;
    }
}
