package z83;

/* loaded from: classes14.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI f470742d;

    public j(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
        this.f470742d = kidsWatchRegGetInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "click reg button");
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f470742d;
        java.lang.String string = kidsWatchRegGetInfoUI.getString(com.tencent.mm.R.string.f490573yv);
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI2 = this.f470742d;
        kidsWatchRegGetInfoUI.f143150q = db5.e1.Q(kidsWatchRegGetInfoUI, string, kidsWatchRegGetInfoUI2.getString(com.tencent.mm.R.string.f490604zq), true, true, null);
        ck5.f b17 = ck5.f.b(kidsWatchRegGetInfoUI2.T6().f444002n);
        b17.f42561f = 1;
        b17.f42560e = 32;
        b17.f42556a = true;
        b17.d(new z83.i(kidsWatchRegGetInfoUI2));
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
