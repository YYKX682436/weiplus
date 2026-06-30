package com.tencent.mm.plugin.setting.model;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/setting/model/ShowMuteModeToastEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "Landroid/os/Parcelable;", "setting-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ShowMuteModeToastEvent extends com.tencent.mm.sdk.event.IEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.setting.model.ShowMuteModeToastEvent> CREATOR = new k14.m0();

    /* renamed from: g, reason: collision with root package name */
    public final int f160046g;

    public ShowMuteModeToastEvent(int i17) {
        this.f160046g = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f160046g);
    }
}
