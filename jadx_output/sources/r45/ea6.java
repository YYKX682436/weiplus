package r45;

/* loaded from: classes4.dex */
public class ea6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f373195d;

    /* renamed from: e, reason: collision with root package name */
    public float f373196e;

    /* renamed from: f, reason: collision with root package name */
    public float f373197f;

    /* renamed from: g, reason: collision with root package name */
    public float f373198g;

    /* renamed from: h, reason: collision with root package name */
    public int f373199h;

    /* renamed from: i, reason: collision with root package name */
    public long f373200i;

    /* renamed from: m, reason: collision with root package name */
    public long f373201m;

    /* renamed from: n, reason: collision with root package name */
    public float f373202n;

    /* renamed from: o, reason: collision with root package name */
    public int f373203o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ea6)) {
            return false;
        }
        r45.ea6 ea6Var = (r45.ea6) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f373195d), java.lang.Float.valueOf(ea6Var.f373195d)) && n51.f.a(java.lang.Float.valueOf(this.f373196e), java.lang.Float.valueOf(ea6Var.f373196e)) && n51.f.a(java.lang.Float.valueOf(this.f373197f), java.lang.Float.valueOf(ea6Var.f373197f)) && n51.f.a(java.lang.Float.valueOf(this.f373198g), java.lang.Float.valueOf(ea6Var.f373198g)) && n51.f.a(java.lang.Integer.valueOf(this.f373199h), java.lang.Integer.valueOf(ea6Var.f373199h)) && n51.f.a(java.lang.Long.valueOf(this.f373200i), java.lang.Long.valueOf(ea6Var.f373200i)) && n51.f.a(java.lang.Long.valueOf(this.f373201m), java.lang.Long.valueOf(ea6Var.f373201m)) && n51.f.a(java.lang.Float.valueOf(this.f373202n), java.lang.Float.valueOf(ea6Var.f373202n)) && n51.f.a(java.lang.Integer.valueOf(this.f373203o), java.lang.Integer.valueOf(ea6Var.f373203o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f373195d);
            fVar.d(2, this.f373196e);
            fVar.d(3, this.f373197f);
            fVar.d(4, this.f373198g);
            fVar.e(5, this.f373199h);
            fVar.h(6, this.f373200i);
            fVar.h(7, this.f373201m);
            fVar.d(8, this.f373202n);
            fVar.e(9, this.f373203o);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f373195d) + 0 + b36.f.d(2, this.f373196e) + b36.f.d(3, this.f373197f) + b36.f.d(4, this.f373198g) + b36.f.e(5, this.f373199h) + b36.f.h(6, this.f373200i) + b36.f.h(7, this.f373201m) + b36.f.d(8, this.f373202n) + b36.f.e(9, this.f373203o);
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
        r45.ea6 ea6Var = (r45.ea6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ea6Var.f373195d = aVar2.f(intValue);
                return 0;
            case 2:
                ea6Var.f373196e = aVar2.f(intValue);
                return 0;
            case 3:
                ea6Var.f373197f = aVar2.f(intValue);
                return 0;
            case 4:
                ea6Var.f373198g = aVar2.f(intValue);
                return 0;
            case 5:
                ea6Var.f373199h = aVar2.g(intValue);
                return 0;
            case 6:
                ea6Var.f373200i = aVar2.i(intValue);
                return 0;
            case 7:
                ea6Var.f373201m = aVar2.i(intValue);
                return 0;
            case 8:
                ea6Var.f373202n = aVar2.f(intValue);
                return 0;
            case 9:
                ea6Var.f373203o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
