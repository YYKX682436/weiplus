package lo2;

/* loaded from: classes8.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI f320173d;

    public v(com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI finderMemberQAVideoUI) {
        this.f320173d = finderMemberQAVideoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/ui/FinderMemberQAVideoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI finderMemberQAVideoUI = this.f320173d;
        finderMemberQAVideoUI.setTitleVisibility(finderMemberQAVideoUI.B ? 8 : 0);
        finderMemberQAVideoUI.B = !finderMemberQAVideoUI.B;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/ui/FinderMemberQAVideoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
