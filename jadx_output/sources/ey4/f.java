package ey4;

/* loaded from: classes4.dex */
public class f implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter f257620d;

    public f(com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter) {
        this.f257620d = webViewInputFooter;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter = this.f257620d;
        if (webViewInputFooter.f187285o.getText() == null) {
            return;
        }
        webViewInputFooter.f187285o.requestFocus();
        boolean z17 = editable.length() > 0 && editable.toString().trim().length() > 0;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(webViewInputFooter.getContext(), com.tencent.mm.R.anim.f477843d1);
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(webViewInputFooter.getContext(), com.tencent.mm.R.anim.f477848d6);
        loadAnimation.setDuration(150L);
        loadAnimation2.setDuration(150L);
        android.view.View view = webViewInputFooter.f187283m;
        if (view == null || webViewInputFooter.f187284n == null) {
            return;
        }
        if (z17) {
            if (view.getVisibility() == 8 || webViewInputFooter.f187283m.getVisibility() == 4) {
                return;
            }
            webViewInputFooter.f187284n.startAnimation(loadAnimation);
            android.view.View view2 = webViewInputFooter.f187284n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            webViewInputFooter.f187283m.startAnimation(loadAnimation2);
            android.view.View view3 = webViewInputFooter.f187283m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            if (view.getVisibility() == 0 || webViewInputFooter.f187283m.getVisibility() == 0) {
                return;
            }
            webViewInputFooter.f187283m.startAnimation(loadAnimation);
            android.view.View view4 = webViewInputFooter.f187283m;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            webViewInputFooter.f187284n.startAnimation(loadAnimation2);
            android.view.View view5 = webViewInputFooter.f187284n;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter", "canSend", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        webViewInputFooter.f187284n.getParent().requestLayout();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
