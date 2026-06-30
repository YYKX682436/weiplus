package fk2;

/* loaded from: classes3.dex */
public final class k2 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f263418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fk2.l2 f263419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263420f;

    public k2(dk2.zf zfVar, fk2.l2 l2Var, android.content.Context context) {
        this.f263418d = zfVar;
        this.f263419e = l2Var;
        this.f263420f = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemRecvRedPacket$onBindRecvLuckyMoneyMsg$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        dk2.zf zfVar = this.f263418d;
        if (zfVar instanceof dk2.ka) {
            java.lang.Object D = zfVar.D();
            kotlin.jvm.internal.o.e(D, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveAppMsgRecvRedPacketInfo");
            java.lang.String string = ((r45.vj1) D).getString(0);
            if (string != null) {
                this.f263419e.q(this.f263420f, string);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemRecvRedPacket$onBindRecvLuckyMoneyMsg$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f263420f.getResources().getColor(com.tencent.mm.R.color.f479050od));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
