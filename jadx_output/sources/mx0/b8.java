package mx0;

/* loaded from: classes5.dex */
public final class b8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331856d;

    public b8(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        this.f331856d = shootComposingPluginLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingPluginLayout$openMoreTemplatePanel$fakeView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xx0.n nVar = this.f331856d.K1;
        if (nVar != null) {
            nVar.b();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingPluginLayout$openMoreTemplatePanel$fakeView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
