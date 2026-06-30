package r45;

/* loaded from: classes2.dex */
public class zs extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392345d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f392346e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zs)) {
            return false;
        }
        r45.zs zsVar = (r45.zs) fVar;
        return n51.f.a(this.f392345d, zsVar.f392345d) && n51.f.a(this.f392346e, zsVar.f392346e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f392346e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f392345d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f392345d;
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
        r45.zs zsVar = (r45.zs) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zsVar.f392345d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        zsVar.f392346e.add(aVar2.k(intValue));
        return 0;
    }
}
