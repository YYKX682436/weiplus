package ku1;

/* loaded from: classes15.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f312146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f312147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f312148f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f312149g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f312150h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tt1.j f312151i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ku1.v f312152m;

    public u(ku1.v vVar, android.view.View view, android.view.View view2, android.widget.ImageView imageView, android.widget.Button button, android.view.ViewGroup viewGroup, tt1.j jVar) {
        this.f312152m = vVar;
        this.f312146d = view;
        this.f312147e = view2;
        this.f312148f = imageView;
        this.f312149g = button;
        this.f312150h = viewGroup;
        this.f312151i = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f312146d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f312147e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f312148f.setVisibility(0);
        this.f312149g.setVisibility(8);
        ku1.v vVar = this.f312152m;
        vVar.f312130a.l(lu1.e.CARDCODEREFRESHACTION_SNAPSHOT);
        vVar.i(this.f312150h, this.f312151i);
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
