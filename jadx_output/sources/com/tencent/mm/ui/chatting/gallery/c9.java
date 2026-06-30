package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class c9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ta f200836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f200838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f200839g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(com.tencent.mm.ui.chatting.gallery.ta taVar, com.tencent.mm.storage.f9 f9Var, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f200836d = taVar;
        this.f200837e = f9Var;
        this.f200838f = i17;
        this.f200839g = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.gallery.c9(this.f200836d, this.f200837e, this.f200838f, this.f200839g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.gallery.c9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "[+] [tomys] Easy crash pos, bitmap will be down sample to reduce mem cost. position=" + this.f200836d.f201425c);
        try {
            i95.m c17 = i95.n0.c(tg3.u0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.storage.f9 f9Var = this.f200837e;
            return com.tencent.mm.sdk.platformtools.x.t(tg3.u0.L4((tg3.u0) c17, f9Var, f9Var.z0(), false, 4, null), this.f200838f, this.f200839g, false, false);
        } catch (java.lang.OutOfMemoryError unused) {
            return null;
        }
    }
}
