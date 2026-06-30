package z22;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z22.d f469712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z22.f f469713e;

    public c(z22.d dVar, z22.f fVar) {
        this.f469712d = dVar;
        this.f469713e = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.p pVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/adapter/MoreStickerAdapter$StickerViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f469712d.getAdapterPosition();
        z22.f fVar = this.f469713e;
        t85.d dVar = (t85.d) kz5.n0.a0(fVar.f469717d, adapterPosition);
        if (dVar != null && (pVar = fVar.f469719f) != null) {
            pVar.invoke(java.lang.Integer.valueOf(adapterPosition), dVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/adapter/MoreStickerAdapter$StickerViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
