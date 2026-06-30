package m31;

/* loaded from: classes9.dex */
public final class y1 implements h31.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI f323240a;

    public y1(com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI) {
        this.f323240a = subscribeMsgRequestProxyUI;
    }

    public void a(int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        int i19 = com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI.f71874u;
        com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI = this.f323240a;
        com.tencent.mars.xlog.Log.e("MicroMsg.SubscribeMsgRequestProxyUI", "subscribeMsgRequest onError bizUsername: %s, action: %d, errCode: %d, errMsg: %s", subscribeMsgRequestProxyUI.V6(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = subscribeMsgRequestProxyUI.f71876e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI.T6(this.f323240a, i18, errMsg, true, null, 8, null);
    }

    public void b(boolean z17, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult result) {
        kotlin.jvm.internal.o.g(result, "result");
        int i17 = com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI.f71874u;
        com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI = this.f323240a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeMsgRequestProxyUI", "onGetSubscribeListSuccess bizUsername: %s, %d, showDialog: %b", subscribeMsgRequestProxyUI.V6(), java.lang.Integer.valueOf(result.f71785h.size()), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.ui.widget.dialog.u3 u3Var = subscribeMsgRequestProxyUI.f71876e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        subscribeMsgRequestProxyUI.f71878g = h31.s.b(subscribeMsgRequestProxyUI.f71878g);
        if (subscribeMsgRequestProxyUI.U6() == 1 || !z17) {
            com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI.T6(this.f323240a, 0, "", false, null, 12, null);
        }
    }

    public void c(com.tencent.mm.msgsubscription.SubscribeMsgRequestResult result) {
        kotlin.jvm.internal.o.g(result, "result");
        int i17 = com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI.f71874u;
        com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI = this.f323240a;
        java.lang.String V6 = subscribeMsgRequestProxyUI.V6();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = result.f71785h;
        com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeMsgRequestProxyUI", "onSubscribeMsgSuccess bizUsername: %s, %d", V6, java.lang.Integer.valueOf(arrayList.size()));
        subscribeMsgRequestProxyUI.f71878g = h31.s.b(subscribeMsgRequestProxyUI.f71878g);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("key_result_data", arrayList);
        bundle.putString("key_result_ext_data", result.f71800z);
        com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI.T6(this.f323240a, 0, "", false, bundle, 4, null);
    }
}
