package r;

/* loaded from: classes16.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.LoadingCard C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.open_voice_control.card.LoadingCard loadingCard) {
        super(0);
        this.C = loadingCard;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Bundle arguments = this.C.getArguments();
        return java.lang.Integer.valueOf(arguments != null ? arguments.getInt("ui_id") : 0);
    }
}
