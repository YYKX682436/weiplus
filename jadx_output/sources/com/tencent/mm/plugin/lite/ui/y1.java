package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.z1 f144500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f144502f;

    public y1(com.tencent.mm.plugin.lite.ui.z1 z1Var, java.lang.String str, java.lang.Object obj) {
        this.f144500d = z1Var;
        this.f144501e = str;
        this.f144502f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.plugin.common.MethodChannel methodChannel = this.f144500d.f144505d;
        if (methodChannel != null) {
            methodChannel.invokeMethod(this.f144501e, this.f144502f);
        }
    }
}
