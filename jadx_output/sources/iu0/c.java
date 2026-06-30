package iu0;

/* loaded from: classes5.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu0.d f294799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iu0.a f294801f;

    public c(iu0.d dVar, java.lang.String str, iu0.a aVar) {
        this.f294799d = dVar;
        this.f294800e = str;
        this.f294801f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f294799d.f294804c) {
            return;
        }
        this.f294799d.c(this.f294800e, this.f294801f);
    }
}
