package fk2;

/* loaded from: classes3.dex */
public final class m1 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMNeat7extView f263432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f263433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.f0 f263434f;

    public m1(com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, yz5.a aVar, com.tencent.mm.pluginsdk.ui.span.f0 f0Var) {
        this.f263432d = mMNeat7extView;
        this.f263433e = aVar;
        this.f263434f = f0Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLikeNotify$Companion$setTextWithEllipsize$ellipsizeStrWithEndText$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = this.f263434f;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f263432d;
        mMNeat7extView.post(new fk2.l1(mMNeat7extView, f0Var));
        yz5.a aVar = this.f263433e;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLikeNotify$Companion$setTextWithEllipsize$ellipsizeStrWithEndText$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setUnderlineText(false);
        ds6.setColor(this.f263432d.getContext().getResources().getColor(com.tencent.mm.R.color.f479049ak4));
    }
}
