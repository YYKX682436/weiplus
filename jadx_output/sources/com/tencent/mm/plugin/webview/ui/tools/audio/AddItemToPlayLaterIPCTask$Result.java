package com.tencent.mm.plugin.webview.ui.tools.audio;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/audio/AddItemToPlayLaterIPCTask$Result", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class AddItemToPlayLaterIPCTask$Result implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Result> CREATOR = new fx4.c();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f183916d;

    public AddItemToPlayLaterIPCTask$Result(boolean z17) {
        this.f183916d = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Result) && this.f183916d == ((com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Result) obj).f183916d;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f183916d);
    }

    public java.lang.String toString() {
        return "Result(success=" + this.f183916d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f183916d ? 1 : 0);
    }
}
