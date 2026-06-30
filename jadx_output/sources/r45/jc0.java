package r45;

/* loaded from: classes4.dex */
public class jc0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377695d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f377696e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jc0)) {
            return false;
        }
        r45.jc0 jc0Var = (r45.jc0) fVar;
        return n51.f.a(this.f377695d, jc0Var.f377695d) && n51.f.a(this.f377696e, jc0Var.f377696e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377695d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, this.f377696e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f377695d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 1, this.f377696e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f377696e.clear();
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
        r45.jc0 jc0Var = (r45.jc0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jc0Var.f377695d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        jc0Var.f377696e.add(aVar2.k(intValue));
        return 0;
    }
}
