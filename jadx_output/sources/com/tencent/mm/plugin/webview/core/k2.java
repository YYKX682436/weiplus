package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class k2 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.l2 f181860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f181862f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f181863g;

    public k2(com.tencent.mm.plugin.webview.core.l2 l2Var, java.lang.String str, long j17, int i17) {
        this.f181860d = l2Var;
        this.f181861e = str;
        this.f181862f = j17;
        this.f181863g = i17;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        long j17 = this.f181862f;
        int i17 = this.f181863g;
        com.tencent.mm.plugin.webview.core.l2 l2Var = this.f181860d;
        l2Var.a(this.f181861e, j17, i17);
        l2Var.f181875h = null;
        return false;
    }
}
