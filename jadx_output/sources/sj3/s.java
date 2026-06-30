package sj3;

/* loaded from: classes9.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.t f408732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.CollapseView f408733e;

    public s(com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView, sj3.t tVar) {
        this.f408733e = collapseView;
        this.f408732d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f408733e.findViewById(com.tencent.mm.R.id.k6o) != null) {
            this.f408732d.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
