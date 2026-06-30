package mr3;

/* loaded from: classes5.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f330860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mr3.j f330861e;

    public f(in5.s0 s0Var, mr3.j jVar) {
        this.f330860d = s0Var;
        this.f330861e = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/desc_image/DescImageAddItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f330860d.f293121e;
        if (context instanceof android.app.Activity) {
            this.f330861e.f330871g.a((android.app.Activity) context, r7.f293122f.getItemCount() - 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/desc_image/DescImageAddItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
