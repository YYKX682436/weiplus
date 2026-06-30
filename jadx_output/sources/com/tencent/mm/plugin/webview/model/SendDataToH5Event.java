package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public final class SendDataToH5Event extends com.tencent.mm.sdk.event.IEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.model.SendDataToH5Event> CREATOR = new com.tencent.mm.plugin.webview.model.o3();

    /* renamed from: g, reason: collision with root package name */
    public final int f182728g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f182729h;

    /* renamed from: i, reason: collision with root package name */
    public final org.json.JSONObject f182730i;

    /* loaded from: classes7.dex */
    public static final class a implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.webview.model.SendDataToH5Event, com.tencent.mm.ipcinvoker.type.IPCVoid> {
        private a() {
        }

        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            com.tencent.mm.plugin.webview.model.SendDataToH5Event sendDataToH5Event = (com.tencent.mm.plugin.webview.model.SendDataToH5Event) obj;
            if (sendDataToH5Event != null) {
                sendDataToH5Event.e();
            }
        }
    }

    public SendDataToH5Event(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f182728g = i17;
        this.f182729h = str;
        this.f182730i = jSONObject;
    }

    public static void f(com.tencent.mm.plugin.webview.model.SendDataToH5Event sendDataToH5Event) {
        java.lang.String str = com.tencent.mm.pluginsdk.model.g4.a() ? com.tencent.mm.sdk.platformtools.w9.f193053a : com.tencent.mm.sdk.platformtools.w9.f193055c;
        if (str.equals(bm5.f1.a())) {
            sendDataToH5Event.e();
        } else {
            com.tencent.mm.ipcinvoker.d0.d(str, sendDataToH5Event, com.tencent.mm.plugin.webview.model.SendDataToH5Event.a.class, null);
        }
    }

    public static void g(com.tencent.mm.plugin.webview.model.SendDataToH5Event sendDataToH5Event) {
        java.lang.String str = com.tencent.mm.pluginsdk.model.g4.b() ? com.tencent.mm.sdk.platformtools.w9.f193053a : com.tencent.mm.sdk.platformtools.w9.f193055c;
        if (str.equals(bm5.f1.a())) {
            sendDataToH5Event.e();
        } else {
            com.tencent.mm.ipcinvoker.d0.d(str, sendDataToH5Event, com.tencent.mm.plugin.webview.model.SendDataToH5Event.a.class, null);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f182728g);
        parcel.writeString(this.f182729h);
        parcel.writeString(this.f182730i.toString());
    }

    public SendDataToH5Event(android.os.Parcel parcel) {
        org.json.JSONObject jSONObject;
        this.f182728g = parcel.readInt();
        this.f182729h = parcel.readString();
        java.lang.String readString = parcel.readString();
        try {
            jSONObject = new org.json.JSONObject(readString);
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SendDataToH5Event", "json exception %s", readString);
            jSONObject = new org.json.JSONObject();
        }
        this.f182730i = jSONObject;
    }
}
