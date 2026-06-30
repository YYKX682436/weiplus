package com.tencent.mm.plugin.game.luggage.ipc;

/* loaded from: classes8.dex */
public class AddShortcutTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask> CREATOR = new w43.b();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f139566f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f139567g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f139568h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f139569i;

    public /* synthetic */ AddShortcutTask(android.os.Parcel parcel, w43.a aVar) {
        this(parcel);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f139566f = parcel.readString();
        this.f139567g = parcel.readString();
        this.f139568h = parcel.readByte() == 1;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f139566f);
        parcel.writeString(this.f139567g);
        parcel.writeByte(this.f139568h ? (byte) 1 : (byte) 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.Runnable runnable = this.f139569i;
        if (runnable != null) {
            ((b53.i) runnable).run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f139567g) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f139566f)) {
            com.tencent.mm.plugin.webview.model.j0.a(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f139566f, this.f139567g, new w43.a(this));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddShortcutTask", "appid or username is null");
            this.f139568h = false;
        }
    }

    public AddShortcutTask() {
    }

    private AddShortcutTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
