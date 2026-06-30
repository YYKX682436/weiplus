package cw3;

/* loaded from: classes10.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw3.m f224176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f224177e;

    public l(cw3.m mVar, int i17) {
        this.f224176d = mVar;
        this.f224177e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/view/EditorTextColorAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cw3.m mVar = this.f224176d;
        int i17 = mVar.f224179e;
        int i18 = this.f224177e;
        if (i17 == i18) {
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/view/EditorTextColorAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorTextColorAdapter", "setOnClickListener >> " + mVar.f224179e + ", " + i18);
        android.view.View view2 = mVar.f224180f;
        if (view2 != null) {
            cw3.m.x(mVar, view2, 1.0f);
        }
        kotlin.jvm.internal.o.d(view);
        cw3.m.x(mVar, view, 1.4f);
        mVar.f224180f = view;
        mVar.f224179e = i18;
        cw3.o oVar = mVar.f224182h;
        if (oVar != null) {
            cw3.q qVar = ((cw3.p) oVar).f224185a;
            java.util.Iterator it = qVar.f224188c.iterator();
            int i19 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (i19 == i18) {
                    qVar.f224187b = i18;
                    yz5.l lVar = qVar.f224190e;
                    if (lVar != null) {
                        lVar.invoke(java.lang.Integer.valueOf(i18));
                    }
                }
                i19 = i27;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/view/EditorTextColorAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
