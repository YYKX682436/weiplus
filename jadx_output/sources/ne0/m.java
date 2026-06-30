package ne0;

/* loaded from: classes7.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ne0.n f336496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f336498f;

    public m(ne0.n nVar, java.lang.String str, double d17) {
        this.f336496d = nVar;
        this.f336497e = str;
        this.f336498f = d17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ne0.n nVar = this.f336496d;
        java.util.HashMap hashMap = nVar.f336501f;
        java.lang.String str = this.f336497e;
        double d17 = this.f336498f;
        synchronized (hashMap) {
            nVar.f336501f.put(str, java.lang.Double.valueOf(d17));
        }
    }
}
