package com.tencent.wechat.mm.biz;

/* loaded from: classes11.dex */
public class r5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f218540d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f218541e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f218542f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f218543g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f218544h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f218545i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f218546m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f218547n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f218548o = 0;

    static {
        new com.tencent.wechat.mm.biz.r5();
    }

    public int b() {
        return this.f218547n;
    }

    public int c() {
        return this.f218548o;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.r5)) {
            return false;
        }
        com.tencent.wechat.mm.biz.r5 r5Var = (com.tencent.wechat.mm.biz.r5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218540d), java.lang.Integer.valueOf(r5Var.f218540d)) && n51.f.a(java.lang.Integer.valueOf(this.f218541e), java.lang.Integer.valueOf(r5Var.f218541e)) && n51.f.a(java.lang.Integer.valueOf(this.f218542f), java.lang.Integer.valueOf(r5Var.f218542f)) && n51.f.a(java.lang.Integer.valueOf(this.f218543g), java.lang.Integer.valueOf(r5Var.f218543g)) && n51.f.a(java.lang.Integer.valueOf(this.f218544h), java.lang.Integer.valueOf(r5Var.f218544h)) && n51.f.a(java.lang.Integer.valueOf(this.f218545i), java.lang.Integer.valueOf(r5Var.f218545i)) && n51.f.a(java.lang.Integer.valueOf(this.f218546m), java.lang.Integer.valueOf(r5Var.f218546m)) && n51.f.a(java.lang.Integer.valueOf(this.f218547n), java.lang.Integer.valueOf(r5Var.f218547n)) && n51.f.a(java.lang.Integer.valueOf(this.f218548o), java.lang.Integer.valueOf(r5Var.f218548o));
    }

    public int d() {
        return this.f218545i;
    }

    public int e() {
        return this.f218541e;
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.r5 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.r5) super.parseFrom(bArr);
    }

    public int getCommentCount() {
        return this.f218543g;
    }

    public int getFollowTime() {
        return this.f218540d;
    }

    public int getLikeCount() {
        return this.f218542f;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.r5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f218540d);
            fVar.e(2, this.f218541e);
            fVar.e(3, this.f218542f);
            fVar.e(4, this.f218543g);
            fVar.e(5, this.f218544h);
            fVar.e(6, this.f218545i);
            fVar.e(7, this.f218546m);
            fVar.e(8, this.f218547n);
            fVar.e(9, this.f218548o);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f218540d) + 0 + b36.f.e(2, this.f218541e) + b36.f.e(3, this.f218542f) + b36.f.e(4, this.f218543g) + b36.f.e(5, this.f218544h) + b36.f.e(6, this.f218545i) + b36.f.e(7, this.f218546m) + b36.f.e(8, this.f218547n) + b36.f.e(9, this.f218548o);
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
        switch (intValue) {
            case 1:
                this.f218540d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f218541e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f218542f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f218543g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f218544h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f218545i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f218546m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f218547n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f218548o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
