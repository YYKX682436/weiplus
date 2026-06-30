package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes12.dex */
public class LuggageUploadMediaFileManager$UploadMediaFileTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$UploadMediaFileTask> CREATOR = new com.tencent.mm.plugin.webview.luggage.jsapi.k6();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.luggage.jsapi.f6 f182242f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f182243g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f182244h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f182245i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f182246m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f182247n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Runnable f182248o;

    public /* synthetic */ LuggageUploadMediaFileManager$UploadMediaFileTask(android.os.Parcel parcel, com.tencent.mm.plugin.webview.luggage.jsapi.u5 u5Var) {
        this(parcel);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f182243g = parcel.readString();
        this.f182244h = parcel.readString();
        this.f182245i = parcel.readString();
        this.f182246m = parcel.readString();
        this.f182247n = parcel.readByte() == 1;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f182243g);
        parcel.writeString(this.f182244h);
        parcel.writeString(this.f182245i);
        parcel.writeString(this.f182246m);
        parcel.writeByte(this.f182247n ? (byte) 1 : (byte) 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.Runnable runnable = this.f182248o;
        if (runnable != null) {
            ((com.tencent.mm.plugin.webview.luggage.jsapi.x5) runnable).run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadMediaTask", "runInMainProcess");
        if (this.f182242f == null) {
            this.f182242f = new com.tencent.mm.plugin.webview.luggage.jsapi.j6(this);
        }
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(this.f182243g);
        if (b17 == null) {
            c();
            return;
        }
        int i17 = b17.f182742n;
        if (i17 == 1) {
            com.tencent.mm.plugin.webview.luggage.jsapi.l6.a(com.tencent.mm.sdk.platformtools.x2.f193071a, b17, this.f182244h, this.f182243g, 20301, 202, 2, false, this.f182242f);
        } else if (i17 != 4) {
            com.tencent.mm.plugin.webview.luggage.jsapi.l6.b(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f182244h, this.f182243g, 20302, 202, 2, false, this.f182242f);
        } else {
            com.tencent.mm.plugin.webview.luggage.jsapi.l6.b(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f182244h, this.f182243g, 20302, 202, 2, false, this.f182242f);
        }
    }

    public LuggageUploadMediaFileManager$UploadMediaFileTask() {
    }

    private LuggageUploadMediaFileManager$UploadMediaFileTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
