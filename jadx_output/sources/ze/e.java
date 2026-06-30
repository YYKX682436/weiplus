package ze;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze.g f471722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f471723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f471724f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471725g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f471726h;

    public e(ze.g gVar, boolean z17, boolean z18, java.lang.String str, boolean z19) {
        this.f471722d = gVar;
        this.f471723e = z17;
        this.f471724f = z18;
        this.f471725g = str;
        this.f471726h = z19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f471722d.tuningRtContentView(this.f471723e, this.f471724f, this.f471725g, this.f471726h);
    }
}
