package r45;

/* loaded from: classes7.dex */
public class fd4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public double f374239d;

    /* renamed from: e, reason: collision with root package name */
    public double f374240e;

    /* renamed from: f, reason: collision with root package name */
    public double f374241f;

    /* renamed from: g, reason: collision with root package name */
    public int f374242g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fd4)) {
            return false;
        }
        r45.fd4 fd4Var = (r45.fd4) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f374239d), java.lang.Double.valueOf(fd4Var.f374239d)) && n51.f.a(java.lang.Double.valueOf(this.f374240e), java.lang.Double.valueOf(fd4Var.f374240e)) && n51.f.a(java.lang.Double.valueOf(this.f374241f), java.lang.Double.valueOf(fd4Var.f374241f)) && n51.f.a(java.lang.Integer.valueOf(this.f374242g), java.lang.Integer.valueOf(fd4Var.f374242g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(2, this.f374239d);
            fVar.c(3, this.f374240e);
            fVar.c(5, this.f374241f);
            fVar.e(6, this.f374242g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.c(2, this.f374239d) + 0 + b36.f.c(3, this.f374240e) + b36.f.c(5, this.f374241f) + b36.f.e(6, this.f374242g);
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
        r45.fd4 fd4Var = (r45.fd4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 2) {
            fd4Var.f374239d = aVar2.e(intValue);
            return 0;
        }
        if (intValue == 3) {
            fd4Var.f374240e = aVar2.e(intValue);
            return 0;
        }
        if (intValue == 5) {
            fd4Var.f374241f = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 6) {
            return -1;
        }
        fd4Var.f374242g = aVar2.g(intValue);
        return 0;
    }
}
