package tl2;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f420243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo0.a f420244e;

    public f(boolean z17, qo0.a aVar) {
        this.f420243d = z17;
        this.f420244e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f420243d;
        qo0.a aVar = this.f420244e;
        if (z17) {
            aVar.f365323d.setTranslationX(Float.MAX_VALUE);
        } else {
            aVar.f365323d.setTranslationX(0.0f);
        }
    }
}
