package com.tencent.mm.plugin.multitask;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/multitask/PluginMultiTaskUIServiceProxy$IPCAnimationConfig", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/multitask/w1", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class PluginMultiTaskUIServiceProxy$IPCAnimationConfig implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.multitask.w1 CREATOR = new com.tencent.mm.plugin.multitask.w1(null);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f150405d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f150406e;

    public PluginMultiTaskUIServiceProxy$IPCAnimationConfig(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f150405d = parcel.readByte() != 0;
        this.f150406e = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeByte(this.f150405d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f150406e ? (byte) 1 : (byte) 0);
    }

    public PluginMultiTaskUIServiceProxy$IPCAnimationConfig(boolean z17, boolean z18) {
        this.f150405d = z17;
        this.f150406e = z18;
    }
}
