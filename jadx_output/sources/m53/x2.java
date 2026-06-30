package m53;

/* loaded from: classes4.dex */
public class x2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f324169d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f324170e;

    /* renamed from: f, reason: collision with root package name */
    public m53.r3 f324171f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.x2)) {
            return false;
        }
        m53.x2 x2Var = (m53.x2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f324169d), java.lang.Integer.valueOf(x2Var.f324169d)) && n51.f.a(this.f324170e, x2Var.f324170e) && n51.f.a(this.f324171f, x2Var.f324171f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f324169d);
            java.lang.String str = this.f324170e;
            if (str != null) {
                fVar.j(2, str);
            }
            m53.r3 r3Var = this.f324171f;
            if (r3Var != null) {
                fVar.i(3, r3Var.computeSize());
                this.f324171f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f324169d) + 0;
            java.lang.String str2 = this.f324170e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            m53.r3 r3Var2 = this.f324171f;
            return r3Var2 != null ? e17 + b36.f.i(3, r3Var2.computeSize()) : e17;
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
        m53.x2 x2Var = (m53.x2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x2Var.f324169d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            x2Var.f324170e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            m53.r3 r3Var3 = new m53.r3();
            if (bArr != null && bArr.length > 0) {
                r3Var3.parseFrom(bArr);
            }
            x2Var.f324171f = r3Var3;
        }
        return 0;
    }
}
