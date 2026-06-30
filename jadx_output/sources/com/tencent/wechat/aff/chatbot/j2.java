package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public class j2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.i2 f216309d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216310e;

    /* renamed from: f, reason: collision with root package name */
    public int f216311f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f216312g = new boolean[4];

    static {
        new com.tencent.wechat.aff.chatbot.j2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.j2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.j2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.j2)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.j2 j2Var = (com.tencent.wechat.aff.chatbot.j2) fVar;
        return n51.f.a(this.f216309d, j2Var.f216309d) && n51.f.a(this.f216310e, j2Var.f216310e) && n51.f.a(java.lang.Integer.valueOf(this.f216311f), java.lang.Integer.valueOf(j2Var.f216311f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.j2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216312g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.chatbot.i2 i2Var = this.f216309d;
            if (i2Var != null && zArr[1]) {
                fVar.i(1, i2Var.computeSize());
                this.f216309d.writeFields(fVar);
            }
            java.lang.String str = this.f216310e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f216311f);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.chatbot.i2 i2Var2 = this.f216309d;
            if (i2Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, i2Var2.computeSize());
            }
            java.lang.String str2 = this.f216310e;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f216311f) : i18;
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f216310e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f216311f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.wechat.aff.chatbot.i2 i2Var3 = new com.tencent.wechat.aff.chatbot.i2();
            if (bArr != null && bArr.length > 0) {
                i2Var3.parseFrom(bArr);
            }
            this.f216309d = i2Var3;
        }
        zArr[1] = true;
        return 0;
    }
}
