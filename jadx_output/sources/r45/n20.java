package r45;

/* loaded from: classes4.dex */
public class n20 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f381013d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381014e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n20)) {
            return false;
        }
        r45.n20 n20Var = (r45.n20) fVar;
        return n51.f.a(this.f381013d, n20Var.f381013d) && n51.f.a(this.f381014e, n20Var.f381014e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, this.f381013d);
            java.lang.String str = this.f381014e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, this.f381013d) + 0;
            java.lang.String str2 = this.f381014e;
            return str2 != null ? g17 + b36.f.j(2, str2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f381013d.clear();
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
        r45.n20 n20Var = (r45.n20) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            n20Var.f381013d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        n20Var.f381014e = aVar2.k(intValue);
        return 0;
    }
}
