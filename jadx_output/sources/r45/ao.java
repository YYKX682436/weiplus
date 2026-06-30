package r45;

/* loaded from: classes4.dex */
public class ao extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370161d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f370162e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ao)) {
            return false;
        }
        r45.ao aoVar = (r45.ao) fVar;
        return n51.f.a(this.f370161d, aoVar.f370161d) && n51.f.a(this.f370162e, aoVar.f370162e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370161d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f370162e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f370161d;
            return (str2 != null ? 0 + b36.f.j(2, str2) : 0) + b36.f.g(3, 1, this.f370162e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f370162e.clear();
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
        r45.ao aoVar = (r45.ao) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 2) {
            aoVar.f370161d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        aoVar.f370162e.add(aVar2.k(intValue));
        return 0;
    }
}
