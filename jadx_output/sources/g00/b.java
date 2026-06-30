package g00;

/* loaded from: classes9.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g00.c f267385d;

    public b(g00.c cVar) {
        this.f267385d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/card/vm/EcsProductCardViewModel$productCardClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        g00.c cVar = this.f267385d;
        if (cVar.f267386d != null) {
            java.lang.Object context = view.getContext();
            kotlinx.coroutines.l.d(new com.tencent.mm.sdk.coroutines.LifecycleScope("EcsProductCardViewModel", context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null, 0, 4, null), null, null, new g00.a(view, cVar, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/feature/ecs/card/vm/EcsProductCardViewModel$productCardClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
