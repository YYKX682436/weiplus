package su3;

/* loaded from: classes5.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su3.f f412778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ su3.m f412779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f412780f;

    public e(su3.f fVar, su3.m mVar, android.view.View view) {
        this.f412778d = fVar;
        this.f412779e = mVar;
        this.f412780f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.p pVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/adapter/RecommendMusicAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f412778d.getAdapterPosition();
        su3.m mVar = this.f412779e;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo x17 = mVar.x(adapterPosition);
        if (x17 != null && (pVar = mVar.f412801o) != null) {
            pVar.invoke(java.lang.Integer.valueOf(adapterPosition), x17);
        }
        this.f412780f.requestFocus();
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/adapter/RecommendMusicAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
