package vu0;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu0.h f440083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vu0.u f440085f;

    public f(vu0.h hVar, java.lang.String str, vu0.u uVar) {
        this.f440083d = hVar;
        this.f440084e = str;
        this.f440085f = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f440083d.c(this.f440084e, this.f440085f);
    }
}
