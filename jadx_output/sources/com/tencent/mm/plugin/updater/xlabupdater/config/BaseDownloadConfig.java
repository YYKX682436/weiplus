package com.tencent.mm.plugin.updater.xlabupdater.config;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/updater/xlabupdater/config/BaseDownloadConfig;", "Landroid/os/Parcelable;", "CREATOR", "yn4/a", "plugin-updater_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public class BaseDownloadConfig implements android.os.Parcelable {
    public static final yn4.a CREATOR = new yn4.a(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f175519d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f175520e;

    public BaseDownloadConfig(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f175519d = "";
        this.f175520e = "";
        java.lang.String readString = parcel.readString();
        this.f175519d = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        this.f175520e = readString2 != null ? readString2 : "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f175519d);
        parcel.writeString(this.f175520e);
    }
}
