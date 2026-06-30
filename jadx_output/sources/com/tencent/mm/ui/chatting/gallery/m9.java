package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class m9 implements com.tencent.mm.pluginsdk.ui.tools.b4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f201200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ta f201201e;

    public m9(com.tencent.mm.ui.chatting.gallery.ja jaVar, com.tencent.mm.ui.chatting.gallery.ta taVar) {
        this.f201200d = jaVar;
        this.f201201e = taVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.b4
    public final void k(int i17, int i18) {
        com.tencent.mm.ui.chatting.gallery.ta taVar = this.f201201e;
        com.tencent.mm.ui.chatting.gallery.ja jaVar = this.f201200d;
        if (i17 == 701) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "on buffering start");
            jaVar.J(taVar);
        } else {
            if (i17 != 702) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "on buffering end");
            com.tencent.mm.ui.chatting.gallery.ja.E(jaVar, taVar);
        }
    }
}
