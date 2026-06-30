package je1;

/* loaded from: classes15.dex */
public final class e implements android.os.Parcelable.Creator {
    public e(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.GetCardInfoTask(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.GetCardInfoTask[i17];
    }
}
