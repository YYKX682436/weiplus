package f41;

/* loaded from: classes4.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.SendMsgCard f259492d;

    public k0(com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard) {
        this.f259492d = sendMsgCard;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/open_voice_control/card/SendMsgCard$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("maskView clicked, onCloseClick=");
        com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard = this.f259492d;
        sb6.append(sendMsgCard.f72255s);
        com.tencent.mars.xlog.Log.i("MicroMsg.OVC.SendMsgCard", sb6.toString());
        yz5.a aVar = sendMsgCard.f72255s;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/open_voice_control/card/SendMsgCard$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
