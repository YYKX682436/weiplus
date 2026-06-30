package df2;

/* loaded from: classes3.dex */
public final class j4 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f230449d;

    public j4(yz5.l lVar) {
        this.f230449d = lVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        pm0.v.X(new df2.i4(this.f230449d));
        return true;
    }
}
