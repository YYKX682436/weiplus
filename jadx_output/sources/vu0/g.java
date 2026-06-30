package vu0;

/* loaded from: classes5.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu0.h f440087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f440089f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f440090g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f440091h;

    public g(vu0.h hVar, java.lang.String str, java.util.List list, boolean z17, boolean z18) {
        this.f440087d = hVar;
        this.f440088e = str;
        this.f440089f = list;
        this.f440090g = z17;
        this.f440091h = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f440087d.b(this.f440088e, this.f440089f, this.f440090g, this.f440091h);
    }
}
