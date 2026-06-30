package hd2;

/* loaded from: classes2.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment f280497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280498e;

    public m0(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment, android.content.Context context) {
        this.f280497d = finderProfileCardFragment;
        this.f280498e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onNormalOrAbnormal$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f280497d.r0(this.f280498e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onNormalOrAbnormal$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
