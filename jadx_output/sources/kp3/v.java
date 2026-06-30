package kp3;

/* loaded from: classes14.dex */
public final class v implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.x f311046d;

    public v(kp3.x xVar) {
        this.f311046d = xVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        kp3.x.O6(this.f311046d, 3, "CANCEL_PALM_TIME_EXPIRED_RECORD");
        return true;
    }
}
