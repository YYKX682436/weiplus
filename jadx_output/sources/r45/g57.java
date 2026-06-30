package r45;

/* loaded from: classes7.dex */
public class g57 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.b47 f374907d;

    /* renamed from: e, reason: collision with root package name */
    public r45.x47 f374908e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g57)) {
            return false;
        }
        r45.g57 g57Var = (r45.g57) fVar;
        return n51.f.a(this.f374907d, g57Var.f374907d) && n51.f.a(this.f374908e, g57Var.f374908e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.b47 b47Var = this.f374907d;
            if (b47Var != null) {
                fVar.i(1, b47Var.computeSize());
                this.f374907d.writeFields(fVar);
            }
            r45.x47 x47Var = this.f374908e;
            if (x47Var != null) {
                fVar.i(2, x47Var.computeSize());
                this.f374908e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.b47 b47Var2 = this.f374907d;
            int i18 = b47Var2 != null ? 0 + b36.f.i(1, b47Var2.computeSize()) : 0;
            r45.x47 x47Var2 = this.f374908e;
            return x47Var2 != null ? i18 + b36.f.i(2, x47Var2.computeSize()) : i18;
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
        r45.g57 g57Var = (r45.g57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.b47 b47Var3 = new r45.b47();
                if (bArr != null && bArr.length > 0) {
                    b47Var3.parseFrom(bArr);
                }
                g57Var.f374907d = b47Var3;
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
            r45.x47 x47Var3 = new r45.x47();
            if (bArr2 != null && bArr2.length > 0) {
                x47Var3.parseFrom(bArr2);
            }
            g57Var.f374908e = x47Var3;
        }
        return 0;
    }
}
