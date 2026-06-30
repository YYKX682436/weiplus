package df;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f229500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f229502f;

    public k(int i17, java.lang.String str, java.util.HashMap hashMap) {
        this.f229500d = i17;
        this.f229501e = str;
        this.f229502f = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df.n.f229517a.a(this.f229500d, this.f229501e, this.f229502f);
    }
}
