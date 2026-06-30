package r45;

/* loaded from: classes8.dex */
public class d80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f372216d;

    /* renamed from: e, reason: collision with root package name */
    public long f372217e;

    /* renamed from: f, reason: collision with root package name */
    public int f372218f;

    /* renamed from: g, reason: collision with root package name */
    public int f372219g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372220h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d80)) {
            return false;
        }
        r45.d80 d80Var = (r45.d80) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f372216d), java.lang.Long.valueOf(d80Var.f372216d)) && n51.f.a(java.lang.Long.valueOf(this.f372217e), java.lang.Long.valueOf(d80Var.f372217e)) && n51.f.a(java.lang.Integer.valueOf(this.f372218f), java.lang.Integer.valueOf(d80Var.f372218f)) && n51.f.a(java.lang.Integer.valueOf(this.f372219g), java.lang.Integer.valueOf(d80Var.f372219g)) && n51.f.a(this.f372220h, d80Var.f372220h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f372216d);
            fVar.h(2, this.f372217e);
            fVar.e(3, this.f372218f);
            fVar.e(4, this.f372219g);
            java.lang.String str = this.f372220h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f372216d) + 0 + b36.f.h(2, this.f372217e) + b36.f.e(3, this.f372218f) + b36.f.e(4, this.f372219g);
            java.lang.String str2 = this.f372220h;
            return str2 != null ? h17 + b36.f.j(5, str2) : h17;
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
        r45.d80 d80Var = (r45.d80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            d80Var.f372216d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            d80Var.f372217e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            d80Var.f372218f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            d80Var.f372219g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        d80Var.f372220h = aVar2.k(intValue);
        return 0;
    }
}
