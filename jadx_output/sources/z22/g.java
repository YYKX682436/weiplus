package z22;

/* loaded from: classes10.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z22.h f469721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z22.l f469722e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f469723f;

    public g(z22.h hVar, z22.l lVar, android.view.View view) {
        this.f469721d = hVar;
        this.f469722e = lVar;
        this.f469723f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.p pVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f469721d.getAdapterPosition();
        z22.l lVar = this.f469722e;
        t85.d x17 = lVar.x(adapterPosition);
        if (x17 != null && (pVar = lVar.f469727e) != null) {
            pVar.invoke(java.lang.Integer.valueOf(adapterPosition), x17);
        }
        this.f469723f.requestFocus();
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
