package wc1;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f444467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f444468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444469f;

    public d(com.tencent.mm.plugin.appbrand.y yVar, int i17, java.lang.String str) {
        this.f444467d = yVar;
        this.f444468e = i17;
        this.f444469f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wc1.p.x(this.f444467d, java.lang.String.valueOf(this.f444468e), "fail", this.f444469f);
    }
}
