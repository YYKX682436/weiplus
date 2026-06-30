package r45;

/* loaded from: classes7.dex */
public class gr5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375503d;

    /* renamed from: e, reason: collision with root package name */
    public int f375504e;

    /* renamed from: f, reason: collision with root package name */
    public int f375505f;

    /* renamed from: g, reason: collision with root package name */
    public int f375506g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gr5)) {
            return false;
        }
        r45.gr5 gr5Var = (r45.gr5) fVar;
        return n51.f.a(this.f375503d, gr5Var.f375503d) && n51.f.a(java.lang.Integer.valueOf(this.f375504e), java.lang.Integer.valueOf(gr5Var.f375504e)) && n51.f.a(java.lang.Integer.valueOf(this.f375505f), java.lang.Integer.valueOf(gr5Var.f375505f)) && n51.f.a(java.lang.Integer.valueOf(this.f375506g), java.lang.Integer.valueOf(gr5Var.f375506g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f375503d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f375504e);
            fVar.e(3, this.f375505f);
            fVar.e(6, this.f375506g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f375503d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f375504e) + b36.f.e(3, this.f375505f) + b36.f.e(6, this.f375506g);
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
        r45.gr5 gr5Var = (r45.gr5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gr5Var.f375503d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            gr5Var.f375504e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            gr5Var.f375505f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 6) {
            return -1;
        }
        gr5Var.f375506g = aVar2.g(intValue);
        return 0;
    }
}
