package k91;

/* loaded from: classes7.dex */
public final class u2 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        k91.b1 valueOf;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        boolean z17 = parcel.readInt() > 0;
        int readInt = parcel.readInt();
        java.lang.String readString = parcel.readString();
        kotlin.jvm.internal.o.d(readString);
        k91.s2 valueOf2 = k91.s2.valueOf(readString);
        boolean z18 = parcel.readByte() != 0;
        android.os.Parcelable readParcelable = parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig.class.getClassLoader());
        kotlin.jvm.internal.o.d(readParcelable);
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig backgroundShapeConfig = (com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig) readParcelable;
        boolean z19 = parcel.readByte() != 0;
        android.os.Parcelable readParcelable2 = parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig.class.getClassLoader());
        kotlin.jvm.internal.o.d(readParcelable2);
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig = (com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig) readParcelable2;
        java.lang.String readString2 = parcel.readString();
        kotlin.jvm.internal.o.d(readString2);
        k91.t2 valueOf3 = k91.t2.valueOf(readString2);
        boolean z27 = parcel.readByte() != 0;
        boolean z28 = parcel.readByte() != 0;
        com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener = (com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener.class.getClassLoader());
        java.lang.String readString3 = parcel.readString();
        kotlin.jvm.internal.o.d(readString3);
        k91.y2 valueOf4 = k91.y2.valueOf(readString3);
        boolean z29 = parcel.readByte() != 0;
        boolean z37 = parcel.readByte() != 0;
        java.lang.String readString4 = parcel.readString();
        if (android.text.TextUtils.isEmpty(readString4)) {
            valueOf = k91.b1.f305540d;
        } else {
            kotlin.jvm.internal.o.d(readString4);
            valueOf = k91.b1.valueOf(readString4);
        }
        k91.b1 b1Var = valueOf;
        boolean z38 = parcel.readByte() != 0;
        int readInt2 = parcel.readInt();
        android.os.Parcelable readParcelable3 = parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig.class.getClassLoader());
        kotlin.jvm.internal.o.d(readParcelable3);
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig shareActionConfig = (com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig) readParcelable3;
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        boolean z39 = parcel.readByte() != 0;
        boolean z47 = parcel.readByte() != 0;
        boolean z48 = parcel.readByte() != 0;
        java.lang.String readString5 = parcel.readString();
        kotlin.jvm.internal.o.d(readString5);
        k91.x2 valueOf5 = k91.x2.valueOf(readString5);
        boolean z49 = parcel.readByte() != 0;
        android.os.Parcelable readParcelable4 = parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo.class.getClassLoader());
        kotlin.jvm.internal.o.d(readParcelable4);
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo customSubjectInfo = (com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo) readParcelable4;
        int readInt6 = parcel.readInt();
        boolean z57 = parcel.readByte() != 0;
        java.lang.String readString6 = parcel.readString();
        kotlin.jvm.internal.o.d(readString6);
        boolean z58 = parcel.readByte() != 0;
        int readInt7 = parcel.readInt();
        boolean z59 = parcel.readByte() != 0;
        boolean z66 = parcel.readByte() != 0;
        boolean z67 = parcel.readByte() != 0;
        boolean z68 = parcel.readByte() != 0;
        java.lang.String readString7 = parcel.readString();
        kotlin.jvm.internal.o.d(readString7);
        k91.v2 valueOf6 = k91.v2.valueOf(readString7);
        java.lang.String readString8 = parcel.readString();
        kotlin.jvm.internal.o.d(readString8);
        com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener weAppHalfScreenHeaderTipsListener = (com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener.class.getClassLoader());
        boolean z69 = parcel.readByte() != 0;
        java.lang.String readString9 = parcel.readString();
        kotlin.jvm.internal.o.d(readString9);
        java.lang.String readString10 = parcel.readString();
        kotlin.jvm.internal.o.d(readString10);
        return new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(z17, readInt, valueOf2, z18, backgroundShapeConfig, z19, closeWhenClickEmptyAreaConfig, valueOf3, z27, z28, weAppHalfScreenStatusChangeListener, valueOf4, z29, z37, b1Var, z38, readInt2, shareActionConfig, readInt3, readInt4, readInt5, z39, z47, z48, valueOf5, z49, customSubjectInfo, readInt6, z57, readString6, z58, readInt7, z59, z66, z67, z68, valueOf6, readString8, weAppHalfScreenHeaderTipsListener, z69, readString9, readString10, parcel.readByte() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig[i17];
    }
}
