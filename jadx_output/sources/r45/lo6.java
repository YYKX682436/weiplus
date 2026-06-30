package r45;

/* loaded from: classes8.dex */
public class lo6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379680d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379681e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379682f;

    /* renamed from: g, reason: collision with root package name */
    public int f379683g;

    /* renamed from: h, reason: collision with root package name */
    public long f379684h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lo6)) {
            return false;
        }
        r45.lo6 lo6Var = (r45.lo6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379680d), java.lang.Integer.valueOf(lo6Var.f379680d)) && n51.f.a(this.f379681e, lo6Var.f379681e) && n51.f.a(this.f379682f, lo6Var.f379682f) && n51.f.a(java.lang.Integer.valueOf(this.f379683g), java.lang.Integer.valueOf(lo6Var.f379683g)) && n51.f.a(java.lang.Long.valueOf(this.f379684h), java.lang.Long.valueOf(lo6Var.f379684h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379680d);
            java.lang.String str = this.f379681e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f379682f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f379683g);
            fVar.h(5, this.f379684h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379680d) + 0;
            java.lang.String str3 = this.f379681e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f379682f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            return e17 + b36.f.e(4, this.f379683g) + b36.f.h(5, this.f379684h);
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
        r45.lo6 lo6Var = (r45.lo6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lo6Var.f379680d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            lo6Var.f379681e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            lo6Var.f379682f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            lo6Var.f379683g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        lo6Var.f379684h = aVar2.i(intValue);
        return 0;
    }
}
