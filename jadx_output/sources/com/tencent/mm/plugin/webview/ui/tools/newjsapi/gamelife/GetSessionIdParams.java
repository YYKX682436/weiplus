package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetSessionIdParams;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class GetSessionIdParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetSessionIdParams> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.o();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f186162d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f186163e;

    /* renamed from: f, reason: collision with root package name */
    public final int f186164f;

    public GetSessionIdParams(java.lang.String selfUserName, java.lang.String talker, int i17) {
        kotlin.jvm.internal.o.g(selfUserName, "selfUserName");
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f186162d = selfUserName;
        this.f186163e = talker;
        this.f186164f = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f186162d);
        out.writeString(this.f186163e);
        out.writeInt(this.f186164f);
    }
}
