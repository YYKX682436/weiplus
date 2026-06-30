package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes7.dex */
public final class c4 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.readInt();
        return new com.tencent.mm.plugin.magicbrush.IMBAppBrandExportFeature$ServerEvent.CleanUpPkgImplsEvent();
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.magicbrush.IMBAppBrandExportFeature$ServerEvent.CleanUpPkgImplsEvent[i17];
    }
}
