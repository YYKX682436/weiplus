package r45;

/* loaded from: classes7.dex */
public class y47 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.a47 f390787d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f390788e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f390789f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y47)) {
            return false;
        }
        r45.y47 y47Var = (r45.y47) fVar;
        return n51.f.a(this.f390787d, y47Var.f390787d) && n51.f.a(this.f390788e, y47Var.f390788e) && n51.f.a(java.lang.Integer.valueOf(this.f390789f), java.lang.Integer.valueOf(y47Var.f390789f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390788e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.a47 a47Var = this.f390787d;
            if (a47Var != null) {
                fVar.i(1, a47Var.computeSize());
                this.f390787d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f390789f);
            return 0;
        }
        if (i17 == 1) {
            r45.a47 a47Var2 = this.f390787d;
            return (a47Var2 != null ? 0 + b36.f.i(1, a47Var2.computeSize()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f390789f);
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
        r45.y47 y47Var = (r45.y47) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.a47 a47Var3 = new r45.a47();
                if (bArr2 != null && bArr2.length > 0) {
                    a47Var3.parseFrom(bArr2);
                }
                y47Var.f390787d = a47Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            y47Var.f390789f = aVar2.g(intValue);
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
            y47Var.f390788e.add(l47Var);
        }
        return 0;
    }
}
