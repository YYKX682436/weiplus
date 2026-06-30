package m53;

/* loaded from: classes8.dex */
public class q3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f323986d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323987e;

    /* renamed from: f, reason: collision with root package name */
    public m53.g3 f323988f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.q3)) {
            return false;
        }
        m53.q3 q3Var = (m53.q3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f323986d), java.lang.Integer.valueOf(q3Var.f323986d)) && n51.f.a(this.f323987e, q3Var.f323987e) && n51.f.a(this.f323988f, q3Var.f323988f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f323986d);
            java.lang.String str = this.f323987e;
            if (str != null) {
                fVar.j(2, str);
            }
            m53.g3 g3Var = this.f323988f;
            if (g3Var != null) {
                fVar.i(3, g3Var.computeSize());
                this.f323988f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f323986d) + 0;
            java.lang.String str2 = this.f323987e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            m53.g3 g3Var2 = this.f323988f;
            return g3Var2 != null ? e17 + b36.f.i(3, g3Var2.computeSize()) : e17;
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
        m53.q3 q3Var = (m53.q3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            q3Var.f323986d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            q3Var.f323987e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            m53.g3 g3Var3 = new m53.g3();
            if (bArr != null && bArr.length > 0) {
                g3Var3.parseFrom(bArr);
            }
            q3Var.f323988f = g3Var3;
        }
        return 0;
    }
}
