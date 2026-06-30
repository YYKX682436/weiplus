package com.tencent.wechat.aff.favorites;

/* loaded from: classes8.dex */
public class l extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216827d;

    /* renamed from: e, reason: collision with root package name */
    public long f216828e;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.aff.favorites.k f216830g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f216829f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f216831h = new boolean[5];

    static {
        new com.tencent.wechat.aff.favorites.l();
    }

    public java.lang.String b() {
        return this.f216831h[1] ? this.f216827d : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.favorites.l parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.favorites.l) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.favorites.l)) {
            return false;
        }
        com.tencent.wechat.aff.favorites.l lVar = (com.tencent.wechat.aff.favorites.l) fVar;
        return n51.f.a(this.f216827d, lVar.f216827d) && n51.f.a(java.lang.Long.valueOf(this.f216828e), java.lang.Long.valueOf(lVar.f216828e)) && n51.f.a(this.f216829f, lVar.f216829f) && n51.f.a(this.f216830g, lVar.f216830g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.favorites.l();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f216829f;
        boolean[] zArr = this.f216831h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216827d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f216828e);
            }
            fVar.g(3, 2, linkedList);
            com.tencent.wechat.aff.favorites.k kVar = this.f216830g;
            if (kVar != null && zArr[4]) {
                fVar.i(4, kVar.computeSize());
                this.f216830g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f216827d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f216828e);
            }
            int g17 = i18 + b36.f.g(3, 2, linkedList);
            com.tencent.wechat.aff.favorites.k kVar2 = this.f216830g;
            return (kVar2 == null || !zArr[4]) ? g17 : g17 + b36.f.i(4, kVar2.computeSize());
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
            this.f216827d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216828e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.wechat.aff.favorites.k kVar3 = new com.tencent.wechat.aff.favorites.k();
            if (bArr != null && bArr.length > 0) {
                kVar3.parseFrom(bArr);
            }
            this.f216830g = kVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
