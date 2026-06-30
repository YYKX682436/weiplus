package r45;

/* loaded from: classes7.dex */
public class e57 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.b47 f373035d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f373036e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e57)) {
            return false;
        }
        r45.e57 e57Var = (r45.e57) fVar;
        return n51.f.a(this.f373035d, e57Var.f373035d) && n51.f.a(java.lang.Boolean.valueOf(this.f373036e), java.lang.Boolean.valueOf(e57Var.f373036e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.b47 b47Var = this.f373035d;
            if (b47Var != null) {
                fVar.i(1, b47Var.computeSize());
                this.f373035d.writeFields(fVar);
            }
            fVar.a(2, this.f373036e);
            return 0;
        }
        if (i17 == 1) {
            r45.b47 b47Var2 = this.f373035d;
            return (b47Var2 != null ? 0 + b36.f.i(1, b47Var2.computeSize()) : 0) + b36.f.a(2, this.f373036e);
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
        r45.e57 e57Var = (r45.e57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            e57Var.f373036e = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.b47 b47Var3 = new r45.b47();
            if (bArr != null && bArr.length > 0) {
                b47Var3.parseFrom(bArr);
            }
            e57Var.f373035d = b47Var3;
        }
        return 0;
    }
}
