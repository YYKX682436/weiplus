package f41;

/* loaded from: classes4.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.SelectContactCard f259513d;

    public s(com.tencent.mm.open_voice_control.card.SelectContactCard selectContactCard) {
        this.f259513d = selectContactCard;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/open_voice_control/card/SelectContactCard$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("maskView clicked, onCloseClick=");
        com.tencent.mm.open_voice_control.card.SelectContactCard selectContactCard = this.f259513d;
        sb6.append(selectContactCard.f72242o);
        com.tencent.mars.xlog.Log.i("MicroMsg.OVC.SelectContactCard", sb6.toString());
        yz5.a aVar = selectContactCard.f72242o;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/open_voice_control/card/SelectContactCard$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
