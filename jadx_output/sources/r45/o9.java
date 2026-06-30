package r45;

/* loaded from: classes2.dex */
public class o9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public ot0.k0 f382041d;

    /* renamed from: e, reason: collision with root package name */
    public long f382042e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o9)) {
            return false;
        }
        r45.o9 o9Var = (r45.o9) fVar;
        return n51.f.a(this.f382041d, o9Var.f382041d) && n51.f.a(java.lang.Long.valueOf(this.f382042e), java.lang.Long.valueOf(o9Var.f382042e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            ot0.k0 k0Var = this.f382041d;
            if (k0Var != null) {
                fVar.i(1, k0Var.computeSize());
                this.f382041d.writeFields(fVar);
            }
            fVar.h(2, this.f382042e);
            return 0;
        }
        if (i17 == 1) {
            ot0.k0 k0Var2 = this.f382041d;
            return (k0Var2 != null ? 0 + b36.f.i(1, k0Var2.computeSize()) : 0) + b36.f.h(2, this.f382042e);
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
        r45.o9 o9Var = (r45.o9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            o9Var.f382042e = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            ot0.k0 k0Var3 = new ot0.k0();
            if (bArr != null && bArr.length > 0) {
                k0Var3.parseFrom(bArr);
            }
            o9Var.f382041d = k0Var3;
        }
        return 0;
    }
}
