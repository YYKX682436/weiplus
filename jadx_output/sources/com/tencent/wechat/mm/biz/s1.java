package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class s1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218578d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218579e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218580f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218581g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f218582h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f218583i;

    /* renamed from: m, reason: collision with root package name */
    public int f218584m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f218585n;

    /* renamed from: o, reason: collision with root package name */
    public int f218586o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f218587p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f218588q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.r1 f218589r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f218590s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f218591t;

    /* renamed from: u, reason: collision with root package name */
    public long f218592u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f218593v;

    /* renamed from: w, reason: collision with root package name */
    public final android.util.ArrayMap f218594w = new android.util.ArrayMap();

    static {
        new com.tencent.wechat.mm.biz.s1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.s1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.s1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.s1)) {
            return false;
        }
        com.tencent.wechat.mm.biz.s1 s1Var = (com.tencent.wechat.mm.biz.s1) fVar;
        return n51.f.a(this.f218578d, s1Var.f218578d) && n51.f.a(this.f218579e, s1Var.f218579e) && n51.f.a(this.f218580f, s1Var.f218580f) && n51.f.a(this.f218581g, s1Var.f218581g) && n51.f.a(this.f218582h, s1Var.f218582h) && n51.f.a(this.f218583i, s1Var.f218583i) && n51.f.a(java.lang.Integer.valueOf(this.f218584m), java.lang.Integer.valueOf(s1Var.f218584m)) && n51.f.a(this.f218585n, s1Var.f218585n) && n51.f.a(java.lang.Integer.valueOf(this.f218586o), java.lang.Integer.valueOf(s1Var.f218586o)) && n51.f.a(this.f218587p, s1Var.f218587p) && n51.f.a(this.f218588q, s1Var.f218588q) && n51.f.a(this.f218589r, s1Var.f218589r) && n51.f.a(this.f218590s, s1Var.f218590s) && n51.f.a(this.f218591t, s1Var.f218591t) && n51.f.a(java.lang.Long.valueOf(this.f218592u), java.lang.Long.valueOf(s1Var.f218592u)) && n51.f.a(this.f218593v, s1Var.f218593v);
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f218594w.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.s1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f218578d != null && hasFieldNumber(1)) {
                fVar.j(1, this.f218578d);
            }
            if (this.f218579e != null && hasFieldNumber(2)) {
                fVar.j(2, this.f218579e);
            }
            if (this.f218580f != null && hasFieldNumber(3)) {
                fVar.j(3, this.f218580f);
            }
            if (this.f218581g != null && hasFieldNumber(4)) {
                fVar.j(4, this.f218581g);
            }
            if (this.f218582h != null && hasFieldNumber(5)) {
                fVar.j(5, this.f218582h);
            }
            if (this.f218583i != null && hasFieldNumber(6)) {
                fVar.j(6, this.f218583i);
            }
            if (hasFieldNumber(7)) {
                fVar.e(7, this.f218584m);
            }
            if (this.f218585n != null && hasFieldNumber(8)) {
                fVar.j(8, this.f218585n);
            }
            if (hasFieldNumber(9)) {
                fVar.e(9, this.f218586o);
            }
            if (this.f218587p != null && hasFieldNumber(10)) {
                fVar.j(10, this.f218587p);
            }
            if (this.f218588q != null && hasFieldNumber(11)) {
                fVar.j(11, this.f218588q);
            }
            if (this.f218589r != null && hasFieldNumber(12)) {
                fVar.i(12, this.f218589r.computeSize());
                this.f218589r.writeFields(fVar);
            }
            if (this.f218590s != null && hasFieldNumber(13)) {
                fVar.j(13, this.f218590s);
            }
            if (this.f218591t != null && hasFieldNumber(900)) {
                fVar.j(900, this.f218591t);
            }
            if (hasFieldNumber(901)) {
                fVar.h(901, this.f218592u);
            }
            if (this.f218593v != null && hasFieldNumber(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX)) {
                fVar.j(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX, this.f218593v);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f218578d != null && hasFieldNumber(1)) {
                i18 = b36.f.j(1, this.f218578d) + 0;
            }
            if (this.f218579e != null && hasFieldNumber(2)) {
                i18 += b36.f.j(2, this.f218579e);
            }
            if (this.f218580f != null && hasFieldNumber(3)) {
                i18 += b36.f.j(3, this.f218580f);
            }
            if (this.f218581g != null && hasFieldNumber(4)) {
                i18 += b36.f.j(4, this.f218581g);
            }
            if (this.f218582h != null && hasFieldNumber(5)) {
                i18 += b36.f.j(5, this.f218582h);
            }
            if (this.f218583i != null && hasFieldNumber(6)) {
                i18 += b36.f.j(6, this.f218583i);
            }
            if (hasFieldNumber(7)) {
                i18 += b36.f.e(7, this.f218584m);
            }
            if (this.f218585n != null && hasFieldNumber(8)) {
                i18 += b36.f.j(8, this.f218585n);
            }
            if (hasFieldNumber(9)) {
                i18 += b36.f.e(9, this.f218586o);
            }
            if (this.f218587p != null && hasFieldNumber(10)) {
                i18 += b36.f.j(10, this.f218587p);
            }
            if (this.f218588q != null && hasFieldNumber(11)) {
                i18 += b36.f.j(11, this.f218588q);
            }
            if (this.f218589r != null && hasFieldNumber(12)) {
                i18 += b36.f.i(12, this.f218589r.computeSize());
            }
            if (this.f218590s != null && hasFieldNumber(13)) {
                i18 += b36.f.j(13, this.f218590s);
            }
            if (this.f218591t != null && hasFieldNumber(900)) {
                i18 += b36.f.j(900, this.f218591t);
            }
            if (hasFieldNumber(901)) {
                i18 += b36.f.h(901, this.f218592u);
            }
            return (this.f218593v == null || !hasFieldNumber(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX)) ? i18 : i18 + b36.f.j(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX, this.f218593v);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        android.util.ArrayMap arrayMap = this.f218594w;
        switch (intValue) {
            case 1:
                this.f218578d = aVar2.k(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f218579e = aVar2.k(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f218580f = aVar2.k(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f218581g = aVar2.k(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f218582h = aVar2.k(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f218583i = aVar2.k(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f218584m = aVar2.g(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                this.f218585n = aVar2.k(intValue);
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            case 9:
                this.f218586o = aVar2.g(intValue);
                arrayMap.put(9, java.lang.Boolean.TRUE);
                return 0;
            case 10:
                this.f218587p = aVar2.k(intValue);
                arrayMap.put(10, java.lang.Boolean.TRUE);
                return 0;
            case 11:
                this.f218588q = aVar2.k(intValue);
                arrayMap.put(11, java.lang.Boolean.TRUE);
                return 0;
            case 12:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.mm.biz.r1 r1Var = new com.tencent.wechat.mm.biz.r1();
                    if (bArr != null && bArr.length > 0) {
                        r1Var.parseFrom(bArr);
                    }
                    this.f218589r = r1Var;
                }
                arrayMap.put(12, java.lang.Boolean.TRUE);
                return 0;
            case 13:
                this.f218590s = aVar2.k(intValue);
                arrayMap.put(13, java.lang.Boolean.TRUE);
                return 0;
            default:
                switch (intValue) {
                    case 900:
                        this.f218591t = aVar2.k(intValue);
                        arrayMap.put(900, java.lang.Boolean.TRUE);
                        return 0;
                    case 901:
                        this.f218592u = aVar2.i(intValue);
                        arrayMap.put(901, java.lang.Boolean.TRUE);
                        return 0;
                    case com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX /* 902 */:
                        this.f218593v = aVar2.k(intValue);
                        arrayMap.put(java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX), java.lang.Boolean.TRUE);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
