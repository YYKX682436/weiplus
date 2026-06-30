package r;

/* loaded from: classes16.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.SelectContactCard C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.open_voice_control.card.SelectContactCard selectContactCard) {
        super(0);
        this.C = selectContactCard;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.C.findViewById(com.tencent.mm.R.id.f487786o8);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.view.MaxHeightFrameLayout");
        return (com.tencent.mm.view.MaxHeightFrameLayout) findViewById;
    }
}
