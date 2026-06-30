package i85;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f289660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i85.c f289661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f289662f;

    public a(java.lang.Throwable th6, i85.c cVar, java.lang.reflect.Method method) {
        this.f289660d = th6;
        this.f289661e = cVar;
        this.f289662f = method;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String[] strArr = new java.lang.String[2];
        strArr[0] = this.f289661e.a();
        java.lang.reflect.Method method = this.f289662f;
        strArr[1] = java.lang.String.valueOf(method != null ? method.getName() : null);
        ap.a.a(1, "amsCall", this.f289660d, null, strArr);
    }
}
