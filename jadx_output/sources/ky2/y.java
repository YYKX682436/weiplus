package ky2;

/* loaded from: classes.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky2.z f313601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f313602e;

    public y(ky2.z zVar, int i17) {
        this.f313601d = zVar;
        this.f313602e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteHistoryAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ky2.z zVar = this.f313601d;
        yz5.l lVar = zVar.f313604e;
        if (lVar != null) {
            java.lang.Object obj = zVar.f313603d.get(this.f313602e);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            lVar.invoke(obj);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteHistoryAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
