package f41;

/* loaded from: classes11.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.SelectContactCard f259518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.open_voice_control.card.SelectContactCard selectContactCard) {
        super(0);
        this.f259518d = selectContactCard;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Bundle arguments = this.f259518d.getArguments();
        return java.lang.Integer.valueOf(arguments != null ? arguments.getInt("ui_id") : 0);
    }
}
