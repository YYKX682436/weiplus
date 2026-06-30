package v24;

/* loaded from: classes.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f432893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f432894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f432895f;

    public a(yz5.p pVar, int i17, java.util.List list) {
        this.f432893d = pVar;
        this.f432894e = i17;
        this.f432895f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f432893d.invoke(java.lang.Integer.valueOf(this.f432894e + 1), java.lang.Integer.valueOf(this.f432895f.size()));
    }
}
