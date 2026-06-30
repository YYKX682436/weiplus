package qw2;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qw2.c f367114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qw2.f f367115e;

    public b(qw2.c cVar, qw2.f fVar) {
        this.f367114d = cVar;
        this.f367115e = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.p pVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f367114d.getAdapterPosition();
        qw2.f fVar = this.f367115e;
        t85.d dVar = (t85.d) kz5.n0.a0(fVar.f367121d, adapterPosition);
        if (dVar != null && (pVar = fVar.f367125h) != null) {
            pVar.invoke(java.lang.Integer.valueOf(adapterPosition), dVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
