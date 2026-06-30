package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes12.dex */
public class u2 implements wh5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f202493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.n3 f202494b;

    public u2(com.tencent.mm.ui.chatting.presenter.n3 n3Var, com.tencent.mm.storage.f9 f9Var) {
        this.f202494b = n3Var;
        this.f202493a = f9Var;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[downloadBeforeExport onFailed] MsgId:%s", java.lang.Long.valueOf(this.f202493a.getMsgId()));
        r0.f202365p--;
        this.f202494b.f202367r = true;
    }
}
