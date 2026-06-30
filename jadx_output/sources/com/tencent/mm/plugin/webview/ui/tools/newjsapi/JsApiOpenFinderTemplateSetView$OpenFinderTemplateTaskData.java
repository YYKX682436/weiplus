package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderTemplateSetView$OpenFinderTemplateTaskData", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/webview/ui/tools/newjsapi/y7", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class JsApiOpenFinderTemplateSetView$OpenFinderTemplateTaskData implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.y7 CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.y7(null);

    /* renamed from: d, reason: collision with root package name */
    public long f185901d;

    /* renamed from: e, reason: collision with root package name */
    public int f185902e;

    /* renamed from: f, reason: collision with root package name */
    public int f185903f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "OpenFinderTemplateTaskData(templateTopicId=" + this.f185901d + ", templateEnterScene=" + this.f185902e + ", finderEntryScene=" + this.f185903f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeLong(this.f185901d);
        parcel.writeInt(this.f185902e);
        parcel.writeInt(this.f185903f);
    }
}
