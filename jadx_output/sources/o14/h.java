package o14;

/* loaded from: classes.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI f342278d;

    public h(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI fixToolsFileListUI) {
        this.f342278d = fixToolsFileListUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI fixToolsFileListUI = this.f342278d;
        int i17 = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI.f160063e;
        fixToolsFileListUI.getClass();
        android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(fixToolsFileListUI, fixToolsFileListUI.getString(com.tencent.mm.R.string.f490573yv), fixToolsFileListUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new o14.l(cancellationSignal));
        ((ku5.t0) ku5.t0.f312615d).a(new o14.k(cancellationSignal, Q, fixToolsFileListUI));
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
