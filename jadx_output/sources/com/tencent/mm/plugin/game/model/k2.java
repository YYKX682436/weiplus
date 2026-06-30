package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f140352d;

    public k2(com.tencent.mm.plugin.game.model.r2 r2Var, android.content.Context context) {
        this.f140352d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) this.f140352d).f140985d.setVisibility(8);
    }
}
