package ey4;

/* loaded from: classes4.dex */
public class p implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter f257627d;

    public p(com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter) {
        this.f257627d = webViewRedesignInputFooter;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter = this.f257627d;
        if (webViewRedesignInputFooter.f187300o.getText() == null) {
            return;
        }
        webViewRedesignInputFooter.f187300o.requestFocus();
        boolean z17 = editable.length() > 0 && editable.toString().trim().length() > 0;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(webViewRedesignInputFooter.getContext(), com.tencent.mm.R.anim.f477843d1);
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(webViewRedesignInputFooter.getContext(), com.tencent.mm.R.anim.f477848d6);
        loadAnimation.setDuration(150L);
        loadAnimation2.setDuration(150L);
        android.widget.Button button = webViewRedesignInputFooter.f187298m;
        if (button == null || webViewRedesignInputFooter.f187299n == null) {
            return;
        }
        if (z17) {
            if (button.getVisibility() == 8 || webViewRedesignInputFooter.f187298m.getVisibility() == 4) {
                return;
            }
            webViewRedesignInputFooter.f187299n.startAnimation(loadAnimation);
            webViewRedesignInputFooter.f187299n.setVisibility(0);
            webViewRedesignInputFooter.f187298m.startAnimation(loadAnimation2);
            webViewRedesignInputFooter.f187298m.setVisibility(8);
        } else {
            if (button.getVisibility() == 0 || webViewRedesignInputFooter.f187298m.getVisibility() == 0) {
                return;
            }
            webViewRedesignInputFooter.f187298m.startAnimation(loadAnimation);
            webViewRedesignInputFooter.f187298m.setVisibility(0);
            webViewRedesignInputFooter.f187299n.startAnimation(loadAnimation2);
            webViewRedesignInputFooter.f187299n.setVisibility(8);
        }
        webViewRedesignInputFooter.f187299n.getParent().requestLayout();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
