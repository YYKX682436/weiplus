package x03;

/* loaded from: classes15.dex */
public final class p implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f451086d;

    public p(x03.i0 i0Var) {
        this.f451086d = i0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        x03.i0 i0Var = this.f451086d;
        java.lang.String str = i0Var.f451044a;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = i0Var.f451045b;
        if (iTPPlayer == null) {
            return true;
        }
        iTPPlayer.getCurrentPositionMs();
        return true;
    }
}
