package r45;

/* loaded from: classes7.dex */
public class od7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f382177d;

    /* renamed from: e, reason: collision with root package name */
    public int f382178e;

    /* renamed from: f, reason: collision with root package name */
    public int f382179f;

    /* renamed from: g, reason: collision with root package name */
    public int f382180g;

    /* renamed from: h, reason: collision with root package name */
    public int f382181h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.od7)) {
            return false;
        }
        r45.od7 od7Var = (r45.od7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f382177d), java.lang.Integer.valueOf(od7Var.f382177d)) && n51.f.a(java.lang.Integer.valueOf(this.f382178e), java.lang.Integer.valueOf(od7Var.f382178e)) && n51.f.a(java.lang.Integer.valueOf(this.f382179f), java.lang.Integer.valueOf(od7Var.f382179f)) && n51.f.a(java.lang.Integer.valueOf(this.f382180g), java.lang.Integer.valueOf(od7Var.f382180g)) && n51.f.a(java.lang.Integer.valueOf(this.f382181h), java.lang.Integer.valueOf(od7Var.f382181h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f382177d);
            fVar.e(2, this.f382178e);
            fVar.e(3, this.f382179f);
            fVar.e(5, this.f382180g);
            fVar.e(6, this.f382181h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f382177d) + 0 + b36.f.e(2, this.f382178e) + b36.f.e(3, this.f382179f) + b36.f.e(5, this.f382180g) + b36.f.e(6, this.f382181h);
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
        r45.od7 od7Var = (r45.od7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            od7Var.f382177d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            od7Var.f382178e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            od7Var.f382179f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            od7Var.f382180g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 6) {
            return -1;
        }
        od7Var.f382181h = aVar2.g(intValue);
        return 0;
    }
}
