package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class y7 implements android.os.Parcelable.Creator {
    public y7(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderTemplateSetView$OpenFinderTemplateTaskData jsApiOpenFinderTemplateSetView$OpenFinderTemplateTaskData = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderTemplateSetView$OpenFinderTemplateTaskData();
        jsApiOpenFinderTemplateSetView$OpenFinderTemplateTaskData.f185901d = parcel.readLong();
        jsApiOpenFinderTemplateSetView$OpenFinderTemplateTaskData.f185902e = parcel.readInt();
        jsApiOpenFinderTemplateSetView$OpenFinderTemplateTaskData.f185903f = parcel.readInt();
        return jsApiOpenFinderTemplateSetView$OpenFinderTemplateTaskData;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderTemplateSetView$OpenFinderTemplateTaskData[i17];
    }
}
