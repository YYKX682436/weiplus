package p33;

/* loaded from: classes2.dex */
public class i0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f351592d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f351593e;

    /* renamed from: g, reason: collision with root package name */
    public int f351595g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f351594f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f351596h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p33.i0)) {
            return false;
        }
        p33.i0 i0Var = (p33.i0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f351592d), java.lang.Integer.valueOf(i0Var.f351592d)) && n51.f.a(this.f351593e, i0Var.f351593e) && n51.f.a(this.f351594f, i0Var.f351594f) && n51.f.a(java.lang.Integer.valueOf(this.f351595g), java.lang.Integer.valueOf(i0Var.f351595g)) && n51.f.a(this.f351596h, i0Var.f351596h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f351596h;
        java.util.LinkedList linkedList2 = this.f351594f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f351592d);
            java.lang.String str = this.f351593e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, linkedList2);
            fVar.e(4, this.f351595g);
            fVar.g(5, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f351592d) + 0;
            java.lang.String str2 = this.f351593e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.g(3, 1, linkedList2) + b36.f.e(4, this.f351595g) + b36.f.g(5, 1, linkedList);
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
        p33.i0 i0Var = (p33.i0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i0Var.f351592d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            i0Var.f351593e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            i0Var.f351594f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 4) {
            i0Var.f351595g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        i0Var.f351596h.add(aVar2.k(intValue));
        return 0;
    }
}
