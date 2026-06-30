package kq2;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kq2.c f311261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f311262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dd2 f311263f;

    public b(kq2.c cVar, int i17, r45.dd2 dd2Var) {
        this.f311261d = cVar;
        this.f311262e = i17;
        this.f311263f = dd2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/subtab/SubTabAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kq2.c cVar = this.f311261d;
        cVar.f311264d.l();
        int i17 = cVar.f311265e;
        cVar.f311265e = this.f311262e;
        cVar.notifyItemChanged(i17);
        cVar.notifyItemChanged(cVar.f311265e);
        iq2.d0 d0Var = cVar.f311264d;
        d0Var.getClass();
        r45.dd2 data = this.f311263f;
        kotlin.jvm.internal.o.g(data, "data");
        d0Var.k("fetchSubTabFeeds", true);
        d0Var.f293732p.clear();
        up2.h hVar = d0Var.f293734r;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
        if (d0Var.g(data.getInteger(0))) {
            d0Var.i();
        } else {
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = d0Var.f293738v;
            if (mMProcessBar == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            mMProcessBar.setVisibility(0);
            d0Var.c(0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/subtab/SubTabAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
