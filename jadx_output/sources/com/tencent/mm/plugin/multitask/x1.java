package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public final class x1 implements android.os.Parcelable.Creator {
    public x1(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.multitask.PluginMultiTaskUIServiceProxy$IPCPoint pluginMultiTaskUIServiceProxy$IPCPoint = new com.tencent.mm.plugin.multitask.PluginMultiTaskUIServiceProxy$IPCPoint();
        int readInt = parcel.readInt();
        android.graphics.Point point = pluginMultiTaskUIServiceProxy$IPCPoint.f150407d;
        point.x = readInt;
        point.y = parcel.readInt();
        return pluginMultiTaskUIServiceProxy$IPCPoint;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.multitask.PluginMultiTaskUIServiceProxy$IPCPoint[i17];
    }
}
