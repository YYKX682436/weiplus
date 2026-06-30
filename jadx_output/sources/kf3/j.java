package kf3;

/* loaded from: classes5.dex */
public class j implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kf3.u f307362d;

    public j(kf3.u uVar) {
        this.f307362d = uVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        kf3.u uVar = this.f307362d;
        uVar.f307437b.U1(uVar.f307438c.d());
        return true;
    }
}
