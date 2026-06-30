package sb2;

/* loaded from: classes3.dex */
public final class g implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f405412d;

    public g(yz5.l lVar) {
        this.f405412d = lVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        pm0.v.X(new sb2.f(this.f405412d));
        return true;
    }
}
