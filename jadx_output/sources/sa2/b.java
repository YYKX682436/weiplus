package sa2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.topic.fragment.FinderActivityTabParentFragment f405297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.finder.activity.topic.fragment.FinderActivityTabParentFragment finderActivityTabParentFragment) {
        super(0);
        this.f405297d = finderActivityTabParentFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.fragment.app.FragmentActivity activity = this.f405297d.getActivity();
        if (activity != null) {
            return (android.widget.FrameLayout) activity.findViewById(com.tencent.mm.R.id.ohb);
        }
        return null;
    }
}
