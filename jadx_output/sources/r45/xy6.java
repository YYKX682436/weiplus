package r45;

/* loaded from: classes2.dex */
public class xy6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390599d;

    /* renamed from: e, reason: collision with root package name */
    public int f390600e;

    /* renamed from: f, reason: collision with root package name */
    public int f390601f;

    /* renamed from: g, reason: collision with root package name */
    public int f390602g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xy6)) {
            return false;
        }
        r45.xy6 xy6Var = (r45.xy6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390599d), java.lang.Integer.valueOf(xy6Var.f390599d)) && n51.f.a(java.lang.Integer.valueOf(this.f390600e), java.lang.Integer.valueOf(xy6Var.f390600e)) && n51.f.a(java.lang.Integer.valueOf(this.f390601f), java.lang.Integer.valueOf(xy6Var.f390601f)) && n51.f.a(java.lang.Integer.valueOf(this.f390602g), java.lang.Integer.valueOf(xy6Var.f390602g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390599d);
            fVar.e(2, this.f390600e);
            fVar.e(3, this.f390601f);
            fVar.e(4, this.f390602g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f390599d) + 0 + b36.f.e(2, this.f390600e) + b36.f.e(3, this.f390601f) + b36.f.e(4, this.f390602g);
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
        r45.xy6 xy6Var = (r45.xy6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xy6Var.f390599d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            xy6Var.f390600e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            xy6Var.f390601f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        xy6Var.f390602g = aVar2.g(intValue);
        return 0;
    }
}
