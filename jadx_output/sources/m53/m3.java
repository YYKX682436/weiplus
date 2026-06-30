package m53;

/* loaded from: classes8.dex */
public class m3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323902d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323903e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f323904f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.m3)) {
            return false;
        }
        m53.m3 m3Var = (m53.m3) fVar;
        return n51.f.a(this.f323902d, m3Var.f323902d) && n51.f.a(this.f323903e, m3Var.f323903e) && n51.f.a(this.f323904f, m3Var.f323904f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f323904f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323902d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f323903e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f323902d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f323903e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.g(3, 1, linkedList);
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
        m53.m3 m3Var = (m53.m3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            m3Var.f323902d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            m3Var.f323903e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        m3Var.f323904f.add(aVar2.k(intValue));
        return 0;
    }
}
