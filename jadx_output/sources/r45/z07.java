package r45;

/* loaded from: classes8.dex */
public class z07 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.y07 f391576d;

    /* renamed from: e, reason: collision with root package name */
    public int f391577e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z07)) {
            return false;
        }
        r45.z07 z07Var = (r45.z07) fVar;
        return n51.f.a(this.f391576d, z07Var.f391576d) && n51.f.a(java.lang.Integer.valueOf(this.f391577e), java.lang.Integer.valueOf(z07Var.f391577e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.y07 y07Var = this.f391576d;
            if (y07Var != null) {
                fVar.i(1, y07Var.computeSize());
                this.f391576d.writeFields(fVar);
            }
            fVar.e(2, this.f391577e);
            return 0;
        }
        if (i17 == 1) {
            r45.y07 y07Var2 = this.f391576d;
            return (y07Var2 != null ? 0 + b36.f.i(1, y07Var2.computeSize()) : 0) + b36.f.e(2, this.f391577e);
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
        r45.z07 z07Var = (r45.z07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            z07Var.f391577e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.y07 y07Var3 = new r45.y07();
            if (bArr != null && bArr.length > 0) {
                y07Var3.parseFrom(bArr);
            }
            z07Var.f391576d = y07Var3;
        }
        return 0;
    }
}
