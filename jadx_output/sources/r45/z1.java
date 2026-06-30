package r45;

/* loaded from: classes2.dex */
public class z1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.e70 f391578d;

    /* renamed from: e, reason: collision with root package name */
    public r45.e70 f391579e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z1)) {
            return false;
        }
        r45.z1 z1Var = (r45.z1) fVar;
        return n51.f.a(this.f391578d, z1Var.f391578d) && n51.f.a(this.f391579e, z1Var.f391579e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.e70 e70Var = this.f391578d;
            if (e70Var != null) {
                fVar.i(1, e70Var.computeSize());
                this.f391578d.writeFields(fVar);
            }
            r45.e70 e70Var2 = this.f391579e;
            if (e70Var2 != null) {
                fVar.i(2, e70Var2.computeSize());
                this.f391579e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.e70 e70Var3 = this.f391578d;
            int i18 = e70Var3 != null ? 0 + b36.f.i(1, e70Var3.computeSize()) : 0;
            r45.e70 e70Var4 = this.f391579e;
            return e70Var4 != null ? i18 + b36.f.i(2, e70Var4.computeSize()) : i18;
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
        r45.z1 z1Var = (r45.z1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.e70 e70Var5 = new r45.e70();
                if (bArr != null && bArr.length > 0) {
                    e70Var5.parseFrom(bArr);
                }
                z1Var.f391578d = e70Var5;
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
            r45.e70 e70Var6 = new r45.e70();
            if (bArr2 != null && bArr2.length > 0) {
                e70Var6.parseFrom(bArr2);
            }
            z1Var.f391579e = e70Var6;
        }
        return 0;
    }
}
