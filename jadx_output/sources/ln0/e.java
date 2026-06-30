package ln0;

/* loaded from: classes10.dex */
public final class e implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln0.p f319646d;

    public e(ln0.p pVar) {
        this.f319646d = pVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        ln0.p pVar = this.f319646d;
        if (pVar.f319679h.compareAndSet(true, false)) {
            ((ku5.t0) ku5.t0.f312615d).h(new ln0.a(pVar), pVar.f319678g);
        }
        return true;
    }
}
