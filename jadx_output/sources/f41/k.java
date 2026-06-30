package f41;

/* loaded from: classes5.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.PermissionRequestCard f259491d;

    public k(com.tencent.mm.open_voice_control.card.PermissionRequestCard permissionRequestCard) {
        this.f259491d = permissionRequestCard;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/open_voice_control/card/PermissionRequestCard$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.OVC.PermissionRequestCard", "btnAllow clicked");
        yz5.a aVar = this.f259491d.f72233n;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/open_voice_control/card/PermissionRequestCard$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
