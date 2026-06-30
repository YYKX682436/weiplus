package go2;

/* loaded from: classes2.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.area.uic.FinderMemberVideoTabContentUIC f273971d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.finder.member.area.uic.FinderMemberVideoTabContentUIC finderMemberVideoTabContentUIC) {
        super(0);
        this.f273971d = finderMemberVideoTabContentUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.member.area.uic.FinderMemberVideoTabContentUIC finderMemberVideoTabContentUIC = this.f273971d;
        androidx.appcompat.app.AppCompatActivity activity = finderMemberVideoTabContentUIC.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        return new com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), finderMemberVideoTabContentUIC.f121117d, finderMemberVideoTabContentUIC.f121118e, null, finderMemberVideoTabContentUIC.f121119f);
    }
}
