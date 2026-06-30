package fk2;

/* loaded from: classes3.dex */
public final class d0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.g0 f263341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263343f;

    public d0(fk2.g0 g0Var, java.lang.String str, android.content.Context context) {
        this.f263341d = g0Var;
        this.f263342e = str;
        this.f263343f = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward$getNickNameClickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        this.f263341d.f445240a.c(this.f263342e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward$getNickNameClickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f263343f.getResources().getColor(com.tencent.mm.R.color.f479222ta));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
