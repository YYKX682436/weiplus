package sp2;

/* loaded from: classes2.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.b0 f410964d;

    public a0(sp2.b0 b0Var) {
        this.f410964d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$showSearchEntrance$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sp2.b0 b0Var = this.f410964d;
        androidx.appcompat.app.AppCompatActivity activity = b0Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p;
        if (str == null) {
            str = "";
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_context_id", str);
        intent.putExtra("key_click_tab_context_id", ip2.a.f293614c);
        new jp2.a(b0Var.getActivity()).a(intent);
        b0Var.S6("main_page_search", false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$showSearchEntrance$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
