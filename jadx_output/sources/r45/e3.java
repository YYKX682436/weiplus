package r45;

/* loaded from: classes4.dex */
public class e3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372952d;

    /* renamed from: e, reason: collision with root package name */
    public int f372953e;

    /* renamed from: f, reason: collision with root package name */
    public float f372954f;

    /* renamed from: g, reason: collision with root package name */
    public float f372955g;

    /* renamed from: h, reason: collision with root package name */
    public float f372956h;

    /* renamed from: i, reason: collision with root package name */
    public long f372957i;

    /* renamed from: m, reason: collision with root package name */
    public long f372958m;

    /* renamed from: n, reason: collision with root package name */
    public long f372959n;

    /* renamed from: o, reason: collision with root package name */
    public long f372960o;

    /* renamed from: p, reason: collision with root package name */
    public long f372961p;

    /* renamed from: q, reason: collision with root package name */
    public long f372962q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e3)) {
            return false;
        }
        r45.e3 e3Var = (r45.e3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372952d), java.lang.Integer.valueOf(e3Var.f372952d)) && n51.f.a(java.lang.Integer.valueOf(this.f372953e), java.lang.Integer.valueOf(e3Var.f372953e)) && n51.f.a(java.lang.Float.valueOf(this.f372954f), java.lang.Float.valueOf(e3Var.f372954f)) && n51.f.a(java.lang.Float.valueOf(this.f372955g), java.lang.Float.valueOf(e3Var.f372955g)) && n51.f.a(java.lang.Float.valueOf(this.f372956h), java.lang.Float.valueOf(e3Var.f372956h)) && n51.f.a(java.lang.Long.valueOf(this.f372957i), java.lang.Long.valueOf(e3Var.f372957i)) && n51.f.a(java.lang.Long.valueOf(this.f372958m), java.lang.Long.valueOf(e3Var.f372958m)) && n51.f.a(java.lang.Long.valueOf(this.f372959n), java.lang.Long.valueOf(e3Var.f372959n)) && n51.f.a(java.lang.Long.valueOf(this.f372960o), java.lang.Long.valueOf(e3Var.f372960o)) && n51.f.a(java.lang.Long.valueOf(this.f372961p), java.lang.Long.valueOf(e3Var.f372961p)) && n51.f.a(java.lang.Long.valueOf(this.f372962q), java.lang.Long.valueOf(e3Var.f372962q));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372952d);
            fVar.e(2, this.f372953e);
            fVar.d(3, this.f372954f);
            fVar.d(4, this.f372955g);
            fVar.d(5, this.f372956h);
            fVar.h(6, this.f372957i);
            fVar.h(7, this.f372958m);
            fVar.h(8, this.f372959n);
            fVar.h(9, this.f372960o);
            fVar.h(10, this.f372961p);
            fVar.h(11, this.f372962q);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f372952d) + 0 + b36.f.e(2, this.f372953e) + b36.f.d(3, this.f372954f) + b36.f.d(4, this.f372955g) + b36.f.d(5, this.f372956h) + b36.f.h(6, this.f372957i) + b36.f.h(7, this.f372958m) + b36.f.h(8, this.f372959n) + b36.f.h(9, this.f372960o) + b36.f.h(10, this.f372961p) + b36.f.h(11, this.f372962q);
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
        r45.e3 e3Var = (r45.e3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                e3Var.f372952d = aVar2.g(intValue);
                return 0;
            case 2:
                e3Var.f372953e = aVar2.g(intValue);
                return 0;
            case 3:
                e3Var.f372954f = aVar2.f(intValue);
                return 0;
            case 4:
                e3Var.f372955g = aVar2.f(intValue);
                return 0;
            case 5:
                e3Var.f372956h = aVar2.f(intValue);
                return 0;
            case 6:
                e3Var.f372957i = aVar2.i(intValue);
                return 0;
            case 7:
                e3Var.f372958m = aVar2.i(intValue);
                return 0;
            case 8:
                e3Var.f372959n = aVar2.i(intValue);
                return 0;
            case 9:
                e3Var.f372960o = aVar2.i(intValue);
                return 0;
            case 10:
                e3Var.f372961p = aVar2.i(intValue);
                return 0;
            case 11:
                e3Var.f372962q = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
