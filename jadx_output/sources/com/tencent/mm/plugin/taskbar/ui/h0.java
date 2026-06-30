package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes11.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f172619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f172620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.z f172621f;

    public h0(com.tencent.mm.plugin.taskbar.ui.z zVar, boolean z17, int i17) {
        this.f172621f = zVar;
        this.f172619d = z17;
        this.f172620e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.taskbar.ui.z zVar = this.f172621f;
        zVar.f172761J = this.f172619d;
        zVar.a(this.f172620e);
    }
}
