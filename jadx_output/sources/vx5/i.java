package vx5;

/* loaded from: classes13.dex */
public class i implements com.tencent.xweb.pinus.sdk.PSNotifyChannelListener {
    public i(vx5.l lVar) {
    }

    @Override // com.tencent.xweb.pinus.sdk.PSNotifyChannelListener
    public void onNotifyCallBackChannel(int i17, java.lang.Object[] objArr) {
        try {
            if (i17 == 50001) {
                by5.s0.e(java.lang.Long.parseLong((java.lang.String) objArr[0]), java.lang.Long.parseLong((java.lang.String) objArr[1]), java.lang.Integer.parseInt((java.lang.String) objArr[2]));
            } else if (i17 == 50002) {
                by5.s0.t(java.lang.Integer.parseInt((java.lang.String) objArr[0]), (java.lang.String) objArr[1]);
            } else {
                by5.c4.f("PinusStandAloneChannel", "NotifyChannel called funid = " + i17 + " do not match");
            }
        } catch (java.lang.RuntimeException e17) {
            by5.c4.d("PinusStandAloneChannel", "NotifyChannel error", e17);
        }
    }
}
