package r45;

/* loaded from: classes8.dex */
public class fk5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f374412d;

    /* renamed from: e, reason: collision with root package name */
    public r45.i34 f374413e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f374414f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fk5)) {
            return false;
        }
        r45.fk5 fk5Var = (r45.fk5) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f374412d), java.lang.Boolean.valueOf(fk5Var.f374412d)) && n51.f.a(this.f374413e, fk5Var.f374413e) && n51.f.a(this.f374414f, fk5Var.f374414f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374414f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f374412d);
            r45.i34 i34Var = this.f374413e;
            if (i34Var != null) {
                fVar.i(2, i34Var.computeSize());
                this.f374413e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f374412d) + 0;
            r45.i34 i34Var2 = this.f374413e;
            if (i34Var2 != null) {
                a17 += b36.f.i(2, i34Var2.computeSize());
            }
            return a17 + b36.f.g(3, 8, linkedList);
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
        r45.fk5 fk5Var = (r45.fk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fk5Var.f374412d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.i34 i34Var3 = new r45.i34();
                if (bArr2 != null && bArr2.length > 0) {
                    i34Var3.parseFrom(bArr2);
                }
                fk5Var.f374413e = i34Var3;
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
            r45.i34 i34Var4 = new r45.i34();
            if (bArr3 != null && bArr3.length > 0) {
                i34Var4.parseFrom(bArr3);
            }
            fk5Var.f374414f.add(i34Var4);
        }
        return 0;
    }
}
