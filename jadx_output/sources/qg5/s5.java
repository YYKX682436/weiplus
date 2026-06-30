package qg5;

/* loaded from: classes3.dex */
public final class s5 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.v5 f363178d;

    public s5(qg5.v5 v5Var) {
        this.f363178d = v5Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/feature/api/YuanBaoSummarizeTosDialog$createTosLink$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        qg5.v5 v5Var = this.f363178d;
        v5Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/3orQTOzd9I4Qx5gh");
        intent.putExtra("hide_option_menu", true);
        j45.l.j(v5Var.f363226a, "webview", ".ui.tools.WebViewUI", intent, null);
        qg5.v5.a(v5Var, 3);
        com.tencent.mars.xlog.Log.i("YuanBaoSummarizeTosDialog", "TOS link clicked");
        yj0.a.h(this, "com/tencent/mm/ui/feature/api/YuanBaoSummarizeTosDialog$createTosLink$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setColor(b3.l.getColor(this.f363178d.f363226a, com.tencent.mm.R.color.Link_100));
        ds6.setUnderlineText(false);
    }
}
