package eu3;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eu3.c f256819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f256820e;

    public b(eu3.c cVar, int i17) {
        this.f256819d = cVar;
        this.f256820e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/improve_photo/adapter/ImproveEditPhotoBrushListAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        eu3.c cVar = this.f256819d;
        int i17 = cVar.f256822e;
        int i18 = this.f256820e;
        if (i17 == i18) {
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/adapter/ImproveEditPhotoBrushListAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoBrushListAdapter", "setOnClickListener >> " + cVar.f256822e + ", " + i18);
        android.view.View view2 = cVar.f256823f;
        if (view2 != null) {
            cVar.x(view2, 1.0f);
        }
        kotlin.jvm.internal.o.d(view);
        cVar.x(view, 1.4f);
        cVar.f256823f = view;
        cVar.f256822e = i18;
        yz5.p pVar = cVar.f256825h;
        if (pVar != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
            java.lang.Object obj = cVar.f256821d.get(i18);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            pVar.invoke(valueOf, obj);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/adapter/ImproveEditPhotoBrushListAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
