package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes5.dex */
public final class ib extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.e1 f201037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mv.c0 f201038e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(com.tencent.mm.ui.chatting.gallery.e1 e1Var, mv.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f201037d = e1Var;
        this.f201038e = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.gallery.ib(this.f201037d, this.f201038e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.gallery.ib) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Boolean bool;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.chatting.gallery.e1 e1Var = this.f201037d;
        mv.c0 result = this.f201038e;
        com.tencent.mm.ui.chatting.gallery.r rVar = (com.tencent.mm.ui.chatting.gallery.r) e1Var;
        rVar.getClass();
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i(rVar.f201316e, "[process] mediaId=" + rVar.f201314c + ", reportMediaType=" + rVar.f201315d + ", result=" + result);
        if (result.f331484a != 0) {
            return java.lang.Boolean.FALSE;
        }
        synchronized (com.tencent.mm.ui.chatting.gallery.r.class) {
            long k17 = com.tencent.mm.vfs.w6.k(result.f331486c);
            if (k17 == 0) {
                com.tencent.mars.xlog.Log.i(rVar.f201316e, "[process] tmpFileLen is 0, mediaId=" + rVar.f201314c);
                bool = java.lang.Boolean.FALSE;
            } else if (com.tencent.mm.vfs.w6.d(result.f331486c, rVar.f201313b, false) <= 0) {
                com.tencent.mars.xlog.Log.e(rVar.f201316e, "[process] copyFile error, tempPath=" + result.f331486c + ", fullPath=" + rVar.f201313b + ", mediaId = " + rVar.f201314c);
                bool = java.lang.Boolean.FALSE;
            } else {
                java.lang.String Q0 = rVar.f201312a.Q0();
                kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
                ((ku5.t0) ku5.t0.f312615d).r(new fo1.k(Q0, rVar.f201312a.getCreateTime()), "RoamBackup.MediaPullObserver");
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.d(31328, java.lang.Integer.valueOf(rVar.f201315d), 1, java.lang.Integer.valueOf(result.f331485b), 0, java.lang.Long.valueOf(k17));
                if (rVar.f201312a.z2()) {
                    rVar.f201312a.c1(0);
                    mt1.b0 b0Var = mt1.b0.f331191a;
                    long msgId = rVar.f201312a.getMsgId();
                    java.lang.String Q02 = rVar.f201312a.Q0();
                    kotlin.jvm.internal.o.f(Q02, "getTalker(...)");
                    b0Var.q(msgId, Q02);
                    ((com.tencent.mm.storage.g9) c01.d9.b().u()).bb(rVar.f201312a.getMsgId(), rVar.f201312a);
                    fVar.d(31328, java.lang.Integer.valueOf(rVar.f201315d), 2, java.lang.Integer.valueOf(result.f331485b), 0, java.lang.Long.valueOf(k17));
                    com.tencent.mars.xlog.Log.i(rVar.f201316e, "[process] report31328 deviceType=" + result.f331485b + ", tmpFileLen=" + k17 + ", mediaId=" + rVar.f201314c);
                    bool = java.lang.Boolean.TRUE;
                } else {
                    bool = java.lang.Boolean.FALSE;
                }
            }
        }
        return bool;
    }
}
