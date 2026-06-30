package m53;

/* loaded from: classes4.dex */
public class e5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f323658d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323659e;

    /* renamed from: f, reason: collision with root package name */
    public int f323660f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.e5)) {
            return false;
        }
        m53.e5 e5Var = (m53.e5) fVar;
        return n51.f.a(this.f323658d, e5Var.f323658d) && n51.f.a(this.f323659e, e5Var.f323659e) && n51.f.a(java.lang.Integer.valueOf(this.f323660f), java.lang.Integer.valueOf(e5Var.f323660f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f323658d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList);
            java.lang.String str = this.f323659e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f323660f);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, linkedList) + 0;
            java.lang.String str2 = this.f323659e;
            if (str2 != null) {
                g17 += b36.f.j(2, str2);
            }
            return g17 + b36.f.e(3, this.f323660f);
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
        m53.e5 e5Var = (m53.e5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e5Var.f323658d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 2) {
            e5Var.f323659e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        e5Var.f323660f = aVar2.g(intValue);
        return 0;
    }
}
