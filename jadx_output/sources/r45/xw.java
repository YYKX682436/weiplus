package r45;

/* loaded from: classes7.dex */
public class xw extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f390537d;

    /* renamed from: e, reason: collision with root package name */
    public long f390538e;

    /* renamed from: f, reason: collision with root package name */
    public long f390539f;

    /* renamed from: g, reason: collision with root package name */
    public long f390540g;

    /* renamed from: h, reason: collision with root package name */
    public long f390541h;

    /* renamed from: i, reason: collision with root package name */
    public long f390542i;

    /* renamed from: m, reason: collision with root package name */
    public long f390543m;

    /* renamed from: n, reason: collision with root package name */
    public long f390544n;

    /* renamed from: o, reason: collision with root package name */
    public long f390545o;

    /* renamed from: p, reason: collision with root package name */
    public long f390546p;

    /* renamed from: q, reason: collision with root package name */
    public long f390547q;

    /* renamed from: r, reason: collision with root package name */
    public long f390548r;

    /* renamed from: s, reason: collision with root package name */
    public long f390549s;

    /* renamed from: t, reason: collision with root package name */
    public long f390550t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f390551u;

    /* renamed from: v, reason: collision with root package name */
    public long f390552v;

    /* renamed from: w, reason: collision with root package name */
    public long f390553w;

    /* renamed from: x, reason: collision with root package name */
    public long f390554x;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xw)) {
            return false;
        }
        r45.xw xwVar = (r45.xw) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f390537d), java.lang.Long.valueOf(xwVar.f390537d)) && n51.f.a(java.lang.Long.valueOf(this.f390538e), java.lang.Long.valueOf(xwVar.f390538e)) && n51.f.a(java.lang.Long.valueOf(this.f390539f), java.lang.Long.valueOf(xwVar.f390539f)) && n51.f.a(java.lang.Long.valueOf(this.f390540g), java.lang.Long.valueOf(xwVar.f390540g)) && n51.f.a(java.lang.Long.valueOf(this.f390541h), java.lang.Long.valueOf(xwVar.f390541h)) && n51.f.a(java.lang.Long.valueOf(this.f390542i), java.lang.Long.valueOf(xwVar.f390542i)) && n51.f.a(java.lang.Long.valueOf(this.f390543m), java.lang.Long.valueOf(xwVar.f390543m)) && n51.f.a(java.lang.Long.valueOf(this.f390544n), java.lang.Long.valueOf(xwVar.f390544n)) && n51.f.a(java.lang.Long.valueOf(this.f390545o), java.lang.Long.valueOf(xwVar.f390545o)) && n51.f.a(java.lang.Long.valueOf(this.f390546p), java.lang.Long.valueOf(xwVar.f390546p)) && n51.f.a(java.lang.Long.valueOf(this.f390547q), java.lang.Long.valueOf(xwVar.f390547q)) && n51.f.a(java.lang.Long.valueOf(this.f390548r), java.lang.Long.valueOf(xwVar.f390548r)) && n51.f.a(java.lang.Long.valueOf(this.f390549s), java.lang.Long.valueOf(xwVar.f390549s)) && n51.f.a(java.lang.Long.valueOf(this.f390550t), java.lang.Long.valueOf(xwVar.f390550t)) && n51.f.a(this.f390551u, xwVar.f390551u) && n51.f.a(java.lang.Long.valueOf(this.f390552v), java.lang.Long.valueOf(xwVar.f390552v)) && n51.f.a(java.lang.Long.valueOf(this.f390553w), java.lang.Long.valueOf(xwVar.f390553w)) && n51.f.a(java.lang.Long.valueOf(this.f390554x), java.lang.Long.valueOf(xwVar.f390554x));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f390537d);
            fVar.h(2, this.f390538e);
            fVar.h(3, this.f390539f);
            fVar.h(4, this.f390540g);
            fVar.h(5, this.f390541h);
            fVar.h(6, this.f390542i);
            fVar.h(7, this.f390543m);
            fVar.h(8, this.f390544n);
            fVar.h(9, this.f390545o);
            fVar.h(10, this.f390546p);
            fVar.h(11, this.f390547q);
            fVar.h(12, this.f390548r);
            fVar.h(13, this.f390549s);
            fVar.h(14, this.f390550t);
            java.lang.String str = this.f390551u;
            if (str != null) {
                fVar.j(15, str);
            }
            fVar.h(16, this.f390552v);
            fVar.h(17, this.f390553w);
            fVar.h(18, this.f390554x);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f390537d) + 0 + b36.f.h(2, this.f390538e) + b36.f.h(3, this.f390539f) + b36.f.h(4, this.f390540g) + b36.f.h(5, this.f390541h) + b36.f.h(6, this.f390542i) + b36.f.h(7, this.f390543m) + b36.f.h(8, this.f390544n) + b36.f.h(9, this.f390545o) + b36.f.h(10, this.f390546p) + b36.f.h(11, this.f390547q) + b36.f.h(12, this.f390548r) + b36.f.h(13, this.f390549s) + b36.f.h(14, this.f390550t);
            java.lang.String str2 = this.f390551u;
            if (str2 != null) {
                h17 += b36.f.j(15, str2);
            }
            return h17 + b36.f.h(16, this.f390552v) + b36.f.h(17, this.f390553w) + b36.f.h(18, this.f390554x);
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
        r45.xw xwVar = (r45.xw) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xwVar.f390537d = aVar2.i(intValue);
                return 0;
            case 2:
                xwVar.f390538e = aVar2.i(intValue);
                return 0;
            case 3:
                xwVar.f390539f = aVar2.i(intValue);
                return 0;
            case 4:
                xwVar.f390540g = aVar2.i(intValue);
                return 0;
            case 5:
                xwVar.f390541h = aVar2.i(intValue);
                return 0;
            case 6:
                xwVar.f390542i = aVar2.i(intValue);
                return 0;
            case 7:
                xwVar.f390543m = aVar2.i(intValue);
                return 0;
            case 8:
                xwVar.f390544n = aVar2.i(intValue);
                return 0;
            case 9:
                xwVar.f390545o = aVar2.i(intValue);
                return 0;
            case 10:
                xwVar.f390546p = aVar2.i(intValue);
                return 0;
            case 11:
                xwVar.f390547q = aVar2.i(intValue);
                return 0;
            case 12:
                xwVar.f390548r = aVar2.i(intValue);
                return 0;
            case 13:
                xwVar.f390549s = aVar2.i(intValue);
                return 0;
            case 14:
                xwVar.f390550t = aVar2.i(intValue);
                return 0;
            case 15:
                xwVar.f390551u = aVar2.k(intValue);
                return 0;
            case 16:
                xwVar.f390552v = aVar2.i(intValue);
                return 0;
            case 17:
                xwVar.f390553w = aVar2.i(intValue);
                return 0;
            case 18:
                xwVar.f390554x = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
