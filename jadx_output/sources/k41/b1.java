package k41;

/* loaded from: classes11.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j41.w f303971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303972e;

    public b1(j41.w wVar, java.lang.String str) {
        this.f303971d = wVar;
        this.f303972e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j41.w wVar = this.f303971d;
        if (wVar != null) {
            wVar.b(this.f303972e);
        }
    }
}
