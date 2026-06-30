package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lt.h0 f188989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188991f;

    public n(lt.h0 h0Var, java.lang.String str, java.lang.String str2) {
        this.f188989d = h0Var;
        this.f188990e = str;
        this.f188991f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("key_open_sdk_pkg");
        lt.h0 h0Var = this.f188989d;
        if (R == null) {
            h0Var.a(null);
            return;
        }
        java.lang.String str = this.f188991f;
        java.lang.String str2 = this.f188990e;
        R.D(str2, str);
        h0Var.a(com.tencent.mm.pluginsdk.model.app.w.k(str2, true));
    }
}
