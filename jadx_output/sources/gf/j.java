package gf;

/* loaded from: classes7.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.k f271097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f271098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f271099f;

    public j(gf.k kVar, int i17, int i18) {
        this.f271097d = kVar;
        this.f271098e = i17;
        this.f271099f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f271097d.onBackDone(this.f271098e, this.f271099f);
    }
}
