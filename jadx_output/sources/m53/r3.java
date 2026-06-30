package m53;

/* loaded from: classes4.dex */
public class r3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324005d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f324006e;

    /* renamed from: f, reason: collision with root package name */
    public int f324007f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.r3)) {
            return false;
        }
        m53.r3 r3Var = (m53.r3) fVar;
        return n51.f.a(this.f324005d, r3Var.f324005d) && n51.f.a(this.f324006e, r3Var.f324006e) && n51.f.a(java.lang.Integer.valueOf(this.f324007f), java.lang.Integer.valueOf(r3Var.f324007f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f324005d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f324006e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f324007f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f324005d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f324006e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f324007f);
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
        m53.r3 r3Var = (m53.r3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            r3Var.f324005d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            r3Var.f324006e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        r3Var.f324007f = aVar2.g(intValue);
        return 0;
    }
}
