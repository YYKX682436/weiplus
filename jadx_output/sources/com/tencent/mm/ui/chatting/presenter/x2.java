package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes12.dex */
public class x2 implements com.tencent.mm.pluginsdk.model.app.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f202535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.n3 f202536b;

    public x2(com.tencent.mm.ui.chatting.presenter.n3 n3Var, com.tencent.mm.storage.f9 f9Var) {
        this.f202536b = n3Var;
        this.f202535a = f9Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.r0
    public void S(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        if (j17 == j18) {
            com.tencent.mm.storage.f9 f9Var = this.f202535a;
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[onSceneProgressEnd] MsgId:%s", java.lang.Long.valueOf(f9Var.getMsgId()));
            com.tencent.mm.ui.chatting.presenter.n3 n3Var = this.f202536b;
            n3Var.f202365p--;
            if (!com.tencent.mm.ui.chatting.gallery.k1.j(n3Var.f202358f, f9Var, false)) {
                n3Var.f202367r = true;
            }
            if (n3Var.e()) {
                boolean z17 = n3Var.f202367r;
                com.tencent.mm.sdk.platformtools.n3 n3Var2 = n3Var.f202366q;
                if (z17) {
                    n3Var2.post(new com.tencent.mm.ui.chatting.presenter.w2(this));
                } else {
                    n3Var2.post(new com.tencent.mm.ui.chatting.presenter.v2(this));
                }
            }
        }
    }
}
