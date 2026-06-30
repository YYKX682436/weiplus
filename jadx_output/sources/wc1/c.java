package wc1;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f444464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f444465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444466f;

    public c(com.tencent.mm.plugin.appbrand.y yVar, int i17, java.lang.String str) {
        this.f444464d = yVar;
        this.f444465e = i17;
        this.f444466f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wc1.p.x(this.f444464d, java.lang.String.valueOf(this.f444465e), ya.b.SUCCESS, this.f444466f);
    }
}
