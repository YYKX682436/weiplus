package hk2;

/* loaded from: classes3.dex */
public final class h extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ we2.a f281900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281902f;

    public h(java.lang.String str, we2.a aVar, java.lang.String str2) {
        this.f281901e = str;
        this.f281900d = aVar;
        this.f281902f = str2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemGift$fillItem$userMessage$2$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.h5 h5Var = ml2.h5.f327542z;
        java.lang.String str = this.f281901e;
        r0Var.Wj(h5Var, str, 0);
        this.f281900d.n(str, this.f281902f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemGift$fillItem$userMessage$2$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479049ak4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
