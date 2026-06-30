package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* loaded from: classes8.dex */
public final class a implements android.os.Parcelable.Creator {
    public a(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.FinderFeedInfoForVideoPlugin finderFeedInfoForVideoPlugin = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.FinderFeedInfoForVideoPlugin();
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        finderFeedInfoForVideoPlugin.f186976d = readString;
        finderFeedInfoForVideoPlugin.f186977e = parcel.readByte() != 0;
        finderFeedInfoForVideoPlugin.f186978f = parcel.readByte() != 0;
        finderFeedInfoForVideoPlugin.f186979g = parcel.readInt();
        finderFeedInfoForVideoPlugin.f186980h = parcel.readInt();
        return finderFeedInfoForVideoPlugin;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.FinderFeedInfoForVideoPlugin[i17];
    }
}
