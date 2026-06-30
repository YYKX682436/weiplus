package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class lf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f199432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.mf f199433e;

    public lf(com.tencent.mm.ui.chatting.component.mf mfVar, int i17) {
        this.f199433e = mfVar;
        this.f199432d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f199433e.f199505d.f199692p.h(this.f199432d);
    }
}
