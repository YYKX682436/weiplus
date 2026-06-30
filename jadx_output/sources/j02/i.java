package j02;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b02.a f296996d;

    public i(b02.a aVar) {
        this.f296996d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b02.a aVar = this.f296996d;
        int max = java.lang.Math.max(aVar.f16804c.getWidth(), aVar.f16803b.getWidth());
        aVar.f16804c.setWidth(max);
        aVar.f16803b.setWidth(max);
    }
}
