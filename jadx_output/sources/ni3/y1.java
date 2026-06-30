package ni3;

/* loaded from: classes12.dex */
public class y1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni3.g2 f337759d;

    public y1(ni3.g2 g2Var) {
        this.f337759d = g2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        ni3.g2.Di(this.f337759d);
        return true;
    }
}
