package uc3;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc3.e f426366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f426369g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426370h;

    public d(uc3.e eVar, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        this.f426366d = eVar;
        this.f426367e = str;
        this.f426368f = str2;
        this.f426369g = i17;
        this.f426370h = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f426366d.f426371a.subscribeHandler(this.f426367e, this.f426368f, this.f426369g, this.f426370h);
    }
}
