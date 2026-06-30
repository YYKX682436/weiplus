package hk2;

/* loaded from: classes3.dex */
public final class g extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f281894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281896f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f281897g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281898h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281899i;

    public g(gk2.e eVar, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4) {
        this.f281894d = eVar;
        this.f281895e = str;
        this.f281896f = str2;
        this.f281897g = i17;
        this.f281898h = str3;
        this.f281899i = str4;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemGift$fillItem$userMessage$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        gk2.e eVar = this.f281894d;
        boolean z17 = ((mm2.m6) eVar.a(mm2.m6.class)).f329248p;
        fk2.x xVar = fk2.g0.f263390m;
        dk2.ef efVar = dk2.ef.f233372a;
        xVar.a(dk2.ef.f233384g, this.f281895e, this.f281896f, this.f281897g, z17);
        ((mm2.m6) eVar.a(mm2.m6.class)).f329244i.postValue(new mm2.j7(this.f281898h, this.f281899i));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemGift$fillItem$userMessage$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479049ak4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
