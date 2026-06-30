package ks3;

/* loaded from: classes8.dex */
public class k1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f311711d;

    /* renamed from: e, reason: collision with root package name */
    public ks3.z0 f311712e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.k1)) {
            return false;
        }
        ks3.k1 k1Var = (ks3.k1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f311711d), java.lang.Long.valueOf(k1Var.f311711d)) && n51.f.a(this.f311712e, k1Var.f311712e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f311711d);
            ks3.z0 z0Var = this.f311712e;
            if (z0Var != null) {
                fVar.i(2, z0Var.computeSize());
                this.f311712e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f311711d) + 0;
            ks3.z0 z0Var2 = this.f311712e;
            return z0Var2 != null ? h17 + b36.f.i(2, z0Var2.computeSize()) : h17;
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
        ks3.k1 k1Var = (ks3.k1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k1Var.f311711d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            ks3.z0 z0Var3 = new ks3.z0();
            if (bArr != null && bArr.length > 0) {
                z0Var3.parseFrom(bArr);
            }
            k1Var.f311712e = z0Var3;
        }
        return 0;
    }
}
