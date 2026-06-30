package qg5;

/* loaded from: classes8.dex */
public final class j extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.p f363023d;

    public j(qg5.p pVar) {
        this.f363023d = pVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/feature/api/ChatRecordsAnalyzeStagingDialog$createTosLink$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        qg5.p pVar = this.f363023d;
        java.lang.String str = ((com.tencent.mm.feature.yuanbao.IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo) ((jz5.n) pVar.f363127i).getValue()).f67867f;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(pVar.f363119a, "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsAnalyzeStagingDialog", "TOS link clicked");
        qg5.p.a(pVar, 5, pVar.b());
        yj0.a.h(this, "com/tencent/mm/ui/feature/api/ChatRecordsAnalyzeStagingDialog$createTosLink$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setColor(b3.l.getColor(this.f363023d.f363119a, com.tencent.mm.R.color.Link_100));
        ds6.setUnderlineText(false);
    }
}
