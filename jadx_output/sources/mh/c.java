package mh;

/* loaded from: classes11.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh.d f326259e;

    public c(java.lang.String str, mh.d dVar) {
        this.f326258d = str;
        this.f326259e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ap.a.a(1, "errAccStats", null, null, "listOverHeat", this.f326258d, java.lang.String.valueOf(this.f326259e.size()));
    }
}
