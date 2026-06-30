package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes15.dex */
public class g implements db5.f4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearlife.ui.BaseLifeUI f152320a;

    public g(com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI) {
        this.f152320a = baseLifeUI;
    }

    @Override // db5.f4
    public void onLoadMore() {
        com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI = this.f152320a;
        if (baseLifeUI.f152242r != -1 || baseLifeUI.f152241q != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseLifeUI", "is loading, please wait");
        } else if (baseLifeUI.d7(true)) {
            baseLifeUI.f152231d.c();
        }
    }
}
