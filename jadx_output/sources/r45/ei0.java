package r45;

/* loaded from: classes10.dex */
public class ei0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f373529d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f373530e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ei0)) {
            return false;
        }
        r45.ei0 ei0Var = (r45.ei0) fVar;
        return n51.f.a(this.f373529d, ei0Var.f373529d) && n51.f.a(this.f373530e, ei0Var.f373530e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f373529d);
            fVar.g(2, 8, this.f373530e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f373529d) + 0 + b36.f.g(2, 8, this.f373530e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f373529d.clear();
            this.f373530e.clear();
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
        r45.ei0 ei0Var = (r45.ei0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ji0 ji0Var = new r45.ji0();
                if (bArr2 != null && bArr2.length > 0) {
                    ji0Var.parseFrom(bArr2);
                }
                ei0Var.f373529d.add(ji0Var);
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
            r45.gi0 gi0Var = new r45.gi0();
            if (bArr3 != null && bArr3.length > 0) {
                gi0Var.parseFrom(bArr3);
            }
            ei0Var.f373530e.add(gi0Var);
        }
        return 0;
    }
}
