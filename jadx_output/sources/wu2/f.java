package wu2;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment f449679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment finderBaseGridFeedFragment) {
        super(0);
        this.f449679d = finderBaseGridFeedFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.fragment.app.FragmentActivity activity = this.f449679d.getActivity();
        kotlin.jvm.internal.o.d(activity);
        return (com.tencent.mm.ui.MMActivity) activity;
    }
}
