package ls1;

/* loaded from: classes8.dex */
public final class l0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI f321000d;

    public l0(com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI tmplWebViewToolUI) {
        this.f321000d = tmplWebViewToolUI;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.lang.String str;
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewToolUI$onResetAfterCreate$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int i17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI.G3;
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI tmplWebViewToolUI = this.f321000d;
        tmplWebViewToolUI.getClass();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(tmplWebViewToolUI);
        j0Var.setTitle("Debug Info");
        ls1.e0 e0Var = tmplWebViewToolUI.E3;
        if (e0Var != null) {
            if (e0Var.P1.f94291l0 || tmplWebViewToolUI.m9()) {
                str = "isFastLoad = false\n";
            } else {
                str = "isFastLoad = true\nisUseCachedData = " + e0Var.U1 + '\n';
            }
            f0Var = jz5.f0.f302826a;
        } else {
            str = "";
            f0Var = null;
        }
        if (f0Var == null) {
            str = str + "isFastLoad = false\n";
        }
        j0Var.t((str + "Pkg Info：\n") + is1.l.f294423a.g());
        android.widget.TextView textView = j0Var.f211833n;
        if (textView != null) {
            textView.setGravity(3);
        }
        j0Var.C(3);
        j0Var.A(tmplWebViewToolUI.getString(com.tencent.mm.R.string.f492294fz1), true, null);
        j0Var.show();
        yj0.a.i(true, this, "com/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewToolUI$onResetAfterCreate$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
