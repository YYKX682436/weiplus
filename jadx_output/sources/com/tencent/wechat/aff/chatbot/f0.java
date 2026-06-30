package com.tencent.wechat.aff.chatbot;

/* loaded from: classes2.dex */
public class f0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f216198d;

    /* renamed from: e, reason: collision with root package name */
    public float f216199e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f216200f = new boolean[3];

    static {
        new com.tencent.wechat.aff.chatbot.f0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.f0)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.f0 f0Var = (com.tencent.wechat.aff.chatbot.f0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f216198d), java.lang.Integer.valueOf(f0Var.f216198d)) && n51.f.a(java.lang.Float.valueOf(this.f216199e), java.lang.Float.valueOf(f0Var.f216199e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.f0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216200f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f216198d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f216199e);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f216198d) : 0;
            return zArr[2] ? e17 + b36.f.d(2, this.f216199e) : e17;
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
            this.f216198d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f216199e = aVar2.f(intValue);
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.f0) super.parseFrom(bArr);
    }
}
