package r45;

/* loaded from: classes7.dex */
public class m97 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380287d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f380288e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m97)) {
            return false;
        }
        r45.m97 m97Var = (r45.m97) fVar;
        return n51.f.a(this.f380287d, m97Var.f380287d) && n51.f.a(this.f380288e, m97Var.f380288e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380288e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380287d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f380287d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 1, linkedList);
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
        r45.m97 m97Var = (r45.m97) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            m97Var.f380287d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        m97Var.f380288e.add(aVar2.k(intValue));
        return 0;
    }
}
