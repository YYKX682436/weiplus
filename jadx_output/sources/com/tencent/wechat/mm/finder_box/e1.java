package com.tencent.wechat.mm.finder_box;

/* loaded from: classes9.dex */
public class e1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f219382d;

    /* renamed from: e, reason: collision with root package name */
    public int f219383e;

    /* renamed from: f, reason: collision with root package name */
    public int f219384f;

    /* renamed from: g, reason: collision with root package name */
    public int f219385g;

    /* renamed from: h, reason: collision with root package name */
    public int f219386h;

    /* renamed from: i, reason: collision with root package name */
    public int f219387i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f219388m = new boolean[7];

    static {
        new com.tencent.wechat.mm.finder_box.e1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.e1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.e1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.e1)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.e1 e1Var = (com.tencent.wechat.mm.finder_box.e1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f219382d), java.lang.Integer.valueOf(e1Var.f219382d)) && n51.f.a(java.lang.Integer.valueOf(this.f219383e), java.lang.Integer.valueOf(e1Var.f219383e)) && n51.f.a(java.lang.Integer.valueOf(this.f219384f), java.lang.Integer.valueOf(e1Var.f219384f)) && n51.f.a(java.lang.Integer.valueOf(this.f219385g), java.lang.Integer.valueOf(e1Var.f219385g)) && n51.f.a(java.lang.Integer.valueOf(this.f219386h), java.lang.Integer.valueOf(e1Var.f219386h)) && n51.f.a(java.lang.Integer.valueOf(this.f219387i), java.lang.Integer.valueOf(e1Var.f219387i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.e1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f219388m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f219382d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f219383e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f219384f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f219385g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f219386h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f219387i);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f219382d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f219383e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f219384f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f219385g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f219386h);
            }
            return zArr[6] ? e17 + b36.f.e(6, this.f219387i) : e17;
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
                this.f219382d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f219383e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f219384f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f219385g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f219386h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f219387i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
