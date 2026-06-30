package y20;

/* loaded from: classes11.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.test.EcsTestUIRichText f459035d;

    public x(com.tencent.mm.feature.ecs.test.EcsTestUIRichText ecsTestUIRichText) {
        this.f459035d = ecsTestUIRichText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/test/EcsTestUIRichText$setupListeners$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        y20.t tVar = y20.t.f459024d;
        com.tencent.mm.feature.ecs.test.EcsTestUIRichText ecsTestUIRichText = this.f459035d;
        ecsTestUIRichText.f = tVar;
        ecsTestUIRichText.c7();
        yj0.a.h(this, "com/tencent/mm/feature/ecs/test/EcsTestUIRichText$setupListeners$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
