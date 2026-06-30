package com.tencent.mm.plugin.webview.luggage.ipc;

/* loaded from: classes8.dex */
public class JsApiMMTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.luggage.ipc.JsApiMMTask> CREATOR = new sw4.m();

    /* renamed from: f, reason: collision with root package name */
    public sd.b f182230f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f182231g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f182232h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f182233i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f182234m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f182235n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f182236o;

    public /* synthetic */ JsApiMMTask(android.os.Parcel parcel, sw4.l lVar) {
        this(parcel);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f182231g = parcel.readString();
        this.f182232h = parcel.readString();
        this.f182233i = parcel.readString();
        this.f182234m = parcel.readString();
        this.f182235n = parcel.readString();
        this.f182236o = parcel.readInt() == 1;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f182231g);
        parcel.writeString(this.f182232h);
        parcel.writeString(this.f182233i);
        parcel.writeString(this.f182234m);
        parcel.writeString(this.f182235n);
        parcel.writeInt(this.f182236o ? 1 : 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        org.json.JSONObject jSONObject;
        if (!this.f182236o) {
            x();
        }
        if (this.f182230f != null) {
            try {
                jSONObject = android.text.TextUtils.isEmpty(this.f182234m) ? new org.json.JSONObject() : new org.json.JSONObject(this.f182234m);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiMMTask", e17, "runInClientProcess fail.", new java.lang.Object[0]);
                jSONObject = null;
            }
            if (android.text.TextUtils.isEmpty(this.f182235n)) {
                this.f182230f.c(this.f182233i, jSONObject);
                return;
            }
            sd.d dVar = this.f182230f.f406596a;
            if (dVar instanceof sd.a) {
                ((sd.a) dVar).getRuntime().b(this.f182235n, jSONObject);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        try {
            ((com.tencent.mm.plugin.webview.luggage.jsapi.r5) java.lang.Class.forName(this.f182232h).newInstance()).d(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f182231g, new sw4.l(this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiMMTask", e17, "runInMainProcess fail.", new java.lang.Object[0]);
        }
    }

    public JsApiMMTask() {
        this.f182236o = false;
    }

    private JsApiMMTask(android.os.Parcel parcel) {
        this.f182236o = false;
        v(parcel);
    }
}
