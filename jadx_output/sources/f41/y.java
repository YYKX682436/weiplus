package f41;

/* loaded from: classes11.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.SelectContactCard f259517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.open_voice_control.card.SelectContactCard selectContactCard) {
        super(0);
        this.f259517d = selectContactCard;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f259517d.findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        return (android.widget.TextView) findViewById;
    }
}
