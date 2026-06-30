package qg5;

/* loaded from: classes8.dex */
public final class y3 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.a4 f363268d;

    public y3(qg5.a4 a4Var) {
        this.f363268d = a4Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/feature/api/YuanBaoCopyChatRecordsTosDialog$createTosLink$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        qg5.a4 a4Var = this.f363268d;
        a4Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/q7p0eWsNfnmqsfYh");
        intent.putExtra("hide_option_menu", true);
        j45.l.j(a4Var.f362907a, "webview", ".ui.tools.WebViewUI", intent, null);
        ((qg5.e3) a4Var.a()).uj(3);
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoCopyChatRecordsTosDialog", "TOS link clicked");
        yj0.a.h(this, "com/tencent/mm/ui/feature/api/YuanBaoCopyChatRecordsTosDialog$createTosLink$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setColor(b3.l.getColor(this.f363268d.f362907a, com.tencent.mm.R.color.Link_100));
        ds6.setUnderlineText(false);
    }
}
