package m53;

/* loaded from: classes4.dex */
public class a4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f323560d;

    /* renamed from: e, reason: collision with root package name */
    public int f323561e;

    /* renamed from: f, reason: collision with root package name */
    public int f323562f;

    /* renamed from: g, reason: collision with root package name */
    public m53.i0 f323563g;

    /* renamed from: h, reason: collision with root package name */
    public int f323564h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.a4)) {
            return false;
        }
        m53.a4 a4Var = (m53.a4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f323560d), java.lang.Integer.valueOf(a4Var.f323560d)) && n51.f.a(java.lang.Integer.valueOf(this.f323561e), java.lang.Integer.valueOf(a4Var.f323561e)) && n51.f.a(java.lang.Integer.valueOf(this.f323562f), java.lang.Integer.valueOf(a4Var.f323562f)) && n51.f.a(this.f323563g, a4Var.f323563g) && n51.f.a(java.lang.Integer.valueOf(this.f323564h), java.lang.Integer.valueOf(a4Var.f323564h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f323560d);
            fVar.e(2, this.f323561e);
            fVar.e(3, this.f323562f);
            m53.i0 i0Var = this.f323563g;
            if (i0Var != null) {
                fVar.i(4, i0Var.computeSize());
                this.f323563g.writeFields(fVar);
            }
            fVar.e(5, this.f323564h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f323560d) + 0 + b36.f.e(2, this.f323561e) + b36.f.e(3, this.f323562f);
            m53.i0 i0Var2 = this.f323563g;
            if (i0Var2 != null) {
                e17 += b36.f.i(4, i0Var2.computeSize());
            }
            return e17 + b36.f.e(5, this.f323564h);
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
        m53.a4 a4Var = (m53.a4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a4Var.f323560d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            a4Var.f323561e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            a4Var.f323562f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            a4Var.f323564h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            m53.i0 i0Var3 = new m53.i0();
            if (bArr != null && bArr.length > 0) {
                i0Var3.parseFrom(bArr);
            }
            a4Var.f323563g = i0Var3;
        }
        return 0;
    }
}
