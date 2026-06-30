package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public final class q5 implements android.os.Parcelable.Creator {
    public q5(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.pluginsdk.ui.tools.QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog.IPCData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), java.lang.Long.valueOf(parcel.readLong()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.pluginsdk.ui.tools.QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog.IPCData[i17];
    }
}
