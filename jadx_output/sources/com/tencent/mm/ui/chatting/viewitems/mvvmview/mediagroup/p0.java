package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes12.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f204840d;

    /* renamed from: e, reason: collision with root package name */
    public int f204841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b11.f f204842f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView f204843g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(b11.f fVar, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f204842f = fVar;
        this.f204843g = chattingMediaGroupVideoItemMvvmView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.p0(this.f204842f, this.f204843g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.storage.f9 f9Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f204841e;
        b11.f fVar = this.f204842f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(fVar.getTalker(), fVar.k());
            if (k17 == null) {
                throw new java.lang.IllegalStateException("preloadPrepareContext, msgInfo is null");
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.o0 o0Var = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.o0(k17, null);
            this.f204840d = k17;
            this.f204841e = 1;
            java.lang.Object g17 = kotlinx.coroutines.l.g(p0Var, o0Var, this);
            if (g17 == aVar) {
                return aVar;
            }
            f9Var = k17;
            obj = g17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f9Var = (com.tencent.mm.storage.f9) this.f204840d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        t21.v2 v2Var = (t21.v2) obj;
        if (v2Var != null) {
            return new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0(fVar, f9Var, v2Var, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.o(this.f204843g, f9Var, v2Var));
        }
        throw new java.lang.IllegalStateException("preloadPrepareContext, videoInfo is null");
    }
}
