package wn1;

/* loaded from: classes2.dex */
public class a0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f447392d;

    /* renamed from: e, reason: collision with root package name */
    public long f447393e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f447394f;

    /* renamed from: g, reason: collision with root package name */
    public int f447395g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.a0)) {
            return false;
        }
        wn1.a0 a0Var = (wn1.a0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f447392d), java.lang.Long.valueOf(a0Var.f447392d)) && n51.f.a(java.lang.Long.valueOf(this.f447393e), java.lang.Long.valueOf(a0Var.f447393e)) && n51.f.a(this.f447394f, a0Var.f447394f) && n51.f.a(java.lang.Integer.valueOf(this.f447395g), java.lang.Integer.valueOf(a0Var.f447395g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f447392d);
            fVar.h(2, this.f447393e);
            java.lang.String str = this.f447394f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f447395g);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f447392d) + 0 + b36.f.h(2, this.f447393e);
            java.lang.String str2 = this.f447394f;
            if (str2 != null) {
                h17 += b36.f.j(3, str2);
            }
            return h17 + b36.f.e(4, this.f447395g);
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
        wn1.a0 a0Var = (wn1.a0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a0Var.f447392d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            a0Var.f447393e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            a0Var.f447394f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        a0Var.f447395g = aVar2.g(intValue);
        return 0;
    }
}
