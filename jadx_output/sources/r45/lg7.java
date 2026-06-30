package r45;

/* loaded from: classes4.dex */
public class lg7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379463d;

    /* renamed from: e, reason: collision with root package name */
    public int f379464e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f379465f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lg7)) {
            return false;
        }
        r45.lg7 lg7Var = (r45.lg7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379463d), java.lang.Integer.valueOf(lg7Var.f379463d)) && n51.f.a(java.lang.Integer.valueOf(this.f379464e), java.lang.Integer.valueOf(lg7Var.f379464e)) && n51.f.a(this.f379465f, lg7Var.f379465f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379465f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379463d);
            fVar.e(2, this.f379464e);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f379463d) + 0 + b36.f.e(2, this.f379464e) + b36.f.g(3, 8, linkedList);
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
        r45.lg7 lg7Var = (r45.lg7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lg7Var.f379463d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            lg7Var.f379464e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.k54 k54Var = new r45.k54();
            if (bArr2 != null && bArr2.length > 0) {
                k54Var.parseFrom(bArr2);
            }
            lg7Var.f379465f.add(k54Var);
        }
        return 0;
    }
}
