package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class n3 extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.n3 f218375i = new com.tencent.wechat.mm.biz.n3();

    /* renamed from: d, reason: collision with root package name */
    public int f218376d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218377e;

    /* renamed from: f, reason: collision with root package name */
    public int f218378f;

    /* renamed from: g, reason: collision with root package name */
    public int f218379g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f218380h = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.n3)) {
            return false;
        }
        com.tencent.wechat.mm.biz.n3 n3Var = (com.tencent.wechat.mm.biz.n3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218376d), java.lang.Integer.valueOf(n3Var.f218376d)) && n51.f.a(this.f218377e, n3Var.f218377e) && n51.f.a(java.lang.Integer.valueOf(this.f218378f), java.lang.Integer.valueOf(n3Var.f218378f)) && n51.f.a(java.lang.Integer.valueOf(this.f218379g), java.lang.Integer.valueOf(n3Var.f218379g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.n3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218380h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f218376d);
            }
            java.lang.String str = this.f218377e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f218378f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f218379g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f218376d) : 0;
            java.lang.String str2 = this.f218377e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f218378f);
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f218379g) : e17;
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
        if (intValue == 1) {
            this.f218376d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f218377e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f218378f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f218379g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.n3) super.parseFrom(bArr);
    }
}
