package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class p1 implements android.os.Parcelable.Creator {
    public p1(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        return new com.tencent.mm.plugin.finder.live.util.IntentBufferSameProcess$BufferShell(readString);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.finder.live.util.IntentBufferSameProcess$BufferShell[i17];
    }
}
