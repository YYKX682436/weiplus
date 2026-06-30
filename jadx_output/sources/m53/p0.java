package m53;

/* loaded from: classes2.dex */
public class p0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f323956d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323957e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f323958f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.p0)) {
            return false;
        }
        m53.p0 p0Var = (m53.p0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f323956d), java.lang.Boolean.valueOf(p0Var.f323956d)) && n51.f.a(this.f323957e, p0Var.f323957e) && n51.f.a(java.lang.Boolean.valueOf(this.f323958f), java.lang.Boolean.valueOf(p0Var.f323958f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f323956d);
            java.lang.String str = this.f323957e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f323958f);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f323956d) + 0;
            java.lang.String str2 = this.f323957e;
            if (str2 != null) {
                a17 += b36.f.j(2, str2);
            }
            return a17 + b36.f.a(3, this.f323958f);
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
        m53.p0 p0Var = (m53.p0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p0Var.f323956d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            p0Var.f323957e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        p0Var.f323958f = aVar2.c(intValue);
        return 0;
    }
}
