package o14;

/* loaded from: classes5.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUpLogUploadingUI f342298d;

    public r(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUpLogUploadingUI fixToolsUpLogUploadingUI) {
        this.f342298d = fixToolsUpLogUploadingUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUpLogUploadingUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUpLogUploadingUI fixToolsUpLogUploadingUI = this.f342298d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(fixToolsUpLogUploadingUI);
        u1Var.g(fixToolsUpLogUploadingUI.getResources().getString(com.tencent.mm.R.string.fa_));
        u1Var.m(com.tencent.mm.R.string.f490608zu);
        u1Var.l(new o14.q(this));
        u1Var.j(fixToolsUpLogUploadingUI.getResources().getString(com.tencent.mm.R.string.f490503wx));
        u1Var.i(new o14.p(this));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUpLogUploadingUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
