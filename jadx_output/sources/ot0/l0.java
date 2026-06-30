package ot0;

/* loaded from: classes4.dex */
public class l0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f348570d;

    /* renamed from: e, reason: collision with root package name */
    public int f348571e;

    /* renamed from: f, reason: collision with root package name */
    public int f348572f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f348573g;

    /* renamed from: h, reason: collision with root package name */
    public long f348574h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ot0.l0)) {
            return false;
        }
        ot0.l0 l0Var = (ot0.l0) fVar;
        return n51.f.a(this.f348570d, l0Var.f348570d) && n51.f.a(java.lang.Integer.valueOf(this.f348571e), java.lang.Integer.valueOf(l0Var.f348571e)) && n51.f.a(java.lang.Integer.valueOf(this.f348572f), java.lang.Integer.valueOf(l0Var.f348572f)) && n51.f.a(this.f348573g, l0Var.f348573g) && n51.f.a(java.lang.Long.valueOf(this.f348574h), java.lang.Long.valueOf(l0Var.f348574h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f348570d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f348571e);
            fVar.e(3, this.f348572f);
            java.lang.String str2 = this.f348573g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f348574h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f348570d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f348571e) + b36.f.e(3, this.f348572f);
            java.lang.String str4 = this.f348573g;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            return j17 + b36.f.h(5, this.f348574h);
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
        ot0.l0 l0Var = (ot0.l0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l0Var.f348570d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            l0Var.f348571e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            l0Var.f348572f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            l0Var.f348573g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        l0Var.f348574h = aVar2.i(intValue);
        return 0;
    }
}
