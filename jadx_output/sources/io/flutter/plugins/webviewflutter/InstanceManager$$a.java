package io.flutter.plugins.webviewflutter;

/* loaded from: classes13.dex */
public final /* synthetic */ class InstanceManager$$a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugins.webviewflutter.InstanceManager f293381d;

    public /* synthetic */ InstanceManager$$a(io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        this.f293381d = instanceManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f293381d.releaseAllFinalizedInstances();
    }
}
