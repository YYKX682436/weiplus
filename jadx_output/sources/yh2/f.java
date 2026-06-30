package yh2;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yh2.h f462383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yh2.b f462384e;

    public f(yh2.h hVar, yh2.b bVar) {
        this.f462383d = hVar;
        this.f462384e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/adapter/FinderLiveMicMemberLinearAdapter$bindMember$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f462383d.f462396r;
        if (lVar != null) {
            lVar.invoke(this.f462384e.f462367a);
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Xj(ml2.r3.f327900e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/adapter/FinderLiveMicMemberLinearAdapter$bindMember$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
