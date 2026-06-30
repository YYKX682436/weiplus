package sa2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.topic.fragment.FinderActivityTabParentFragment f405298d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.finder.activity.topic.fragment.FinderActivityTabParentFragment finderActivityTabParentFragment) {
        super(0);
        this.f405298d = finderActivityTabParentFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f405298d.getView();
        if (view != null) {
            return (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.ohb);
        }
        return null;
    }
}
