package r45;

/* loaded from: classes2.dex */
public class xv6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390533d;

    /* renamed from: e, reason: collision with root package name */
    public int f390534e;

    /* renamed from: f, reason: collision with root package name */
    public long f390535f;

    /* renamed from: g, reason: collision with root package name */
    public int f390536g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xv6)) {
            return false;
        }
        r45.xv6 xv6Var = (r45.xv6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390533d), java.lang.Integer.valueOf(xv6Var.f390533d)) && n51.f.a(java.lang.Integer.valueOf(this.f390534e), java.lang.Integer.valueOf(xv6Var.f390534e)) && n51.f.a(java.lang.Long.valueOf(this.f390535f), java.lang.Long.valueOf(xv6Var.f390535f)) && n51.f.a(java.lang.Integer.valueOf(this.f390536g), java.lang.Integer.valueOf(xv6Var.f390536g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390533d);
            fVar.e(2, this.f390534e);
            fVar.h(3, this.f390535f);
            fVar.e(4, this.f390536g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f390533d) + 0 + b36.f.e(2, this.f390534e) + b36.f.h(3, this.f390535f) + b36.f.e(4, this.f390536g);
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
        r45.xv6 xv6Var = (r45.xv6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xv6Var.f390533d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            xv6Var.f390534e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            xv6Var.f390535f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        xv6Var.f390536g = aVar2.g(intValue);
        return 0;
    }
}
