package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class m6 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f202349a;

    public m6(com.tencent.mm.ui.chatting.presenter.c6 c6Var, q80.d0 d0Var) {
        this.f202349a = d0Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.UrlHistoryListPresenter", "openLiteApp fail %s.", this.f202349a.f360649a);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.UrlHistoryListPresenter", "openLiteApp success %s.", this.f202349a.f360649a);
    }
}
