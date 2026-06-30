package r45;

/* loaded from: classes9.dex */
public class ui1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.yx1 f387397d;

    /* renamed from: e, reason: collision with root package name */
    public int f387398e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yx1 f387399f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ui1)) {
            return false;
        }
        r45.ui1 ui1Var = (r45.ui1) fVar;
        return n51.f.a(this.f387397d, ui1Var.f387397d) && n51.f.a(java.lang.Integer.valueOf(this.f387398e), java.lang.Integer.valueOf(ui1Var.f387398e)) && n51.f.a(this.f387399f, ui1Var.f387399f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.yx1 yx1Var = this.f387397d;
            if (yx1Var != null) {
                fVar.i(1, yx1Var.computeSize());
                this.f387397d.writeFields(fVar);
            }
            fVar.e(2, this.f387398e);
            r45.yx1 yx1Var2 = this.f387399f;
            if (yx1Var2 != null) {
                fVar.i(3, yx1Var2.computeSize());
                this.f387399f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.yx1 yx1Var3 = this.f387397d;
            int i18 = (yx1Var3 != null ? 0 + b36.f.i(1, yx1Var3.computeSize()) : 0) + b36.f.e(2, this.f387398e);
            r45.yx1 yx1Var4 = this.f387399f;
            return yx1Var4 != null ? i18 + b36.f.i(3, yx1Var4.computeSize()) : i18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.ui1 ui1Var = (r45.ui1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.yx1 yx1Var5 = new r45.yx1();
                if (bArr != null && bArr.length > 0) {
                    yx1Var5.parseFrom(bArr);
                }
                ui1Var.f387397d = yx1Var5;
            }
            return 0;
        }
        if (intValue == 2) {
            ui1Var.f387398e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.yx1 yx1Var6 = new r45.yx1();
            if (bArr2 != null && bArr2.length > 0) {
                yx1Var6.parseFrom(bArr2);
            }
            ui1Var.f387399f = yx1Var6;
        }
        return 0;
    }
}
