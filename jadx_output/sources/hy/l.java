package hy;

/* loaded from: classes14.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f285740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285741e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f285742f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f285743g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285744h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285745i;

    public l(hy.a0 a0Var, java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        this.f285740d = a0Var;
        this.f285741e = str;
        this.f285742f = i17;
        this.f285743g = i18;
        this.f285744h = str2;
        this.f285745i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f285740d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).vf(this.f285741e, this.f285742f, this.f285743g, this.f285744h, this.f285745i);
        }
    }
}
