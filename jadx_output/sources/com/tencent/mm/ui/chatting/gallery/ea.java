package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class ea extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f200899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer f200900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk4.d f200901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer, pk4.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f200899d = c0Var;
        this.f200900e = thumbPlayerViewContainer;
        this.f200901f = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.gallery.ea(this.f200899d, this.f200900e, this.f200901f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.chatting.gallery.ea eaVar = (com.tencent.mm.ui.chatting.gallery.ea) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        eaVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f200899d.f310112d;
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = this.f200900e;
        if (z17) {
            thumbPlayerViewContainer.h();
        } else {
            thumbPlayerViewContainer.i();
        }
        if (fp.h.a(23)) {
            this.f200901f.setAutoFixRotation(true);
        }
        return jz5.f0.f302826a;
    }
}
