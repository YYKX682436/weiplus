package com.tencent.wechat.aff.chatbot;

/* loaded from: classes8.dex */
public class k extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f216313d;

    /* renamed from: e, reason: collision with root package name */
    public long f216314e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f216315f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f216316g = new boolean[4];

    static {
        new com.tencent.wechat.aff.chatbot.k();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.k)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.k kVar = (com.tencent.wechat.aff.chatbot.k) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f216313d), java.lang.Long.valueOf(kVar.f216313d)) && n51.f.a(java.lang.Long.valueOf(this.f216314e), java.lang.Long.valueOf(kVar.f216314e)) && n51.f.a(java.lang.Boolean.valueOf(this.f216315f), java.lang.Boolean.valueOf(kVar.f216315f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.k();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216316g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f216313d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f216314e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f216315f);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f216313d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f216314e);
            }
            return zArr[3] ? h17 + b36.f.a(3, this.f216315f) : h17;
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
            this.f216313d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216314e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f216315f = aVar2.c(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.k) super.parseFrom(bArr);
    }
}
