package r45;

/* loaded from: classes2.dex */
public class gg7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375239d;

    /* renamed from: e, reason: collision with root package name */
    public int f375240e;

    /* renamed from: f, reason: collision with root package name */
    public int f375241f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375242g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gg7)) {
            return false;
        }
        r45.gg7 gg7Var = (r45.gg7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375239d), java.lang.Integer.valueOf(gg7Var.f375239d)) && n51.f.a(java.lang.Integer.valueOf(this.f375240e), java.lang.Integer.valueOf(gg7Var.f375240e)) && n51.f.a(java.lang.Integer.valueOf(this.f375241f), java.lang.Integer.valueOf(gg7Var.f375241f)) && n51.f.a(this.f375242g, gg7Var.f375242g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375239d);
            fVar.e(2, this.f375240e);
            fVar.e(3, this.f375241f);
            java.lang.String str = this.f375242g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375239d) + 0 + b36.f.e(2, this.f375240e) + b36.f.e(3, this.f375241f);
            java.lang.String str2 = this.f375242g;
            return str2 != null ? e17 + b36.f.j(4, str2) : e17;
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
        r45.gg7 gg7Var = (r45.gg7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gg7Var.f375239d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            gg7Var.f375240e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            gg7Var.f375241f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        gg7Var.f375242g = aVar2.k(intValue);
        return 0;
    }
}
