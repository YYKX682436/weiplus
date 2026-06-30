package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class po implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205282e;

    public po(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f205281d = dVar;
        this.f205282e = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        sb5.k2 k2Var = (sb5.k2) this.f205281d.f460708c.a(sb5.k2.class);
        if (k2Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemVoice", "ui or ui.transformImp null");
            return;
        }
        com.tencent.mm.storage.f9 f9Var = this.f205282e;
        if (f9Var.a2()) {
            i17 = 2;
        } else {
            com.tencent.mm.ui.chatting.component.xm xmVar = (com.tencent.mm.ui.chatting.component.xm) k2Var;
            i17 = xmVar.q0(f9Var.getMsgId()) ? 3 : !com.tencent.mm.sdk.platformtools.t8.K0(xmVar.s0(f9Var.getMsgId(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var))) ? 5 : 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemVoice", "TransformText report clickScene: %d, msgId: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(f9Var.getMsgId()));
        com.tencent.mm.autogen.events.ExtVoiceTransformTextClickEvent extVoiceTransformTextClickEvent = new com.tencent.mm.autogen.events.ExtVoiceTransformTextClickEvent();
        am.b9 b9Var = extVoiceTransformTextClickEvent.f54219g;
        b9Var.f6225b = 1;
        b9Var.f6226c = i17;
        b9Var.f6224a = f9Var.z0();
        extVoiceTransformTextClickEvent.e();
    }
}
