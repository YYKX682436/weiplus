package mh;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh.f f326263e;

    public e(java.lang.String str, mh.f fVar) {
        this.f326262d = str;
        this.f326263e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ap.a.a(1, "errAccStats", null, null, "mapOverHeat", this.f326262d, java.lang.String.valueOf(this.f326263e.size()));
    }
}
