package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f140425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f140426e;

    public q2(com.tencent.mm.plugin.game.model.r2 r2Var, android.content.Context context, android.os.Bundle bundle) {
        this.f140425d = context;
        this.f140426e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) this.f140425d).f140986e.setNavigationBarButtons(this.f140426e);
    }
}
