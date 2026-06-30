package im2;

/* loaded from: classes3.dex */
public final class c7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC f292280d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC finderLiveVisitorUIC) {
        super(0);
        this.f292280d = finderLiveVisitorUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f292280d.getActivity().getWindow();
    }
}
