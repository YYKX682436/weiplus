package f41;

/* loaded from: classes11.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.SelectContactCard f259516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.open_voice_control.card.SelectContactCard selectContactCard) {
        super(0);
        this.f259516d = selectContactCard;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rz5.a aVar = f41.n.f259501h;
        android.os.Bundle arguments = this.f259516d.getArguments();
        return (f41.n) ((rz5.c) aVar).get(arguments != null ? arguments.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) : 0);
    }
}
