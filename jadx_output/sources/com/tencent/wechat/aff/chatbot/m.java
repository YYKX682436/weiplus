package com.tencent.wechat.aff.chatbot;

/* loaded from: classes8.dex */
public class m extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wechat.aff.chatbot.m f216371m = new com.tencent.wechat.aff.chatbot.m();

    /* renamed from: d, reason: collision with root package name */
    public long f216372d;

    /* renamed from: e, reason: collision with root package name */
    public long f216373e;

    /* renamed from: g, reason: collision with root package name */
    public int f216375g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216376h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f216374f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f216377i = new boolean[6];

    public java.lang.String b() {
        return this.f216377i[5] ? this.f216376h : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.m)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.m mVar = (com.tencent.wechat.aff.chatbot.m) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f216372d), java.lang.Long.valueOf(mVar.f216372d)) && n51.f.a(java.lang.Long.valueOf(this.f216373e), java.lang.Long.valueOf(mVar.f216373e)) && n51.f.a(this.f216374f, mVar.f216374f) && n51.f.a(java.lang.Integer.valueOf(this.f216375g), java.lang.Integer.valueOf(mVar.f216375g)) && n51.f.a(this.f216376h, mVar.f216376h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.m();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f216374f;
        boolean[] zArr = this.f216377i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f216372d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f216373e);
            }
            fVar.g(3, 8, linkedList);
            if (zArr[4]) {
                fVar.e(4, this.f216375g);
            }
            java.lang.String str = this.f216376h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f216372d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f216373e);
            }
            int g17 = h17 + b36.f.g(3, 8, linkedList);
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f216375g);
            }
            java.lang.String str2 = this.f216376h;
            return (str2 == null || !zArr[5]) ? g17 : g17 + b36.f.j(5, str2);
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
            this.f216372d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216373e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f216375g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f216376h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.chatbot.l lVar = new com.tencent.wechat.aff.chatbot.l();
            if (bArr != null && bArr.length > 0) {
                lVar.parseFrom(bArr);
            }
            linkedList.add(lVar);
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.m) super.parseFrom(bArr);
    }
}
