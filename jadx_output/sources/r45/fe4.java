package r45;

/* loaded from: classes8.dex */
public class fe4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f374253d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.zz6 f374254e;

    /* renamed from: f, reason: collision with root package name */
    public long f374255f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fe4)) {
            return false;
        }
        r45.fe4 fe4Var = (r45.fe4) fVar;
        return n51.f.a(this.f374253d, fe4Var.f374253d) && n51.f.a(this.f374254e, fe4Var.f374254e) && n51.f.a(java.lang.Long.valueOf(this.f374255f), java.lang.Long.valueOf(fe4Var.f374255f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374253d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            r45.zz6 zz6Var = this.f374254e;
            if (zz6Var != null) {
                fVar.i(2, zz6Var.computeSize());
                this.f374254e.writeFields(fVar);
            }
            fVar.h(3, this.f374255f);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            r45.zz6 zz6Var2 = this.f374254e;
            if (zz6Var2 != null) {
                g17 += b36.f.i(2, zz6Var2.computeSize());
            }
            return g17 + b36.f.h(3, this.f374255f);
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
        r45.fe4 fe4Var = (r45.fe4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ge4 ge4Var = new r45.ge4();
                if (bArr2 != null && bArr2.length > 0) {
                    ge4Var.parseFrom(bArr2);
                }
                fe4Var.f374253d.add(ge4Var);
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            fe4Var.f374255f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.zz6 zz6Var3 = new r45.zz6();
            if (bArr3 != null && bArr3.length > 0) {
                zz6Var3.parseFrom(bArr3);
            }
            fe4Var.f374254e = zz6Var3;
        }
        return 0;
    }
}
