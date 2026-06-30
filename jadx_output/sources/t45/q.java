package t45;

/* loaded from: classes2.dex */
public class q extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public t45.l0 f415632d;

    /* renamed from: e, reason: collision with root package name */
    public t45.n0 f415633e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof t45.q)) {
            return false;
        }
        t45.q qVar = (t45.q) fVar;
        return n51.f.a(this.f415632d, qVar.f415632d) && n51.f.a(this.f415633e, qVar.f415633e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            t45.l0 l0Var = this.f415632d;
            if (l0Var != null) {
                fVar.i(1, l0Var.computeSize());
                this.f415632d.writeFields(fVar);
            }
            t45.n0 n0Var = this.f415633e;
            if (n0Var != null) {
                fVar.i(2, n0Var.computeSize());
                this.f415633e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            t45.l0 l0Var2 = this.f415632d;
            int i18 = l0Var2 != null ? 0 + b36.f.i(1, l0Var2.computeSize()) : 0;
            t45.n0 n0Var2 = this.f415633e;
            return n0Var2 != null ? i18 + b36.f.i(2, n0Var2.computeSize()) : i18;
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
        t45.q qVar = (t45.q) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                t45.l0 l0Var3 = new t45.l0();
                if (bArr != null && bArr.length > 0) {
                    l0Var3.parseFrom(bArr);
                }
                qVar.f415632d = l0Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            t45.n0 n0Var3 = new t45.n0();
            if (bArr2 != null && bArr2.length > 0) {
                n0Var3.parseFrom(bArr2);
            }
            qVar.f415633e = n0Var3;
        }
        return 0;
    }
}
