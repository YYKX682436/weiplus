package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes7.dex */
public final class x4 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.HashSet hashSet = new java.util.HashSet(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            hashSet.add(parcel.readSerializable());
        }
        int readInt2 = parcel.readInt();
        java.util.HashSet hashSet2 = new java.util.HashSet(readInt2);
        for (int i18 = 0; i18 != readInt2; i18++) {
            hashSet2.add(parcel.readString());
        }
        return new com.tencent.mm.plugin.magicbrush.MBBuildConfig(hashSet, hashSet2, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readParcelable(com.tencent.mm.plugin.magicbrush.MBBuildConfig.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.magicbrush.MBBuildConfig[i17];
    }
}
