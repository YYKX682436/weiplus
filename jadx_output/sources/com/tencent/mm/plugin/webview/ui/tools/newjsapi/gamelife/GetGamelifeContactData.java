package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetGamelifeContactData;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class GetGamelifeContactData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeContactData> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.j();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f186146d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f186147e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f186148f;

    public GetGamelifeContactData(java.util.LinkedList linkedList, java.lang.String errmsg, boolean z17) {
        kotlin.jvm.internal.o.g(errmsg, "errmsg");
        this.f186146d = linkedList;
        this.f186147e = errmsg;
        this.f186148f = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeSerializable(this.f186146d);
        out.writeString(this.f186147e);
        out.writeInt(this.f186148f ? 1 : 0);
    }
}
