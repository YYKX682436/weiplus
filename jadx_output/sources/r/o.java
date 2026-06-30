package r;

/* loaded from: classes16.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.SendMsgCard f367957d;

    public o(com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard) {
        this.f367957d = sendMsgCard;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/open_voice_control/card/SendMsgCard$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("confirm send: ");
        com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard = this.f367957d;
        sb6.append(sendMsgCard.f72257u);
        com.tencent.mars.xlog.Log.i("MicroMsg.OVC.SendMsgCard", sb6.toString());
        w11.r1 b17 = w11.s1.b(sendMsgCard.n0(), null, 2, null);
        b17.f442130e = 1;
        b17.f442131f = 0;
        b17.e(sendMsgCard.f72257u);
        b17.g(sendMsgCard.n0());
        b17.f442133h = null;
        b17.f442140o = null;
        b17.f442134i = 5;
        boolean a17 = b17.a().a();
        com.tencent.mars.xlog.Log.i("MicroMsg.OVC.SendMsgCard", "send result: success=" + a17);
        yz5.p pVar = sendMsgCard.f72256t;
        if (pVar != null) {
            pVar.invoke(sendMsgCard.n0(), java.lang.Boolean.valueOf(a17));
        }
        yj0.a.h(this, "com/tencent/mm/open_voice_control/card/SendMsgCard$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
