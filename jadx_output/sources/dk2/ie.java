package dk2;

/* loaded from: classes3.dex */
public final class ie extends android.telephony.PhoneStateListener {
    @Override // android.telephony.PhoneStateListener
    public void onCallStateChanged(int i17, java.lang.String incomingNumber) {
        kotlin.jvm.internal.o.g(incomingNumber, "incomingNumber");
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            k0Var.onCallStateChanged(i17, incomingNumber);
        }
    }
}
