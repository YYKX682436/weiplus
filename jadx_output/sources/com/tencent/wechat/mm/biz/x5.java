package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class x5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f218782d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218783e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218784f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.w5 f218785g;

    /* renamed from: h, reason: collision with root package name */
    public int f218786h;

    /* renamed from: i, reason: collision with root package name */
    public int f218787i;

    /* renamed from: m, reason: collision with root package name */
    public int f218788m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.u5 f218789n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.v5 f218790o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f218791p = new boolean[10];

    static {
        new com.tencent.wechat.mm.biz.x5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.x5 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.x5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.x5)) {
            return false;
        }
        com.tencent.wechat.mm.biz.x5 x5Var = (com.tencent.wechat.mm.biz.x5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218782d), java.lang.Integer.valueOf(x5Var.f218782d)) && n51.f.a(this.f218783e, x5Var.f218783e) && n51.f.a(this.f218784f, x5Var.f218784f) && n51.f.a(this.f218785g, x5Var.f218785g) && n51.f.a(java.lang.Integer.valueOf(this.f218786h), java.lang.Integer.valueOf(x5Var.f218786h)) && n51.f.a(java.lang.Integer.valueOf(this.f218787i), java.lang.Integer.valueOf(x5Var.f218787i)) && n51.f.a(java.lang.Integer.valueOf(this.f218788m), java.lang.Integer.valueOf(x5Var.f218788m)) && n51.f.a(this.f218789n, x5Var.f218789n) && n51.f.a(this.f218790o, x5Var.f218790o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.x5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218791p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f218782d);
            }
            java.lang.String str = this.f218783e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f218784f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            com.tencent.wechat.mm.biz.w5 w5Var = this.f218785g;
            if (w5Var != null && zArr[4]) {
                fVar.i(4, w5Var.computeSize());
                this.f218785g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f218786h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f218787i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f218788m);
            }
            com.tencent.wechat.mm.biz.u5 u5Var = this.f218789n;
            if (u5Var != null && zArr[8]) {
                fVar.i(8, u5Var.computeSize());
                this.f218789n.writeFields(fVar);
            }
            com.tencent.wechat.mm.biz.v5 v5Var = this.f218790o;
            if (v5Var != null && zArr[9]) {
                fVar.i(9, v5Var.computeSize());
                this.f218790o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f218782d) : 0;
            java.lang.String str3 = this.f218783e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f218784f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            com.tencent.wechat.mm.biz.w5 w5Var2 = this.f218785g;
            if (w5Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, w5Var2.computeSize());
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f218786h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f218787i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f218788m);
            }
            com.tencent.wechat.mm.biz.u5 u5Var2 = this.f218789n;
            if (u5Var2 != null && zArr[8]) {
                e17 += b36.f.i(8, u5Var2.computeSize());
            }
            com.tencent.wechat.mm.biz.v5 v5Var2 = this.f218790o;
            return (v5Var2 == null || !zArr[9]) ? e17 : e17 + b36.f.i(9, v5Var2.computeSize());
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
                this.f218782d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218783e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218784f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.mm.biz.w5 w5Var3 = new com.tencent.wechat.mm.biz.w5();
                    if (bArr != null && bArr.length > 0) {
                        w5Var3.parseFrom(bArr);
                    }
                    this.f218785g = w5Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f218786h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218787i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218788m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.wechat.mm.biz.u5 u5Var3 = new com.tencent.wechat.mm.biz.u5();
                    if (bArr2 != null && bArr2.length > 0) {
                        u5Var3.parseFrom(bArr2);
                    }
                    this.f218789n = u5Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.tencent.wechat.mm.biz.v5 v5Var3 = new com.tencent.wechat.mm.biz.v5();
                    if (bArr3 != null && bArr3.length > 0) {
                        v5Var3.parseFrom(bArr3);
                    }
                    this.f218790o = v5Var3;
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
