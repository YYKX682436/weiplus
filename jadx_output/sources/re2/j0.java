package re2;

/* loaded from: classes3.dex */
public final class j0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI f394436d;

    public j0(com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI finderLiveCoLiveInvitationConfirmUI) {
        this.f394436d = finderLiveCoLiveInvitationConfirmUI;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationConfirmUI$initDescSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mars.xlog.Log.i("Finder.CoLiveInvitationConfirmUI", "learn more clicked");
        re2.g0.a(this.f394436d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationConfirmUI$initDescSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f394436d.getResources().getColor(com.tencent.mm.R.color.f479308vo));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
