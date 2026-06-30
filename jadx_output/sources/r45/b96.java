package r45;

/* loaded from: classes4.dex */
public class b96 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370639d;

    /* renamed from: e, reason: collision with root package name */
    public int f370640e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f370641f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b96)) {
            return false;
        }
        r45.b96 b96Var = (r45.b96) fVar;
        return n51.f.a(this.f370639d, b96Var.f370639d) && n51.f.a(java.lang.Integer.valueOf(this.f370640e), java.lang.Integer.valueOf(b96Var.f370640e)) && n51.f.a(this.f370641f, b96Var.f370641f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370639d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f370640e);
            r45.cu5 cu5Var = this.f370641f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f370641f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f370639d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f370640e);
            r45.cu5 cu5Var2 = this.f370641f;
            return cu5Var2 != null ? j17 + b36.f.i(3, cu5Var2.computeSize()) : j17;
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
        r45.b96 b96Var = (r45.b96) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            b96Var.f370639d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            b96Var.f370640e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            b96Var.f370641f = cu5Var3;
        }
        return 0;
    }
}
