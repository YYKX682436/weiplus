package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class y9 implements com.tencent.mm.pluginsdk.ui.tools.c4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f201584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ta f201585e;

    public y9(com.tencent.mm.ui.chatting.gallery.ja jaVar, com.tencent.mm.ui.chatting.gallery.ta taVar) {
        this.f201584d = jaVar;
        this.f201585e = taVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.c4
    public final void z(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "seek completed");
        if (z17) {
            com.tencent.mm.ui.chatting.gallery.ta holder = this.f201585e;
            kotlin.jvm.internal.o.f(holder, "$holder");
            com.tencent.mm.ui.chatting.gallery.ja.E(this.f201584d, holder);
        }
    }
}
