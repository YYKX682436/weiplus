package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class r4 extends com.tencent.mm.protobuf.f {

    /* renamed from: v, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.r4 f218524v = new com.tencent.wechat.mm.biz.r4();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.iam.biz.t f218525d = new com.tencent.wechat.iam.biz.t();

    /* renamed from: e, reason: collision with root package name */
    public int f218526e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f218527f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f218528g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f218529h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f218530i = 0;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.k3 f218531m = new com.tencent.wechat.mm.biz.k3();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f218532n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.e3 f218533o = new com.tencent.wechat.mm.biz.e3();

    /* renamed from: p, reason: collision with root package name */
    public int f218534p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f218535q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f218536r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f218537s = 0;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.w4 f218538t = new com.tencent.wechat.mm.biz.w4();

    /* renamed from: u, reason: collision with root package name */
    public int f218539u = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.r4)) {
            return false;
        }
        com.tencent.wechat.mm.biz.r4 r4Var = (com.tencent.wechat.mm.biz.r4) fVar;
        return n51.f.a(this.f218525d, r4Var.f218525d) && n51.f.a(java.lang.Integer.valueOf(this.f218526e), java.lang.Integer.valueOf(r4Var.f218526e)) && n51.f.a(java.lang.Integer.valueOf(this.f218527f), java.lang.Integer.valueOf(r4Var.f218527f)) && n51.f.a(java.lang.Integer.valueOf(this.f218528g), java.lang.Integer.valueOf(r4Var.f218528g)) && n51.f.a(java.lang.Integer.valueOf(this.f218529h), java.lang.Integer.valueOf(r4Var.f218529h)) && n51.f.a(java.lang.Integer.valueOf(this.f218530i), java.lang.Integer.valueOf(r4Var.f218530i)) && n51.f.a(this.f218531m, r4Var.f218531m) && n51.f.a(this.f218532n, r4Var.f218532n) && n51.f.a(this.f218533o, r4Var.f218533o) && n51.f.a(java.lang.Integer.valueOf(this.f218534p), java.lang.Integer.valueOf(r4Var.f218534p)) && n51.f.a(java.lang.Integer.valueOf(this.f218535q), java.lang.Integer.valueOf(r4Var.f218535q)) && n51.f.a(java.lang.Integer.valueOf(this.f218536r), java.lang.Integer.valueOf(r4Var.f218536r)) && n51.f.a(java.lang.Integer.valueOf(this.f218537s), java.lang.Integer.valueOf(r4Var.f218537s)) && n51.f.a(this.f218538t, r4Var.f218538t) && n51.f.a(java.lang.Integer.valueOf(this.f218539u), java.lang.Integer.valueOf(r4Var.f218539u));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.r4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218532n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.iam.biz.t tVar = this.f218525d;
            if (tVar != null) {
                fVar.i(1, tVar.computeSize());
                this.f218525d.writeFields(fVar);
            }
            fVar.e(2, this.f218526e);
            fVar.e(3, this.f218527f);
            fVar.e(4, this.f218528g);
            fVar.e(5, this.f218529h);
            fVar.e(6, this.f218530i);
            com.tencent.wechat.mm.biz.k3 k3Var = this.f218531m;
            if (k3Var != null) {
                fVar.i(7, k3Var.computeSize());
                this.f218531m.writeFields(fVar);
            }
            fVar.g(8, 2, linkedList);
            com.tencent.wechat.mm.biz.e3 e3Var = this.f218533o;
            if (e3Var != null) {
                fVar.i(9, e3Var.computeSize());
                this.f218533o.writeFields(fVar);
            }
            fVar.e(10, this.f218534p);
            fVar.e(11, this.f218535q);
            fVar.e(12, this.f218536r);
            fVar.e(13, this.f218537s);
            com.tencent.wechat.mm.biz.w4 w4Var = this.f218538t;
            if (w4Var != null) {
                fVar.i(14, w4Var.computeSize());
                this.f218538t.writeFields(fVar);
            }
            fVar.e(15, this.f218539u);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.iam.biz.t tVar2 = this.f218525d;
            int i18 = (tVar2 != null ? b36.f.i(1, tVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f218526e) + b36.f.e(3, this.f218527f) + b36.f.e(4, this.f218528g) + b36.f.e(5, this.f218529h) + b36.f.e(6, this.f218530i);
            com.tencent.wechat.mm.biz.k3 k3Var2 = this.f218531m;
            if (k3Var2 != null) {
                i18 += b36.f.i(7, k3Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(8, 2, linkedList);
            com.tencent.wechat.mm.biz.e3 e3Var2 = this.f218533o;
            if (e3Var2 != null) {
                g17 += b36.f.i(9, e3Var2.computeSize());
            }
            int e17 = g17 + b36.f.e(10, this.f218534p) + b36.f.e(11, this.f218535q) + b36.f.e(12, this.f218536r) + b36.f.e(13, this.f218537s);
            com.tencent.wechat.mm.biz.w4 w4Var2 = this.f218538t;
            if (w4Var2 != null) {
                e17 += b36.f.i(14, w4Var2.computeSize());
            }
            return e17 + b36.f.e(15, this.f218539u);
        }
        if (i17 == 2) {
            linkedList.clear();
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.iam.biz.t tVar3 = new com.tencent.wechat.iam.biz.t();
                    if (bArr != null && bArr.length > 0) {
                        tVar3.parseFrom(bArr);
                    }
                    this.f218525d = tVar3;
                }
                return 0;
            case 2:
                this.f218526e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f218527f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f218528g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f218529h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f218530i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.mm.biz.k3 k3Var3 = new com.tencent.wechat.mm.biz.k3();
                    if (bArr2 != null && bArr2.length > 0) {
                        k3Var3.parseFrom(bArr2);
                    }
                    this.f218531m = k3Var3;
                }
                return 0;
            case 8:
                linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.wechat.mm.biz.e3 e3Var3 = new com.tencent.wechat.mm.biz.e3();
                    if (bArr3 != null && bArr3.length > 0) {
                        e3Var3.parseFrom(bArr3);
                    }
                    this.f218533o = e3Var3;
                }
                return 0;
            case 10:
                this.f218534p = aVar2.g(intValue);
                return 0;
            case 11:
                this.f218535q = aVar2.g(intValue);
                return 0;
            case 12:
                this.f218536r = aVar2.g(intValue);
                return 0;
            case 13:
                this.f218537s = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.wechat.mm.biz.w4 w4Var3 = new com.tencent.wechat.mm.biz.w4();
                    if (bArr4 != null && bArr4.length > 0) {
                        w4Var3.parseFrom(bArr4);
                    }
                    this.f218538t = w4Var3;
                }
                return 0;
            case 15:
                this.f218539u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.r4) super.parseFrom(bArr);
    }
}
