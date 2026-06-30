package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes3.dex */
public class v4 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI f143043d;

    public v4(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI iPCallShareCouponUI) {
        this.f143043d = iPCallShareCouponUI;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$13", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI iPCallShareCouponUI = this.f143043d;
        ((android.widget.TextView) view).setHighlightColor(iPCallShareCouponUI.getResources().getColor(com.tencent.mm.R.color.a9e));
        java.lang.String str = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=weixin_phone/notice";
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
            str = str + "&wechat_real_lang=" + f17;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        j45.l.j(iPCallShareCouponUI, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$13", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(this.f143043d.getResources().getColor(com.tencent.mm.R.color.f479308vo));
        textPaint.setUnderlineText(false);
    }
}
