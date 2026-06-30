package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class rb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ub f201343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f201345f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(com.tencent.mm.ui.chatting.gallery.ub ubVar, java.lang.String str, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f201343d = ubVar;
        this.f201344e = str;
        this.f201345f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.gallery.rb(this.f201343d, this.f201344e, this.f201345f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.gallery.rb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return com.tencent.mm.ui.chatting.gallery.ub.a(this.f201343d, this.f201344e, this.f201345f);
    }
}
