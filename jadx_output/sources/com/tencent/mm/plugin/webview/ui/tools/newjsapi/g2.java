package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class g2 implements android.os.Parcelable.Creator {
    public g2(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetNewLifeContact$NewLifeGetNewLifeContactData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetNewLifeContact$NewLifeGetNewLifeContactData[i17];
    }
}
