package xl1;

/* loaded from: classes5.dex */
public class c implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView f455103d;

    public c(com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView editVerifyCodeView) {
        this.f455103d = editVerifyCodeView;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/sms/EditVerifyCodeView$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (i17 != 67 || keyEvent.getAction() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/appbrand/widget/sms/EditVerifyCodeView$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView editVerifyCodeView = this.f455103d;
        java.lang.StringBuilder sb6 = editVerifyCodeView.f92104d;
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVerifyCodeView", "del before str:" + ((java.lang.Object) sb6));
        int length = sb7.length();
        if (length != 0) {
            if (length > 0 && length <= 6) {
                int i18 = length - 1;
                sb6.delete(i18, length);
                android.widget.TextView[] textViewArr = editVerifyCodeView.f92106f;
                textViewArr[i18].setVisibility(4);
                textViewArr[i18].setText("");
                editVerifyCodeView.f92105e[i18].setVisibility(0);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.EditVerifyCodeView", "del after str:" + ((java.lang.Object) sb6));
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/widget/sms/EditVerifyCodeView$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return true;
    }
}
