package com.tencent.wechat.mm.biz;

/* loaded from: classes9.dex */
public class q3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f218486d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218487e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218488f;

    /* renamed from: g, reason: collision with root package name */
    public int f218489g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f218490h;

    /* renamed from: i, reason: collision with root package name */
    public int f218491i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f218492m = new boolean[7];

    static {
        new com.tencent.wechat.mm.biz.q3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.q3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.q3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.q3)) {
            return false;
        }
        com.tencent.wechat.mm.biz.q3 q3Var = (com.tencent.wechat.mm.biz.q3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f218486d), java.lang.Long.valueOf(q3Var.f218486d)) && n51.f.a(this.f218487e, q3Var.f218487e) && n51.f.a(this.f218488f, q3Var.f218488f) && n51.f.a(java.lang.Integer.valueOf(this.f218489g), java.lang.Integer.valueOf(q3Var.f218489g)) && n51.f.a(this.f218490h, q3Var.f218490h) && n51.f.a(java.lang.Integer.valueOf(this.f218491i), java.lang.Integer.valueOf(q3Var.f218491i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.q3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218492m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f218486d);
            }
            java.lang.String str = this.f218487e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f218488f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f218489g);
            }
            java.lang.String str3 = this.f218490h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f218491i);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f218486d) : 0;
            java.lang.String str4 = this.f218487e;
            if (str4 != null && zArr[2]) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f218488f;
            if (str5 != null && zArr[3]) {
                h17 += b36.f.j(3, str5);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f218489g);
            }
            java.lang.String str6 = this.f218490h;
            if (str6 != null && zArr[5]) {
                h17 += b36.f.j(5, str6);
            }
            return zArr[6] ? h17 + b36.f.e(6, this.f218491i) : h17;
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
                this.f218486d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218487e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218488f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f218489g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f218490h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218491i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
