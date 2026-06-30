package y20;

/* loaded from: classes.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f458987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qq.c f458988e;

    public a(yz5.l lVar, qq.c cVar) {
        this.f458987d = lVar;
        this.f458988e = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/test/EcsSettingDialog$OptionsAdapter$OptionViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f458987d.invoke(this.f458988e);
        yj0.a.h(this, "com/tencent/mm/feature/ecs/test/EcsSettingDialog$OptionsAdapter$OptionViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
