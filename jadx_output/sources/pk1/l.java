package pk1;

/* loaded from: classes15.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk1.q f355461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355463f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ye1.h f355464g;

    public l(pk1.q qVar, java.lang.String str, java.lang.String str2, ye1.h hVar) {
        this.f355461d = qVar;
        this.f355462e = str;
        this.f355463f = str2;
        this.f355464g = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*ye1.a*/.u(this.f355462e, this.f355463f, this.f355464g);
    }
}
