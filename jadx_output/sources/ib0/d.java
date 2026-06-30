package ib0;

/* loaded from: classes3.dex */
public final class d extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290028d;

    public d(android.content.Context context) {
        this.f290028d = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openmsg/ui/OpenMsgFunctionTipHelper$showFunctionTips$cs$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        ib0.e eVar = ib0.e.f290029a;
        android.content.Context context = this.f290028d;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/5ovo5GKYRLqp7KJZ");
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgFunctionTipHelper", "showFunctionTips onClick");
        yj0.a.h(this, "com/tencent/mm/feature/openmsg/ui/OpenMsgFunctionTipHelper$showFunctionTips$cs$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setColor(this.f290028d.getColor(com.tencent.mm.R.color.Link_100));
        ds6.setUnderlineText(false);
    }
}
