package com.tencent.mm.storage;

/* loaded from: classes.dex */
public class x8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f196334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f196335e;

    public x8(com.tencent.mm.storage.f9 f9Var, long j17, com.tencent.mm.storage.f9 f9Var2) {
        this.f196334d = j17;
        this.f196335e = f9Var2;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(this.f196334d, this.f196335e);
    }
}
