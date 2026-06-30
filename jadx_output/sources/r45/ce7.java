package r45;

/* loaded from: classes7.dex */
public class ce7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.be7 f371512d;

    /* renamed from: e, reason: collision with root package name */
    public r45.b10 f371513e;

    /* renamed from: f, reason: collision with root package name */
    public int f371514f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ce7)) {
            return false;
        }
        r45.ce7 ce7Var = (r45.ce7) fVar;
        return n51.f.a(this.f371512d, ce7Var.f371512d) && n51.f.a(this.f371513e, ce7Var.f371513e) && n51.f.a(java.lang.Integer.valueOf(this.f371514f), java.lang.Integer.valueOf(ce7Var.f371514f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.be7 be7Var = this.f371512d;
            if (be7Var != null) {
                fVar.i(1, be7Var.computeSize());
                this.f371512d.writeFields(fVar);
            }
            r45.b10 b10Var = this.f371513e;
            if (b10Var != null) {
                fVar.i(2, b10Var.computeSize());
                this.f371513e.writeFields(fVar);
            }
            fVar.e(3, this.f371514f);
            return 0;
        }
        if (i17 == 1) {
            r45.be7 be7Var2 = this.f371512d;
            int i18 = be7Var2 != null ? 0 + b36.f.i(1, be7Var2.computeSize()) : 0;
            r45.b10 b10Var2 = this.f371513e;
            if (b10Var2 != null) {
                i18 += b36.f.i(2, b10Var2.computeSize());
            }
            return i18 + b36.f.e(3, this.f371514f);
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
        r45.ce7 ce7Var = (r45.ce7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.be7 be7Var3 = new r45.be7();
                if (bArr != null && bArr.length > 0) {
                    be7Var3.parseFrom(bArr);
                }
                ce7Var.f371512d = be7Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            ce7Var.f371514f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.b10 b10Var3 = new r45.b10();
            if (bArr2 != null && bArr2.length > 0) {
                b10Var3.parseFrom(bArr2);
            }
            ce7Var.f371513e = b10Var3;
        }
        return 0;
    }
}
