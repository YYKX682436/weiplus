package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes12.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f204851d;

    /* renamed from: e, reason: collision with root package name */
    public int f204852e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f204853f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b11.f f204854g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView f204855h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(b11.f fVar, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f204854g = fVar;
        this.f204855h = chattingMediaGroupVideoItemMvvmView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.r0 r0Var = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.r0(this.f204854g, this.f204855h, continuation);
        r0Var.f204853f = obj;
        return r0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.storage.f9 f9Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f204852e;
        b11.f fVar = this.f204854g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f204853f;
            com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(fVar.getTalker(), fVar.k());
            if (k17 == null) {
                throw new java.lang.IllegalStateException("preloadPrepareContext, msgInfo is null");
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.q0 q0Var = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.q0(k17, null);
            this.f204853f = y0Var;
            this.f204851d = k17;
            this.f204852e = 1;
            obj = kotlinx.coroutines.l.g(p0Var, q0Var, this);
            if (obj == aVar) {
                return aVar;
            }
            f9Var = k17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f9Var = (com.tencent.mm.storage.f9) this.f204851d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        t21.v2 v2Var = (t21.v2) obj;
        if (v2Var == null) {
            throw new java.lang.IllegalStateException("preloadPrepareContext, videoInfo is null");
        }
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView = this.f204855h;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0 h0Var = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0(fVar, f9Var, v2Var, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.o(chattingMediaGroupVideoItemMvvmView, f9Var, v2Var));
        chattingMediaGroupVideoItemMvvmView.f204735v = h0Var;
        return h0Var;
    }
}
