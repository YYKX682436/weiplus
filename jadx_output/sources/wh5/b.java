package wh5;

/* loaded from: classes12.dex */
public final class b implements vf3.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wh5.a f446018e;

    public b(java.lang.String str, wh5.a aVar) {
        this.f446017d = str;
        this.f446018e = aVar;
    }

    @Override // vf3.g
    public void A(gg3.c videoParam, sf3.g imageParam, vf3.e state, vf3.f extraInfo) {
        kotlin.jvm.internal.o.g(videoParam, "videoParam");
        kotlin.jvm.internal.o.g(imageParam, "imageParam");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download state changed: ");
        sb6.append(state.name());
        sb6.append(", info: ");
        sb6.append(extraInfo.f436392d);
        sb6.append(" mediaId: ");
        java.lang.String str = this.f446017d;
        sb6.append(str);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("C2CLiveExporter", sb6.toString());
        vf3.e eVar = vf3.e.f436381h;
        wh5.a aVar = this.f446018e;
        if (state == eVar || state == vf3.e.f436378e) {
            com.tencent.mars.xlog.Log.i("C2CLiveExporter", "download finished, mediaId: " + str + ' ');
            com.tencent.mm.ui.chatting.presenter.u2 u2Var = (com.tencent.mm.ui.chatting.presenter.u2) aVar;
            com.tencent.mm.storage.f9 f9Var = u2Var.f202493a;
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[downloadBeforeExport onFinish] MsgId:%s", java.lang.Long.valueOf(f9Var.getMsgId()));
            com.tencent.mm.ui.chatting.presenter.n3 n3Var = u2Var.f202494b;
            n3Var.f202365p--;
            if (!com.tencent.mm.ui.chatting.gallery.k1.j(n3Var.f202358f, f9Var, false)) {
                n3Var.f202367r = true;
            }
            if (n3Var.e()) {
                boolean z17 = n3Var.f202367r;
                com.tencent.mm.sdk.platformtools.n3 n3Var2 = n3Var.f202366q;
                if (z17) {
                    n3Var2.post(new com.tencent.mm.ui.chatting.presenter.t2(u2Var));
                } else {
                    n3Var2.post(new com.tencent.mm.ui.chatting.presenter.s2(u2Var));
                }
            }
        }
        if (state == vf3.e.f436382i) {
            com.tencent.mars.xlog.Log.i("C2CLiveExporter", "download failed, mediaId: " + str);
            ((com.tencent.mm.ui.chatting.presenter.u2) aVar).a();
        }
    }
}
