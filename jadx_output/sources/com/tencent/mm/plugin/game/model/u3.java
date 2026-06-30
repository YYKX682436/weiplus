package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.v3 f140487d;

    public u3(com.tencent.mm.plugin.game.model.v3 v3Var) {
        this.f140487d = v3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.model.v3 v3Var = this.f140487d;
        com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener.c(v3Var.f140496b, v3Var.f140497c, v3Var.f140498d);
    }
}
