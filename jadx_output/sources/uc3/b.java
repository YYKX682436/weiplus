package uc3;

/* loaded from: classes7.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc3.e f426361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f426362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426363f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426364g;

    public b(uc3.e eVar, int i17, java.lang.String str, java.lang.String str2) {
        this.f426361d = eVar;
        this.f426362e = i17;
        this.f426363f = str;
        this.f426364g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f426361d.f426371a.invokeCallbackHandler(this.f426362e, this.f426363f, this.f426364g);
    }
}
