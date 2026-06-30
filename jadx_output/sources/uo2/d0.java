package uo2;

/* loaded from: classes2.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView f429607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f429608e;

    public d0(com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView finderQQMusicFollowHeaderView, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        this.f429607d = finderQQMusicFollowHeaderView;
        this.f429608e = finderObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/music/FinderQQMusicFollowHeaderView$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uo2.j0 j0Var = this.f429607d.f121447i;
        if (j0Var == null) {
            kotlin.jvm.internal.o.o("topicFollowHelper");
            throw null;
        }
        j0Var.a(this.f429608e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/music/FinderQQMusicFollowHeaderView$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
