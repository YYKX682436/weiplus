package r45;

/* loaded from: classes4.dex */
public class kw6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f379006d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.lw6 f379007e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kw6)) {
            return false;
        }
        r45.kw6 kw6Var = (r45.kw6) fVar;
        return n51.f.a(this.f379006d, kw6Var.f379006d) && n51.f.a(this.f379007e, kw6Var.f379007e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379006d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            r45.lw6 lw6Var = this.f379007e;
            if (lw6Var != null) {
                fVar.i(2, lw6Var.computeSize());
                this.f379007e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            r45.lw6 lw6Var2 = this.f379007e;
            return lw6Var2 != null ? g17 + b36.f.i(2, lw6Var2.computeSize()) : g17;
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
        r45.kw6 kw6Var = (r45.kw6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.lw6 lw6Var3 = new r45.lw6();
                if (bArr2 != null && bArr2.length > 0) {
                    lw6Var3.parseFrom(bArr2);
                }
                kw6Var.f379006d.add(lw6Var3);
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
            r45.lw6 lw6Var4 = new r45.lw6();
            if (bArr3 != null && bArr3.length > 0) {
                lw6Var4.parseFrom(bArr3);
            }
            kw6Var.f379007e = lw6Var4;
        }
        return 0;
    }
}
