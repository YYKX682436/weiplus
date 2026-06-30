package mm3;

/* loaded from: classes10.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm3.w f329668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm3.b f329669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm3.q f329670f;

    public p(mm3.w wVar, fm3.b bVar, mm3.q qVar) {
        this.f329668d = wVar;
        this.f329669e = bVar;
        this.f329670f = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mm3.w wVar = this.f329668d;
        wVar.E(false);
        fm3.b bVar = this.f329669e;
        wVar.f329681r = bVar != null ? bVar.f264028a : null;
        mm3.q qVar = this.f329670f;
        qVar.notifyItemRangeChanged(0, qVar.getItemCount());
        wVar.f329679p.invoke(bVar, java.lang.Boolean.FALSE);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
