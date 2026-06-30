package r45;

/* loaded from: classes2.dex */
public class b7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370579d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f370580e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370581f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b7)) {
            return false;
        }
        r45.b7 b7Var = (r45.b7) fVar;
        return n51.f.a(this.f370579d, b7Var.f370579d) && n51.f.a(this.f370580e, b7Var.f370580e) && n51.f.a(this.f370581f, b7Var.f370581f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f370580e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370579d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str2 = this.f370581f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f370579d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str4 = this.f370581f;
            return str4 != null ? j17 + b36.f.j(3, str4) : j17;
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
        r45.b7 b7Var = (r45.b7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            b7Var.f370579d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            b7Var.f370581f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.ce6 ce6Var = new r45.ce6();
            if (bArr2 != null && bArr2.length > 0) {
                ce6Var.parseFrom(bArr2);
            }
            b7Var.f370580e.add(ce6Var);
        }
        return 0;
    }
}
