package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f140404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f140405e;

    public p2(com.tencent.mm.plugin.game.model.r2 r2Var, android.content.Context context, java.lang.String str) {
        this.f140404d = context;
        this.f140405e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) this.f140404d).f140986e.setTitleText(this.f140405e);
    }
}
