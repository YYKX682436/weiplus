package com.tencent.mm.plugin.multitask;

/* loaded from: classes7.dex */
public final class t0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        return new com.tencent.mm.plugin.multitask.MultiTaskListParcel(in6);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.multitask.MultiTaskListParcel[i17];
    }
}
