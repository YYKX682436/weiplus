package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f183187d;

    public x4(com.tencent.mm.plugin.webview.model.y4 y4Var, android.content.Intent intent) {
        this.f183187d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((zd0.e) hVar).getClass();
        xp1.c.a(context, this.f183187d, null, null, false);
    }
}
