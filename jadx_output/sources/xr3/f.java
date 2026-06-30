package xr3;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xr3.i f456220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.mm f456221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f456222f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f456223g;

    public f(xr3.i iVar, r45.mm mmVar, int i17, int i18) {
        this.f456220d = iVar;
        this.f456221e = mmVar;
        this.f456222f = i17;
        this.f456223g = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter$onBindViewHolder$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.q qVar = this.f456220d.f456229e;
        if (qVar != null) {
            r45.mm data = this.f456221e;
            kotlin.jvm.internal.o.f(data, "$data");
            qVar.invoke(data, java.lang.Integer.valueOf(this.f456222f), java.lang.Integer.valueOf(this.f456223g));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter$onBindViewHolder$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
