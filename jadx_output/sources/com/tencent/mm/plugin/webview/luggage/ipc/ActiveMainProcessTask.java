package com.tencent.mm.plugin.webview.luggage.ipc;

/* loaded from: classes8.dex */
public class ActiveMainProcessTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.luggage.ipc.ActiveMainProcessTask> CREATOR = new sw4.a();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Runnable f182228f;

    public /* synthetic */ ActiveMainProcessTask(android.os.Parcel parcel, sw4.a aVar) {
        this(parcel);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ActiveMainProcessTask", "runInClientProcess");
        java.lang.Runnable runnable = this.f182228f;
        if (runnable != null) {
            ((com.tencent.mm.plugin.game.luggage.page.c0) runnable).run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ActiveMainProcessTask", "active");
        c();
    }

    public ActiveMainProcessTask() {
    }

    private ActiveMainProcessTask(android.os.Parcel parcel) {
    }
}
