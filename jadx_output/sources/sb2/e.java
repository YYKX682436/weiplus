package sb2;

/* loaded from: classes3.dex */
public final class e implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb2.i f405410d;

    public e(sb2.i iVar) {
        this.f405410d = iVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        sb2.i iVar = this.f405410d;
        iVar.getClass();
        pm0.v.X(new sb2.c(iVar));
        return true;
    }
}
