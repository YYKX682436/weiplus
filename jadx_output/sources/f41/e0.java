package f41;

/* loaded from: classes11.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.SendMsgCard f259478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard) {
        super(0);
        this.f259478d = sendMsgCard;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f259478d.findViewById(com.tencent.mm.R.id.sxq);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        return (android.widget.LinearLayout) findViewById;
    }
}
