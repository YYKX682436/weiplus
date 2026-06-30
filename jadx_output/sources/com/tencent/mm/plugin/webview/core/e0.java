package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f181790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181791f;

    public e0(com.tencent.mm.plugin.webview.core.r0 r0Var, int i17, java.lang.String str) {
        this.f181789d = r0Var;
        this.f181790e = i17;
        this.f181791f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.f181789d.Z.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.webview.core.f3) it.next()).c(this.f181790e, this.f181791f);
        }
    }
}
