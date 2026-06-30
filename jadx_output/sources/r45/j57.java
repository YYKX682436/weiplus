package r45;

/* loaded from: classes7.dex */
public class j57 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.b47 f377597d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f377598e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f377599f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j57)) {
            return false;
        }
        r45.j57 j57Var = (r45.j57) fVar;
        return n51.f.a(this.f377597d, j57Var.f377597d) && n51.f.a(this.f377598e, j57Var.f377598e) && n51.f.a(java.lang.Integer.valueOf(this.f377599f), java.lang.Integer.valueOf(j57Var.f377599f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f377598e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.b47 b47Var = this.f377597d;
            if (b47Var != null) {
                fVar.i(1, b47Var.computeSize());
                this.f377597d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f377599f);
            return 0;
        }
        if (i17 == 1) {
            r45.b47 b47Var2 = this.f377597d;
            return (b47Var2 != null ? 0 + b36.f.i(1, b47Var2.computeSize()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f377599f);
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
        r45.j57 j57Var = (r45.j57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.b47 b47Var3 = new r45.b47();
                if (bArr2 != null && bArr2.length > 0) {
                    b47Var3.parseFrom(bArr2);
                }
                j57Var.f377597d = b47Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            j57Var.f377599f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.l47 l47Var = new r45.l47();
            if (bArr3 != null && bArr3.length > 0) {
                l47Var.parseFrom(bArr3);
            }
            j57Var.f377598e.add(l47Var);
        }
        return 0;
    }
}
