package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class v2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f218699d;

    /* renamed from: e, reason: collision with root package name */
    public int f218700e;

    /* renamed from: f, reason: collision with root package name */
    public int f218701f;

    /* renamed from: h, reason: collision with root package name */
    public int f218703h;

    /* renamed from: i, reason: collision with root package name */
    public int f218704i;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f218702g = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f218705m = new boolean[7];

    static {
        new com.tencent.wechat.mm.biz.v2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.v2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.v2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.v2)) {
            return false;
        }
        com.tencent.wechat.mm.biz.v2 v2Var = (com.tencent.wechat.mm.biz.v2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218699d), java.lang.Integer.valueOf(v2Var.f218699d)) && n51.f.a(java.lang.Integer.valueOf(this.f218700e), java.lang.Integer.valueOf(v2Var.f218700e)) && n51.f.a(java.lang.Integer.valueOf(this.f218701f), java.lang.Integer.valueOf(v2Var.f218701f)) && n51.f.a(this.f218702g, v2Var.f218702g) && n51.f.a(java.lang.Integer.valueOf(this.f218703h), java.lang.Integer.valueOf(v2Var.f218703h)) && n51.f.a(java.lang.Integer.valueOf(this.f218704i), java.lang.Integer.valueOf(v2Var.f218704i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.v2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218702g;
        boolean[] zArr = this.f218705m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f218699d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f218700e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f218701f);
            }
            fVar.g(4, 8, linkedList);
            if (zArr[5]) {
                fVar.e(5, this.f218703h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f218704i);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f218699d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f218700e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f218701f);
            }
            int g17 = e17 + b36.f.g(4, 8, linkedList);
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f218703h);
            }
            return zArr[6] ? g17 + b36.f.e(6, this.f218704i) : g17;
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
                this.f218699d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218700e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218701f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.mm.biz.w2 w2Var = new com.tencent.wechat.mm.biz.w2();
                    if (bArr != null && bArr.length > 0) {
                        w2Var.parseFrom(bArr);
                    }
                    linkedList.add(w2Var);
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f218703h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218704i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
