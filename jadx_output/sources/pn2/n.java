package pn2;

/* loaded from: classes3.dex */
public final class n implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn2.s f357006d;

    public n(pn2.s sVar) {
        this.f357006d = sVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        pn2.s sVar = this.f357006d;
        sVar.getClass();
        pm0.v.X(new pn2.k(sVar));
        return true;
    }
}
