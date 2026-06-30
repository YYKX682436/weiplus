package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.o0 f140427d;

    public q3(sd.o0 o0Var) {
        this.f140427d = o0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.o0 o0Var = this.f140427d;
        ((com.tencent.mm.plugin.game.luggage.page.b0) o0Var.h()).onResume();
        ((com.tencent.mm.plugin.game.luggage.page.b0) o0Var.h()).setBlockNetworkImage(false);
    }
}
