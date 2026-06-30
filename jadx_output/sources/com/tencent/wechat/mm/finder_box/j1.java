package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class j1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219530d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219531e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219532f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219533g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f219534h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f219535i;

    /* renamed from: m, reason: collision with root package name */
    public int f219536m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f219537n;

    /* renamed from: o, reason: collision with root package name */
    public int f219538o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f219539p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f219540q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.i1 f219541r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f219542s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f219543t;

    /* renamed from: u, reason: collision with root package name */
    public long f219544u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f219545v;

    /* renamed from: w, reason: collision with root package name */
    public final android.util.ArrayMap f219546w = new android.util.ArrayMap();

    static {
        new com.tencent.wechat.mm.finder_box.j1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.j1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.j1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.j1)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.j1 j1Var = (com.tencent.wechat.mm.finder_box.j1) fVar;
        return n51.f.a(this.f219530d, j1Var.f219530d) && n51.f.a(this.f219531e, j1Var.f219531e) && n51.f.a(this.f219532f, j1Var.f219532f) && n51.f.a(this.f219533g, j1Var.f219533g) && n51.f.a(this.f219534h, j1Var.f219534h) && n51.f.a(this.f219535i, j1Var.f219535i) && n51.f.a(java.lang.Integer.valueOf(this.f219536m), java.lang.Integer.valueOf(j1Var.f219536m)) && n51.f.a(this.f219537n, j1Var.f219537n) && n51.f.a(java.lang.Integer.valueOf(this.f219538o), java.lang.Integer.valueOf(j1Var.f219538o)) && n51.f.a(this.f219539p, j1Var.f219539p) && n51.f.a(this.f219540q, j1Var.f219540q) && n51.f.a(this.f219541r, j1Var.f219541r) && n51.f.a(this.f219542s, j1Var.f219542s) && n51.f.a(this.f219543t, j1Var.f219543t) && n51.f.a(java.lang.Long.valueOf(this.f219544u), java.lang.Long.valueOf(j1Var.f219544u)) && n51.f.a(this.f219545v, j1Var.f219545v);
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f219546w.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.j1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f219530d != null && hasFieldNumber(1)) {
                fVar.j(1, this.f219530d);
            }
            if (this.f219531e != null && hasFieldNumber(2)) {
                fVar.j(2, this.f219531e);
            }
            if (this.f219532f != null && hasFieldNumber(3)) {
                fVar.j(3, this.f219532f);
            }
            if (this.f219533g != null && hasFieldNumber(4)) {
                fVar.j(4, this.f219533g);
            }
            if (this.f219534h != null && hasFieldNumber(5)) {
                fVar.j(5, this.f219534h);
            }
            if (this.f219535i != null && hasFieldNumber(6)) {
                fVar.j(6, this.f219535i);
            }
            if (hasFieldNumber(7)) {
                fVar.e(7, this.f219536m);
            }
            if (this.f219537n != null && hasFieldNumber(8)) {
                fVar.j(8, this.f219537n);
            }
            if (hasFieldNumber(9)) {
                fVar.e(9, this.f219538o);
            }
            if (this.f219539p != null && hasFieldNumber(10)) {
                fVar.j(10, this.f219539p);
            }
            if (this.f219540q != null && hasFieldNumber(11)) {
                fVar.j(11, this.f219540q);
            }
            if (this.f219541r != null && hasFieldNumber(12)) {
                fVar.i(12, this.f219541r.computeSize());
                this.f219541r.writeFields(fVar);
            }
            if (this.f219542s != null && hasFieldNumber(13)) {
                fVar.j(13, this.f219542s);
            }
            if (this.f219543t != null && hasFieldNumber(900)) {
                fVar.j(900, this.f219543t);
            }
            if (hasFieldNumber(901)) {
                fVar.h(901, this.f219544u);
            }
            if (this.f219545v != null && hasFieldNumber(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX)) {
                fVar.j(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX, this.f219545v);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f219530d != null && hasFieldNumber(1)) {
                i18 = b36.f.j(1, this.f219530d) + 0;
            }
            if (this.f219531e != null && hasFieldNumber(2)) {
                i18 += b36.f.j(2, this.f219531e);
            }
            if (this.f219532f != null && hasFieldNumber(3)) {
                i18 += b36.f.j(3, this.f219532f);
            }
            if (this.f219533g != null && hasFieldNumber(4)) {
                i18 += b36.f.j(4, this.f219533g);
            }
            if (this.f219534h != null && hasFieldNumber(5)) {
                i18 += b36.f.j(5, this.f219534h);
            }
            if (this.f219535i != null && hasFieldNumber(6)) {
                i18 += b36.f.j(6, this.f219535i);
            }
            if (hasFieldNumber(7)) {
                i18 += b36.f.e(7, this.f219536m);
            }
            if (this.f219537n != null && hasFieldNumber(8)) {
                i18 += b36.f.j(8, this.f219537n);
            }
            if (hasFieldNumber(9)) {
                i18 += b36.f.e(9, this.f219538o);
            }
            if (this.f219539p != null && hasFieldNumber(10)) {
                i18 += b36.f.j(10, this.f219539p);
            }
            if (this.f219540q != null && hasFieldNumber(11)) {
                i18 += b36.f.j(11, this.f219540q);
            }
            if (this.f219541r != null && hasFieldNumber(12)) {
                i18 += b36.f.i(12, this.f219541r.computeSize());
            }
            if (this.f219542s != null && hasFieldNumber(13)) {
                i18 += b36.f.j(13, this.f219542s);
            }
            if (this.f219543t != null && hasFieldNumber(900)) {
                i18 += b36.f.j(900, this.f219543t);
            }
            if (hasFieldNumber(901)) {
                i18 += b36.f.h(901, this.f219544u);
            }
            return (this.f219545v == null || !hasFieldNumber(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX)) ? i18 : i18 + b36.f.j(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX, this.f219545v);
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
        android.util.ArrayMap arrayMap = this.f219546w;
        switch (intValue) {
            case 1:
                this.f219530d = aVar2.k(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f219531e = aVar2.k(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f219532f = aVar2.k(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f219533g = aVar2.k(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f219534h = aVar2.k(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f219535i = aVar2.k(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f219536m = aVar2.g(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                this.f219537n = aVar2.k(intValue);
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            case 9:
                this.f219538o = aVar2.g(intValue);
                arrayMap.put(9, java.lang.Boolean.TRUE);
                return 0;
            case 10:
                this.f219539p = aVar2.k(intValue);
                arrayMap.put(10, java.lang.Boolean.TRUE);
                return 0;
            case 11:
                this.f219540q = aVar2.k(intValue);
                arrayMap.put(11, java.lang.Boolean.TRUE);
                return 0;
            case 12:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.mm.finder_box.i1 i1Var = new com.tencent.wechat.mm.finder_box.i1();
                    if (bArr != null && bArr.length > 0) {
                        i1Var.parseFrom(bArr);
                    }
                    this.f219541r = i1Var;
                }
                arrayMap.put(12, java.lang.Boolean.TRUE);
                return 0;
            case 13:
                this.f219542s = aVar2.k(intValue);
                arrayMap.put(13, java.lang.Boolean.TRUE);
                return 0;
            default:
                switch (intValue) {
                    case 900:
                        this.f219543t = aVar2.k(intValue);
                        arrayMap.put(900, java.lang.Boolean.TRUE);
                        return 0;
                    case 901:
                        this.f219544u = aVar2.i(intValue);
                        arrayMap.put(901, java.lang.Boolean.TRUE);
                        return 0;
                    case com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX /* 902 */:
                        this.f219545v = aVar2.k(intValue);
                        arrayMap.put(java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX), java.lang.Boolean.TRUE);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
