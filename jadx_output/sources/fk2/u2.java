package fk2;

/* loaded from: classes3.dex */
public final class u2 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fk2.v2 f263493e;

    public u2(android.content.Context context, fk2.v2 v2Var) {
        this.f263492d = context;
        this.f263493e = v2Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemShopMsgAnchorTips$initSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        zl2.r4.f473950a.G(this.f263492d, this.f263493e.f263501m);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemShopMsgAnchorTips$initSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f263492d.getResources().getColor(com.tencent.mm.R.color.f479049ak4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
