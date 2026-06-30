package j3;

/* loaded from: classes13.dex */
public class r implements android.os.Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final j3.s f297341a;

    public r(j3.s sVar) {
        this.f297341a = sVar;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return this.f297341a.createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return this.f297341a.newArray(i17);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return this.f297341a.createFromParcel(parcel, classLoader);
    }
}
