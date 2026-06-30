package f41;

/* loaded from: classes11.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.SendMsgCard f259467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard) {
        super(0);
        this.f259467d = sendMsgCard;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f259467d.findViewById(com.tencent.mm.R.id.a_4);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        return (android.widget.ImageView) findViewById;
    }
}
