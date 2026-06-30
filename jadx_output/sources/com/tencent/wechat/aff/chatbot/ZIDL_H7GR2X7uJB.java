package com.tencent.wechat.aff.chatbot;

/* loaded from: classes11.dex */
class ZIDL_H7GR2X7uJB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.chatbot.s {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.chatbot.t f216053a;

    public ZIDL_H7GR2X7uJB(java.lang.Object obj) {
        com.tencent.wechat.aff.chatbot.t tVar = (com.tencent.wechat.aff.chatbot.t) obj;
        this.f216053a = tVar;
        ((d90.p) tVar).f227444e = this;
    }

    private native void ZIDL_AX(long j17, long j18);

    private native void ZIDL_BX(long j17, long j18);

    private native void ZIDL_CX(long j17, long j18);

    public void Q1(long j17) {
        ZIDL_AX(this.nativeHandler, j17);
    }

    public void R1(long j17) {
        ZIDL_CX(this.nativeHandler, j17);
    }

    public void ZIDL_AV(long j17, byte[][] bArr) {
        java.util.ArrayList mmpbListUnSerializeFromBasic = com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(xv5.h.f457481m, bArr);
        d90.p pVar = (d90.p) this.f216053a;
        if (mmpbListUnSerializeFromBasic != null) {
            pVar.getClass();
            if (mmpbListUnSerializeFromBasic.isEmpty()) {
                return;
            } else {
                pVar.f227440a.a(mmpbListUnSerializeFromBasic);
            }
        }
        com.tencent.wechat.aff.chatbot.s sVar = pVar.f227444e;
        if (sVar != null) {
            ((com.tencent.wechat.aff.chatbot.ZIDL_H7GR2X7uJB) sVar).Q1(j17);
        }
    }

    public void ZIDL_BV(long j17, byte[][] bArr) {
        com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(xv5.a.f457438n, bArr);
        this.f216053a.getClass();
    }

    public void ZIDL_CV(long j17) {
        d90.p pVar = (d90.p) this.f216053a;
        pVar.f227440a.b();
        com.tencent.wechat.aff.chatbot.s sVar = pVar.f227444e;
        if (sVar != null) {
            ((com.tencent.wechat.aff.chatbot.ZIDL_H7GR2X7uJB) sVar).R1(j17);
        }
    }
}
