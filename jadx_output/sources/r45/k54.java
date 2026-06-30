package r45;

/* loaded from: classes4.dex */
public class k54 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378382d;

    /* renamed from: e, reason: collision with root package name */
    public int f378383e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f378384f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k54)) {
            return false;
        }
        r45.k54 k54Var = (r45.k54) fVar;
        return n51.f.a(this.f378382d, k54Var.f378382d) && n51.f.a(java.lang.Integer.valueOf(this.f378383e), java.lang.Integer.valueOf(k54Var.f378383e)) && n51.f.a(this.f378384f, k54Var.f378384f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f378384f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378382d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f378383e);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f378382d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f378383e) + b36.f.g(3, 8, linkedList);
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
        r45.k54 k54Var = (r45.k54) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k54Var.f378382d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            k54Var.f378383e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.nb7 nb7Var = new r45.nb7();
            if (bArr2 != null && bArr2.length > 0) {
                nb7Var.parseFrom(bArr2);
            }
            k54Var.f378384f.add(nb7Var);
        }
        return 0;
    }
}
