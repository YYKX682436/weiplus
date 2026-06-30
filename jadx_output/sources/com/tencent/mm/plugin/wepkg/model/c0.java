package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask f188400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.a f188401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f188402f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188403g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188404h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188405i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f188406m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188407n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188408o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f188409p;

    public c0(com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask wepkgDownloadProcessTask, com.tencent.mm.plugin.wepkg.model.a aVar, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, java.lang.String str5, int i18) {
        this.f188400d = wepkgDownloadProcessTask;
        this.f188401e = aVar;
        this.f188402f = i17;
        this.f188403g = str;
        this.f188404h = str2;
        this.f188405i = str3;
        this.f188406m = j17;
        this.f188407n = str4;
        this.f188408o = str5;
        this.f188409p = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wepkg.model.b0 b0Var = new com.tencent.mm.plugin.wepkg.model.b0(this);
        int i17 = this.f188402f;
        java.lang.String str = this.f188403g;
        if (i17 == 1) {
            xz4.i.a().c(str, b0Var);
            return;
        }
        xz4.i a17 = xz4.i.a();
        int i18 = this.f188402f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = this.f188404h;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = this.f188405i;
        if (str3 == null) {
            str3 = "";
        }
        long j17 = this.f188406m;
        java.lang.String str4 = this.f188407n;
        if (str4 == null) {
            str4 = "";
        }
        java.lang.String str5 = this.f188408o;
        if (str5 == null) {
            str5 = "";
        }
        a17.f(i18, str, "", str2, str3, j17, str4, "", str5, this.f188409p, b0Var);
    }
}
