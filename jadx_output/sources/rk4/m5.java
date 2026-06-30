package rk4;

/* loaded from: classes11.dex */
public final class m5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.TingMembershipTransparentUI f396847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(com.tencent.mm.plugin.ting.TingMembershipTransparentUI tingMembershipTransparentUI) {
        super(1);
        this.f396847d = tingMembershipTransparentUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.pigeon.ting.TingWecoinSubscribeResult it = (com.tencent.pigeon.ting.TingWecoinSubscribeResult) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startMembershipSubscribe callback status: ");
        sb6.append(it.getStatus());
        sb6.append(", cancelled: ");
        com.tencent.mm.plugin.ting.TingMembershipTransparentUI tingMembershipTransparentUI = this.f396847d;
        sb6.append(tingMembershipTransparentUI.f174626e);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipTransparentUI", sb6.toString());
        if (!tingMembershipTransparentUI.f174626e) {
            android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) ((jz5.n) tingMembershipTransparentUI.f174625d).getValue();
            if (resultReceiver != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("key_result_status", (int) it.getStatus());
                resultReceiver.send(0, bundle);
            }
            tingMembershipTransparentUI.finish();
        }
        return jz5.f0.f302826a;
    }
}
