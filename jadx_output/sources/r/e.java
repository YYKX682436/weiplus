package r;

/* loaded from: classes16.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.LoadingCard f367950d;

    public e(com.tencent.mm.open_voice_control.card.LoadingCard loadingCard) {
        this.f367950d = loadingCard;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/open_voice_control/card/LoadingCard$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("maskView clicked, onCloseClick=");
        com.tencent.mm.open_voice_control.card.LoadingCard loadingCard = this.f367950d;
        sb6.append(loadingCard.X1);
        com.tencent.mars.xlog.Log.i("MicroMsg.OVC.LoadingCard", sb6.toString());
        yz5.a aVar = loadingCard.X1;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/open_voice_control/card/LoadingCard$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
