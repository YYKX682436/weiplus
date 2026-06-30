package gf4;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f271344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f271345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271346f;

    public d(long j17, int i17, java.lang.String str) {
        this.f271344d = j17;
        this.f271345e = i17;
        this.f271346f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gf4.l.f271354d.f(this.f271344d, this.f271345e, this.f271346f);
    }
}
