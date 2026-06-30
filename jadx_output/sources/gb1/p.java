package gb1;

/* loaded from: classes4.dex */
public class p implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask reportSubmitFormTask = new com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask();
        reportSubmitFormTask.v(parcel);
        return reportSubmitFormTask;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask[i17];
    }
}
