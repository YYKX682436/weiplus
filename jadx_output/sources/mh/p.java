package mh;

/* loaded from: classes12.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Parcel f326276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.battery.accumulate.persist.FlattParcelable f326277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f326278f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.os.Parcel parcel, com.tencent.matrix.battery.accumulate.persist.FlattParcelable flattParcelable, int i17) {
        super(0);
        this.f326276d = parcel;
        this.f326277e = flattParcelable;
        this.f326278f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.matrix.battery.accumulate.persist.FlattParcelable flattParcelable = this.f326277e;
        android.os.Parcel parcel = this.f326276d;
        try {
            parcel.writeInt(com.tencent.matrix.battery.accumulate.persist.FlattParcelable.access$figureVerForDecode(flattParcelable));
            com.tencent.matrix.battery.accumulate.persist.a.f52553a.k(flattParcelable, parcel, this.f326278f);
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            throw new java.io.IOException("writeToParcel err: " + th6.getMessage());
        }
    }
}
