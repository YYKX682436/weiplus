package com.tencent.wechat.aff.chatbot;

/* loaded from: classes8.dex */
public class w1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f216520d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.v1 f216521e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f216522f = new boolean[3];

    static {
        new com.tencent.wechat.aff.chatbot.w1();
    }

    public com.tencent.wechat.aff.chatbot.v1 b() {
        return this.f216522f[2] ? this.f216521e : new com.tencent.wechat.aff.chatbot.v1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.w1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.w1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.w1)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.w1 w1Var = (com.tencent.wechat.aff.chatbot.w1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f216520d), java.lang.Integer.valueOf(w1Var.f216520d)) && n51.f.a(this.f216521e, w1Var.f216521e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.w1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216522f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f216520d);
            }
            com.tencent.wechat.aff.chatbot.v1 v1Var = this.f216521e;
            if (v1Var != null && zArr[2]) {
                fVar.i(2, v1Var.computeSize());
                this.f216521e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f216520d) : 0;
            com.tencent.wechat.aff.chatbot.v1 v1Var2 = this.f216521e;
            return (v1Var2 == null || !zArr[2]) ? e17 : e17 + b36.f.i(2, v1Var2.computeSize());
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
            this.f216520d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.chatbot.v1 v1Var3 = new com.tencent.wechat.aff.chatbot.v1();
            if (bArr != null && bArr.length > 0) {
                v1Var3.parseFrom(bArr);
            }
            this.f216521e = v1Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
