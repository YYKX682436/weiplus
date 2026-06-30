package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public final class f0 extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.SignalStrengthsListener {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.d0 f192660a;

    @Override // android.telephony.TelephonyCallback.SignalStrengthsListener
    public void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) {
        kotlin.jvm.internal.o.g(signalStrength, "signalStrength");
        com.tencent.mm.sdk.platformtools.d0 d0Var = this.f192660a;
        if (d0Var != null) {
            ((com.tencent.mm.sdk.platformtools.g0) d0Var).a(signalStrength);
        }
    }
}
