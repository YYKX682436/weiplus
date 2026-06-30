package zf2;

/* loaded from: classes3.dex */
public final class d extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf2.e f472632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f472633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ze2 f472634f;

    public d(zf2.e eVar, android.content.Context context, r45.ze2 ze2Var) {
        this.f472632d = eVar;
        this.f472633e = context;
        this.f472634f = ze2Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/LocationCommentConvert$setPoiIconSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        zf2.e.n(this.f472632d, this.f472633e, this.f472634f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/LocationCommentConvert$setPoiIconSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
    }
}
