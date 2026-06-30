package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class h9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f184808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ApduEngineFuncEvent f184809e;

    public h9(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, android.os.Bundle bundle, com.tencent.mm.autogen.events.ApduEngineFuncEvent apduEngineFuncEvent) {
        this.f184808d = bundle;
        this.f184809e = apduEngineFuncEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f184808d.putAll(this.f184809e.f53976h.f7588a);
    }
}
