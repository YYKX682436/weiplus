package r;

/* loaded from: classes16.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.SendMsgCard C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard) {
        super(0);
        this.C = sendMsgCard;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.C.findViewById(com.tencent.mm.R.id.gtf);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.view.View");
        return findViewById;
    }
}
