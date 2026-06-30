package u73;

/* loaded from: classes.dex */
public class d implements com.tencent.mm.wallet_core.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f425121a;

    public d(boolean z17) {
        this.f425121a = z17;
    }

    @Override // com.tencent.mm.wallet_core.g
    public android.content.Intent onProcessEnd(int i17, android.os.Bundle bundle) {
        if (this.f425121a) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15191, 0, 0, 0, 0, 0, 0, 0, 0, 1);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15191, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1);
        }
        return new android.content.Intent();
    }
}
