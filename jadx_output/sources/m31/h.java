package m31;

/* loaded from: classes9.dex */
public final class h implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI f323147a;

    public h(com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI bizSubscribeMsgManagerUI) {
        this.f323147a = bizSubscribeMsgManagerUI;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI bizSubscribeMsgManagerUI = this.f323147a;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = bizSubscribeMsgManagerUI.f71853g;
        objArr[0] = mMSwitchBtn != null ? java.lang.Boolean.valueOf(mMSwitchBtn.f211363x) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizSubscribeMsgManagerUI", "SubscribeMsg onSwitchChanged %s", objArr);
        i31.a aVar = bizSubscribeMsgManagerUI.f71854h;
        if (aVar != null) {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = bizSubscribeMsgManagerUI.f71853g;
            aVar.b(mMSwitchBtn2 != null ? mMSwitchBtn2.f211363x : false);
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn3 = bizSubscribeMsgManagerUI.f71853g;
        if (mMSwitchBtn3 != null && mMSwitchBtn3.f211363x) {
            bizSubscribeMsgManagerUI.U6(true);
            android.widget.LinearLayout linearLayout = bizSubscribeMsgManagerUI.f71856m;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("ll");
                throw null;
            }
            linearLayout.setContentDescription(bizSubscribeMsgManagerUI.getResources().getString(com.tencent.mm.R.string.aki) + ',' + bizSubscribeMsgManagerUI.getResources().getString(com.tencent.mm.R.string.akg));
            return;
        }
        bizSubscribeMsgManagerUI.U6(false);
        android.widget.LinearLayout linearLayout2 = bizSubscribeMsgManagerUI.f71856m;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("ll");
            throw null;
        }
        linearLayout2.setContentDescription(bizSubscribeMsgManagerUI.getResources().getString(com.tencent.mm.R.string.aki) + ',' + bizSubscribeMsgManagerUI.getResources().getString(com.tencent.mm.R.string.akd));
    }
}
