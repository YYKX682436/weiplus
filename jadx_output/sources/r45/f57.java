package r45;

/* loaded from: classes7.dex */
public class f57 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.a47 f374029d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374030e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f57)) {
            return false;
        }
        r45.f57 f57Var = (r45.f57) fVar;
        return n51.f.a(this.f374029d, f57Var.f374029d) && n51.f.a(this.f374030e, f57Var.f374030e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.a47 a47Var = this.f374029d;
            if (a47Var != null) {
                fVar.i(1, a47Var.computeSize());
                this.f374029d.writeFields(fVar);
            }
            java.lang.String str = this.f374030e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.a47 a47Var2 = this.f374029d;
            int i18 = a47Var2 != null ? 0 + b36.f.i(1, a47Var2.computeSize()) : 0;
            java.lang.String str2 = this.f374030e;
            return str2 != null ? i18 + b36.f.j(2, str2) : i18;
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
        r45.f57 f57Var = (r45.f57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            f57Var.f374030e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.a47 a47Var3 = new r45.a47();
            if (bArr != null && bArr.length > 0) {
                a47Var3.parseFrom(bArr);
            }
            f57Var.f374029d = a47Var3;
        }
        return 0;
    }
}
