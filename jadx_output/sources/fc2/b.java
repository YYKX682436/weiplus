package fc2;

/* loaded from: classes2.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f260937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc2.a f260938e;

    public b(java.util.Map.Entry entry, fc2.a aVar) {
        this.f260937d = entry;
        this.f260938e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((fc2.d) this.f260937d.getKey()).G0(this.f260938e);
    }
}
