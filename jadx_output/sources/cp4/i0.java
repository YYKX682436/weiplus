package cp4;

/* loaded from: classes8.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.k0 f221036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f221037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cp4.g1 f221038f;

    public i0(cp4.k0 k0Var, int i17, cp4.g1 g1Var) {
        this.f221036d = k0Var;
        this.f221037e = i17;
        this.f221038f = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.p itemClickListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cp4.k0 k0Var = this.f221036d;
        java.util.ArrayList arrayList2 = k0Var.f221043f;
        int i17 = this.f221037e;
        if (!((r45.is) arrayList2.get(i17)).f377300g && (itemClickListener = this.f221038f.getItemClickListener()) != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(k0Var.f221041d);
            java.lang.Object obj = k0Var.f221043f.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            itemClickListener.invoke(valueOf, obj);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
