package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public class t1 extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wechat.aff.chatbot.t1 f216462h = new com.tencent.wechat.aff.chatbot.t1();

    /* renamed from: d, reason: collision with root package name */
    public int f216463d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216464e;

    /* renamed from: f, reason: collision with root package name */
    public int f216465f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f216466g = new boolean[4];

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.t1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.t1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.t1)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.t1 t1Var = (com.tencent.wechat.aff.chatbot.t1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f216463d), java.lang.Integer.valueOf(t1Var.f216463d)) && n51.f.a(this.f216464e, t1Var.f216464e) && n51.f.a(java.lang.Integer.valueOf(this.f216465f), java.lang.Integer.valueOf(t1Var.f216465f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.t1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216466g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f216463d);
            }
            java.lang.String str = this.f216464e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f216465f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f216463d) : 0;
            java.lang.String str2 = this.f216464e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            return zArr[3] ? e17 + b36.f.e(3, this.f216465f) : e17;
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
            this.f216463d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216464e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f216465f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
