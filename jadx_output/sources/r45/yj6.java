package r45;

/* loaded from: classes2.dex */
public class yj6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.nt4 f391159d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f391160e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f391161f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yj6)) {
            return false;
        }
        r45.yj6 yj6Var = (r45.yj6) fVar;
        return n51.f.a(this.f391159d, yj6Var.f391159d) && n51.f.a(this.f391160e, yj6Var.f391160e) && n51.f.a(this.f391161f, yj6Var.f391161f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391161f;
        java.util.LinkedList linkedList2 = this.f391160e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.nt4 nt4Var = this.f391159d;
            if (nt4Var != null) {
                fVar.i(1, nt4Var.computeSize());
                this.f391159d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.nt4 nt4Var2 = this.f391159d;
            return (nt4Var2 != null ? 0 + b36.f.i(1, nt4Var2.computeSize()) : 0) + b36.f.g(2, 8, linkedList2) + b36.f.g(3, 8, linkedList);
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
        r45.yj6 yj6Var = (r45.yj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.nt4 nt4Var3 = new r45.nt4();
                if (bArr2 != null && bArr2.length > 0) {
                    nt4Var3.parseFrom(bArr2);
                }
                yj6Var.f391159d = nt4Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.e14 e14Var = new r45.e14();
                if (bArr3 != null && bArr3.length > 0) {
                    e14Var.parseFrom(bArr3);
                }
                yj6Var.f391160e.add(e14Var);
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.rl6 rl6Var = new r45.rl6();
            if (bArr4 != null && bArr4.length > 0) {
                rl6Var.parseFrom(bArr4);
            }
            yj6Var.f391161f.add(rl6Var);
        }
        return 0;
    }
}
