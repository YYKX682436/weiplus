package com.tencent.mm.plugin.webview.ui.tools.newjsapi.finder;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/finder/OpenFinderViewTaskData;", "Landroid/os/Parcelable;", "CREATOR", "xx4/c", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class OpenFinderViewTaskData implements android.os.Parcelable {
    public static final xx4.c CREATOR = new xx4.c(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f186096d;

    public OpenFinderViewTaskData(android.os.Parcel src) {
        kotlin.jvm.internal.o.g(src, "src");
        this.f186096d = "";
        java.lang.String readString = src.readString();
        this.f186096d = readString != null ? readString : "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f186096d);
    }
}
