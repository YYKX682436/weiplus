package ot0;

/* loaded from: classes9.dex */
public class m3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f348590d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f348591e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348592f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ot0.m3)) {
            return false;
        }
        ot0.m3 m3Var = (ot0.m3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f348590d), java.lang.Integer.valueOf(m3Var.f348590d)) && n51.f.a(this.f348591e, m3Var.f348591e) && n51.f.a(this.f348592f, m3Var.f348592f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f348590d);
            java.lang.String str = this.f348591e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f348592f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f348590d) + 0;
            java.lang.String str3 = this.f348591e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f348592f;
            return str4 != null ? e17 + b36.f.j(3, str4) : e17;
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
        ot0.m3 m3Var = (ot0.m3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            m3Var.f348590d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            m3Var.f348591e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        m3Var.f348592f = aVar2.k(intValue);
        return 0;
    }
}
