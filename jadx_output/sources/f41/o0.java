package f41;

/* loaded from: classes11.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.SendMsgCard f259504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard) {
        super(0);
        this.f259504d = sendMsgCard;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Bundle arguments = this.f259504d.getArguments();
        return java.lang.Integer.valueOf(arguments != null ? arguments.getInt("ui_id") : 0);
    }
}
