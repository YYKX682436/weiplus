package wv1;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wv1.r f449944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wv1.k f449945e;

    public j(wv1.k kVar, wv1.r rVar) {
        this.f449945e = kVar;
        this.f449944d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f449945e.q(this.f449944d);
    }
}
