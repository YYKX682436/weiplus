package r45;

/* loaded from: classes9.dex */
public class g70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.vl5 f374938d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f374939e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f374940f;

    /* renamed from: g, reason: collision with root package name */
    public r45.vl5 f374941g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g70)) {
            return false;
        }
        r45.g70 g70Var = (r45.g70) fVar;
        return n51.f.a(this.f374938d, g70Var.f374938d) && n51.f.a(this.f374939e, g70Var.f374939e) && n51.f.a(java.lang.Boolean.valueOf(this.f374940f), java.lang.Boolean.valueOf(g70Var.f374940f)) && n51.f.a(this.f374941g, g70Var.f374941g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374939e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.vl5 vl5Var = this.f374938d;
            if (vl5Var != null) {
                fVar.i(1, vl5Var.computeSize());
                this.f374938d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.a(3, this.f374940f);
            r45.vl5 vl5Var2 = this.f374941g;
            if (vl5Var2 != null) {
                fVar.i(4, vl5Var2.computeSize());
                this.f374941g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.vl5 vl5Var3 = this.f374938d;
            int i18 = (vl5Var3 != null ? 0 + b36.f.i(1, vl5Var3.computeSize()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.a(3, this.f374940f);
            r45.vl5 vl5Var4 = this.f374941g;
            return vl5Var4 != null ? i18 + b36.f.i(4, vl5Var4.computeSize()) : i18;
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
        r45.g70 g70Var = (r45.g70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.vl5 vl5Var5 = new r45.vl5();
                if (bArr2 != null && bArr2.length > 0) {
                    vl5Var5.parseFrom(bArr2);
                }
                g70Var.f374938d = vl5Var5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.de deVar = new r45.de();
                if (bArr3 != null && bArr3.length > 0) {
                    deVar.parseFrom(bArr3);
                }
                g70Var.f374939e.add(deVar);
            }
            return 0;
        }
        if (intValue == 3) {
            g70Var.f374940f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.vl5 vl5Var6 = new r45.vl5();
            if (bArr4 != null && bArr4.length > 0) {
                vl5Var6.parseFrom(bArr4);
            }
            g70Var.f374941g = vl5Var6;
        }
        return 0;
    }
}
