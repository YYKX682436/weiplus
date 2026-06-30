package f21;

/* loaded from: classes11.dex */
public class h0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f258906d;

    /* renamed from: e, reason: collision with root package name */
    public int f258907e;

    /* renamed from: f, reason: collision with root package name */
    public int f258908f;

    /* renamed from: g, reason: collision with root package name */
    public int f258909g;

    /* renamed from: h, reason: collision with root package name */
    public int f258910h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof f21.h0)) {
            return false;
        }
        f21.h0 h0Var = (f21.h0) fVar;
        return n51.f.a(this.f258906d, h0Var.f258906d) && n51.f.a(java.lang.Integer.valueOf(this.f258907e), java.lang.Integer.valueOf(h0Var.f258907e)) && n51.f.a(java.lang.Integer.valueOf(this.f258908f), java.lang.Integer.valueOf(h0Var.f258908f)) && n51.f.a(java.lang.Integer.valueOf(this.f258909g), java.lang.Integer.valueOf(h0Var.f258909g)) && n51.f.a(java.lang.Integer.valueOf(this.f258910h), java.lang.Integer.valueOf(h0Var.f258910h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f258906d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f258907e);
            fVar.e(3, this.f258908f);
            fVar.e(4, this.f258909g);
            fVar.e(5, this.f258910h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f258906d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f258907e) + b36.f.e(3, this.f258908f) + b36.f.e(4, this.f258909g) + b36.f.e(5, this.f258910h);
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
        f21.h0 h0Var = (f21.h0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h0Var.f258906d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            h0Var.f258907e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            h0Var.f258908f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            h0Var.f258909g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        h0Var.f258910h = aVar2.g(intValue);
        return 0;
    }
}
