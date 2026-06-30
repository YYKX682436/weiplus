package pr3;

/* loaded from: classes5.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr3.c f357979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMGridLayout f357980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f357981f;

    public l(pr3.c cVar, com.tencent.mm.ui.base.MMGridLayout mMGridLayout, int i17) {
        this.f357979d = cVar;
        this.f357980e = mMGridLayout;
        this.f357981f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/more_info/InfoItemConvert$onBindViewHolder$1$grid$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f357979d.f357965s;
        if (pVar != null) {
            pVar.invoke(this.f357980e.getData(), java.lang.Integer.valueOf(this.f357981f));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/more_info/InfoItemConvert$onBindViewHolder$1$grid$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
