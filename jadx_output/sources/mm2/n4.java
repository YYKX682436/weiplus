package mm2;

/* loaded from: classes3.dex */
public final class n4 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f329288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.o4 f329289e;

    public n4(long j17, mm2.o4 o4Var) {
        this.f329288d = j17;
        this.f329289e = o4Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f329288d;
        ((kotlinx.coroutines.flow.h3) this.f329289e.f329333y0).k(java.lang.Long.valueOf(currentTimeMillis));
        return true;
    }
}
