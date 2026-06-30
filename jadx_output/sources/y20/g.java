package y20;

/* loaded from: classes.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f459005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qq.d f459006e;

    public g(yz5.p pVar, qq.d dVar) {
        this.f459005d = pVar;
        this.f459006e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/test/EcsTestAdapter$ButtonViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f459005d.invoke(this.f459006e, context);
        yj0.a.h(this, "com/tencent/mm/feature/ecs/test/EcsTestAdapter$ButtonViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
