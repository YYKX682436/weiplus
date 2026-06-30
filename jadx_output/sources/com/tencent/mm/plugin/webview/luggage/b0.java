package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes7.dex */
public class b0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider$GetLocalResourceInfoTask luggageMMLocalResourceProvider$GetLocalResourceInfoTask = new com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider$GetLocalResourceInfoTask(null);
        luggageMMLocalResourceProvider$GetLocalResourceInfoTask.v(parcel);
        return luggageMMLocalResourceProvider$GetLocalResourceInfoTask;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider$GetLocalResourceInfoTask[i17];
    }
}
