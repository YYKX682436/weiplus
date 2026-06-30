package r45;

/* loaded from: classes4.dex */
public class ef6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f373408d;

    /* renamed from: e, reason: collision with root package name */
    public int f373409e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f373410f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ef6)) {
            return false;
        }
        r45.ef6 ef6Var = (r45.ef6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f373408d), java.lang.Long.valueOf(ef6Var.f373408d)) && n51.f.a(java.lang.Integer.valueOf(this.f373409e), java.lang.Integer.valueOf(ef6Var.f373409e)) && n51.f.a(this.f373410f, ef6Var.f373410f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f373408d);
            fVar.e(2, this.f373409e);
            r45.cu5 cu5Var = this.f373410f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f373410f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f373408d) + 0 + b36.f.e(2, this.f373409e);
            r45.cu5 cu5Var2 = this.f373410f;
            return cu5Var2 != null ? h17 + b36.f.i(3, cu5Var2.computeSize()) : h17;
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
        r45.ef6 ef6Var = (r45.ef6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ef6Var.f373408d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            ef6Var.f373409e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            ef6Var.f373410f = cu5Var3;
        }
        return 0;
    }
}
