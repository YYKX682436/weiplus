package z83;

/* loaded from: classes.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI f470733d;

    public c(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
        this.f470733d = kidsWatchRegGetInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI.f143139t;
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f470733d;
        kidsWatchRegGetInfoUI.getClass();
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ui(kidsWatchRegGetInfoUI);
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
