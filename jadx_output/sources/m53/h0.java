package m53;

/* loaded from: classes8.dex */
public class h0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f323737d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323738e;

    /* renamed from: f, reason: collision with root package name */
    public int f323739f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323740g;

    /* renamed from: h, reason: collision with root package name */
    public int f323741h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.h0)) {
            return false;
        }
        m53.h0 h0Var = (m53.h0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f323737d), java.lang.Integer.valueOf(h0Var.f323737d)) && n51.f.a(this.f323738e, h0Var.f323738e) && n51.f.a(java.lang.Integer.valueOf(this.f323739f), java.lang.Integer.valueOf(h0Var.f323739f)) && n51.f.a(this.f323740g, h0Var.f323740g) && n51.f.a(java.lang.Integer.valueOf(this.f323741h), java.lang.Integer.valueOf(h0Var.f323741h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f323737d);
            java.lang.String str = this.f323738e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f323739f);
            java.lang.String str2 = this.f323740g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f323741h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f323737d) + 0;
            java.lang.String str3 = this.f323738e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            int e18 = e17 + b36.f.e(3, this.f323739f);
            java.lang.String str4 = this.f323740g;
            if (str4 != null) {
                e18 += b36.f.j(4, str4);
            }
            return e18 + b36.f.e(5, this.f323741h);
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
        m53.h0 h0Var = (m53.h0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h0Var.f323737d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            h0Var.f323738e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            h0Var.f323739f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            h0Var.f323740g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        h0Var.f323741h = aVar2.g(intValue);
        return 0;
    }
}
