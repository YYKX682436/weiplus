package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetGamelifeConversationData;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GetGamelifeConversationData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeConversationData> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.k();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f186149d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f186150e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f186151f;

    public GetGamelifeConversationData(java.util.List list, java.lang.String errmsg, boolean z17) {
        kotlin.jvm.internal.o.g(errmsg, "errmsg");
        this.f186149d = list;
        this.f186150e = errmsg;
        this.f186151f = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.List list = this.f186149d;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeConversationData) it.next()).writeToParcel(out, i17);
            }
        }
        out.writeString(this.f186150e);
        out.writeInt(this.f186151f ? 1 : 0);
    }
}
