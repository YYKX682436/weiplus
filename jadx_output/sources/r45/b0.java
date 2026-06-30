package r45;

/* loaded from: classes2.dex */
public class b0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370384d;

    /* renamed from: e, reason: collision with root package name */
    public long f370385e;

    /* renamed from: f, reason: collision with root package name */
    public int f370386f;

    /* renamed from: g, reason: collision with root package name */
    public int f370387g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b0)) {
            return false;
        }
        r45.b0 b0Var = (r45.b0) fVar;
        return n51.f.a(this.f370384d, b0Var.f370384d) && n51.f.a(java.lang.Long.valueOf(this.f370385e), java.lang.Long.valueOf(b0Var.f370385e)) && n51.f.a(java.lang.Integer.valueOf(this.f370386f), java.lang.Integer.valueOf(b0Var.f370386f)) && n51.f.a(java.lang.Integer.valueOf(this.f370387g), java.lang.Integer.valueOf(b0Var.f370387g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370384d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f370385e);
            fVar.e(3, this.f370386f);
            fVar.e(4, this.f370387g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f370384d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f370385e) + b36.f.e(3, this.f370386f) + b36.f.e(4, this.f370387g);
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
        r45.b0 b0Var = (r45.b0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            b0Var.f370384d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            b0Var.f370385e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            b0Var.f370386f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        b0Var.f370387g = aVar2.g(intValue);
        return 0;
    }
}
