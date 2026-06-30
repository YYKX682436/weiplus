package r45;

/* loaded from: classes2.dex */
public class mj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380552d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f380553e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f380554f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mj)) {
            return false;
        }
        r45.mj mjVar = (r45.mj) fVar;
        return n51.f.a(this.f380552d, mjVar.f380552d) && n51.f.a(this.f380553e, mjVar.f380553e) && n51.f.a(java.lang.Boolean.valueOf(this.f380554f), java.lang.Boolean.valueOf(mjVar.f380554f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380553e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380552d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            fVar.a(3, this.f380554f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f380552d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, linkedList) + b36.f.a(3, this.f380554f);
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
        r45.mj mjVar = (r45.mj) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mjVar.f380552d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            mjVar.f380554f = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.oj ojVar = new r45.oj();
            if (bArr2 != null && bArr2.length > 0) {
                ojVar.parseFrom(bArr2);
            }
            mjVar.f380553e.add(ojVar);
        }
        return 0;
    }
}
