package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class i9 implements com.tencent.mm.pluginsdk.ui.tools.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f201027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ta f201028e;

    public i9(com.tencent.mm.ui.chatting.gallery.ja jaVar, com.tencent.mm.ui.chatting.gallery.ta taVar) {
        this.f201027d = jaVar;
        this.f201028e = taVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.e4
    public final void v() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "First video frame has been rendered");
        com.tencent.mm.ui.chatting.gallery.ja.E(this.f201027d, this.f201028e);
    }
}
