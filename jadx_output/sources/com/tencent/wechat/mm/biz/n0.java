package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class n0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f218358d;

    /* renamed from: e, reason: collision with root package name */
    public int f218359e;

    /* renamed from: f, reason: collision with root package name */
    public int f218360f;

    /* renamed from: g, reason: collision with root package name */
    public int f218361g;

    /* renamed from: h, reason: collision with root package name */
    public int f218362h;

    /* renamed from: i, reason: collision with root package name */
    public int f218363i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f218364m;

    /* renamed from: n, reason: collision with root package name */
    public final android.util.ArrayMap f218365n = new android.util.ArrayMap();

    static {
        new com.tencent.wechat.mm.biz.n0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.n0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.n0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.n0)) {
            return false;
        }
        com.tencent.wechat.mm.biz.n0 n0Var = (com.tencent.wechat.mm.biz.n0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218358d), java.lang.Integer.valueOf(n0Var.f218358d)) && n51.f.a(java.lang.Integer.valueOf(this.f218359e), java.lang.Integer.valueOf(n0Var.f218359e)) && n51.f.a(java.lang.Integer.valueOf(this.f218360f), java.lang.Integer.valueOf(n0Var.f218360f)) && n51.f.a(java.lang.Integer.valueOf(this.f218361g), java.lang.Integer.valueOf(n0Var.f218361g)) && n51.f.a(java.lang.Integer.valueOf(this.f218362h), java.lang.Integer.valueOf(n0Var.f218362h)) && n51.f.a(java.lang.Integer.valueOf(this.f218363i), java.lang.Integer.valueOf(n0Var.f218363i)) && n51.f.a(java.lang.Boolean.valueOf(this.f218364m), java.lang.Boolean.valueOf(n0Var.f218364m));
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f218365n.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.n0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (hasFieldNumber(1)) {
                fVar.e(1, this.f218358d);
            }
            if (hasFieldNumber(2)) {
                fVar.e(2, this.f218359e);
            }
            if (hasFieldNumber(3)) {
                fVar.e(3, this.f218360f);
            }
            if (hasFieldNumber(4)) {
                fVar.e(4, this.f218361g);
            }
            if (hasFieldNumber(5)) {
                fVar.e(5, this.f218362h);
            }
            if (hasFieldNumber(6)) {
                fVar.e(6, this.f218363i);
            }
            if (hasFieldNumber(900)) {
                fVar.a(900, this.f218364m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = hasFieldNumber(1) ? 0 + b36.f.e(1, this.f218358d) : 0;
            if (hasFieldNumber(2)) {
                e17 += b36.f.e(2, this.f218359e);
            }
            if (hasFieldNumber(3)) {
                e17 += b36.f.e(3, this.f218360f);
            }
            if (hasFieldNumber(4)) {
                e17 += b36.f.e(4, this.f218361g);
            }
            if (hasFieldNumber(5)) {
                e17 += b36.f.e(5, this.f218362h);
            }
            if (hasFieldNumber(6)) {
                e17 += b36.f.e(6, this.f218363i);
            }
            return hasFieldNumber(900) ? e17 + b36.f.a(900, this.f218364m) : e17;
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
        android.util.ArrayMap arrayMap = this.f218365n;
        if (intValue == 900) {
            this.f218364m = aVar2.c(intValue);
            arrayMap.put(900, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f218358d = aVar2.g(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f218359e = aVar2.g(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f218360f = aVar2.g(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f218361g = aVar2.g(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f218362h = aVar2.g(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f218363i = aVar2.g(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
