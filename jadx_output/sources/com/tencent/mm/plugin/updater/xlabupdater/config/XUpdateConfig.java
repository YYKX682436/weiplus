package com.tencent.mm.plugin.updater.xlabupdater.config;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/updater/xlabupdater/config/XUpdateConfig;", "Lcom/tencent/mm/plugin/updater/xlabupdater/config/BaseDownloadConfig;", "CREATOR", "yn4/b", "plugin-updater_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public class XUpdateConfig extends com.tencent.mm.plugin.updater.xlabupdater.config.BaseDownloadConfig {
    public static final yn4.b CREATOR = new yn4.b(null);

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f175521f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f175522g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XUpdateConfig(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f175521f = "";
        this.f175522g = "";
        java.lang.String readString = parcel.readString();
        this.f175521f = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        this.f175522g = readString2 != null ? readString2 : "";
    }

    @Override // com.tencent.mm.plugin.updater.xlabupdater.config.BaseDownloadConfig, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f175521f);
        parcel.writeString(this.f175522g);
    }
}
