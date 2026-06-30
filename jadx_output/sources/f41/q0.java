package f41;

/* loaded from: classes11.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.SendMsgCard f259509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard) {
        super(0);
        this.f259509d = sendMsgCard;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String string;
        android.os.Bundle arguments = this.f259509d.getArguments();
        return (arguments == null || (string = arguments.getString(dm.i4.COL_USERNAME)) == null) ? "" : string;
    }
}
