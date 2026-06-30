package go2;

/* loaded from: classes2.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.z f274081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f274082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f274083f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f274084g;

    public y(go2.z zVar, int i17, int i18, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f274081d = zVar;
        this.f274082e = i17;
        this.f274083f = i18;
        this.f274084g = finderItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC$updateCurLive$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        go2.z zVar = this.f274081d;
        if (((r45.tr0) zVar.f452719d) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC$updateCurLive$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = zVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).getClass();
        int i17 = this.f274082e;
        if (i17 <= 0) {
            i17 = this.f274083f;
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Jk(zVar.getContext(), this.f274084g, i17, "204");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC$updateCurLive$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
