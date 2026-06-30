package wu2;

/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment f449673d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment mMFinderFragment) {
        super(0);
        this.f449673d = mMFinderFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment mMFinderFragment = this.f449673d;
        android.view.View view = mMFinderFragment.getView();
        androidx.fragment.app.FragmentActivity activity = mMFinderFragment.getActivity();
        if (view != null && activity != null) {
            com.tencent.mm.plugin.finder.report.j0.f125083a.g(view, activity);
        }
        return jz5.f0.f302826a;
    }
}
