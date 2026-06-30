package j31;

/* loaded from: classes9.dex */
public final class d implements android.os.Parcelable.Creator {
    public d(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.msgsubscription.report.SubscribeMsgReporter$SubscribeMsgSettingReportInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.msgsubscription.report.SubscribeMsgReporter$SubscribeMsgSettingReportInfo[i17];
    }
}
