package k23;

/* loaded from: classes12.dex */
public final class i0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f303583d;

    public i0(k23.v0 v0Var) {
        this.f303583d = v0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        k23.v0 v0Var = this.f303583d;
        z21.e eVar = v0Var.f303708c;
        if (eVar == null) {
            return true;
        }
        int maxAmplitudeRate = eVar.getMaxAmplitudeRate();
        k23.x xVar = v0Var.f303715j;
        if (xVar != null) {
            xVar.setSoundWave(maxAmplitudeRate);
            return true;
        }
        kotlin.jvm.internal.o.o("recognizingPanel");
        throw null;
    }
}
