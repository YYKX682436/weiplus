package r45;

/* loaded from: classes9.dex */
public class mk0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.nk0 f380600d;

    /* renamed from: e, reason: collision with root package name */
    public r45.lk0 f380601e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mk0)) {
            return false;
        }
        r45.mk0 mk0Var = (r45.mk0) fVar;
        return n51.f.a(this.f380600d, mk0Var.f380600d) && n51.f.a(this.f380601e, mk0Var.f380601e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.nk0 nk0Var = this.f380600d;
            if (nk0Var != null) {
                fVar.i(1, nk0Var.computeSize());
                this.f380600d.writeFields(fVar);
            }
            r45.lk0 lk0Var = this.f380601e;
            if (lk0Var != null) {
                fVar.i(2, lk0Var.computeSize());
                this.f380601e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.nk0 nk0Var2 = this.f380600d;
            int i18 = nk0Var2 != null ? 0 + b36.f.i(1, nk0Var2.computeSize()) : 0;
            r45.lk0 lk0Var2 = this.f380601e;
            return lk0Var2 != null ? i18 + b36.f.i(2, lk0Var2.computeSize()) : i18;
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
        r45.mk0 mk0Var = (r45.mk0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.nk0 nk0Var3 = new r45.nk0();
                if (bArr != null && bArr.length > 0) {
                    nk0Var3.parseFrom(bArr);
                }
                mk0Var.f380600d = nk0Var3;
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
            r45.lk0 lk0Var3 = new r45.lk0();
            if (bArr2 != null && bArr2.length > 0) {
                lk0Var3.parseFrom(bArr2);
            }
            mk0Var.f380601e = lk0Var3;
        }
        return 0;
    }
}
