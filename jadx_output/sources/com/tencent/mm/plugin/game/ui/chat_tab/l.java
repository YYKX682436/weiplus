package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.e1 f141288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.o f141289f;

    public l(com.tencent.mm.plugin.game.ui.chat_tab.o oVar, java.lang.String str, com.tencent.mm.plugin.game.model.e1 e1Var) {
        this.f141289f = oVar;
        this.f141287d = str;
        this.f141288e = e1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        p53.u uVar = this.f141289f.f141296b;
        if (uVar != null) {
            uVar.getGameTabWidget().e(this.f141287d, this.f141288e.M2.f140524b);
        }
    }
}
