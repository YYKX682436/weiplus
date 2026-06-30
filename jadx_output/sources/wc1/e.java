package wc1;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f444470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f444471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444472f;

    public e(com.tencent.mm.plugin.appbrand.y yVar, int i17, java.lang.String str) {
        this.f444470d = yVar;
        this.f444471e = i17;
        this.f444472f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wc1.p.x(this.f444470d, java.lang.String.valueOf(this.f444471e), "fail", this.f444472f);
    }
}
