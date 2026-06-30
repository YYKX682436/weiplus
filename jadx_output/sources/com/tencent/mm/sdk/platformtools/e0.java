package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public final class e0 extends android.telephony.PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.d0 f192546a;

    @Override // android.telephony.PhoneStateListener
    public void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) {
        kotlin.jvm.internal.o.g(signalStrength, "signalStrength");
        super.onSignalStrengthsChanged(signalStrength);
        com.tencent.mm.sdk.platformtools.d0 d0Var = this.f192546a;
        if (d0Var != null) {
            ((com.tencent.mm.sdk.platformtools.g0) d0Var).a(signalStrength);
        }
    }
}
