package g00;

/* loaded from: classes9.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g00.f f267397d;

    public e(g00.f fVar) {
        this.f267397d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/card/vm/EcsShopCardViewModel$shopCardClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        g00.f fVar = this.f267397d;
        if (fVar.f267398d != null) {
            java.lang.Object context = view.getContext();
            kotlinx.coroutines.l.d(new com.tencent.mm.sdk.coroutines.LifecycleScope("EcsShopCardViewModel", context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null, 0, 4, null), null, null, new g00.d(view, fVar, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/feature/ecs/card/vm/EcsShopCardViewModel$shopCardClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
