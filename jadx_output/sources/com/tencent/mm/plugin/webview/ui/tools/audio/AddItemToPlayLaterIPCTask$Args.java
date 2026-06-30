package com.tencent.mm.plugin.webview.ui.tools.audio;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/audio/AddItemToPlayLaterIPCTask$Args", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class AddItemToPlayLaterIPCTask$Args implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Args> CREATOR = new fx4.b();

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f183914d;

    /* renamed from: e, reason: collision with root package name */
    public final int f183915e;

    public AddItemToPlayLaterIPCTask$Args(byte[] listenLaterTingItem, int i17) {
        kotlin.jvm.internal.o.g(listenLaterTingItem, "listenLaterTingItem");
        this.f183914d = listenLaterTingItem;
        this.f183915e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Args)) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Args addItemToPlayLaterIPCTask$Args = (com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Args) obj;
        return kotlin.jvm.internal.o.b(this.f183914d, addItemToPlayLaterIPCTask$Args.f183914d) && this.f183915e == addItemToPlayLaterIPCTask$Args.f183915e;
    }

    public int hashCode() {
        return (java.util.Arrays.hashCode(this.f183914d) * 31) + java.lang.Integer.hashCode(this.f183915e);
    }

    public java.lang.String toString() {
        return "Args(listenLaterTingItem=" + java.util.Arrays.toString(this.f183914d) + ", scene=" + this.f183915e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeByteArray(this.f183914d);
        out.writeInt(this.f183915e);
    }
}
