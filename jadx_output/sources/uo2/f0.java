package uo2;

/* loaded from: classes2.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView f429615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f429616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.zi2 f429617f;

    public f0(com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView finderQQMusicFollowHeaderView, com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.zi2 zi2Var) {
        this.f429615d = finderQQMusicFollowHeaderView;
        this.f429616e = finderObject;
        this.f429617f = zi2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/music/FinderQQMusicFollowHeaderView$refreshView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView.f121441n;
        this.f429615d.c(this.f429616e, this.f429617f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/music/FinderQQMusicFollowHeaderView$refreshView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
