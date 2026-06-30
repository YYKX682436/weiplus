package wd0;

/* loaded from: classes11.dex */
public final class f1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.feature.setting.api.FingerprintVerifyParam(com.tencent.mm.feature.setting.api.AskParam.CREATOR.createFromParcel(parcel), com.tencent.mm.feature.setting.api.AuthKeyParam.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.feature.setting.api.FingerprintVerifyParam[i17];
    }
}
