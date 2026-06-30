package fk2;

/* loaded from: classes3.dex */
public final class y extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.g0 f263516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263518f;

    public y(fk2.g0 g0Var, java.lang.String str, java.lang.String str2) {
        this.f263516d = g0Var;
        this.f263517e = str;
        this.f263518f = str2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward$asyncLoadGiftImgSpan$1$1$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        this.f263516d.f445240a.n(this.f263517e, this.f263518f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward$asyncLoadGiftImgSpan$1$1$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
    }
}
