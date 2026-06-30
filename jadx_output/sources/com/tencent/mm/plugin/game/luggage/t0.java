package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.o0 f139967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139968e;

    public t0(sd.o0 o0Var, java.lang.String str) {
        this.f139967d = o0Var;
        this.f139968e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f139967d.c(new com.tencent.mm.plugin.game.luggage.s0(this));
    }
}
