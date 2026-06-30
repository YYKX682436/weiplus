package r45;

/* loaded from: classes9.dex */
public class u66 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387089d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f387090e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f387091f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u66)) {
            return false;
        }
        r45.u66 u66Var = (r45.u66) fVar;
        return n51.f.a(this.f387089d, u66Var.f387089d) && n51.f.a(this.f387090e, u66Var.f387090e) && n51.f.a(this.f387091f, u66Var.f387091f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387091f;
        java.util.LinkedList linkedList2 = this.f387090e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387089d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList2);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f387089d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, linkedList2) + b36.f.g(3, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.u66 u66Var = (r45.u66) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            u66Var.f387089d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.if0 if0Var = new r45.if0();
                if (bArr2 != null && bArr2.length > 0) {
                    if0Var.parseFrom(bArr2);
                }
                u66Var.f387090e.add(if0Var);
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.if0 if0Var2 = new r45.if0();
            if (bArr3 != null && bArr3.length > 0) {
                if0Var2.parseFrom(bArr3);
            }
            u66Var.f387091f.add(if0Var2);
        }
        return 0;
    }
}
