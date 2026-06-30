package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f143564d;

    public e3(com.tencent.mm.plugin.lite.jsapi.comms.f3 f3Var, android.content.Context context) {
        this.f143564d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((android.app.Activity) this.f143564d).finish();
    }
}
