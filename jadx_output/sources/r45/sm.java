package r45;

/* loaded from: classes4.dex */
public class sm extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385840d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f385841e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f385842f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sm)) {
            return false;
        }
        r45.sm smVar = (r45.sm) fVar;
        return n51.f.a(this.f385840d, smVar.f385840d) && n51.f.a(this.f385841e, smVar.f385841e) && n51.f.a(java.lang.Boolean.valueOf(this.f385842f), java.lang.Boolean.valueOf(smVar.f385842f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385841e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385840d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 2, linkedList);
            fVar.a(3, this.f385842f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f385840d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 2, linkedList) + b36.f.a(3, this.f385842f);
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
        r45.sm smVar = (r45.sm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            smVar.f385840d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            smVar.f385841e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        smVar.f385842f = aVar2.c(intValue);
        return 0;
    }
}
