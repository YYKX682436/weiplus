package r45;

/* loaded from: classes9.dex */
public class qm5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rm5 f384095d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rm5 f384096e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f384097f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qm5)) {
            return false;
        }
        r45.qm5 qm5Var = (r45.qm5) fVar;
        return n51.f.a(this.f384095d, qm5Var.f384095d) && n51.f.a(this.f384096e, qm5Var.f384096e) && n51.f.a(this.f384097f, qm5Var.f384097f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384097f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rm5 rm5Var = this.f384095d;
            if (rm5Var != null) {
                fVar.i(1, rm5Var.computeSize());
                this.f384095d.writeFields(fVar);
            }
            r45.rm5 rm5Var2 = this.f384096e;
            if (rm5Var2 != null) {
                fVar.i(2, rm5Var2.computeSize());
                this.f384096e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.rm5 rm5Var3 = this.f384095d;
            int i18 = rm5Var3 != null ? 0 + b36.f.i(1, rm5Var3.computeSize()) : 0;
            r45.rm5 rm5Var4 = this.f384096e;
            if (rm5Var4 != null) {
                i18 += b36.f.i(2, rm5Var4.computeSize());
            }
            return i18 + b36.f.g(3, 8, linkedList);
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
        r45.qm5 qm5Var = (r45.qm5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.rm5 rm5Var5 = new r45.rm5();
                if (bArr2 != null && bArr2.length > 0) {
                    rm5Var5.parseFrom(bArr2);
                }
                qm5Var.f384095d = rm5Var5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.rm5 rm5Var6 = new r45.rm5();
                if (bArr3 != null && bArr3.length > 0) {
                    rm5Var6.parseFrom(bArr3);
                }
                qm5Var.f384096e = rm5Var6;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.pm5 pm5Var = new r45.pm5();
            if (bArr4 != null && bArr4.length > 0) {
                pm5Var.parseFrom(bArr4);
            }
            qm5Var.f384097f.add(pm5Var);
        }
        return 0;
    }
}
