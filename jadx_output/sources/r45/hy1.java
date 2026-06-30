package r45;

/* loaded from: classes7.dex */
public class hy1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376551d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376552e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376553f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376554g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hy1)) {
            return false;
        }
        r45.hy1 hy1Var = (r45.hy1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376551d), java.lang.Integer.valueOf(hy1Var.f376551d)) && n51.f.a(this.f376552e, hy1Var.f376552e) && n51.f.a(this.f376553f, hy1Var.f376553f) && n51.f.a(this.f376554g, hy1Var.f376554g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376551d);
            java.lang.String str = this.f376552e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f376553f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f376554g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f376551d) + 0;
            java.lang.String str4 = this.f376552e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f376553f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f376554g;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
        r45.hy1 hy1Var = (r45.hy1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hy1Var.f376551d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            hy1Var.f376552e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            hy1Var.f376553f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        hy1Var.f376554g = aVar2.k(intValue);
        return 0;
    }
}
