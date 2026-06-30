package qg5;

/* loaded from: classes3.dex */
public final class v4 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.w4 f363225d;

    public v4(qg5.w4 w4Var) {
        this.f363225d = w4Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/feature/api/YuanBaoForwardChatRecordsTosDialog$createTosLink$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        qg5.w4 w4Var = this.f363225d;
        w4Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/UMjyguwHdpGtTEms");
        intent.putExtra("hide_option_menu", true);
        j45.l.j(w4Var.f363245a, "webview", ".ui.tools.WebViewUI", intent, null);
        qg5.w4.a(w4Var, 3);
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoForwardChatRecordsTosDialog", "TOS link clicked");
        yj0.a.h(this, "com/tencent/mm/ui/feature/api/YuanBaoForwardChatRecordsTosDialog$createTosLink$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setColor(b3.l.getColor(this.f363225d.f363245a, com.tencent.mm.R.color.Link_100));
        ds6.setUnderlineText(false);
    }
}
