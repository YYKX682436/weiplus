package iz3;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f296065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296066e;

    public a(long j17, java.lang.String str) {
        this.f296065d = j17;
        this.f296066e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iz3.f.f296076b.put(java.lang.Long.valueOf(this.f296065d), this.f296066e);
    }
}
