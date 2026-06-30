package vu0;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu0.h f440077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f440079f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f440080g;

    public e(vu0.h hVar, java.lang.String str, java.util.List list, boolean z17) {
        this.f440077d = hVar;
        this.f440078e = str;
        this.f440079f = list;
        this.f440080g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f440077d.a(this.f440078e, this.f440079f, this.f440080g);
    }
}
