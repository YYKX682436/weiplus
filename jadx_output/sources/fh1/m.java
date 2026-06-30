package fh1;

/* loaded from: classes7.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f262565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f262566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f262567f;

    public m(fh1.z zVar, kotlinx.coroutines.q qVar, yz5.a aVar) {
        this.f262565d = zVar;
        this.f262566e = qVar;
        this.f262567f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f262565d.f262634h.get()) {
            this.f262567f.invoke();
            return;
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f262566e.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
    }
}
