package mh;

/* loaded from: classes11.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f326269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.battery.accumulate.persist.FlattParcelable f326270e;

    public j(java.lang.String str, long j17, com.tencent.matrix.battery.accumulate.persist.FlattParcelable flattParcelable) {
        this.f326269d = j17;
        this.f326270e = flattParcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ap.a.a(1, "accStatsEncodeCost", null, null, java.lang.String.valueOf(this.f326269d), this.f326270e.getClass().getSimpleName());
    }
}
