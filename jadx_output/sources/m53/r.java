package m53;

/* loaded from: classes2.dex */
public class r extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f323994d;

    /* renamed from: e, reason: collision with root package name */
    public int f323995e;

    /* renamed from: f, reason: collision with root package name */
    public long f323996f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323997g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f323998h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.r)) {
            return false;
        }
        m53.r rVar = (m53.r) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f323994d), java.lang.Long.valueOf(rVar.f323994d)) && n51.f.a(java.lang.Integer.valueOf(this.f323995e), java.lang.Integer.valueOf(rVar.f323995e)) && n51.f.a(java.lang.Long.valueOf(this.f323996f), java.lang.Long.valueOf(rVar.f323996f)) && n51.f.a(this.f323997g, rVar.f323997g) && n51.f.a(java.lang.Boolean.valueOf(this.f323998h), java.lang.Boolean.valueOf(rVar.f323998h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f323994d);
            fVar.e(2, this.f323995e);
            fVar.h(3, this.f323996f);
            java.lang.String str = this.f323997g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.a(5, this.f323998h);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f323994d) + 0 + b36.f.e(2, this.f323995e) + b36.f.h(3, this.f323996f);
            java.lang.String str2 = this.f323997g;
            if (str2 != null) {
                h17 += b36.f.j(4, str2);
            }
            return h17 + b36.f.a(5, this.f323998h);
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
        m53.r rVar = (m53.r) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            rVar.f323994d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            rVar.f323995e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            rVar.f323996f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            rVar.f323997g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        rVar.f323998h = aVar2.c(intValue);
        return 0;
    }
}
