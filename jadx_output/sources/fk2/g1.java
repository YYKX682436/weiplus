package fk2;

/* loaded from: classes3.dex */
public final class g1 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.h1 f263393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263394e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263395f;

    public g1(fk2.h1 h1Var, java.lang.String str, android.content.Context context) {
        this.f263393d = h1Var;
        this.f263394e = str;
        this.f263395f = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemJoinFansClub$getNickNameClickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        this.f263393d.f445240a.c(this.f263394e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemJoinFansClub$getNickNameClickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f263395f.getResources().getColor(com.tencent.mm.R.color.f479222ta));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
