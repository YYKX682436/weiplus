package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.h3 f141397d;

    public g3(com.tencent.mm.plugin.game.ui.h3 h3Var) {
        this.f141397d = h3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f141397d.invalidateSelf();
    }
}
