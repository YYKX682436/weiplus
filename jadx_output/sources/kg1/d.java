package kg1;

/* loaded from: classes7.dex */
public class d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo[i17];
    }
}
