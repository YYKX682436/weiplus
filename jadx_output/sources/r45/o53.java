package r45;

/* loaded from: classes4.dex */
public class o53 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.r67 f381940d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f381941e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o53)) {
            return false;
        }
        r45.o53 o53Var = (r45.o53) fVar;
        return n51.f.a(this.f381940d, o53Var.f381940d) && n51.f.a(this.f381941e, o53Var.f381941e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381941e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.r67 r67Var = this.f381940d;
            if (r67Var != null) {
                fVar.i(1, r67Var.computeSize());
                this.f381940d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.r67 r67Var2 = this.f381940d;
            return (r67Var2 != null ? 0 + b36.f.i(1, r67Var2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
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
        r45.o53 o53Var = (r45.o53) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.r67 r67Var3 = new r45.r67();
                if (bArr2 != null && bArr2.length > 0) {
                    r67Var3.parseFrom(bArr2);
                }
                o53Var.f381940d = r67Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.n53 n53Var = new r45.n53();
            if (bArr3 != null && bArr3.length > 0) {
                n53Var.parseFrom(bArr3);
            }
            o53Var.f381941e.add(n53Var);
        }
        return 0;
    }
}
