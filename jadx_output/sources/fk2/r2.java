package fk2;

/* loaded from: classes3.dex */
public final class r2 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f263466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fk2.s2 f263467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263468f;

    public r2(dk2.zf zfVar, fk2.s2 s2Var, android.content.Context context) {
        this.f263466d = zfVar;
        this.f263467e = s2Var;
        this.f263468f = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemSendRedPacket$onBindSendLuckyMoneyMsg$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        dk2.zf zfVar = this.f263466d;
        if (zfVar instanceof dk2.la) {
            java.lang.Object D = zfVar.D();
            kotlin.jvm.internal.o.e(D, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveAppMsgSendRedPacketInfo");
            java.lang.String string = ((r45.ak1) D).getString(0);
            if (string != null) {
                this.f263467e.q(this.f263468f, string);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemSendRedPacket$onBindSendLuckyMoneyMsg$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f263468f.getResources().getColor(com.tencent.mm.R.color.f479050od));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
