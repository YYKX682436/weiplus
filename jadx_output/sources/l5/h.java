package l5;

/* loaded from: classes14.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final l5.k f316525d;

    /* renamed from: e, reason: collision with root package name */
    public final wa.a f316526e;

    public h(l5.k kVar, wa.a aVar) {
        this.f316525d = kVar;
        this.f316526e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f316525d.f316534d != this) {
            return;
        }
        if (l5.k.f316532i.b(this.f316525d, this, l5.k.e(this.f316526e))) {
            l5.k.b(this.f316525d);
        }
    }
}
