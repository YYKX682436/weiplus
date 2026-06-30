package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiShowOpenIMContactProfile$JumpProfileData", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/webview/ui/tools/newjsapi/kd", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class JsApiShowOpenIMContactProfile$JumpProfileData implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.kd CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.kd(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f185923d;

    /* renamed from: e, reason: collision with root package name */
    public final int f185924e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f185925f;

    /* renamed from: g, reason: collision with root package name */
    public final int f185926g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f185927h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f185928i;

    public JsApiShowOpenIMContactProfile$JumpProfileData(java.lang.String str, byte[] bArr, int i17, java.lang.String bizInfo, boolean z17) {
        kotlin.jvm.internal.o.g(bizInfo, "bizInfo");
        this.f185923d = str;
        this.f185925f = bArr;
        this.f185926g = i17;
        this.f185927h = bizInfo;
        this.f185924e = bArr != null ? bArr.length : 0;
        this.f185928i = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f185923d);
        dest.writeInt(this.f185924e);
        dest.writeInt(this.f185926g);
        dest.writeString(this.f185927h);
        dest.writeByteArray(this.f185925f);
        dest.writeByte(this.f185928i ? (byte) 1 : (byte) 0);
    }

    public JsApiShowOpenIMContactProfile$JumpProfileData(android.os.Parcel src) {
        kotlin.jvm.internal.o.g(src, "src");
        java.lang.String readString = src.readString();
        this.f185923d = readString == null ? "" : readString;
        int readInt = src.readInt();
        this.f185924e = readInt;
        this.f185926g = src.readInt();
        java.lang.String readString2 = src.readString();
        this.f185927h = readString2 != null ? readString2 : "";
        byte[] bArr = new byte[readInt];
        src.readByteArray(bArr);
        this.f185925f = bArr;
        this.f185928i = src.readByte() != 0;
    }
}
