package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class s2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f219812d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219813e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219814f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219815g;

    /* renamed from: h, reason: collision with root package name */
    public int f219816h;

    /* renamed from: i, reason: collision with root package name */
    public int f219817i;

    /* renamed from: m, reason: collision with root package name */
    public int f219818m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f219819n = new boolean[8];

    static {
        new com.tencent.wechat.mm.finder_box.s2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.s2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.s2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.s2)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.s2 s2Var = (com.tencent.wechat.mm.finder_box.s2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f219812d), java.lang.Integer.valueOf(s2Var.f219812d)) && n51.f.a(this.f219813e, s2Var.f219813e) && n51.f.a(this.f219814f, s2Var.f219814f) && n51.f.a(this.f219815g, s2Var.f219815g) && n51.f.a(java.lang.Integer.valueOf(this.f219816h), java.lang.Integer.valueOf(s2Var.f219816h)) && n51.f.a(java.lang.Integer.valueOf(this.f219817i), java.lang.Integer.valueOf(s2Var.f219817i)) && n51.f.a(java.lang.Integer.valueOf(this.f219818m), java.lang.Integer.valueOf(s2Var.f219818m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.s2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f219819n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f219812d);
            }
            java.lang.String str = this.f219813e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f219814f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f219815g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f219816h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f219817i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f219818m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f219812d) : 0;
            java.lang.String str4 = this.f219813e;
            if (str4 != null && zArr[2]) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f219814f;
            if (str5 != null && zArr[3]) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f219815g;
            if (str6 != null && zArr[4]) {
                e17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f219816h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f219817i);
            }
            return zArr[7] ? e17 + b36.f.e(7, this.f219818m) : e17;
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
                this.f219812d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f219813e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f219814f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f219815g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f219816h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f219817i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f219818m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
