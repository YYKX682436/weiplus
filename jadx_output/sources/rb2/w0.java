package rb2;

/* loaded from: classes10.dex */
public final class w0 implements android.widget.AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.AdapterView.OnItemSelectedListener f393805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rb2.y0 f393806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393807f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView f393808g;

    public w0(rb2.y0 y0Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView) {
        this.f393806e = y0Var;
        this.f393807f = s0Var;
        this.f393808g = finderCommentImageGalleryView;
        if (!android.widget.AdapterView.OnItemSelectedListener.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(android.widget.AdapterView.OnItemSelectedListener.class.getClassLoader(), new java.lang.Class[]{android.widget.AdapterView.OnItemSelectedListener.class}, pm0.v.f356803b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.AdapterView.OnItemSelectedListener");
        }
        this.f393805d = (android.widget.AdapterView.OnItemSelectedListener) newProxyInstance;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageFlowConvert$onCreateViewHolder$2", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        yz5.p pVar = this.f393806e.f393834m;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f393807f.getAdapterPosition());
        com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView gestureGallery = this.f393808g;
        kotlin.jvm.internal.o.f(gestureGallery, "$gestureGallery");
        pVar.invoke(valueOf, gestureGallery);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageFlowConvert$onCreateViewHolder$2", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
        this.f393805d.onNothingSelected(adapterView);
    }
}
