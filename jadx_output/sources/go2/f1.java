package go2;

/* loaded from: classes2.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.area.uic.FinderMemberVideoTabContentUIC f273978d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.finder.member.area.uic.FinderMemberVideoTabContentUIC finderMemberVideoTabContentUIC) {
        super(0);
        this.f273978d = finderMemberVideoTabContentUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.member.area.uic.FinderMemberVideoTabContentUIC finderMemberVideoTabContentUIC = this.f273978d;
        androidx.appcompat.app.AppCompatActivity activity = finderMemberVideoTabContentUIC.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return new com.tencent.mm.plugin.finder.feed.vl((com.tencent.mm.ui.MMActivity) activity, 2, 204, (com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader) ((jz5.n) finderMemberVideoTabContentUIC.f121126p).getValue(), kotlin.jvm.internal.o.b(xy2.c.e(finderMemberVideoTabContentUIC.getContext()), finderMemberVideoTabContentUIC.f121117d), finderMemberVideoTabContentUIC.f121119f);
    }
}
