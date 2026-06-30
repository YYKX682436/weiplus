package uo2;

/* loaded from: classes2.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uo2.j0 f429624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f429625e;

    public i0(uo2.j0 j0Var, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f429624d = j0Var;
        this.f429625e = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/music/FinderTopicFollowHelper$showBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uo2.j0 j0Var = this.f429624d;
        if (q75.a.a(j0Var.f429627d) != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_create_scene", 12);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).qj(j0Var.f429627d, intent);
        }
        this.f429625e.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/music/FinderTopicFollowHelper$showBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
