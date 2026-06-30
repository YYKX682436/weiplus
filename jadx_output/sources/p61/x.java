package p61;

/* loaded from: classes14.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI f352407d;

    public x(com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI bindLinkedInUI) {
        this.f352407d = bindLinkedInUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI bindLinkedInUI = this.f352407d;
        if (!bindLinkedInUI.f72945h) {
            bindLinkedInUI.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", "http://www.linkedin.com/bind/plugin/");
            intent.putExtra("geta8key_username", c01.z1.r());
            if (bindLinkedInUI.f72946i) {
                intent.putExtra("geta8key_scene", 3);
            } else {
                intent.putExtra("geta8key_scene", 8);
            }
            j45.l.n(bindLinkedInUI, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, 100);
        } else if (bindLinkedInUI.f72941d) {
            db5.e1.u(bindLinkedInUI, bindLinkedInUI.getString(com.tencent.mm.R.string.bee), null, new p61.v(this), new p61.w(this));
        } else {
            bindLinkedInUI.T6(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
