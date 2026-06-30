package ne2;

/* loaded from: classes3.dex */
public final class g implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ne2.k f336530d;

    public g(ne2.k kVar) {
        this.f336530d = kVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        pm0.v.X(new ne2.f(this.f336530d));
        return true;
    }
}
