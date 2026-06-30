package pk2;

/* loaded from: classes3.dex */
public final class n extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o f356020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f356021e;

    public n(pk2.o oVar, android.content.Context context) {
        this.f356020d = oVar;
        this.f356021e = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorAskProductionOption$initSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mars.xlog.Log.i(this.f356020d.f356047i, "click link");
        i95.m c17 = i95.n0.c(zg0.u2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) zg0.u2.K2((zg0.u2) c17, this.f356021e, "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/ADF5pXCh5YWMlSlo", null, new com.tencent.mm.plugin.webview.ui.tools.widget.n1(0.0f, 0.0f, null, false, false, 0, false, false, 0, false, false, 0, false, false, false, null, false, 0, false, 0, false, false, false, 8388591, null), 4, null)).show();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAskProductionOption$initSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f356021e.getResources().getColor(com.tencent.mm.R.color.f479308vo));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
