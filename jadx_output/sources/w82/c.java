package w82;

/* loaded from: classes8.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w82.d f443827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f443828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w82.l f443829f;

    public c(w82.d dVar, int i17, w82.l lVar) {
        this.f443827d = dVar;
        this.f443828e = i17;
        this.f443829f = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavCleanOptionAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        w82.d dVar = this.f443827d;
        int i17 = dVar.f443835f;
        dVar.f443835f = this.f443828e;
        if (i17 != -1) {
            dVar.notifyItemChanged(i17);
        }
        dVar.notifyItemChanged(dVar.f443835f);
        dVar.f443834e.invoke(this.f443829f);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavCleanOptionAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
