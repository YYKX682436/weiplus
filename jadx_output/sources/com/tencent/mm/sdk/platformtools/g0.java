package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public final class g0 implements com.tencent.mm.sdk.platformtools.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192713a;

    public g0(int i17) {
        this.f192713a = i17;
    }

    public void a(android.telephony.SignalStrength signalStrength) {
        kotlin.jvm.internal.o.g(signalStrength, "signalStrength");
        com.tencent.mm.sdk.platformtools.j0 j0Var = com.tencent.mm.sdk.platformtools.v0.f193031e;
        int i17 = this.f192713a;
        j0Var.f192749a = i17;
        if (i17 == 1) {
            j0Var.f192750b = signalStrength.getGsmSignalStrength();
        } else {
            if (i17 != 2) {
                return;
            }
            j0Var.f192751c = signalStrength.getCdmaDbm();
        }
    }
}
