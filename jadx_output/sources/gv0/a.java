package gv0;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gv0.c f275968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gv0.b f275969e;

    public a(gv0.c cVar, gv0.b bVar) {
        this.f275968d = cVar;
        this.f275969e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/adapter/BaseDataCallbackAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f275968d.getAdapterPosition();
        if (adapterPosition != -1) {
            gv0.b bVar = this.f275969e;
            java.lang.Object obj = bVar.f275970d.get(adapterPosition);
            bVar.getClass();
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            long j17 = bVar.f275972f;
            if (j17 <= 0 || uptimeMillis - bVar.f275973g >= j17) {
                bVar.f275973g = uptimeMillis;
                bVar.f275971e.invoke(java.lang.Integer.valueOf(adapterPosition), obj);
            }
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/adapter/BaseDataCallbackAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
