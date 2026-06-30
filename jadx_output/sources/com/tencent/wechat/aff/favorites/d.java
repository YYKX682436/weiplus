package com.tencent.wechat.aff.favorites;

/* loaded from: classes4.dex */
public class d extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wechat.aff.favorites.d f216748i = new com.tencent.wechat.aff.favorites.d();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216750e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216751f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f216752g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f216749d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f216753h = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.favorites.d parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.favorites.d) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.favorites.d)) {
            return false;
        }
        com.tencent.wechat.aff.favorites.d dVar = (com.tencent.wechat.aff.favorites.d) fVar;
        return n51.f.a(this.f216749d, dVar.f216749d) && n51.f.a(this.f216750e, dVar.f216750e) && n51.f.a(this.f216751f, dVar.f216751f) && n51.f.a(java.lang.Boolean.valueOf(this.f216752g), java.lang.Boolean.valueOf(dVar.f216752g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.favorites.d();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f216749d;
        boolean[] zArr = this.f216753h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 2, linkedList);
            java.lang.String str = this.f216750e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f216751f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.a(4, this.f216752g);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 2, linkedList) + 0;
            java.lang.String str3 = this.f216750e;
            if (str3 != null && zArr[2]) {
                g17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f216751f;
            if (str4 != null && zArr[3]) {
                g17 += b36.f.j(3, str4);
            }
            return zArr[4] ? g17 + b36.f.a(4, this.f216752g) : g17;
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
        if (intValue == 1) {
            linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216750e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f216751f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f216752g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }
}
