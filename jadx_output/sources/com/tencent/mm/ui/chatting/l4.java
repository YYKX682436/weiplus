package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class l4 implements kotlin.coroutines.Continuation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.h4 f201922d;

    public l4(com.tencent.mm.ui.chatting.h4 h4Var) {
        this.f201922d = h4Var;
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        return oz5.m.f350329d;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "optRecord finish");
        this.f201922d.L(obj);
    }
}
