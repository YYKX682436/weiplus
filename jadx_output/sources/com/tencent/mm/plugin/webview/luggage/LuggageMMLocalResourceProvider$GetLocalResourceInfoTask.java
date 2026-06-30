package com.tencent.mm.plugin.webview.luggage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class LuggageMMLocalResourceProvider$GetLocalResourceInfoTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider$GetLocalResourceInfoTask> CREATOR = new com.tencent.mm.plugin.webview.luggage.b0();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f182123f;

    /* renamed from: g, reason: collision with root package name */
    public int f182124g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f182125h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f182126i;

    private LuggageMMLocalResourceProvider$GetLocalResourceInfoTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f182123f = parcel.readString();
        this.f182124g = parcel.readInt();
        this.f182125h = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f182123f);
        parcel.writeInt(this.f182124g);
        parcel.writeString(this.f182125h);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.Runnable runnable = this.f182126i;
        if (runnable != null) {
            ((com.tencent.mm.plugin.webview.luggage.a0) runnable).run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        int i17 = this.f182124g;
        if (i17 == 1) {
            this.f182125h = com.tencent.mm.plugin.webview.model.o5.e(this.f182123f);
        } else if (i17 == 2) {
            this.f182125h = com.tencent.mm.plugin.webview.model.o5.d(this.f182123f);
        }
        c();
    }

    public /* synthetic */ LuggageMMLocalResourceProvider$GetLocalResourceInfoTask(com.tencent.mm.plugin.webview.luggage.a0 a0Var) {
        this();
    }
}
