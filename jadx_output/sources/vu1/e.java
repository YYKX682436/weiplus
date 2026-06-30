package vu1;

/* loaded from: classes13.dex */
public final class e implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu1.h f440186d;

    public e(vu1.h hVar) {
        this.f440186d = hVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        vu1.h hVar = this.f440186d;
        hVar.b(new vu1.d(hVar));
        return true;
    }
}
