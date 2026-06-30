package e45;

/* loaded from: classes8.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e45.r f249414d;

    public o(e45.r rVar) {
        this.f249414d = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        e45.i iVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/FileSelectorBottomBarUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        e45.r rVar = this.f249414d;
        com.tencent.mm.ui.widget.button.WeButton weButton = rVar.f249418e;
        boolean z17 = false;
        if (weButton != null && weButton.isEnabled()) {
            z17 = true;
        }
        if (z17 && (iVar = rVar.f249425o) != null) {
            com.tencent.mm.pluginsdk.ui.tools.o1 o1Var = com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.I;
            ((com.tencent.mm.pluginsdk.ui.tools.x2) iVar).f191977a.W6();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/FileSelectorBottomBarUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
