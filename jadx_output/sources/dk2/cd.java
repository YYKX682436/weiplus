package dk2;

/* loaded from: classes16.dex */
public final class cd implements ve0.f {
    @Override // ve0.f
    public void a(int i17) {
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            k0Var.onCallStateChanged(i17, "0");
        }
    }

    @Override // ve0.f
    public void b(android.content.Intent intent) {
    }

    @Override // ve0.f
    public void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) {
    }
}
