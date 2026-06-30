package r45;

/* loaded from: classes2.dex */
public class wt3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f389445d;

    /* renamed from: e, reason: collision with root package name */
    public int f389446e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f389447f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f389448g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wt3)) {
            return false;
        }
        r45.wt3 wt3Var = (r45.wt3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f389445d), java.lang.Integer.valueOf(wt3Var.f389445d)) && n51.f.a(java.lang.Integer.valueOf(this.f389446e), java.lang.Integer.valueOf(wt3Var.f389446e)) && n51.f.a(java.lang.Boolean.valueOf(this.f389447f), java.lang.Boolean.valueOf(wt3Var.f389447f)) && n51.f.a(java.lang.Boolean.valueOf(this.f389448g), java.lang.Boolean.valueOf(wt3Var.f389448g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f389445d);
            fVar.e(2, this.f389446e);
            fVar.a(3, this.f389447f);
            fVar.a(4, this.f389448g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f389445d) + 0 + b36.f.e(2, this.f389446e) + b36.f.a(3, this.f389447f) + b36.f.a(4, this.f389448g);
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
        r45.wt3 wt3Var = (r45.wt3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wt3Var.f389445d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            wt3Var.f389446e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            wt3Var.f389447f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        wt3Var.f389448g = aVar2.c(intValue);
        return 0;
    }
}
