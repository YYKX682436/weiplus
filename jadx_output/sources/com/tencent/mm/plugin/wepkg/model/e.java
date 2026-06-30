package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f188413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.i f188414e;

    public e(com.tencent.mm.plugin.wepkg.model.i iVar, int i17) {
        this.f188414e = iVar;
        this.f188413d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f188414e.g(null, 0, this.f188413d);
    }
}
