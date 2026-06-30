package mh;

/* loaded from: classes12.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Parcel f326274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.battery.accumulate.persist.FlattParcelable f326275e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.os.Parcel parcel, com.tencent.matrix.battery.accumulate.persist.FlattParcelable flattParcelable) {
        super(0);
        this.f326274d = parcel;
        this.f326275e = flattParcelable;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Parcel parcel = this.f326274d;
        com.tencent.matrix.battery.accumulate.persist.FlattParcelable flattParcelable = this.f326275e;
        try {
            int readInt = parcel.readInt();
            if (readInt == com.tencent.matrix.battery.accumulate.persist.FlattParcelable.access$figureVerForDecode(flattParcelable)) {
                com.tencent.matrix.battery.accumulate.persist.a.f52553a.j(flattParcelable, parcel);
                flattParcelable.setFromDecode(true);
            } else {
                flattParcelable.setVerMatch(false);
                com.tencent.mars.xlog.Log.w("MicroMsg.proc.FlattParcelable", "ver mismatch, get=" + readInt + ", expected=" + com.tencent.matrix.battery.accumulate.persist.FlattParcelable.access$figureVerForDecode(flattParcelable));
            }
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            throw new java.io.IOException("readFromParcel err: " + th6.getMessage());
        }
    }
}
