package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public final class s2 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.game.model.LocalHalfScreen(parcel.readInt(), parcel.readInt(), parcel.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.game.model.LocalHalfScreen[i17];
    }
}
