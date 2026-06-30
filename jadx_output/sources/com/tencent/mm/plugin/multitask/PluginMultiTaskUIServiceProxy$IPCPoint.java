package com.tencent.mm.plugin.multitask;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/multitask/PluginMultiTaskUIServiceProxy$IPCPoint", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/multitask/x1", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class PluginMultiTaskUIServiceProxy$IPCPoint implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.multitask.x1 CREATOR = new com.tencent.mm.plugin.multitask.x1(null);

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Point f150407d;

    public PluginMultiTaskUIServiceProxy$IPCPoint() {
        this.f150407d = new android.graphics.Point(0, 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        android.graphics.Point point = this.f150407d;
        dest.writeInt(point.x);
        dest.writeInt(point.y);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PluginMultiTaskUIServiceProxy$IPCPoint(android.graphics.Point point) {
        this();
        kotlin.jvm.internal.o.g(point, "point");
        this.f150407d = point;
    }
}
