package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public final class t2 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.game.model.LocalJumpInfo(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : com.tencent.mm.plugin.game.model.WeAppJumpInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? com.tencent.mm.plugin.game.model.LocalHalfScreen.CREATOR.createFromParcel(parcel) : null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.game.model.LocalJumpInfo[i17];
    }
}
