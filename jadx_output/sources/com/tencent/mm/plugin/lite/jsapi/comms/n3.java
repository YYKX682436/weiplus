package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f143689d;

    public n3(com.tencent.mm.plugin.lite.jsapi.comms.o3 o3Var, android.content.Context context) {
        this.f143689d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((android.app.Activity) this.f143689d).finish();
    }
}
