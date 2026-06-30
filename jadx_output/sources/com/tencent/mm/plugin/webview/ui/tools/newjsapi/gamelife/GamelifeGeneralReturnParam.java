package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GamelifeGeneralReturnParam;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class GamelifeGeneralReturnParam implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeGeneralReturnParam> CREATOR = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.i();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f186144d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f186145e;

    public GamelifeGeneralReturnParam(boolean z17, java.lang.String errmsg) {
        kotlin.jvm.internal.o.g(errmsg, "errmsg");
        this.f186144d = z17;
        this.f186145e = errmsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f186144d ? 1 : 0);
        out.writeString(this.f186145e);
    }
}
