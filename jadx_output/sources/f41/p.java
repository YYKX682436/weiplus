package f41;

/* loaded from: classes11.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.SelectContactCard f259505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.open_voice_control.card.SelectContactCard selectContactCard) {
        super(0);
        this.f259505d = selectContactCard;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f259505d.findViewById(com.tencent.mm.R.id.ceg);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerView");
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById;
    }
}
