package fk2;

/* loaded from: classes3.dex */
public final class f1 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.h1 f263379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263380e;

    public f1(fk2.h1 h1Var, android.content.Context context) {
        this.f263379d = h1Var;
        this.f263380e = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemJoinFansClub$getFansClubClickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Lj((ml2.r0) c17, ml2.j4.f327628x, null, null, 6, null);
        this.f263379d.f445240a.j();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemJoinFansClub$getFansClubClickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f263380e.getResources().getColor(com.tencent.mm.R.color.f479049ak4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
