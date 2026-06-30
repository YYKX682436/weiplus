package hl4;

/* loaded from: classes11.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.membership.view.TingMembershipInfoDialog f282117d;

    public e(com.tencent.mm.plugin.ting.membership.view.TingMembershipInfoDialog tingMembershipInfoDialog) {
        this.f282117d = tingMembershipInfoDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View.OnClickListener onClickListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/membership/view/TingMembershipInfoDialog$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ting.membership.view.TingMembershipInfoDialog tingMembershipInfoDialog = this.f282117d;
        hl4.b bVar = tingMembershipInfoDialog.f174711z;
        if (bVar != null && (onClickListener = bVar.f282113j) != null) {
            onClickListener.onClick(view);
        }
        tingMembershipInfoDialog.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/ting/membership/view/TingMembershipInfoDialog$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
