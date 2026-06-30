package r45;

/* loaded from: classes8.dex */
public class dn4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f372595d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372596e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f372597f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dn4)) {
            return false;
        }
        r45.dn4 dn4Var = (r45.dn4) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f372595d), java.lang.Boolean.valueOf(dn4Var.f372595d)) && n51.f.a(this.f372596e, dn4Var.f372596e) && n51.f.a(this.f372597f, dn4Var.f372597f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372597f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f372595d);
            java.lang.String str = this.f372596e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f372595d) + 0;
            java.lang.String str2 = this.f372596e;
            if (str2 != null) {
                a17 += b36.f.j(2, str2);
            }
            return a17 + b36.f.g(3, 2, linkedList);
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
        r45.dn4 dn4Var = (r45.dn4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dn4Var.f372595d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            dn4Var.f372596e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        dn4Var.f372597f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
        return 0;
    }
}
