package sw4;

/* loaded from: classes8.dex */
public class m implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.webview.luggage.ipc.JsApiMMTask(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.webview.luggage.ipc.JsApiMMTask[i17];
    }
}
