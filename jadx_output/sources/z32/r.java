package z32;

/* loaded from: classes4.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z32.s f469930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f469931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f469932f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f469933g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f469934h;

    public r(z32.s sVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f469930d = sVar;
        this.f469931e = str;
        this.f469932f = str2;
        this.f469933g = str3;
        this.f469934h = str4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$6$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        a42.g gVar = a42.g.f1206a;
        android.app.Activity context = this.f469930d.getContext();
        java.lang.String liteAppId = this.f469931e;
        kotlin.jvm.internal.o.f(liteAppId, "$liteAppId");
        gVar.b(context, liteAppId, this.f469932f, this.f469933g, this.f469934h);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$6$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
