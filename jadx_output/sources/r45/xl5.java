package r45;

/* loaded from: classes8.dex */
public class xl5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390215d;

    /* renamed from: e, reason: collision with root package name */
    public long f390216e;

    /* renamed from: f, reason: collision with root package name */
    public int f390217f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390218g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390219h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xl5)) {
            return false;
        }
        r45.xl5 xl5Var = (r45.xl5) fVar;
        return n51.f.a(this.f390215d, xl5Var.f390215d) && n51.f.a(java.lang.Long.valueOf(this.f390216e), java.lang.Long.valueOf(xl5Var.f390216e)) && n51.f.a(java.lang.Integer.valueOf(this.f390217f), java.lang.Integer.valueOf(xl5Var.f390217f)) && n51.f.a(this.f390218g, xl5Var.f390218g) && n51.f.a(this.f390219h, xl5Var.f390219h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390215d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f390216e);
            fVar.e(3, this.f390217f);
            java.lang.String str2 = this.f390218g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f390219h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f390215d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.h(2, this.f390216e) + b36.f.e(3, this.f390217f);
            java.lang.String str5 = this.f390218g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f390219h;
            return str6 != null ? j17 + b36.f.j(5, str6) : j17;
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
        r45.xl5 xl5Var = (r45.xl5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xl5Var.f390215d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            xl5Var.f390216e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            xl5Var.f390217f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            xl5Var.f390218g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        xl5Var.f390219h = aVar2.k(intValue);
        return 0;
    }
}
